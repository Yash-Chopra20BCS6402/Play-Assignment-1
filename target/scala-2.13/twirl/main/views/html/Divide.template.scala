
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object Divide extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(res: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.12*/("""
"""),_display_(/*2.2*/Body("Add Operation")/*2.23*/ {_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<section id="content">
    <div class="wrapper doc">
        <article>
            <center><h1> Division is: """),_display_(/*6.40*/res),format.raw/*6.43*/("""</h1></center>
        </article>
    </div>
</section>
""")))}))
      }
    }
  }

  def render(res:Int): play.twirl.api.HtmlFormat.Appendable = apply(res)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (res) => apply(res)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Divide.scala.html
                  HASH: 9cd8b3503cf61fb9f42f244e8249147b15a1e70f
                  MATRIX: 727->1|832->11|860->14|889->35|928->37|956->39|1095->152|1118->155
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|31->6|31->6
                  -- GENERATED --
              */
          