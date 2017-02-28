
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object searchintake_Scope0 {
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

class searchintake extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[java.util.List[Intake],java.util.List[Lookup],java.util.List[User],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeList: java.util.List[Intake], lookups: java.util.List[Lookup], users: java.util.List[User], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.text.SimpleDateFormat

Seq[Any](format.raw/*1.112*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(null)/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
	"""),format.raw/*6.2*/("""<script src=""""),_display_(/*6.16*/routes/*6.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*6.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*7.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*8.15*/routes/*8.21*/.Assets.at("css/tablesort.css")),format.raw/*8.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript" language="javascript" >
		$(document).ready(function() """),format.raw/*10.32*/("""{"""),format.raw/*10.33*/("""
			"""),format.raw/*11.4*/("""$("#tableAll").tablesorter();
			$(".selectFirstField").change(function() """),format.raw/*12.45*/("""{"""),format.raw/*12.46*/("""
				"""),format.raw/*13.5*/("""filterSearch("selectFirstField", "reqstatus")
			"""),format.raw/*14.4*/("""}"""),format.raw/*14.5*/(""");
			$(".selectSecondField").change(function() """),format.raw/*15.46*/("""{"""),format.raw/*15.47*/("""
				"""),format.raw/*16.5*/("""filterSearch("selectSecondField", "agency")
			"""),format.raw/*17.4*/("""}"""),format.raw/*17.5*/(""");
			$(".selectThirdField").change(function() """),format.raw/*18.45*/("""{"""),format.raw/*18.46*/("""
				"""),format.raw/*19.5*/("""filterSearch("selectThirdField", "ba")
			"""),format.raw/*20.4*/("""}"""),format.raw/*20.5*/(""");
			$(".selectFourthField").change(function() """),format.raw/*21.46*/("""{"""),format.raw/*21.47*/("""
				"""),format.raw/*22.5*/("""filterSearch("selectFourthField", "se")
			"""),format.raw/*23.4*/("""}"""),format.raw/*23.5*/(""");
		"""),format.raw/*24.3*/("""}"""),format.raw/*24.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
			<h5>All Projects:</h5>
			"""),_display_(/*29.5*/if(user.role.getValue() >= 3)/*29.34*/ {_display_(Seq[Any](format.raw/*29.36*/("""
				"""),format.raw/*30.5*/("""<a href="/addintake" class="buttonCustomView" style="color: #FFFFFF;">Add New Project</a>
  			""")))}),format.raw/*31.7*/("""
			"""),format.raw/*32.4*/("""<div class="container">
  				<div class="row" style="margin: auto;">
					<div class="col-sm-3">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="medium">
									<span>
										<select class="selectFirstField" name="selectFirstField" id="selectFirstField">
											<option selected="selected" value="" disabled="disabled">--- Filter By Req Status ---</option>
											<option value="All">All</option>
											"""),_display_(/*42.13*/for(lookup <- lookups) yield /*42.35*/ {_display_(Seq[Any](format.raw/*42.37*/("""
												"""),_display_(/*43.14*/if(lookup.lookuptype == "Request Status")/*43.55*/ {_display_(Seq[Any](format.raw/*43.57*/("""<option value=""""),_display_(/*43.73*/lookup/*43.79*/.name),format.raw/*43.84*/("""">"""),_display_(/*43.87*/lookup/*43.93*/.name),format.raw/*43.98*/("""</option>""")))}),format.raw/*43.108*/("""
											""")))}),format.raw/*44.13*/("""	
										"""),format.raw/*45.11*/("""</select>
										<i></i><span class="iconPlacement"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="medium">
									<span>
										<select class="selectSecondField" name="selectSecondField" id="selectSecondField">
											<option selected="selected" value="" disabled="disabled">--- Filter By Agency ---</option>
											<option value="All">All</option>
											"""),_display_(/*60.13*/for(lookup <- lookups) yield /*60.35*/ {_display_(Seq[Any](format.raw/*60.37*/("""
												"""),_display_(/*61.14*/if(lookup.lookuptype == "Agency")/*61.47*/ {_display_(Seq[Any](format.raw/*61.49*/("""<option value=""""),_display_(/*61.65*/lookup/*61.71*/.name),format.raw/*61.76*/("""">"""),_display_(/*61.79*/lookup/*61.85*/.name),format.raw/*61.90*/("""</option>""")))}),format.raw/*61.100*/("""
											""")))}),format.raw/*62.13*/("""	
										"""),format.raw/*63.11*/("""</select>
										<i></i><span class="iconPlacement"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="medium">
									<span>
										<select class="selectThirdField" name="selectThirdField" id="selectThirdField">
											<option selected="selected" value="" disabled="disabled">--- Filter By BA ---</option>
											<option value="All">All</option>
											"""),_display_(/*78.13*/for(people <- users) yield /*78.33*/ {_display_(Seq[Any](format.raw/*78.35*/("""
												"""),_display_(/*79.14*/if(people.role.toString() == "1")/*79.47*/ {_display_(Seq[Any](format.raw/*79.49*/("""<option value=""""),_display_(/*79.65*/people/*79.71*/.fullname),format.raw/*79.80*/("""">"""),_display_(/*79.83*/people/*79.89*/.fullname),format.raw/*79.98*/("""</option>""")))}),format.raw/*79.108*/("""
											""")))}),format.raw/*80.13*/("""	
										"""),format.raw/*81.11*/("""</select>
										<i></i><span class="iconPlacement"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-3">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="medium">
									<span>
										<select class="selectFourthField" name="selectFourthField" id="selectFourthField">
											<option selected="selected" value="" disabled="disabled">--- Filter By SE ---</option>
											<option value="All">All</option>
											"""),_display_(/*96.13*/for(people <- users) yield /*96.33*/ {_display_(Seq[Any](format.raw/*96.35*/("""
												"""),_display_(/*97.14*/if(people.role.toString() == "2")/*97.47*/ {_display_(Seq[Any](format.raw/*97.49*/("""<option value=""""),_display_(/*97.65*/people/*97.71*/.fullname),format.raw/*97.80*/("""">"""),_display_(/*97.83*/people/*97.89*/.fullname),format.raw/*97.98*/("""</option>""")))}),format.raw/*97.108*/("""
											""")))}),format.raw/*98.13*/("""	
										"""),format.raw/*99.11*/("""</select>
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
						<th>Date Requested</th>
						<th>Request Status</th>
						<th>BA</th>
						<th>SE</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*121.7*/for(intake <- intakeList) yield /*121.32*/ {_display_(Seq[Any](format.raw/*121.34*/("""
					"""),format.raw/*122.6*/("""<tr>
						<td><a href="/openintake/"""),_display_(/*123.33*/intake/*123.39*/.intakekey),format.raw/*123.49*/("""">"""),_display_(/*123.52*/intake/*123.58*/.projectid),format.raw/*123.68*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*124.33*/intake/*124.39*/.intakekey),format.raw/*124.49*/("""">"""),_display_(/*124.52*/intake/*124.58*/.projectname),format.raw/*124.70*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*125.33*/intake/*125.39*/.intakekey),format.raw/*125.49*/("""">"""),_display_(/*125.52*/intake/*125.58*/.agency),format.raw/*125.65*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*126.33*/intake/*126.39*/.intakekey),format.raw/*126.49*/("""">"""),_display_(/*126.52*/if(intake.daterequested != null)/*126.84*/{_display_(_display_(/*126.86*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.daterequested))))}),format.raw/*126.152*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*127.33*/intake/*127.39*/.intakekey),format.raw/*127.49*/("""">"""),_display_(/*127.52*/intake/*127.58*/.requeststatus),format.raw/*127.72*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*128.33*/intake/*128.39*/.intakekey),format.raw/*128.49*/("""">"""),_display_(/*128.52*/intake/*128.58*/.baassigned),format.raw/*128.69*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*129.33*/intake/*129.39*/.intakekey),format.raw/*129.49*/("""">"""),_display_(/*129.52*/intake/*129.58*/.seassigned),format.raw/*129.69*/("""</a></td>
					</tr>
					""")))}),format.raw/*131.7*/(""" 
				"""),format.raw/*132.5*/("""</tbody>
			</table>
		</div>
		<div><a id="exportButton" href="" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
	</section>
	<script type="text/javascript" language="javascript" >
		window.onload = function() """),format.raw/*138.30*/("""{"""),format.raw/*138.31*/("""
		    """),format.raw/*139.7*/("""var queryString = window.location.search;
		    if (queryString.length === 0 || !queryString) """),format.raw/*140.53*/("""{"""),format.raw/*140.54*/("""
		    	"""),format.raw/*141.8*/("""queryString = "?type=All&value=All";
		    """),format.raw/*142.7*/("""}"""),format.raw/*142.8*/("""
		    """),format.raw/*143.7*/("""var a = document.getElementById("exportButton");
		    a.href = "/exportintake" + queryString;
		"""),format.raw/*145.3*/("""}"""),format.raw/*145.4*/("""
	"""),format.raw/*146.2*/("""</script>
""")))}))
      }
    }
  }

  def render(intakeList:java.util.List[Intake],lookups:java.util.List[Lookup],users:java.util.List[User],user:User): play.twirl.api.HtmlFormat.Appendable = apply(intakeList,lookups,users,user)

  def f:((java.util.List[Intake],java.util.List[Lookup],java.util.List[User],User) => play.twirl.api.HtmlFormat.Appendable) = (intakeList,lookups,users,user) => apply(intakeList,lookups,users,user)

  def ref: this.type = this

}


}

