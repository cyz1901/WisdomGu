package per.cyz.musicalMaster.backend

import cats.effect.Sync
import cats.implicits._
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl

object Routes {
  def helloWorldRoutes[F[_]: Sync](H: HelloWorld[F]): HttpRoutes[F] =
    val dsl = new Http4sDsl[F] {}
    import dsl._
    HttpRoutes.of[F] { case GET -> Root / "hello" / name =>
      for {
        greeting <- H.hello(HelloWorld.Name(name))
        resp <- Ok(greeting)
      } yield resp
    }

}

def testRoutes[F[_]: Sync](): HttpRoutes[F] =
  val dsl = new Http4sDsl[F] {}
  import dsl._
  HttpRoutes.of[F] { case GET -> Root / "test" =>
    for {
      resp <- Ok("hello world")
    } yield resp
  }

//   def jokeRoutes[F[_]: Sync](J: Jokes[F]): HttpRoutes[F] =
//     val dsl = new Http4sDsl[F] {}
//     import dsl._
//     HttpRoutes.of[F] { case GET -> Root / "joke" =>
//       for {
//         joke <- J.get
//         resp <- Ok(joke)
//       } yield resp
//     }

//   def helloWorldRoutes[F[_]: Sync](H: HelloWorld[F]): HttpRoutes[F] =
//     val dsl = new Http4sDsl[F] {}
//     import dsl._
//     HttpRoutes.of[F] { case GET -> Root / "hello" / name =>
//       for {
//         greeting <- H.hello(HelloWorld.Name(name))
//         resp <- Ok(greeting)
//       } yield resp
//     }
