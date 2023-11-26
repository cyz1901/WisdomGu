package per.cyz.musicalMaster.backend

import cats.effect.Sync
import cats.implicits._
import org.http4s.HttpRoutes
import org.http4s.dsl.Http4sDsl
import per.cyz.wisdomGu.backend.servers.LocalAIService

object Routes {

  def localAIRoutes[F[_]: Sync](L: LocalAIService[F]): HttpRoutes[F] = {
    val dsl = new Http4sDsl[F] {}
    import dsl._
    HttpRoutes.of[F] { case GET -> Root / "init" =>
      for {
        resp <- Ok("greeting")
      } yield resp
    }
  }
}
