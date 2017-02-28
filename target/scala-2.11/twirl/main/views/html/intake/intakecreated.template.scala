
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object intakecreated_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class intakecreated extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[java.lang.String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(uniquekey: java.lang.String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	 """),format.raw/*4.3*/("""<section id="intakeCreated">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px" >
			<div class="title">
				<h2>Success</h2>
			</div>
			<div class="element-input">
				<label class="title"><span class="required"></span>"""),_display_(/*11.57*/Messages("intake.save")),format.raw/*11.80*/("""</label>
			</div>
			<div class="submit">
				<input type="submit" onclick="window.location.href='/openintake/"""),_display_(/*14.70*/uniquekey),format.raw/*14.79*/("""'" value="Continue" />
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}))
      }
    }
  }

  def render(uniquekey:java.lang.String): play.twirl.api.HtmlFormat.Appendable = apply(uniquekey)

  def f:((java.lang.String) => play.twirl.api.HtmlFormat.Appendable) = (uniquekey) => apply(uniquekey)

  def ref: this.type = this

}


}

/**/
object intakecreated extends intakecreated_Scope0.intakecreated
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:16 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intakecreated.scala.html
                  HASH: 9bea9903686519aee1e934c1b956b70995c94aa6
                  MATRIX: 778->1|902->30|932->35|950->45|989->47|1019->51|1435->440|1479->463|1621->578|1651->587
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|42->11|42->11|45->14|45->14
                  -- GENERATED --
              */
          