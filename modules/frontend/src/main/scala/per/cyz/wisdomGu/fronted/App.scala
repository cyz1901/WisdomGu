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

@js.native
@JSImport("styles/index.css", JSImport.Default)
object IndexCss extends js.Object

@js.native
@JSImport("tw-elements", JSImport.Default)
private object TW extends js.Object {
  def initTE(): js.Any = js.native
}

object App extends IOWebApp {
  val indexCss: IndexCss.type = IndexCss

  def render: Resource[IO, fs2.dom.HtmlElement[IO]] = {
    routes(
      pathEnd {
        runEffect {
          IO {
            import typings.twElements.*

          } >> BrowserNavigation.pushState(url = "/home")
        }
      },
      pathPrefix("home") {
        firstMatch(
          pathEnd {
            HomePage.root()
          }
        )
      },
      noneMatched {
        div("404")
      }
    )

  }
}
