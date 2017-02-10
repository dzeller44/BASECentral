
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object home_Scope0 {
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

class home extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[java.util.List[Intake],java.util.List[Lookup],java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeList: java.util.List[Intake], lookups: java.util.List[Lookup], users: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.100*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*5.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("css/tablesort.css")),format.raw/*6.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*8.32*/("""{"""),format.raw/*8.33*/("""
			"""),format.raw/*9.4*/("""$("#tableAll").tablesorter();
			$(".selectFirstField").change(function() """),format.raw/*10.45*/("""{"""),format.raw/*10.46*/("""
				"""),format.raw/*11.5*/("""getByServices();
			"""),format.raw/*12.4*/("""}"""),format.raw/*12.5*/(""");
			$(".selectSecondField").change(function() """),format.raw/*13.46*/("""{"""),format.raw/*13.47*/("""
				"""),format.raw/*14.5*/("""getByCounty();
			"""),format.raw/*15.4*/("""}"""),format.raw/*15.5*/(""");
		"""),format.raw/*16.3*/("""}"""),format.raw/*16.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
			<h5>All Business Profiles:</h5>
			<div class="container">
				<div class="row">
					<div class="col-sm-10">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="large">
									<span>
										<select class="selectFirstField" name="selectFirstField" id="selectFirstField">
											<option selected="selected" value="" disabled="disabled">--- Filter By Request Status ---</option>
											<option value="All">All</option>
											"""),_display_(/*31.13*/for(lookup <- lookups) yield /*31.35*/ {_display_(Seq[Any](format.raw/*31.37*/("""
												"""),_display_(/*32.14*/if(lookup.lookuptype == "Request Status")/*32.55*/ {_display_(Seq[Any](format.raw/*32.57*/("""<option value=""""),_display_(/*32.73*/lookup/*32.79*/.name),format.raw/*32.84*/("""">"""),_display_(/*32.87*/lookup/*32.93*/.name),format.raw/*32.98*/("""</option>""")))}),format.raw/*32.108*/("""
											""")))}),format.raw/*33.13*/("""	
										"""),format.raw/*34.11*/("""</select>
										<i></i><span class="iconPlacement"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-10">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="large">
									<span>
										<select class="selectSecondField" name="selectSecondField" id="selectSecondField">
											<option selected="selected" value="" disabled="disabled">--- Filter By Agency ---</option>
											<option value="All">All</option>
											"""),_display_(/*49.13*/for(lookup <- lookups) yield /*49.35*/ {_display_(Seq[Any](format.raw/*49.37*/("""
												"""),_display_(/*50.14*/if(lookup.lookuptype == "Agency")/*50.47*/ {_display_(Seq[Any](format.raw/*50.49*/("""<option value=""""),_display_(/*50.65*/lookup/*50.71*/.name),format.raw/*50.76*/("""">"""),_display_(/*50.79*/lookup/*50.85*/.name),format.raw/*50.90*/("""</option>""")))}),format.raw/*50.100*/("""
											""")))}),format.raw/*51.13*/("""	
										"""),format.raw/*52.11*/("""</select>
										<i></i><span class="iconPlacement"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<table id="tableAll" class="tablesorter" border="0" cellpadding="0" cellspacing="1">
				<thead>
					<tr>
						<th>Project ID</th>
						<th>Project Name</th>
						<th>Agency</th>
						<th>Request Status</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*71.7*/for(intake <- intakeList) yield /*71.32*/ {_display_(Seq[Any](format.raw/*71.34*/("""
					"""),format.raw/*72.6*/("""<tr>
						<td><a href="/openintake/"""),_display_(/*73.33*/intake/*73.39*/.intakekey),format.raw/*73.49*/("""">"""),_display_(/*73.52*/intake/*73.58*/.projectid),format.raw/*73.68*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*74.33*/intake/*74.39*/.intakekey),format.raw/*74.49*/("""">"""),_display_(/*74.52*/intake/*74.58*/.projectname),format.raw/*74.70*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*75.33*/intake/*75.39*/.intakekey),format.raw/*75.49*/("""">"""),_display_(/*75.52*/intake/*75.58*/.agency),format.raw/*75.65*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*76.33*/intake/*76.39*/.intakekey),format.raw/*76.49*/("""">"""),_display_(/*76.52*/intake/*76.58*/.requeststatus),format.raw/*76.72*/("""</a></td>
					</tr>
					""")))}),format.raw/*78.7*/(""" 
				"""),format.raw/*79.5*/("""</tbody>
			</table>
		</div>
		<div><a href="/exportprofiles/All" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
	</section>
""")))}))
      }
    }
  }

  def render(intakeList:java.util.List[Intake],lookups:java.util.List[Lookup],users:java.util.List[User]): play.twirl.api.HtmlFormat.Appendable = apply(intakeList,lookups,users)

  def f:((java.util.List[Intake],java.util.List[Lookup],java.util.List[User]) => play.twirl.api.HtmlFormat.Appendable) = (intakeList,lookups,users) => apply(intakeList,lookups,users)

  def ref: this.type = this

}


}

/**/
object home extends home_Scope0.home
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 14:19:19 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/home.scala.html
                  HASH: fd0bf42effb83e6ddbe962452bb57d096835adb7
                  MATRIX: 803->1|997->99|1025->102|1043->112|1082->114|1110->116|1150->130|1164->136|1224->176|1300->226|1314->232|1379->277|1454->326|1468->332|1519->363|1648->465|1676->466|1706->470|1808->544|1837->545|1869->550|1916->570|1944->571|2020->619|2049->620|2081->625|2126->643|2154->644|2186->649|2214->650|2831->1240|2869->1262|2909->1264|2950->1278|3000->1319|3040->1321|3083->1337|3098->1343|3124->1348|3154->1351|3169->1357|3195->1362|3237->1372|3281->1385|3321->1397|3882->1931|3920->1953|3960->1955|4001->1969|4043->2002|4083->2004|4126->2020|4141->2026|4167->2031|4197->2034|4212->2040|4238->2045|4280->2055|4324->2068|4364->2080|4803->2493|4844->2518|4884->2520|4917->2526|4981->2563|4996->2569|5027->2579|5057->2582|5072->2588|5103->2598|5172->2640|5187->2646|5218->2656|5248->2659|5263->2665|5296->2677|5365->2719|5380->2725|5411->2735|5441->2738|5456->2744|5484->2751|5553->2793|5568->2799|5599->2809|5629->2812|5644->2818|5679->2832|5736->2859|5769->2865
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|40->9|41->10|41->10|42->11|43->12|43->12|44->13|44->13|45->14|46->15|46->15|47->16|47->16|62->31|62->31|62->31|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|63->32|64->33|65->34|80->49|80->49|80->49|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|81->50|82->51|83->52|102->71|102->71|102->71|103->72|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|109->78|110->79
                  -- GENERATED --
              */
          