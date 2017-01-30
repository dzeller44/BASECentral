
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

class create extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Register],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.at("js/jquery/jquery-latest.js")),format.raw/*4.62*/("""" type="text/javascript"></script>
	<script>
	   $(document).ready(function() """),format.raw/*6.34*/("""{"""),format.raw/*6.35*/("""
	       """),format.raw/*7.9*/("""$("input[name$='role']").click(function() """),format.raw/*7.51*/("""{"""),format.raw/*7.52*/("""
	           """),format.raw/*8.13*/("""var test = $(this).val();
	   
	           $("div.desc").hide();
	           $("#" + test).show();
	       """),format.raw/*12.9*/("""}"""),format.raw/*12.10*/(""");
	   """),format.raw/*13.5*/("""}"""),format.raw/*13.6*/(""");
	</script>
	
	<script>

		jQuery(function()"""),format.raw/*18.20*/("""{"""),format.raw/*18.21*/("""
        """),format.raw/*19.9*/("""$("#submit").click(function()"""),format.raw/*19.38*/("""{"""),format.raw/*19.39*/("""
        """),format.raw/*20.9*/("""$(".error").hide();
        var hasError = false;
        var passwordVal = $("#inputPassword").val();
        var checkVal = $("#password-check").val();
        if (passwordVal == '') """),format.raw/*24.32*/("""{"""),format.raw/*24.33*/("""
            """),format.raw/*25.13*/("""$("#inputPassword").after('<span class="error">Please enter a password.</span>');
            hasError = true;
        """),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""" """),format.raw/*27.11*/("""else if (checkVal == '') """),format.raw/*27.36*/("""{"""),format.raw/*27.37*/("""
            """),format.raw/*28.13*/("""$("#password-check").after('<span class="error">Please re-enter your password.</span>');
            hasError = true;
        """),format.raw/*30.9*/("""}"""),format.raw/*30.10*/(""" """),format.raw/*30.11*/("""else if (passwordVal != checkVal ) """),format.raw/*30.46*/("""{"""),format.raw/*30.47*/("""
            """),format.raw/*31.13*/("""$("#password-check").after('<span class="error">Passwords do not match.</span>');
            hasError = true;
        """),format.raw/*33.9*/("""}"""),format.raw/*33.10*/("""
        """),format.raw/*34.9*/("""if(hasError == true) """),format.raw/*34.30*/("""{"""),format.raw/*34.31*/("""return false;"""),format.raw/*34.44*/("""}"""),format.raw/*34.45*/("""
    		"""),format.raw/*35.7*/("""}"""),format.raw/*35.8*/(""");
		"""),format.raw/*36.3*/("""}"""),format.raw/*36.4*/(""");

	</script>
	
	<section id="signup">
	   <!-- Start Formoid form-->
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
	         <div>Note: Password must be 8 characters, contain 1 UPPERCASE character, 1 lowercase character, 1 number, and 1 special character. </div>
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
	            <label>
	            	<input type="radio" name="role" value="user" required="required" /><span>Business User</span>
	            </label>
	            <label>
	            	<input type="radio" name="role" value="manager" required="required" /><span>Emergency Manager</span>
	            </label>
	         </div>
	         <span class="clearfix"></span>
	         <div id="user" class="desc" style="display: none;">
	         </div>
	         <div id="manager" class="desc" style="display: none;">
	            <div class="element-input">
	               <label class="title">Agency:</label>
	               <div class="item-cont">
	                  <input class="large" type="text" name="agency" value="" placeholder="Which agency..." /><span class="icon-place"></span>
	               </div>
	            </div>
	         </div>
	      </div>
	      <div class="element-checkbox">
	         <div class="column column1">
	            <label><input type="checkbox" name="checkbox[]"
	               value="option 1" / required="required"><span>I agree with the terms and conditions *</span></label>
	         </div>
	         <span class="clearfix"></span>
	      </div>
	      <div class="element-input">
	         """),_display_(/*113.12*/if(signupForm.hasGlobalErrors)/*113.42*/ {_display_(Seq[Any](format.raw/*113.44*/("""
	         	"""),format.raw/*114.12*/("""<span class="errorMessageDisplay" style="color: #d9534f;"> """),_display_(/*114.72*/signupForm/*114.82*/.globalError.message),format.raw/*114.102*/("""</span>
	         """)))}),format.raw/*115.12*/("""
	      """),format.raw/*116.8*/("""</div>
	      <div class="submit">
	         <!-- <input type="submit" a href="controllers.account.routes.Signup.save();" value="Submit" /> -->
	         <input type="submit" value="Submit" id="submit"/> <a href="/"
	            class="buttonCancel">"""),_display_(/*120.36*/Messages("goback")),format.raw/*120.54*/("""</a>
	      </div>
	      <!-- This is needed for bottom shadow to appear... -->
	      <div></div>
	   </form>
	   <div class="loginBlock">
	      <a href="/auth">
	         <div class="loginText">"""),_display_(/*127.35*/Messages("account.exists")),format.raw/*127.61*/("""</div>
	      </a>
	      <a href="/reset/ask">
	         <div class="loginText">"""),_display_(/*130.35*/Messages("forgot.password")),format.raw/*130.62*/("""</div>
	      </a>
	   </div>
	</section>

""")))}),format.raw/*135.2*/("""
"""))
      }
    }
  }

  def render(signupForm:Form[Application.Register]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[Application.Register]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object create extends create_Scope0.create
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 10:30:33 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/account/signup/create.scala.html
                  HASH: 3c0df28ce1f1c84a4e7d820ddbdb17d369992265
                  MATRIX: 782->1|917->41|947->46|965->56|1004->58|1033->61|1073->75|1087->81|1147->121|1254->201|1282->202|1318->212|1387->254|1415->255|1456->269|1594->380|1623->381|1658->389|1686->390|1765->441|1794->442|1831->452|1888->481|1917->482|1954->492|2171->681|2200->682|2242->696|2390->817|2419->818|2448->819|2501->844|2530->845|2572->859|2727->987|2756->988|2785->989|2848->1024|2877->1025|2919->1039|3067->1160|3096->1161|3133->1171|3182->1192|3211->1193|3252->1206|3281->1207|3316->1215|3344->1216|3377->1222|3405->1223|7001->4791|7041->4821|7082->4823|7124->4836|7212->4896|7232->4906|7275->4926|7327->4946|7364->4955|7647->5210|7687->5228|7921->5434|7969->5460|8082->5545|8131->5572|8211->5621
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|35->4|35->4|35->4|37->6|37->6|38->7|38->7|38->7|39->8|43->12|43->12|44->13|44->13|49->18|49->18|50->19|50->19|50->19|51->20|55->24|55->24|56->25|58->27|58->27|58->27|58->27|58->27|59->28|61->30|61->30|61->30|61->30|61->30|62->31|64->33|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|67->36|67->36|144->113|144->113|144->113|145->114|145->114|145->114|145->114|146->115|147->116|151->120|151->120|158->127|158->127|161->130|161->130|166->135
                  -- GENERATED --
              */
          