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

object ConversationPage {
  def root(): Resource[IO, HtmlElement[IO]] = renderConversation()

  def renderConversation(): Resource[IO, HtmlElement[IO]] = {
    div(
      cls := "flex flex-col w-full h-full",
      div(
        cls := "w-full h-8 bg-[#1B1D22] flex flex-row items-center justify-between",
        div(
          cls := "w-1/2 whitespace-nowrap overflow-x-hidden",
          button(
            cls := "btn btn-xs",
            onClick --> (_.foreach(_ => IO {}))
          )
        )
      ),
      div(
        cls := "flex flex-col w-full h-[calc(100%-32px)]",
        div(
          cls := "bg-[#2A2C35] flex flex-col overflow-auto h-full space-y-4",
          dialogTag(nameAttr := "me", contentAttr := "aaaa")
        ),
        div(
          cls := "h-[80px] absolute bottom-3 left-[calc((100%-96px)/2+96px-25%)] w-1/2",
          div(
            cls := "h-12",
            textArea(
              cls := "textarea w-full resize-none",
              placeholder := "Send a message",
              onKeyDown --> { _.foreach(_ => IO {}) }
              // onKeyDown --> (_ => js.eval("{handleKeyDown}"))
            )
          )
        )
      )
    )
  }
}
