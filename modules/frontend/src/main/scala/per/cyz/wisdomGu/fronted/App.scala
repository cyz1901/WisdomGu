package per.cyz.wisdomGu.fronted

import calico.*
import calico.html.io.{*, given}
import calico.syntax.*
import calico.unsafe.given
import cats.effect.*
import cats.effect.syntax.all.*
import cats.syntax.all.*
import frontroute.{*, given}
import fs2.*
import fs2.concurrent.*
import fs2.dom.*
import org.scalajs.dom
import org.scalajs.dom.*

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import per.cyz.wisdomGu.fronted.pages.HomePage
import per.cyz.wisdomGu.fronted.stores.GlobalStore

@js.native
@JSImport("styles/index.css", JSImport.Default)
object IndexCss extends js.Object

@js.native
@JSImport("@iconify-json/uil", JSImport.Namespace)
object UilIcons extends js.Object

object App extends IOWebApp {
  val indexCss: IndexCss.type = IndexCss

  def render: Resource[IO, fs2.dom.HtmlElement[IO]] = {
    SignallingRef.of[IO, GlobalStore](GlobalStore.apply()).toResource.flatMap { globalStore =>
      routes(
        pathEnd {
          runEffect {
            BrowserNavigation.pushState(url = "/home")
          }
        },
        pathPrefix("home") {
          firstMatch(
            pathEnd {
              HomePage.root(globalStore)
            }
          )
        },
        noneMatched {
          div("404")
        }
      )
    }
  }
}
