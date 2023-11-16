package per.cyz.wisdomGu.fronted.stores

import calico.frp.SignallingSortedMapRef
import cats.effect.IO
import fs2.concurrent.SignallingRef

import per.cyz.wisdomGu.fronted.models.HomeSidebarTab
import cats.effect.kernel.Resource

case class GlobalStore(sidebarTab: HomeSidebarTab) {}

object GlobalStore {
  def apply(): GlobalStore = {
    GlobalStore(HomeSidebarTab.Data)
  }
}
