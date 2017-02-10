
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
				<div>Password must be 8 characters, contain 1 UPPERCASE character, 1 lowercase character, 1 number, and 1 special character (.*[!&#64#$!%^&+=]).</div>
			</div>
			<div class="element-input">
			    """),_display_(/*32.9*/if(loginForm.hasGlobalErrors)/*32.38*/ {_display_(Seq[Any](format.raw/*32.40*/("""
	        		"""),format.raw/*33.12*/("""<span class="errorMessageDisplay" style="color: #d9534f;">
	            		"""),_display_(/*34.17*/loginForm/*34.26*/.globalError.message),format.raw/*34.46*/("""
	        		"""),format.raw/*35.12*/("""</span>
	   			""")))}),format.raw/*36.9*/("""
			"""),format.raw/*37.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*40.39*/Messages("goback")),format.raw/*40.57*/("""</a>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
		<div class="loginBlock">
			<a href="/signup"><div class="loginText">"""),_display_(/*46.46*/Messages("account.need")),format.raw/*46.70*/("""</div></a>
			<a href="/reset/ask"><div class="loginText">"""),_display_(/*47.49*/Messages("forgot.password")),format.raw/*47.76*/("""</div></a>
		</div>
	</section>
""")))}),format.raw/*50.2*/("""
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
                  DATE: Fri Feb 10 14:19:19 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/auth.scala.html
                  HASH: e672361f0a8f1ad94fb2722a28c3ebec1fe23a0d
                  MATRIX: 760->1|898->60|930->84|1014->37|1045->138|1075->143|1093->153|1132->155|1161->158|2380->1351|2418->1380|2458->1382|2499->1395|2602->1471|2620->1480|2661->1500|2702->1513|2749->1530|2781->1535|2923->1650|2962->1668|3165->1844|3210->1868|3297->1928|3345->1955|3411->1991
                  LINES: 27->1|31->4|31->4|32->1|34->4|36->6|36->6|36->6|37->7|62->32|62->32|62->32|63->33|64->34|64->34|64->34|65->35|66->36|67->37|70->40|70->40|76->46|76->46|77->47|77->47|80->50
                  -- GENERATED --
              */
          