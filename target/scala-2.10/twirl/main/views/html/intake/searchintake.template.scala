
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


Seq[Any](format.raw/*1.112*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*5.16*/routes/*5.22*/.Assets.at("js/jquery/jquery.tablesorter.js")),format.raw/*5.67*/("""" type="text/javascript"></script>
	<link href=""""),_display_(/*6.15*/routes/*6.21*/.Assets.at("css/tablesort.css")),format.raw/*6.52*/("""" rel="stylesheet" type="text/css" />
	<script type="text/javascript">
		$(document).ready(function() """),format.raw/*8.32*/("""{"""),format.raw/*8.33*/("""
			"""),format.raw/*9.4*/("""$("#tableAll").tablesorter();
			$(".selectFirstField").change(function() """),format.raw/*10.45*/("""{"""),format.raw/*10.46*/("""
				"""),format.raw/*11.5*/("""filterSearch("selectFirstField", "reqstatus")
			"""),format.raw/*12.4*/("""}"""),format.raw/*12.5*/(""");
			$(".selectSecondField").change(function() """),format.raw/*13.46*/("""{"""),format.raw/*13.47*/("""
				"""),format.raw/*14.5*/("""filterSearch("selectSecondField", "agency")
			"""),format.raw/*15.4*/("""}"""),format.raw/*15.5*/(""");
			$(".selectThirdField").change(function() """),format.raw/*16.45*/("""{"""),format.raw/*16.46*/("""
				"""),format.raw/*17.5*/("""filterSearch("selectThirdField", "ba")
			"""),format.raw/*18.4*/("""}"""),format.raw/*18.5*/(""");
			$(".selectFourthField").change(function() """),format.raw/*19.46*/("""{"""),format.raw/*19.47*/("""
				"""),format.raw/*20.5*/("""filterSearch("selectFourthField", "se")
			"""),format.raw/*21.4*/("""}"""),format.raw/*21.5*/(""");
		"""),format.raw/*22.3*/("""}"""),format.raw/*22.4*/(""");
	</script>
	<section id="displayResults" style="padding: 30px;">
		<div class="table-responsive">
			<h5>All Projects:</h5>
			"""),_display_(/*27.5*/if(user.getRolename().contains("Manager"))/*27.47*/ {_display_(Seq[Any](format.raw/*27.49*/("""
				"""),format.raw/*28.5*/("""<a href="/addintake" class="buttonCustomView" style="color: #FFFFFF;">Add New Project</a>
  			""")))}),format.raw/*29.7*/("""
			"""),format.raw/*30.4*/("""<div class="container">
  				<div class="row" style="margin: auto;">
					<div class="col-sm-3">
						<div class="element-select">
							<div class="selectDropdownField">
								<div class="medium">
									<span>
										<select class="selectFirstField" name="selectFirstField" id="selectFirstField">
											<option selected="selected" value="" disabled="disabled">--- Filter By Request Status ---</option>
											<option value="All">All</option>
											"""),_display_(/*40.13*/for(lookup <- lookups) yield /*40.35*/ {_display_(Seq[Any](format.raw/*40.37*/("""
												"""),_display_(/*41.14*/if(lookup.lookuptype == "Request Status")/*41.55*/ {_display_(Seq[Any](format.raw/*41.57*/("""<option value=""""),_display_(/*41.73*/lookup/*41.79*/.name),format.raw/*41.84*/("""">"""),_display_(/*41.87*/lookup/*41.93*/.name),format.raw/*41.98*/("""</option>""")))}),format.raw/*41.108*/("""
											""")))}),format.raw/*42.13*/("""	
										"""),format.raw/*43.11*/("""</select>
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
											"""),_display_(/*58.13*/for(lookup <- lookups) yield /*58.35*/ {_display_(Seq[Any](format.raw/*58.37*/("""
												"""),_display_(/*59.14*/if(lookup.lookuptype == "Agency")/*59.47*/ {_display_(Seq[Any](format.raw/*59.49*/("""<option value=""""),_display_(/*59.65*/lookup/*59.71*/.name),format.raw/*59.76*/("""">"""),_display_(/*59.79*/lookup/*59.85*/.name),format.raw/*59.90*/("""</option>""")))}),format.raw/*59.100*/("""
											""")))}),format.raw/*60.13*/("""	
										"""),format.raw/*61.11*/("""</select>
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
											"""),_display_(/*76.13*/for(people <- users) yield /*76.33*/ {_display_(Seq[Any](format.raw/*76.35*/("""
												"""),_display_(/*77.14*/if(people.role.toString() == "1")/*77.47*/ {_display_(Seq[Any](format.raw/*77.49*/("""<option value=""""),_display_(/*77.65*/people/*77.71*/.fullname),format.raw/*77.80*/("""">"""),_display_(/*77.83*/people/*77.89*/.fullname),format.raw/*77.98*/("""</option>""")))}),format.raw/*77.108*/("""
											""")))}),format.raw/*78.13*/("""	
										"""),format.raw/*79.11*/("""</select>
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
											"""),_display_(/*94.13*/for(people <- users) yield /*94.33*/ {_display_(Seq[Any](format.raw/*94.35*/("""
												"""),_display_(/*95.14*/if(people.role.toString() == "2")/*95.47*/ {_display_(Seq[Any](format.raw/*95.49*/("""<option value=""""),_display_(/*95.65*/people/*95.71*/.fullname),format.raw/*95.80*/("""">"""),_display_(/*95.83*/people/*95.89*/.fullname),format.raw/*95.98*/("""</option>""")))}),format.raw/*95.108*/("""
											""")))}),format.raw/*96.13*/("""	
										"""),format.raw/*97.11*/("""</select>
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
						<th>BA</th>
						<th>SE</th>
					</tr>
				</thead>
				<tbody>
					"""),_display_(/*118.7*/for(intake <- intakeList) yield /*118.32*/ {_display_(Seq[Any](format.raw/*118.34*/("""
					"""),format.raw/*119.6*/("""<tr>
						<td><a href="/openintake/"""),_display_(/*120.33*/intake/*120.39*/.intakekey),format.raw/*120.49*/("""">"""),_display_(/*120.52*/intake/*120.58*/.projectid),format.raw/*120.68*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*121.33*/intake/*121.39*/.intakekey),format.raw/*121.49*/("""">"""),_display_(/*121.52*/intake/*121.58*/.projectname),format.raw/*121.70*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*122.33*/intake/*122.39*/.intakekey),format.raw/*122.49*/("""">"""),_display_(/*122.52*/intake/*122.58*/.agency),format.raw/*122.65*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*123.33*/intake/*123.39*/.intakekey),format.raw/*123.49*/("""">"""),_display_(/*123.52*/intake/*123.58*/.requeststatus),format.raw/*123.72*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*124.33*/intake/*124.39*/.intakekey),format.raw/*124.49*/("""">"""),_display_(/*124.52*/intake/*124.58*/.baassigned),format.raw/*124.69*/("""</a></td>
						<td><a href="/openintake/"""),_display_(/*125.33*/intake/*125.39*/.intakekey),format.raw/*125.49*/("""">"""),_display_(/*125.52*/intake/*125.58*/.seassigned),format.raw/*125.69*/("""</a></td>
					</tr>
					""")))}),format.raw/*127.7*/(""" 
				"""),format.raw/*128.5*/("""</tbody>
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
                  DATE: Mon Jan 30 10:30:34 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/searchintake.scala.html
                  HASH: 06d9f8a238c9a9a38869b073244a7de018faf16f
                  MATRIX: 831->1|1037->111|1067->116|1085->126|1124->128|1153->131|1193->145|1207->151|1267->191|1344->242|1358->248|1423->293|1499->343|1513->349|1564->380|1695->484|1723->485|1754->490|1857->565|1886->566|1919->572|1996->622|2024->623|2101->672|2130->673|2163->679|2238->727|2266->728|2342->776|2371->777|2404->783|2474->826|2502->827|2579->876|2608->877|2641->883|2712->927|2740->928|2773->934|2801->935|2963->1071|3014->1113|3054->1115|3087->1121|3214->1218|3246->1223|3758->1708|3796->1730|3836->1732|3878->1747|3928->1788|3968->1790|4011->1806|4026->1812|4052->1817|4082->1820|4097->1826|4123->1831|4165->1841|4210->1855|4251->1868|4827->2417|4865->2439|4905->2441|4947->2456|4989->2489|5029->2491|5072->2507|5087->2513|5113->2518|5143->2521|5158->2527|5184->2532|5226->2542|5271->2556|5312->2569|5881->3111|5917->3131|5957->3133|5999->3148|6041->3181|6081->3183|6124->3199|6139->3205|6169->3214|6199->3217|6214->3223|6244->3232|6286->3242|6331->3256|6372->3269|6944->3814|6980->3834|7020->3836|7062->3851|7104->3884|7144->3886|7187->3902|7202->3908|7232->3917|7262->3920|7277->3926|7307->3935|7349->3945|7394->3959|7435->3972|7932->4442|7974->4467|8015->4469|8050->4476|8116->4514|8132->4520|8164->4530|8195->4533|8211->4539|8243->4549|8314->4592|8330->4598|8362->4608|8393->4611|8409->4617|8443->4629|8514->4672|8530->4678|8562->4688|8593->4691|8609->4697|8638->4704|8709->4747|8725->4753|8757->4763|8788->4766|8804->4772|8840->4786|8911->4829|8927->4835|8959->4845|8990->4848|9006->4854|9039->4865|9110->4908|9126->4914|9158->4924|9189->4927|9205->4933|9238->4944|9298->4973|9333->4980
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|37->6|37->6|39->8|39->8|40->9|41->10|41->10|42->11|43->12|43->12|44->13|44->13|45->14|46->15|46->15|47->16|47->16|48->17|49->18|49->18|50->19|50->19|51->20|52->21|52->21|53->22|53->22|58->27|58->27|58->27|59->28|60->29|61->30|71->40|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|72->41|73->42|74->43|89->58|89->58|89->58|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|90->59|91->60|92->61|107->76|107->76|107->76|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|108->77|109->78|110->79|125->94|125->94|125->94|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|126->95|127->96|128->97|149->118|149->118|149->118|150->119|151->120|151->120|151->120|151->120|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|153->122|153->122|153->122|153->122|154->123|154->123|154->123|154->123|154->123|154->123|155->124|155->124|155->124|155->124|155->124|155->124|156->125|156->125|156->125|156->125|156->125|156->125|158->127|159->128
                  -- GENERATED --
              */
          