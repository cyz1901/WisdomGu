import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {

  // frontend
  val calico: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "com.armanbilge" %%% "calico" % DependencyVersions.calico
    )
  }

  val scalaJsDom: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "org.scala-js" %%% "scalajs-dom" % DependencyVersions.scalaJsDom
    )
  }

  val frontrouteCalico: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "io.frontroute" %%% "frontroute-calico" % DependencyVersions.frontrouteCalico
    )
  }

  // backend
  val catsEffect: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "org.typelevel" %% "cats-effect" % DependencyVersions.catsEffect
    )
  }

  val http4sBe: Def.Initialize[Seq[ModuleID]] = Def.setting {
    Seq(
      "org.http4s" %% "http4s-ember-server" % DependencyVersions.http4s,
      "org.http4s" %% "http4s-ember-client" % DependencyVersions.http4s,
      "org.http4s" %% "http4s-dsl" % DependencyVersions.http4s,
      "org.http4s" %% "http4s-circe" % DependencyVersions.http4s
    )
  }
}
