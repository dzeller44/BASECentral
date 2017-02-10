
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
	<script type="text/javascript">
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
		<div><a href="/exportintake/All" class="buttonCustomView" style="color: #FFFFFF;">Export This View</a></div>
	</section>
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
                  DATE: Fri Feb 10 14:19:21 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/searchintake.scala.html
                  HASH: 7cb65ca8b65d25416aa90fa89b119b077b4b1a49
                  MATRIX: 831->1|1070->111|1100->151|1128->154|1146->164|1185->166|1214->169|1254->183|1268->189|1328->229|1405->280|1419->286|1484->331|1560->381|1574->387|1625->418|1757->522|1786->523|1818->528|1921->603|1950->604|1983->610|2060->660|2088->661|2165->710|2194->711|2227->717|2302->765|2330->766|2406->814|2435->815|2468->821|2538->864|2566->865|2643->914|2672->915|2705->921|2776->965|2804->966|2837->972|2865->973|3027->1109|3065->1138|3105->1140|3138->1146|3265->1243|3297->1248|3805->1729|3843->1751|3883->1753|3925->1768|3975->1809|4015->1811|4058->1827|4073->1833|4099->1838|4129->1841|4144->1847|4170->1852|4212->1862|4257->1876|4298->1889|4874->2438|4912->2460|4952->2462|4994->2477|5036->2510|5076->2512|5119->2528|5134->2534|5160->2539|5190->2542|5205->2548|5231->2553|5273->2563|5318->2577|5359->2590|5928->3132|5964->3152|6004->3154|6046->3169|6088->3202|6128->3204|6171->3220|6186->3226|6216->3235|6246->3238|6261->3244|6291->3253|6333->3263|6378->3277|6419->3290|6991->3835|7027->3855|7067->3857|7109->3872|7151->3905|7191->3907|7234->3923|7249->3929|7279->3938|7309->3941|7324->3947|7354->3956|7396->3966|7441->3980|7482->3993|8010->4494|8052->4519|8093->4521|8128->4528|8194->4566|8210->4572|8242->4582|8273->4585|8289->4591|8321->4601|8392->4644|8408->4650|8440->4660|8471->4663|8487->4669|8521->4681|8592->4724|8608->4730|8640->4740|8671->4743|8687->4749|8716->4756|8787->4799|8803->4805|8835->4815|8866->4818|8908->4850|8939->4852|9030->4918|9101->4961|9117->4967|9149->4977|9180->4980|9196->4986|9232->5000|9303->5043|9319->5049|9351->5059|9382->5062|9398->5068|9431->5079|9502->5122|9518->5128|9550->5138|9581->5141|9597->5147|9630->5158|9690->5187|9725->5194
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|40->10|40->10|41->11|42->12|42->12|43->13|44->14|44->14|45->15|45->15|46->16|47->17|47->17|48->18|48->18|49->19|50->20|50->20|51->21|51->21|52->22|53->23|53->23|54->24|54->24|59->29|59->29|59->29|60->30|61->31|62->32|72->42|72->42|72->42|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|73->43|74->44|75->45|90->60|90->60|90->60|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|92->62|93->63|108->78|108->78|108->78|109->79|109->79|109->79|109->79|109->79|109->79|109->79|109->79|109->79|109->79|110->80|111->81|126->96|126->96|126->96|127->97|127->97|127->97|127->97|127->97|127->97|127->97|127->97|127->97|127->97|128->98|129->99|151->121|151->121|151->121|152->122|153->123|153->123|153->123|153->123|153->123|153->123|154->124|154->124|154->124|154->124|154->124|154->124|155->125|155->125|155->125|155->125|155->125|155->125|156->126|156->126|156->126|156->126|156->126|156->126|156->126|157->127|157->127|157->127|157->127|157->127|157->127|158->128|158->128|158->128|158->128|158->128|158->128|159->129|159->129|159->129|159->129|159->129|159->129|161->131|162->132
                  -- GENERATED --
              */
          