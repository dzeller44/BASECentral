
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object auth_Scope0 {
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

class auth extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
implicit def /*4.2*/implicitFieldConstructor/*4.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.80*/("""

"""),_display_(/*6.2*/main(null)/*6.12*/ {_display_(Seq[Any](format.raw/*6.14*/("""
	"""),format.raw/*7.2*/("""<section id="authentication">
		<!-- Start Formoid form-->
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Login</h2>
			</div>
			<div class="element-input">
				<label class="title"><span class="required">*</span>Email:</label>
				<div class="item-cont">
					<input class="large" type="text" name="email" required="required"
						placeholder="Enter your email..." /><span class="icon-place"></span>
				</div>
			</div>
			<div class="element-password">
				<label class="title"><span class="required">*</span>Password:</label>
				<div class="item-cont">
					<input class="large" type="password" name="password" value=""
						required="required" placeholder="Enter your password..." /><span
						class="icon-place"></span>
				</div>
			</div>
			<div class="element-input">
			    """),_display_(/*31.9*/if(loginForm.hasGlobalErrors)/*31.38*/ {_display_(Seq[Any](format.raw/*31.40*/("""
	        		"""),format.raw/*32.12*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
	            		"""),_display_(/*33.17*/loginForm/*33.26*/.globalError.message),format.raw/*33.46*/("""
	        		"""),format.raw/*34.12*/("""</span>
	   			""")))}),format.raw/*35.9*/("""
			"""),format.raw/*36.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*39.39*/Messages("goback")),format.raw/*39.57*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
		<div class="loginBlock">
			<a href="/signup"><div class="loginText">"""),_display_(/*45.46*/Messages("account.need")),format.raw/*45.70*/("""</div></a>
			<a href="/reset/ask"><div class="loginText">"""),_display_(/*46.49*/Messages("forgot.password")),format.raw/*46.76*/("""</div></a>
		</div>
	</section>
""")))}),format.raw/*49.2*/("""
"""))
      }
    }
  }

  def render(loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object auth extends auth_Scope0.auth
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 10:30:32 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/auth.scala.html
                  HASH: fe42a1340ad33d1df1484eae99d7c98aa8e9d88b
                  MATRIX: 760->1|898->60|930->84|1014->37|1045->138|1075->143|1093->153|1132->155|1161->158|2224->1195|2262->1224|2302->1226|2343->1239|2446->1315|2464->1324|2505->1344|2546->1357|2593->1374|2625->1379|2767->1494|2806->1512|3009->1688|3054->1712|3141->1772|3189->1799|3255->1835
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|37->7|61->31|61->31|61->31|62->32|63->33|63->33|63->33|64->34|65->35|66->36|69->39|69->39|75->45|75->45|76->46|76->46|79->49
                  -- GENERATED --
              */
          