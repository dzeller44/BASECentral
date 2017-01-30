
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[User,Html,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: User = null, scripts: Html = Html(""), currentEmail: String=controllers.helpers.AccessMiddleware.getSessionEmail())(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.139*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
		<title>BASE Central | Colorado Governor's Office of Information Technology</title>
  		<link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.at("img/favicon.ico")),format.raw/*8.90*/("""">
  	  	
  		<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,100italic,300,300italic,400italic,500italic,700,500,700italic,900,900italic' rel='stylesheet' type='text/css'>
		<link href="http://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css" rel="stylesheet">

		<link rel="stylesheet" href=""""),_display_(/*13.33*/routes/*13.39*/.Assets.at("css/app.css")),format.raw/*13.64*/("""">
		<link href=""""),_display_(/*14.16*/routes/*14.22*/.Assets.at("css/bootstrap/bootstrap.min.css")),format.raw/*14.67*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*15.16*/routes/*15.22*/.Assets.at("css/flexslider.css")),format.raw/*15.54*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*16.16*/routes/*16.22*/.Assets.at("css/prettyPhoto.css")),format.raw/*16.55*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*17.16*/routes/*17.22*/.Assets.at("css/animate.css")),format.raw/*17.51*/("""" rel="stylesheet" type="text/css" media="all" />
		<link href=""""),_display_(/*18.16*/routes/*18.22*/.Assets.at("css/owl.carousel.css")),format.raw/*18.56*/("""" rel="stylesheet">
		<link href=""""),_display_(/*19.16*/routes/*19.22*/.Assets.at("css/style.css")),format.raw/*19.49*/("""" rel="stylesheet" type="text/css" />
		<link href=""""),_display_(/*20.16*/routes/*20.22*/.Assets.at("css/formoid/formoid-solid-dark.css")),format.raw/*20.70*/("""" rel="stylesheet" type="text/css" />
         
	    <script data-main=""""),_display_(/*22.26*/routes/*22.32*/.Assets.at("js/main.js")),format.raw/*22.56*/("""" src=""""),_display_(/*22.64*/routes/*22.70*/.Assets.at("lib/requirejs/require.js")),format.raw/*22.108*/(""""></script>
	    <script src=""""),_display_(/*23.20*/routes/*23.26*/.Assets.at("lib/angularjs/angular.js")),format.raw/*23.64*/("""" type="text/javascript"></script>
	   	<script src=""""),_display_(/*24.20*/routes/*24.26*/.Assets.at("js/jquery/jquery.min.js")),format.raw/*24.63*/("""" type="text/javascript"></script>
	   	<script src=""""),_display_(/*25.20*/routes/*25.26*/.Assets.at("js/bootstrap/bootstrap.js")),format.raw/*25.65*/("""" type="text/javascript"></script>
	    <script src=""""),_display_(/*26.20*/routes/*26.26*/.Assets.at("js/password.js")),format.raw/*26.54*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*27.17*/routes/*27.23*/.Assets.at("js/jquery/jquery.prettyPhoto.js")),format.raw/*27.68*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*28.17*/routes/*28.23*/.Assets.at("js/jquery/jquery.nicescroll.min.js")),format.raw/*28.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*29.17*/routes/*29.23*/.Assets.at("js/superfish.min.js")),format.raw/*29.56*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*30.17*/routes/*30.23*/.Assets.at("js/jquery/jquery.flexslider-min.js")),format.raw/*30.71*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*31.17*/routes/*31.23*/.Assets.at("js/owl.carousel.js")),format.raw/*31.55*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*32.17*/routes/*32.23*/.Assets.at("js/animate.js")),format.raw/*32.50*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*33.17*/routes/*33.23*/.Assets.at("js/jquery/jquery.BlackAndWhite.js")),format.raw/*33.70*/(""""></script>
		<script src=""""),_display_(/*34.17*/routes/*34.23*/.Assets.at("js/myscript.js")),format.raw/*34.51*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*35.17*/routes/*35.23*/.Assets.at("js/global.js")),format.raw/*35.49*/("""" type="text/javascript"></script>
	    <script>
			//PrettyPhoto
			jQuery(document).ready(function() """),format.raw/*38.38*/("""{"""),format.raw/*38.39*/("""
				"""),format.raw/*39.5*/("""$("a[rel^='prettyPhoto']").prettyPhoto();
			"""),format.raw/*40.4*/("""}"""),format.raw/*40.5*/(""");
	
			//BlackAndWhite
			$(window).load(function() """),format.raw/*43.30*/("""{"""),format.raw/*43.31*/("""
				"""),format.raw/*44.5*/("""$('.client_img').BlackAndWhite("""),format.raw/*44.36*/("""{"""),format.raw/*44.37*/("""
					"""),format.raw/*45.6*/("""hoverEffect : true, // default true
					// set the path to BnWWorker.js for a superfast implementation
					webworkerPath : false,
					// for the images with a fluid width and height
					responsive : true,
					// to invert the hover effect
					invertHoverEffect : false,
					// this option works only on the modern browsers ( on IE lower than 9 it remains always 1)
					intensity : 1,
					speed : """),format.raw/*54.14*/("""{"""),format.raw/*54.15*/(""" """),format.raw/*54.16*/("""//this property could also be just speed: value for both fadeIn and fadeOut
						fadeIn : 300, // 200ms for fadeIn animations
						fadeOut : 300
					// 800ms for fadeOut animations
					"""),format.raw/*58.6*/("""}"""),format.raw/*58.7*/(""",
					onImageReady : function(img) """),format.raw/*59.35*/("""{"""),format.raw/*59.36*/("""
						"""),format.raw/*60.7*/("""// this callback gets executed anytime an image is converted
					"""),format.raw/*61.6*/("""}"""),format.raw/*61.7*/("""
				"""),format.raw/*62.5*/("""}"""),format.raw/*62.6*/(""");
			"""),format.raw/*63.4*/("""}"""),format.raw/*63.5*/(""");
	
			document.getElementById("searchText").addEventListener("keyup", function(event) """),format.raw/*65.84*/("""{"""),format.raw/*65.85*/("""
		    	"""),format.raw/*66.8*/("""event.preventDefault();
			    if (event.keyCode == 13) """),format.raw/*67.33*/("""{"""),format.raw/*67.34*/("""
			        """),format.raw/*68.12*/("""document.getElementById("searchTextButton").click();
			    """),format.raw/*69.8*/("""}"""),format.raw/*69.9*/("""
			"""),format.raw/*70.4*/("""}"""),format.raw/*70.5*/(""");
		</script>   
    </head>
<body>
	<img id="preloader" src=""""),_display_(/*74.28*/routes/*74.34*/.Assets.at("img/preloader.gif")),format.raw/*74.65*/("""" alt="" />
	<div class="preloader_hide">
		<div id="page">
			<header>
				<div class="menu_block">
					<div class="container clearfix">						
					<div class="row vertical-align">
							<div class="col-md-3 logo pull-left">
								<a href="/"><img src=""""),_display_(/*82.32*/routes/*82.38*/.Assets.at("img/co/CO_OIT_Logo_Trans_80px.png")),format.raw/*82.85*/(""""></a>
							</div>
							<div class="col-md-4">
								"""),_display_(/*85.10*/if(Option(currentEmail).forall(_.isEmpty))/*85.52*/ {_display_(Seq[Any](format.raw/*85.54*/("""
								""")))}/*86.11*/else/*86.16*/{_display_(Seq[Any](format.raw/*86.17*/("""
									"""),format.raw/*87.10*/("""<span class="singleField">
										<input class="medium" type="text" id="searchText" name="searchText" placeholder="Search Project IDs..." onkeydown="if (event.keyCode == 13) searchProjects();" />
										<span><a href="javascript:searchProjects();"><img src=""""),_display_(/*89.67*/routes/*89.73*/.Assets.at("img/icon_Search_Main.png")),format.raw/*89.111*/(""""></a></span>
									</span>
								""")))}),format.raw/*91.10*/("""
							"""),format.raw/*92.8*/("""</div>
							<div class="col-md-5 pull-right">
								<nav class="navmenu center">
									<ul>
										<li class="scroll_btn"><a href="/">Home</a></li>
										<li class="scroll_btn"><a href="/contact">Contact</a></li>
										"""),_display_(/*98.12*/if(Option(currentEmail).forall(_.isEmpty))/*98.54*/ {_display_(Seq[Any](format.raw/*98.56*/("""
											"""),format.raw/*99.12*/("""<li class="scroll_btn"><a href="/auth">Login</a></li>
										""")))}/*100.13*/else/*100.18*/{_display_(Seq[Any](format.raw/*100.19*/("""
											"""),format.raw/*101.12*/("""<li class="scroll_btn"><a href="/logout">Logout</a></li>
											<li class="scroll_btn"><a href="/useraccount?email="""),_display_(/*102.64*/currentEmail),format.raw/*102.76*/("""" style="text-transform: lowercase;">"""),_display_(/*102.114*/currentEmail),format.raw/*102.126*/("""</a></li>
										""")))}),format.raw/*103.12*/("""
									"""),format.raw/*104.10*/("""</ul>
								</nav>
							</div>
						</div>
					</div>
				</div>
			</header>
			<section id="home" class="padbot0">
				<div class="mainBlock">
					<div class="container" data-appear-top-offset="-200"
						data-animated="fadeInUp">
						<div id="myTabContent" class="tab-content">
							<div class="tab-pane fade in active clearfix" id="tab1">
								<p class="title">
									<b>BASE Central</b>
								</p>
								<span>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. </span>
							</div>

						</div>
					</div>
				</div>
			</section>
  			<!-- Used for padding and scrolling -->
			<section id="blankMain">
				<!-- BLANK -->
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			
  			<div>"""),_display_(/*133.12*/content),format.raw/*133.19*/("""</div>
  
  			<!-- Used for padding and scrolling -->
			<section id="blank1">
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank2">
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank3">
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank4">
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank5">
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<section id="blank6">
				<div class="services_block padbot40" data-appear-top-offset="-200"></div>
			</section>
			<footer>
				<div class="container">
					<div class="row" data-appear-top-offset="-200">
						<div class="socialCenterAll">
							<ul class="social">
								<li><a href="http://http://www.oit.state.co.us//" target="_blank">OIT</a></li>
								<li><a href="https://www.facebook.com/ColoradoOIT"
									target="_blank"><i class="fa fa-facebook"></i></a></li>
								<li><a
									href="https://www.google.com/maps/place/601+E.+18th Ave.,+ Denver,+CO+80203"
									target="_blank"><i class="map_show fa fa-map-marker"></i></a></li>
								<li><a href="https://www.colorado.gov/"
									target="_blank">SOC</a></li>
							</ul>
						</div>
					</div>
					<div class="row">
						<div class="col-sm-12 text-center">
							<div class="agencyLine">Colorado Governor's Office of Information Technology</div>
							<div class="linkBack">
								<a href="https://icons8.com" target="_blank">Icon pack by Icons8</a>
								&nbsp;||&nbsp;
								<a href="http://formoid.com/" target="_blank">Forms by Formoid</a>
							</div>
						</div>						
					</div>
				</div>
			</footer>
		</div>
	</div>
    </body>
	<!-- Modal for Adding Comments -->
	<div id="modalComments" class="modal fade" style="z-index: 9999;" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">Add Comments</h4>
				</div>
				<div class="modal-body">
					<link href=""""),_display_(/*194.19*/routes/*194.25*/.Assets.at("css/formoid/formoid-solid-dark.css")),format.raw/*194.73*/("""" rel="stylesheet" type="text/css" />
					<div class="commentTextArea">
						<label class="title"><span class="required">*</span>Enter your comments:</label>
						<div class="item-cont"><textarea class="medium" name="comments" id="comments" cols="20" rows="5" required="required" placeholder="Enter your comments..."></textarea><span class="icon-place"></span></div>
					</div>
				</div>
				<div class="modal-footer">
					<div class="container">
						<div class="row">
							<div class="col-sm-4">
							</div>
							<div class="col-sm-4">
								<div><a href="javascript:addComments();" class="buttonCustomView" style="color: #FFFFFF;">Add Comment</a></div>
							</div>
							<div class="col-sm-4">
								<button type="button" class="buttonCustomView" style="color: #FFFFFF;" data-dismiss="modal">Cancel</button>
							</div>
						</div>
					</div>
					<script type="text/javascript">
						function addComments() """),format.raw/*214.30*/("""{"""),format.raw/*214.31*/("""
							"""),format.raw/*215.8*/("""console.log("Add Comment");
							var e;
							var fieldValue1;
							var fieldValue2;
							e = document.getElementById("intakekey");
							fieldValue1 = e.value;
							console.log("intake key = " + fieldValue1);
							e = document.getElementById("comments");
							fieldValue2 = e.value;
							console.log("comments = " + fieldValue2);
							window.location.href = "/addcomments?intakekey=" + fieldValue1 + "&comment=" + fieldValue2;
						"""),format.raw/*226.7*/("""}"""),format.raw/*226.8*/("""
					"""),format.raw/*227.6*/("""</script>
				</div>
			</div>
		</div>
	</div>
</html>
"""))
      }
    }
  }

  def render(user:User,scripts:Html,currentEmail:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(user,scripts,currentEmail)(content)

  def f:((User,Html,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (user,scripts,currentEmail) => (content) => apply(user,scripts,currentEmail)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 10:30:32 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/main.scala.html
                  HASH: fe116f7b20e5f59666adcb92001b823708957119
                  MATRIX: 758->1|991->138|1021->142|1226->321|1240->327|1289->356|1649->689|1664->695|1710->720|1756->739|1771->745|1837->790|1918->844|1933->850|1986->882|2067->936|2082->942|2136->975|2217->1029|2232->1035|2282->1064|2375->1130|2390->1136|2445->1170|2508->1206|2523->1212|2571->1239|2652->1293|2667->1299|2736->1347|2838->1422|2853->1428|2898->1452|2933->1460|2948->1466|3008->1504|3067->1536|3082->1542|3141->1580|3223->1635|3238->1641|3296->1678|3378->1733|3393->1739|3453->1778|3535->1833|3550->1839|3599->1867|3678->1919|3693->1925|3759->1970|3838->2022|3853->2028|3922->2076|4001->2128|4016->2134|4070->2167|4149->2219|4164->2225|4233->2273|4312->2325|4327->2331|4380->2363|4459->2415|4474->2421|4522->2448|4601->2500|4616->2506|4684->2553|4740->2582|4755->2588|4804->2616|4883->2668|4898->2674|4945->2700|5079->2806|5108->2807|5141->2813|5214->2859|5242->2860|5326->2916|5355->2917|5388->2923|5447->2954|5476->2955|5510->2962|5952->3376|5981->3377|6010->3378|6230->3571|6258->3572|6323->3609|6352->3610|6387->3618|6481->3685|6509->3686|6542->3692|6570->3693|6604->3700|6632->3701|6750->3791|6779->3792|6815->3801|6900->3858|6929->3859|6970->3872|7058->3933|7086->3934|7118->3939|7146->3940|7241->4008|7256->4014|7308->4045|7602->4312|7617->4318|7685->4365|7775->4428|7826->4470|7866->4472|7896->4484|7909->4489|7948->4490|7987->4501|8281->4768|8296->4774|8356->4812|8429->4854|8465->4863|8736->5107|8787->5149|8827->5151|8868->5164|8954->5231|8968->5236|9008->5237|9050->5250|9199->5371|9233->5383|9300->5421|9335->5433|9389->5455|9429->5466|10253->6262|10282->6269|12647->8606|12663->8612|12733->8660|13718->9616|13748->9617|13785->9626|14276->10089|14305->10090|14340->10097
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|69->38|69->38|70->39|71->40|71->40|74->43|74->43|75->44|75->44|75->44|76->45|85->54|85->54|85->54|89->58|89->58|90->59|90->59|91->60|92->61|92->61|93->62|93->62|94->63|94->63|96->65|96->65|97->66|98->67|98->67|99->68|100->69|100->69|101->70|101->70|105->74|105->74|105->74|113->82|113->82|113->82|116->85|116->85|116->85|117->86|117->86|117->86|118->87|120->89|120->89|120->89|122->91|123->92|129->98|129->98|129->98|130->99|131->100|131->100|131->100|132->101|133->102|133->102|133->102|133->102|134->103|135->104|164->133|164->133|225->194|225->194|225->194|245->214|245->214|246->215|257->226|257->226|258->227
                  -- GENERATED --
              */
          