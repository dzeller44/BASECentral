
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deleteintakeconfirm_Scope0 {
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

class deleteintakeconfirm extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Intake,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intake: Intake):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="deleteProjectConfirm">
	<!-- Start Formoid form-->
	<form id="showuser" class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Delete Project</h2>
		</div>
		<div class="element-input">
			<label class="title">Project ID:</label>
			<div class="item-cont">
				<input class="large" type="email" name="email" readonly style="color: #dddddd;" 
					placeholder="" value="""),_display_(/*17.28*/intake/*17.34*/.projectid),format.raw/*17.44*/(""" """),format.raw/*17.45*/("""/><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>The Project <b>"""),_display_(/*21.71*/intake/*21.77*/.projectid),format.raw/*21.87*/("""</b> will be deleted.  Please click Delete below to continue or Cancel to stop this process.</label>
		</div>
		<div class="submit">
			<input type="submit" value="Delete" />
			<a href="/admin" class="buttonCancel">"""),_display_(/*25.43*/Messages("goback")),format.raw/*25.61*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>

""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(intake:Intake): play.twirl.api.HtmlFormat.Appendable = apply(intake)

  def f:((Intake) => play.twirl.api.HtmlFormat.Appendable) = (intake) => apply(intake)

  def ref: this.type = this

}


}

/**/
object deleteintakeconfirm extends deleteintakeconfirm_Scope0.deleteintakeconfirm
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 14:19:20 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/deleteintakeconfirm.scala.html
                  HASH: dcf6f01cafc39df00448462971fa9b21a504c82e
                  MATRIX: 780->1|891->17|921->22|939->32|978->34|1008->38|1631->634|1646->640|1677->650|1706->651|1891->809|1906->815|1937->825|2185->1046|2224->1064|2370->1180
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|48->17|48->17|48->17|48->17|52->21|52->21|52->21|56->25|56->25|64->33
                  -- GENERATED --
              */
          