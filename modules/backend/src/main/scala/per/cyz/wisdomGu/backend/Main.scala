package per.cyz.wisdomGu.backend

import cats.effect.{IO, IOApp}

object Main extends IOApp.Simple:
  val run = Server.run()
