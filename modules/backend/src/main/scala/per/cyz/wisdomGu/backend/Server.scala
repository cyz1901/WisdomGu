package per.cyz.wisdomGu.backend

import cats.effect.Async
import cats.syntax.all._
import com.comcast.ip4s._
import fs2.io.net.Network
import org.http4s.ember.server.EmberServerBuilder
import org.http4s.implicits._
import org.http4s.server.middleware.Logger
import cats.effect.IO
import cats.effect.kernel.Resource
import per.cyz.wisdomGu.backend.servers.LocalAIService
import per.cyz.musicalMaster.backend.Routes

object Server {
  def run[F[_]: Async] = {
    val LocalAIAlg = LocalAIService.impl[F]

    val httpApp = (
      Routes.localAIRoutes[F](LocalAIAlg)
    ).orNotFound

    val finalHttpApp = Logger.httpApp(true, true)(httpApp)

    EmberServerBuilder
      .default[F]
      .withHost(ipv4"0.0.0.0")
      .withPort(port"6666")
      .withHttpApp(finalHttpApp)
      .build
  }
}
