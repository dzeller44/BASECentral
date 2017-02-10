
package views.html.manager

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object manager_Scope0 {
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

class manager extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""

"""),format.raw/*5.1*/("""<section id="managerMain">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200"
		data-animated="fadeInUp">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-2 margbot30"></div>
				<div class="col-sm-1 margbot30"></div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/searchprofiles">
						<p>
							<img src=""""),_display_(/*21.19*/routes/*21.25*/.Assets.at("/img/icon_Export_Data.png")),format.raw/*21.64*/(""""> <b>Export Data</b>
						</p> <span>Export Records...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/searchprofiles">
						<p>
							<img src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*28.67*/(""""> <b>Search Records</b>
						</p> <span>Search Business Profiles...</span>
					</a>
				</div>

			</div>
		</div>
		<!-- //ROW -->
	</div>
	<!-- //CONTAINER -->
	</div>
	<!-- //SERVICES -->

</section>

""")))}))
      }
    }
  }

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object manager extends manager_Scope0.manager
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 14:19:21 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/manager/manager.scala.html
                  HASH: 6a982e0d097e96d4dc680b8104b00d311a9545d9
                  MATRIX: 774->1|905->37|933->40|951->50|990->52|1018->54|1479->488|1494->494|1554->533|1785->737|1800->743|1863->785
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|52->21|52->21|52->21|59->28|59->28|59->28
                  -- GENERATED --
              */
          