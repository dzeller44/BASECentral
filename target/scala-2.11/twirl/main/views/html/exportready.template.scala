
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object exportready_Scope0 {
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

class exportready extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(downloadLocation: String, fileName: String, userRole: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<section id="exportLocation">
		<form id="exportReady" class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action=""""),_display_(/*7.27*/routes/*7.33*/.Application.exportOpenFile(downloadLocation)),format.raw/*7.78*/("""">
			<div class="title">
				<h2>Export File Download</h2>
			</div>
			<div class="element-input">
				<label class="title"><span></span>Your export file is ready for download.</label>
			</div>				
			<div class="submit">
				<a href=""""),_display_(/*15.15*/downloadLocation),format.raw/*15.31*/("""" download=""""),_display_(/*15.44*/fileName),format.raw/*15.52*/("""" class="buttonCustom" style="color: #FFFFFF;">Download File</a>
				<a href="/searchprojects" class="buttonCancel">"""),_display_(/*16.53*/Messages("goback")),format.raw/*16.71*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}))
      }
    }
  }

  def render(downloadLocation:String,fileName:String,userRole:String): play.twirl.api.HtmlFormat.Appendable = apply(downloadLocation,fileName,userRole)

  def f:((String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (downloadLocation,fileName,userRole) => apply(downloadLocation,fileName,userRole)

  def ref: this.type = this

}


}

/**/
object exportready extends exportready_Scope0.exportready
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:14 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/exportready.scala.html
                  HASH: a7b8d9c27509156931eeb976a77c810d41c96faf
                  MATRIX: 771->1|928->63|958->68|976->78|1015->80|1044->83|1356->369|1370->375|1435->420|1709->667|1746->683|1786->696|1815->704|1960->822|1999->840
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|38->7|38->7|38->7|46->15|46->15|46->15|46->15|47->16|47->16
                  -- GENERATED --
              */
          