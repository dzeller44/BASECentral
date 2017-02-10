
package views.html.account.reset

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object reset_Scope0 {
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

class reset extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[controllers.account.Reset.ResetForm],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(resetForm: Form[controllers.account.Reset.ResetForm], token: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.6*/implicitFieldConstructor/*4.30*/ = {{
        FieldConstructor(twitterBootstrapInput.render)
    }};
Seq[Any](format.raw/*1.71*/("""

"""),format.raw/*4.1*/("""    """),format.raw/*6.6*/("""

"""),_display_(/*8.2*/main(null)/*8.12*/ {_display_(Seq[Any](format.raw/*8.14*/("""
	"""),format.raw/*9.2*/("""<script src=""""),_display_(/*9.16*/routes/*9.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*9.62*/("""" type="text/javascript"></script>
	<script>
		jQuery(function()"""),format.raw/*11.20*/("""{"""),format.raw/*11.21*/("""
		      """),format.raw/*12.9*/("""$("#submit").click(function()"""),format.raw/*12.38*/("""{"""),format.raw/*12.39*/("""
		      """),format.raw/*13.9*/("""$(".error").hide();
		      var hasError = false;
		      var passwordVal = $("#password").val();
		      var checkVal = $("#password-check").val();
		      if (passwordVal == '') """),format.raw/*17.32*/("""{"""),format.raw/*17.33*/("""
		          """),format.raw/*18.13*/("""$("#password").after('<span class="error">Please enter a password.</span>');
		          hasError = true;
		      """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/(""" """),format.raw/*20.11*/("""else if (checkVal == '') """),format.raw/*20.36*/("""{"""),format.raw/*20.37*/("""
		          """),format.raw/*21.13*/("""$("#password-check").after('<span class="error">Please re-enter your password.</span>');
		          hasError = true;
		      """),format.raw/*23.9*/("""}"""),format.raw/*23.10*/(""" """),format.raw/*23.11*/("""else if (passwordVal != checkVal ) """),format.raw/*23.46*/("""{"""),format.raw/*23.47*/("""
		          """),format.raw/*24.13*/("""$("#password-check").after('<span class="error">Passwords do not match.</span>');
		          hasError = true;
		      """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
		      """),format.raw/*27.9*/("""if(hasError == true) """),format.raw/*27.30*/("""{"""),format.raw/*27.31*/("""return false;"""),format.raw/*27.44*/("""}"""),format.raw/*27.45*/("""
		  		"""),format.raw/*28.7*/("""}"""),format.raw/*28.8*/(""");
		"""),format.raw/*29.3*/("""}"""),format.raw/*29.4*/(""");
		
	</script>
	<section id="resetPasswordChange">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>"""),_display_(/*37.10*/Messages("resetpassword.new.password")),format.raw/*37.48*/("""</h2>
			</div>
			<div class="element-password">
				<label class="title"><span class="required">*</span>Password:</label>
				<div class="item-cont">
					<input class="large" type="password" name="password" id="password" value=""
						required="required" placeholder="Enter your password..." /><span
						class="icon-place"></span>
				</div>
				<div>Password must be 8 characters, contain 1 UPPERCASE character, 1 lowercase character, 1 number, and 1 special character (.*[!&#64#$!%^&+=]). </div>
			</div>
			<div class="element-password">
				<label class="title"><span class="required">*</span>Re-enter Password:</label>
				<div class="item-cont">
					<input class="large" type="password" name="password-check" id="password-check" value=""
						required="required" placeholder="Re-enter password..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-input">
				"""),_display_(/*57.6*/if(resetForm.hasGlobalErrors)/*57.35*/ {_display_(Seq[Any](format.raw/*57.37*/("""
					"""),format.raw/*58.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*58.65*/resetForm/*58.74*/.globalError.message),format.raw/*58.94*/("""</span>
				""")))}),format.raw/*59.6*/("""
			"""),format.raw/*60.4*/("""</div>
			<div class="submit">
				<input type="submit" value=""""),_display_(/*62.34*/Messages("validate")),format.raw/*62.54*/("""" id="submit"/>
				<a href="/" class="buttonCancel">"""),_display_(/*63.39*/Messages("goback")),format.raw/*63.57*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
""")))}),format.raw/*69.2*/("""
"""))
      }
    }
  }

  def render(resetForm:Form[controllers.account.Reset.ResetForm],token:String): play.twirl.api.HtmlFormat.Appendable = apply(resetForm,token)

  def f:((Form[controllers.account.Reset.ResetForm],String) => play.twirl.api.HtmlFormat.Appendable) = (resetForm,token) => apply(resetForm,token)

  def ref: this.type = this

}


}

/**/
object reset extends reset_Scope0.reset
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 14:19:19 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/account/reset/reset.scala.html
                  HASH: b1283956a2c603271126ac89f22f52dce7e958e4
                  MATRIX: 801->1|972->97|1004->121|1102->70|1132->92|1162->189|1192->194|1210->204|1249->206|1278->209|1318->223|1332->229|1392->269|1486->335|1515->336|1552->346|1609->375|1638->376|1675->386|1887->570|1916->571|1958->585|2101->701|2130->702|2159->703|2212->728|2241->729|2283->743|2438->871|2467->872|2496->873|2559->908|2588->909|2630->923|2778->1044|2807->1045|2844->1055|2893->1076|2922->1077|2963->1090|2992->1091|3027->1099|3055->1100|3088->1106|3116->1107|3474->1438|3533->1476|4490->2407|4528->2436|4568->2438|4602->2445|4688->2504|4706->2513|4747->2533|4791->2547|4823->2552|4916->2618|4957->2638|5039->2693|5078->2711|5225->2828
                  LINES: 27->1|31->4|31->4|34->1|36->4|36->6|38->8|38->8|38->8|39->9|39->9|39->9|39->9|41->11|41->11|42->12|42->12|42->12|43->13|47->17|47->17|48->18|50->20|50->20|50->20|50->20|50->20|51->21|53->23|53->23|53->23|53->23|53->23|54->24|56->26|56->26|57->27|57->27|57->27|57->27|57->27|58->28|58->28|59->29|59->29|67->37|67->37|87->57|87->57|87->57|88->58|88->58|88->58|88->58|89->59|90->60|92->62|92->62|93->63|93->63|99->69
                  -- GENERATED --
              */
          