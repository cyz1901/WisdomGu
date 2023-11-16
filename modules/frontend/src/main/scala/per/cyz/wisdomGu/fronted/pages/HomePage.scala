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

import frontroute.*
import frontroute.given

import org.scalajs.dom.*
import org.scalajs.dom

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import per.cyz.wisdomGu.fronted.stores.GlobalStore
import per.cyz.wisdomGu.fronted.models.HomeSidebarTab

@js.native
@JSImport("/icon.png", JSImport.Default)
object GuIcon extends js.Object

object HomePage {

  def root(globalStore: SignallingRef[IO, GlobalStore]): Resource[IO, HtmlElement[IO]] = renderPage(globalStore)

  def renderMenu(globalStore: SignallingRef[IO, GlobalStore]): Resource[IO, HtmlElement[IO]] = {
    ul(
      cls := "menu bg-base-200 rounded-box",
      li(
        a(
          cls := "tooltip tooltip-right flex items-center justify-center",
          span(
            cls := "icon-[uil--file-alt] w-7 h-7"
          ),
          onClick --> (_.foreach(_ => globalStore.update(g => g.copy(HomeSidebarTab.Data))))
        ),
        a(
          cls := "tooltip tooltip-right flex items-center justify-center",
          span(
            cls := "icon-[uil--chat] w-7 h-7"
          ),
          onClick --> (_.foreach(_ => globalStore.update(g => g.copy(HomeSidebarTab.Conversation))))
        )
      ),
      li(
        a(
          cls := "tooltip tooltip-right flex items-center justify-center",
          span(
            cls := "icon-[uil--brain] w-7 h-7"
          ),
          onClick --> (_.foreach(_ => globalStore.get.map(x => println(x))))
        )
      ),
      li(
        a(
          cls := "tooltip tooltip-right flex items-center justify-center",
          span(
            cls := "icon-[uil--setting] w-7 h-7"
          )
        )
      ),
      li(
        a(
          cls := "tooltip tooltip-right flex items-center justify-center",
          span(
            cls := "icon-[uil--dropbox] w-7 h-7"
          )
        )
      )
    )
  }

  def renderPage(globalStore: SignallingRef[IO, GlobalStore]): Resource[IO, HtmlElement[IO]] = {
    div(
      cls := "flex flex-row h-screen bg-[#1B1D22]  overflow-y-hidden",
      div(
        cls := "w-[64px] flex flex-col items-center justify-between pt-2 pb-3 bg-[#1B1D22]",
        div(
          cls := "flex flex-col items-center",
          img(
            cls := "w-8 h-8",
            src := GuIcon.toString()
          ),
          renderMenu(globalStore)
        ),
        div(
          cls := "w-8 h-8 rounded-full overflow-hidden",
          img(
            src := "https://api.dicebear.com/6.x/initials/svg?seed=Ginger",
            alt := "avatar"
          )
        )
      ),
      div(
        cls := "flex flex-col w-full h-full",
        globalStore.map { g =>
          {
            g.sidebarTab.match
              case HomeSidebarTab.Conversation => ConversationPage.root()
              case HomeSidebarTab.Data         => DataPage.root()
          }
        }
      )
    )

  }

}
