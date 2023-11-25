package per.cyz.wisdomGu.backend

import cats.effect.Async
import cats.syntax.all._
import com.comcast.ip4s._
import fs2.io.net.Network
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.implicits._
import org.http4s.server.middleware.Logger
import cats.effect.IO

object Server {

  def run(): IO[Nothing] = {
    // helloWorldAlg = HelloWorld.impl[F]
    //   jokeAlg = Jokes.impl[F](client)

    // Combine Service Routes into an HttpApp.
    // Can also be done via a Router if you
    // want to extract a segments not checked
    // in the underlying routes.
    // httpApp = (
    //   Routes.helloWorldRoutes[F](helloWorldAlg)
    // ).orNotFound

    // // With Middlewares in place
    // finalHttpApp = Logger.httpApp(true, true)(httpApp)
    println("hello world")

    for {
      _ <-
        EmberServerBuilder
          .default[IO]
          .withHost(ipv4"0.0.0.0")
          .withPort(port"8080")
          // .withHttpApp(finalHttpApp)
          .build
    } yield ()
  }.useForever
}
