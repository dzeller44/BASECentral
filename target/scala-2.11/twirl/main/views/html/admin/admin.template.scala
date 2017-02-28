
package views.html.admin

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
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

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


"""),format.raw/*6.1*/("""<!-- ABOUT -->
<section id="adminMain">

	<!-- SERVICES -->
	<div class="services_block padbot40" data-appear-top-offset="-200">

		<!-- CONTAINER -->
		<div class="container">

			<!-- ROW -->
			<div class="row">
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/searchprojects">
						<p>
							<img src=""""),_display_(/*20.19*/routes/*20.25*/.Assets.at("/img/icon_Search_Records.png")),format.raw/*20.67*/(""""> <b>Projects</b>
						</p> <span>Add/Edit/Delete/Search Projects...</span>
					</a>
				</div>
				<div class="col-sm-3 margbot30">
					<a class="services_item" href="/adminuser">
						<p>
							<img src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.at("/img/icon_User_Maint.png")),format.raw/*27.63*/(""""> <b>User Maintenance</b>
						</p> <span>Add/Edit/Delete User Records...</span>
					</a>
				</div>
				<div class="col-sm-4 margbot30">
					<a class="services_item" href="/tablemaint">
						<p>
							<img src=""""),_display_(/*34.19*/routes/*34.25*/.Assets.at("/img/icon_Export_Data.png")),format.raw/*34.64*/(""""> <b>Lookup/Table Maintenance</b>
						</p> <span>Add/Edit Lookup Records...</span>
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
<!-- //ABOUT -->

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
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:14 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/admin/admin.scala.html
                  HASH: 94d2fb7580590cdf4ffce2c90126fa615ae51c4e
                  MATRIX: 768->1|899->37|927->40|945->50|984->52|1013->55|1374->389|1389->395|1452->437|1692->650|1707->656|1766->694|2012->913|2027->919|2087->958
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6|51->20|51->20|51->20|58->27|58->27|58->27|65->34|65->34|65->34
                  -- GENERATED --
              */
          