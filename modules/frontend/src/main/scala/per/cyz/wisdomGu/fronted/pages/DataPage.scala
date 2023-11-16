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
import scala.scalajs.js.annotation.JSImport

import typings.editorjsEditorjs.mod.{default as EditorJS}
import typings.editorjsEditorjs.typesConfigsEditorConfigMod.EditorConfig

object DataPage {

  def root(): Resource[IO, HtmlElement[IO]] = renderPage()

  def rendereditor(): Resource[IO, HtmlElement[IO]] = Resource
    .eval {
      for {
        d <- IO {
          val editor = EditorJS(EditorConfig.apply().setHolder("editorjs"))
          val d = dom.document.createElement("div")
          d.setAttribute("id", "editorjs")
          d.setAttribute("class", "w-full h-full")
          d
        }
      } yield (d.asInstanceOf[HtmlElement[IO]])

    }

  def renderPage(): Resource[IO, HtmlElement[IO]] = div(
    cls := "flex flex-row w-full h-full",
    div(
      cls := "w-full h-full bg-[#2A2C35]",
      div(
        cls := "w-full h-8 bg-[#1B1D22] flex flex-row items-center justify-between",
        div(
          cls := "w-1/2 whitespace-nowrap overflow-x-hidden",
          button(
            cls := "btn btn-xs bg-[#272a31] rounded-none"
          )
        )
      )
    )
    // div(cls := "w-[256px] bg-gray-200")
  )

}
