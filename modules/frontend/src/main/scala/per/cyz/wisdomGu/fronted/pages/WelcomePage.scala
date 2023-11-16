package per.cyz.wisdomGu.fronted.pages

import calico.*
import calico.html.io.{*, given}
import calico.unsafe.given
import calico.syntax.*
import cats.effect.*
import cats.effect.syntax.all.*
import cats.syntax.all.*
import fs2.*
import fs2.concurrent.*
import fs2.dom.*

import scala.scalajs.js
import org.scalajs.dom

import typings.marked.{mod as markedjs}
import scala.scalajs.js.annotation.JSImport

@js.native
@JSImport("/welcome.png", JSImport.Default)
object WelcomeImg extends js.Object

object WelcomePage {

  // val markdown: String = """
  // # Wisdom Gu
  // ### Next generation knowledge base
  // """

  def root(): Resource[IO, HtmlElement[IO]] = div(
    cls := "flex flex-row justify-center items-start mx-12 mt-16",
    div(
      cls := "flex flex-col flex-1 items-start",
      div(cls := "prose", h1("Wisdom Gu"), h3("Next generation knowledge base"), h4("beginning")),
      button(
        cls := "btn bg-slate-600 mt-2",
        "open data file",
        onClick --> (_.foreach(_ =>
          IO {
            // import typings.tauriAppsPluginFs.{mod as fs}
            // fs.read
          }
        ))
      )
    ),
    img(
      cls := "flex-1",
      src := WelcomeImg.toString()
    )
  )

}
