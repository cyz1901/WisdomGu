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

object HomePage {

  def root(): Resource[IO, HtmlElement[IO]] = div((), renderTetx())

  def renderTetx(): Resource[IO, HtmlElement[IO]] = {
    div(
      navTag(
        idAttr := "sidenav-4",
        cls := "group fixed left-0 top-0 z-[1035] h-screen w-60 -translate-x-full overflow-hidden bg-white shadow-[0_4px_12px_0_rgba(0,0,0,0.07),_0_2px_4px_rgba(0,0,0,0.05)] data-[te-sidenav-slim='true']:hidden data-[te-sidenav-slim-collapsed='true']:w-[77px] data-[te-sidenav-slim='true']:w-[77px] data-[te-sidenav-hidden='false']:translate-x-0 dark:bg-zinc-800 [&[data-te-sidenav-slim-collapsed='true'][data-te-sidenav-slim='false']]:hidden [&[data-te-sidenav-slim-collapsed='true'][data-te-sidenav-slim='true']]:[display:unset]",
        dataAttr("data-te-sidenav-init") := "",
        dataAttr("data-te-sidenav-hidden") := "false",
        dataAttr("data-te-sidenav-mode") := "side",
        dataAttr("data-te-sidenav-slim") := "true",
        dataAttr("data-te-sidenav-content") := "#slim-content",
        dataAttr("data-te-sidenav-slim-collapsed") := "true",
        ul(
          cls := "relative m-0 list-none px-[0.2rem]",
          dataAttr("data-te-sidenav-menu-ref") := "",
          li(
            cls := "relative",
            a(
              cls := "flex h-12 cursor-pointer items-center truncate rounded-[5px] px-6 py-4 text-[0.875rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
              dataAttr("data-te-sidenav-link-ref") := "",
              span(
                cls := "mr-4 [&>svg]:h-4 [&>svg]:w-4 [&>svg]:text-gray-400 dark:[&>svg]:text-gray-300"
              ).evalTap(_.innerHtml.set("""
               svg(
                xmlns := "http://www.w3.org/2000/svg",
                fill := "none",
                viewBox := "0 0 24 24",
                dataAttr("stroke-width") := "1.5",
                stroke := "currentColor",
                cls := "h-4 w-4",
                path(
                  dataAttr("stroke-linecap") := "round",
                  dataAttr("stroke-linejoin") := "round",
                  d := "M15.182 15.182a4.5 4.5 0 01-6.364 0M21 12a9 9 0 11-18 0 9 9 0 0118 0zM9.75 9.75c0 .414-.168.75-.375.75S9 10.164 9 9.75 9.168 9 9.375 9s.375.336.375.75zm-.375 0h.008v.015h-.008V9.75zm5.625 0c0 .414-.168.75-.375.75s-.375-.336-.375-.75.168-.75.375-.75.375.336.375.75zm-.375 0h.008v.015h-.008V9.75z"
                )
              )
              """)),
              span(
                cls := "group-[&[data-te-sidenav-slim-collapsed='true']]:data-[te-sidenav-slim='false']:hidden",
                dataAttr("data-te-sidenav-slim") := "false",
                "Link 1"
              )
            )
          ),
          li(
            cls := "relative",
            a(
              cls := "flex h-12 cursor-pointer items-center truncate rounded-[5px] px-6 py-4 text-[0.875rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
              dataAttr("data-te-sidenav-link-ref") := "",
              span(
                cls := "mr-4 [&>svg]:h-4 [&>svg]:w-4 [&>svg]:text-gray-400 dark:[&>svg]:text-gray-300"
              ).evalTap(
                _.innerHtml.set(
                  """
                svg(
                xmlns := "http://www.w3.org/2000/svg",
                viewBox := "0 0 24 24",
                fill := "currentColor",
                cls := "h-4 w-4",
                path(
                  dataAttr("fill-rule") := "evenodd",
                  d := "M12 2.25c-5.385 0-9.75 4.365-9.75 9.75s4.365 9.75 9.75 9.75 9.75-4.365 9.75-9.75S17.385 2.25 12 2.25zm-2.625 6c-.54 0-.828.419-.936.634a1.96 1.96 0 00-.189.866c0 .298.059.605.189.866.108.215.395.634.936.634.54 0 .828-.419.936-.634.13-.26.189-.568.189-.866 0-.298-.059-.605-.189-.866-.108-.215-.395-.634-.936-.634zm4.314.634c.108-.215.395-.634.936-.634.54 0 .828.419.936.634.13.26.189.568.189.866 0 .298-.059.605-.189.866-.108.215-.395.634-.936.634-.54 0-.828-.419-.936-.634a1.96 1.96 0 01-.189-.866c0-.298.059-.605.189-.866zm2.023 6.828a.75.75 0 10-1.06-1.06 3.75 3.75 0 01-5.304 0 .75.75 0 00-1.06 1.06 5.25 5.25 0 007.424 0z",
                  dataAttr("clip-rule") := "evenodd"
                )
              )"""
                )
              ),
              span(
                cls := "group-[&[data-te-sidenav-slim-collapsed='true']]:data-[te-sidenav-slim='false']:hidden",
                dataAttr("data-te-sidenav-slim") := "false",
                "Category 1"
              ),
              span(
                cls := "absolute right-0 ml-auto mr-[0.5rem] transition-transform duration-300 ease-linear motion-reduce:transition-none [&>svg]:text-gray-600 dark:[&>svg]:text-gray-300",
                dataAttr("data-te-sidenav-rotate-icon-ref") := ""
              ).evalTap(
                _.innerHtml.set(
                  """
                    svg(
                xmlns := "http://www.w3.org/2000/svg",
                viewBox := "0 0 20 20",
                fill := "currentColor",
                cls := "h-5 w-5",
                path(
                  dataAttr("fill-rule") := "evenodd",
                  d := "M5.23 7.21a.75.75 0 011.06.02L10 11.168l3.71-3.938a.75.75 0 111.08 1.04l-4.25 4.5a.75.75 0 01-1.08 0l-4.25-4.5a.75.75 0 01.02-1.06z",
                  dataAttr("clip-rule") := "evenodd"
                )
              )
                """
                )
              )
            ),
            ul(
              cls := "!visible relative m-0 hidden list-none p-0 data-[te-collapse-show]:block",
              dataAttr("data-te-sidenav-collapse-ref") := "",
              li(
                cls := "relative",
                a(
                  cls := "flex h-6 cursor-pointer items-center truncate rounded-[5px] py-4 pl-[3.4rem] pr-6 text-[0.78rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
                  dataAttr("data-te-sidenav-link-ref") := "",
                  "Link 2"
                )
              ),
              li(
                cls := "relative",
                a(
                  cls := "flex h-6 cursor-pointer items-center truncate rounded-[5px] py-4 pl-[3.4rem] pr-6 text-[0.78rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
                  dataAttr("data-te-sidenav-link-ref") := "",
                  "Link 3"
                )
              )
            )
          ),
          li(
            cls := "relative",
            a(
              cls := "flex h-12 cursor-pointer items-center truncate rounded-[5px] px-6 py-4 text-[0.875rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
              dataAttr("data-te-sidenav-link-ref") := "",
              span(
                cls := "mr-4 [&>svg]:h-4 [&>svg]:w-4 [&>svg]:text-gray-400 dark:[&>svg]:text-gray-300"
              ).evalTap(
                _.innerHtml.set(
                  """
                       svg(
                xmlns := "http://www.w3.org/2000/svg",
                viewBox := "0 0 24 24",
                fill := "currentColor",
                cls := "h-4 w-4",
                path(
                  dataAttr("fill-rule") := "evenodd",
                  d := "M12 2.25c-5.385 0-9.75 4.365-9.75 9.75s4.365 9.75 9.75 9.75 9.75-4.365 9.75-9.75S17.385 2.25 12 2.25zm-2.625 6c-.54 0-.828.419-.936.634a1.96 1.96 0 00-.189.866c0 .298.059.605.189.866.108.215.395.634.936.634.54 0 .828-.419.936-.634.13-.26.189-.568.189-.866 0-.298-.059-.605-.189-.866-.108-.215-.395-.634-.936-.634zm4.314.634c.108-.215.395-.634.936-.634.54 0 .828.419.936.634.13.26.189.568.189.866 0 .298-.059.605-.189.866-.108.215-.395.634-.936.634-.54 0-.828-.419-.936-.634a1.96 1.96 0 01-.189-.866c0-.298.059-.605.189-.866zm2.023 6.828a.75.75 0 10-1.06-1.06 3.75 3.75 0 01-5.304 0 .75.75 0 00-1.06 1.06 5.25 5.25 0 007.424 0z",
                  dataAttr("clip-rule") := "evenodd"
                )
              )
                """
                )
              ),
              span(
                cls := "group-[&[data-te-sidenav-slim-collapsed='true']]:data-[te-sidenav-slim='false']:hidden",
                dataAttr("data-te-sidenav-slim") := "false",
                "Category 2"
              ),
              span(
                cls := "absolute right-0 ml-auto mr-[0.5rem] transition-transform duration-300 ease-linear motion-reduce:transition-none [&>svg]:text-gray-600 dark:[&>svg]:text-gray-300",
                dataAttr("data-te-sidenav-rotate-icon-ref") := ""
              ).evalTap(_.innerHtml.set("""
                 svg(
                xmlns := "http://www.w3.org/2000/svg",
                viewBox := "0 0 20 20",
                fill := "currentColor",
                cls := "h-5 w-5",
                path(
                  dataAttr("fill-rule") := "evenodd",
                  d := "M5.23 7.21a.75.75 0 011.06.02L10 11.168l3.71-3.938a.75.75 0 111.08 1.04l-4.25 4.5a.75.75 0 01-1.08 0l-4.25-4.5a.75.75 0 01.02-1.06z",
                  dataAttr("clip-rule") := "evenodd"
                )
              )
              """))
            ),
            ul(
              cls := "show !visible relative m-0 hidden list-none p-0 data-[te-collapse-show]:block",
              dataAttr("data-te-sidenav-collapse-ref") := "",
              li(
                cls := "relative",
                a(
                  cls := "flex h-6 cursor-pointer items-center truncate rounded-[5px] py-4 pl-[3.4rem] pr-6 text-[0.78rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
                  dataAttr("data-te-sidenav-link-ref") := "",
                  "Link 4"
                )
              ),
              li(
                cls := "relative",
                a(
                  cls := "flex h-6 cursor-pointer items-center truncate rounded-[5px] py-4 pl-[3.4rem] pr-6 text-[0.78rem] text-gray-600 outline-none transition duration-300 ease-linear hover:bg-slate-50 hover:text-inherit hover:outline-none focus:bg-slate-50 focus:text-inherit focus:outline-none active:bg-slate-50 active:text-inherit active:outline-none data-[te-sidenav-state-active]:text-inherit data-[te-sidenav-state-focus]:outline-none motion-reduce:transition-none dark:text-gray-300 dark:hover:bg-white/10 dark:focus:bg-white/10 dark:active:bg-white/10",
                  dataAttr("data-te-sidenav-link-ref") := "",
                  "Link 5"
                )
              )
            )
          )
        )
      ),
      div(
        idAttr := "slim-content",
        cls := "flex !pl-[77px]",
        button(
          cls := "mr-1 mt-10 inline-block rounded bg-primary px-6 py-2.5 text-xs font-medium uppercase leading-tight text-white shadow-md transition duration-150 ease-in-out hover:bg-primary-700 hover:shadow-lg focus:bg-primary-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-primary-800 active:shadow-lg",
          dataAttr("data-te-sidenav-toggle-ref") := "",
          dataAttr("data-te-target") := "#sidenav-4",
          dataAttr("aria-controls") := "#sidenav-4",
          dataAttr("aria-haspopup") := "true",
          span(
            cls := "block [&>svg]:h-5 [&>svg]:w-5 [&>svg]:text-white"
            // svg(
            //   xmlns := "http://www.w3.org/2000/svg",
            //   viewBox := "0 0 24 24",
            //   fill := "currentColor",
            //   cls := "h-5 w-5",
            //   path(
            //     dataAttr("fill-rule") := "evenodd",
            //     d := "M3 6.75A.75.75 0 013.75 6h16.5a.75.75 0 010 1.5H3.75A.75.75 0 013 6.75zM3 12a.75.75 0 01.75-.75h16.5a.75.75 0 010 1.5H3.75A.75.75 0 013 12zm0 5.25a.75.75 0 01.75-.75h16.5a.75.75 0 010 1.5H3.75a.75.75 0 01-.75-.75z",
            //     dataAttr("clip-rule") := "evenodd"
            //   )
            // )
          )
        ),
        button(
          cls := "mt-10 inline-block rounded bg-primary px-6 py-2.5 text-xs font-medium uppercase leading-tight text-white shadow-md transition duration-150 ease-in-out hover:bg-primary-700 hover:shadow-lg focus:bg-primary-700 focus:shadow-lg focus:outline-none focus:ring-0 active:bg-primary-800 active:shadow-lg",
          dataAttr("aria-haspopup") := "true",
          idAttr := "slim-toggler",
          "Toggle Slim"
        )
      )
    )
  }
}
