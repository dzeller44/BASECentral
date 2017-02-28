
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object deletedintake_Scope0 {
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

class deletedintake extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main()/*1.8*/ {_display_(Seq[Any](format.raw/*1.10*/("""

 """),format.raw/*3.2*/("""<section id="confirmSignup">
	<!-- Start Formoid form-->
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px">
		<div class="title">
			<h2>Success</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required"></span>"""),_display_(/*11.56*/Messages("admin.delete.project")),format.raw/*11.88*/("""</label>
		</div>
		<div class="submit">
			<input type="submit" onclick="window.location.href='/admin'" value="Continue" />
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>

</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object deletedintake extends deletedintake_Scope0.deletedintake
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:14 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/deletedintake.scala.html
                  HASH: ab36086fc8abb9f1536ffd9b113bf9156f7ae27a
                  MATRIX: 850->1|863->7|902->9|931->12|1360->414|1413->446
                  LINES: 32->1|32->1|32->1|34->3|42->11|42->11
                  -- GENERATED --
              */
          