/**/
object searchintake extends searchintake_Scope0.searchintake
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:16 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/searchintake.scala.html
                  HASH: fa25c14e7a7da08cefdc3fb7c8cc1060833be763
                  MATRIX: 831->1|1070->111|1100->151|1128->154|1146->164|1185->166|1214->169|1254->183|1268->189|1328->229|1405->280|1419->286|1484->331|1560->381|1574->387|1625->418|1780->545|1809->546|1841->551|1944->626|1973->627|2006->633|2083->683|2111->684|2188->733|2217->734|2250->740|2325->788|2353->789|2429->837|2458->838|2491->844|2561->887|2589->888|2666->937|2695->938|2728->944|2799->988|2827->989|2860->995|2888->996|3050->1132|3088->1161|3128->1163|3161->1169|3288->1266|3320->1271|3828->1752|3866->1774|3906->1776|3948->1791|3998->1832|4038->1834|4081->1850|4096->1856|4122->1861|4152->1864|4167->1870|4193->1875|4235->1885|4280->1899|4321->1912|4897->2461|4935->2483|4975->2485|5017->2500|5059->2533|5099->2535|5142->2551|5157->2557|5183->2562|5213->2565|5228->2571|5254->2576|5296->2586|5341->2600|5382->2613|5951->3155|5987->3175|6027->3177|6069->3192|6111->3225|6151->3227|6194->3243|6209->3249|6239->3258|6269->3261|6284->3267|6314->3276|6356->3286|6401->3300|6442->3313|7014->3858|7050->3878|7090->3880|7132->3895|7174->3928|7214->3930|7257->3946|7272->3952|7302->3961|7332->3964|7347->3970|7377->3979|7419->3989|7464->4003|7505->4016|8033->4517|8075->4542|8116->4544|8151->4551|8217->4589|8233->4595|8265->4605|8296->4608|8312->4614|8344->4624|8415->4667|8431->4673|8463->4683|8494->4686|8510->4692|8544->4704|8615->4747|8631->4753|8663->4763|8694->4766|8710->4772|8739->4779|8810->4822|8826->4828|8858->4838|8889->4841|8931->4873|8962->4875|9053->4941|9124->4984|9140->4990|9172->5000|9203->5003|9219->5009|9255->5023|9326->5066|9342->5072|9374->5082|9405->5085|9421->5091|9454->5102|9525->5145|9541->5151|9573->5161|9604->5164|9620->5170|9653->5181|9713->5210|9748->5217|10022->5462|10052->5463|10088->5471|10212->5566|10242->5567|10279->5576|10351->5620|10380->5621|10416->5629|10543->5728|10572->5729|10603->5732
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|40->10|40->10|41->11|42->12|42->12|43->13|44->14|44->14|45->15|45->15|46->16|47->17|47->17|48->18|48->18|49->19|50->20|50->20|51->21|51->21|52->22|53->23|53->23|54->24|54->24|59->29|59->29|59->29|60->30|61->31|62->32|72->42|72->42|72->42|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|74->44|75->45|90->60|90->60|90->60|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|92->62|93->63|108->78|108->78|108->78|109->79|109->79|109->79|109->79|109->79|109->79|109->79|109->79|109->79|109->79|110->80|111->81|126->96|126->96|126->96|127->97|127->97|127->97|127->97|127->97|127->97|127->97|127->97|127->97|127->97|128->98|129->99|151->121|151->121|151->121|152->122|153->123|153->123|153->123|153->123|153->123|153->123|154->124|154->124|154->124|154->124|154->124|154->124|155->125|155->125|155->125|155->125|155->125|155->125|156->126|156->126|156->126|156->126|156->126|156->126|156->126|157->127|157->127|157->127|157->127|157->127|157->127|158->128|158->128|158->128|158->128|158->128|158->128|159->129|159->129|159->129|159->129|159->129|159->129|161->131|162->132|168->138|168->138|169->139|170->140|170->140|171->141|172->142|172->142|173->143|175->145|175->145|176->146
                  -- GENERATED --
              */
          