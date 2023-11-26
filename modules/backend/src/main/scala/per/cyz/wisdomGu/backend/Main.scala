package per.cyz.wisdomGu.backend

import cats.effect.{IO, IOApp}
import cats.effect.kernel.Async
import cats.effect.ExitCode
import java.io.File

object Main extends IOApp {

  def run(args: List[String]): IO[ExitCode] = {
    val checkDirFiber = beforeServerStart().start

    Server
      .run[IO]
      .use(_ => checkDirFiber.flatMap(_.join) *> IO.never)
      .as(ExitCode.Success)
  }

  def beforeServerStart(): IO[Unit] = IO.delay {
    println("Before server start")
    val homeDir = sys.props("user.home")
    val dir = new File(homeDir, ".wisdomgu")
    if (dir.exists()) {
      println(".wisdomgu folder exists")
    } else {
      dir.mkdirs()
      println("Created .wisdomgu folder")
    }
  }
}
