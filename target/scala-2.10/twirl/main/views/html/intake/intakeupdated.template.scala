
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object intakeupdated_Scope0 {
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

class intakeupdated extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""
"""),format.raw/*2.1*/("""<section id="intakeUpdated">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px">
		<div class="title">
			<h2>Success</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>"""),_display_(/*10.56*/Messages("intake.updated")),format.raw/*10.82*/("""</label>
		</div>
		<div class="submit">
			<input type="submit" onclick="window.location.href='/'"	value="Continue" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>
""")))}),format.raw/*19.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object intakeupdated extends intakeupdated_Scope0.intakeupdated
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 10:30:34 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intakeupdated.scala.html
                  HASH: d50f422c9fb1c66e2dfe67a0a7e69e3a28bbdf56
                  MATRIX: 850->1|863->7|902->9|930->11|1367->421|1414->447|1674->677
                  LINES: 32->1|32->1|32->1|33->2|41->10|41->10|50->19
                  -- GENERATED --
              */
          