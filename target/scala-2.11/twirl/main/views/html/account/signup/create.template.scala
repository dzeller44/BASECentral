
package views.html.account.signup

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object create_Scope0 {
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],java.util.List[Lookup],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], lookups: java.util.List[Lookup]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
	<script>
		$(document).ready(function() """),format.raw/*6.32*/("""{"""),format.raw/*6.33*/("""
		    """),format.raw/*7.7*/("""$("input[name$='role']").click(function() """),format.raw/*7.49*/("""{"""),format.raw/*7.50*/("""
		        """),format.raw/*8.11*/("""var test = $(this).val();
		
		        $("div.desc").hide();
		        $("#" + test).show();
		    """),format.raw/*12.7*/("""}"""),format.raw/*12.8*/(""");
		"""),format.raw/*13.3*/("""}"""),format.raw/*13.4*/(""");
	</script>
	<script>
		jQuery(function()"""),format.raw/*16.20*/("""{"""),format.raw/*16.21*/("""
		      """),format.raw/*17.9*/("""$("#submit").click(function()"""),format.raw/*17.38*/("""{"""),format.raw/*17.39*/("""
		      """),format.raw/*18.9*/("""$(".error").hide();
		      var hasError = false;
		      var passwordVal = $("#inputPassword").val();
		      var checkVal = $("#password-check").val();
		      if (passwordVal == '') """),format.raw/*22.32*/("""{"""),format.raw/*22.33*/("""
		          """),format.raw/*23.13*/("""$("#inputPassword").after('<span class="error">Please enter a password.</span>');
		          hasError = true;
		      """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""" """),format.raw/*25.11*/("""else if (checkVal == '') """),format.raw/*25.36*/("""{"""),format.raw/*25.37*/("""
		          """),format.raw/*26.13*/("""$("#password-check").after('<span class="error">Please re-enter your password.</span>');
		          hasError = true;
		      """),format.raw/*28.9*/("""}"""),format.raw/*28.10*/(""" """),format.raw/*28.11*/("""else if (passwordVal != checkVal ) """),format.raw/*28.46*/("""{"""),format.raw/*28.47*/("""
		          """),format.raw/*29.13*/("""$("#password-check").after('<span class="error">Passwords do not match.</span>');
		          hasError = true;
		      """),format.raw/*31.9*/("""}"""),format.raw/*31.10*/("""
		      """),format.raw/*32.9*/("""if(hasError == true) """),format.raw/*32.30*/("""{"""),format.raw/*32.31*/("""return false;"""),format.raw/*32.44*/("""}"""),format.raw/*32.45*/("""
		  		"""),format.raw/*33.7*/("""}"""),format.raw/*33.8*/(""");
		"""),format.raw/*34.3*/("""}"""),format.raw/*34.4*/(""");		
	</script>
	<section id="signup">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>New User Registration</h2>
			</div>
			<div class="element-input">
				<label class="title"><span class="required">*</span>User
				Name:</label>
				<div class="item-cont">
					<input class="large" type="text" name="fullname" required="required"
						placeholder="Choose a user name..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-input">
				<label class="title"><span class="required">*</span>Email:</label>
				<div class="item-cont">
					<input class="large" type="email" name="email" required="required"
						placeholder="Enter your email..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-password">
				<label class="title"><span class="required">*</span>Password:</label>
				<div>Password must be 8 characters, contain 1 UPPERCASE character, 1 lowercase character, 1 number, and 1 special character. </div>
				<div class="item-cont">
					<input class="large" type="password" name="inputPassword" id="inputPassword" value=""
						required="required" placeholder="Create a password..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-password">
				<label class="title"><span class="required">*</span>Re-enter Password:</label>
				<div class="item-cont">
					<input class="large" type="password" name="password-check" id="password-check" value=""
						required="required" placeholder="Re-enter password..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-radio">
				<label class="title"><span class="required">*</span>Account Role:</label>
				<div class="column column1">
					"""),_display_(/*78.7*/for(lookup <- lookups) yield /*78.29*/ {_display_(Seq[Any](format.raw/*78.31*/("""
						"""),_display_(/*79.8*/if(lookup.lookuptype == "Role")/*79.39*/ {_display_(Seq[Any](format.raw/*79.41*/("""
							"""),format.raw/*80.8*/("""<input type="radio" name="rolename" value=""""),_display_(/*80.52*/lookup/*80.58*/.name),format.raw/*80.63*/("""" required="required"/><span>"""),_display_(/*80.93*/lookup/*80.99*/.name),format.raw/*80.104*/("""</span></label>
							<span class="clearfix"></span>
						""")))}),format.raw/*82.8*/("""
					""")))}),format.raw/*83.7*/("""
				"""),format.raw/*84.5*/("""</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-checkbox">
				<div class="column column1">
					<label><input type="checkbox" name="checkbox[]"
						value="option 1" / required="required"><span>I agree with the terms and conditions *</span></label>
				</div>
				<span class="clearfix"></span>
			</div>
			<div class="element-input">
				"""),_display_(/*95.6*/if(signupForm.hasGlobalErrors)/*95.36*/ {_display_(Seq[Any](format.raw/*95.38*/("""
				"""),format.raw/*96.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;"> """),_display_(/*96.65*/signupForm/*96.75*/.globalError.message),format.raw/*96.95*/("""</span>
				""")))}),format.raw/*97.6*/("""
			"""),format.raw/*98.4*/("""</div>
			<div class="submit">
				<!-- <input type="submit" a href="controllers.account.routes.Signup.save();" value="Submit" /> -->
				<input type="submit" value="Submit" id="submit"/> <a href="/"
					class="buttonCancel">"""),_display_(/*102.28*/Messages("goback")),format.raw/*102.46*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
		<div class="loginBlock">
			<a href="/auth">
				<div class="loginText">"""),_display_(/*109.29*/Messages("account.exists")),format.raw/*109.55*/("""</div>
			</a>
			<a href="/reset/ask">
				<div class="loginText">"""),_display_(/*112.29*/Messages("forgot.password")),format.raw/*112.56*/("""</div>
			</a>
		</div>
	</section>
""")))}),format.raw/*116.2*/("""
"""))
      }
    }
  }

  def render(signupForm:Form[Application.Register],lookups:java.util.List[Lookup]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,lookups)

  def f:((Form[Application.Register],java.util.List[Lookup]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,lookups) => apply(signupForm,lookups)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:14 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/account/signup/create.scala.html
                  HASH: 56f84f8d62efa7f06500ffa805fe888617f55e9d
                  MATRIX: 805->1|973->74|1003->79|1021->89|1060->91|1089->94|1129->108|1143->114|1203->154|1308->232|1336->233|1370->241|1439->283|1467->284|1506->296|1636->399|1664->400|1697->406|1725->407|1799->453|1828->454|1865->464|1922->493|1951->494|1988->504|2205->693|2234->694|2276->708|2424->829|2453->830|2482->831|2535->856|2564->857|2606->871|2761->999|2790->1000|2819->1001|2882->1036|2911->1037|2953->1051|3101->1172|3130->1173|3167->1183|3216->1204|3245->1205|3286->1218|3315->1219|3350->1227|3378->1228|3411->1234|3439->1235|5457->3227|5495->3249|5535->3251|5570->3260|5610->3291|5650->3293|5686->3302|5757->3346|5772->3352|5798->3357|5855->3387|5870->3393|5897->3398|5990->3461|6028->3469|6061->3475|6468->3856|6507->3886|6547->3888|6580->3894|6667->3954|6686->3964|6727->3984|6771->3998|6803->4003|7062->4234|7102->4252|7310->4432|7358->4458|7457->4529|7506->4556|7578->4597
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|38->7|38->7|39->8|43->12|43->12|44->13|44->13|47->16|47->16|48->17|48->17|48->17|49->18|53->22|53->22|54->23|56->25|56->25|56->25|56->25|56->25|57->26|59->28|59->28|59->28|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|63->32|63->32|64->33|64->33|65->34|65->34|109->78|109->78|109->78|110->79|110->79|110->79|111->80|111->80|111->80|111->80|111->80|111->80|111->80|113->82|114->83|115->84|126->95|126->95|126->95|127->96|127->96|127->96|127->96|128->97|129->98|133->102|133->102|140->109|140->109|143->112|143->112|147->116
                  -- GENERATED --
              */
          