package per.cyz.wisdomGu.backend.servers

import cats.effect.Async
import cats.syntax.all._
import com.comcast.ip4s._
import org.http4s.ember.client.EmberClientBuilder
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.implicits._
import org.http4s.server.middleware.Logger

object InittServer {

  def run[F[_]: Async]: F[Nothing] = {
    for {
      //   helloWorldAlg = HelloWorld.impl[F]
      //   jokeAlg = Jokes.impl[F](client)

      // Combine Service Routes into an HttpApp.
      // Can also be done via a Router if you
      // want to extract a segments not checked
      // in the underlying routes.
      //   httpApp = (
      //     Routes.helloWorldRoutes[F](helloWorldAlg) <+>
      //       HhhRoutes.jokeRoutes[F](jokeAlg)
      //   ).orNotFound

      // With Middlewares in place
      //   finalHttpApp = Logger.httpApp(true, true)(httpApp)

      _ <-
        EmberServerBuilder
          .default[F]
          .withHost(ipv4"0.0.0.0")
          .withPort(port"8080")
          //   .withHttpApp(finalHttpApp)
          .build
    } yield ()
  }.useForever
}
