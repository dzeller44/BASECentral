
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contact_Scope0 {
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

class contact extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Application.Contact],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(contact: Form[Application.Contact]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""


"""),_display_(/*4.2*/main()/*4.8*/ {_display_(Seq[Any](format.raw/*4.10*/("""
	"""),format.raw/*5.2*/("""<form class="formoid-solid-dark" style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS', 'Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 480px; min-width: 150px"method="post" action="">
		<div class="title">
			<h2>Contact Admin</h2>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Name:</label>
			<div class="item-cont">
				<input class="large" type="text" name="name" required="required" placeholder="Enter your name..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Email:</label>
			<div>Note: You will receive a copy of your message at this email. </div>
			<div class="item-cont">
				<input class="large" type="email" name="email" required="required" placeholder="Enter your email..." /><span class="icon-place"></span>
			</div>
		</div>
		<div class="element-input">
			<label class="title"><span class="required">*</span>Message:</label>
			<div class="item-cont">
				<textarea class="large" rows="4" cols="50" type="text" name="message" required="required" placeholder="Enter your message..." /></textarea>
			</div>
		</div>
		<div class="submit">
			<input type="submit" value="Submit" id="submit"/> <a href="/" class="buttonCancel">"""),_display_(/*29.88*/Messages("goback")),format.raw/*29.106*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
""")))}))
      }
    }
  }

  def render(contact:Form[Application.Contact]): play.twirl.api.HtmlFormat.Appendable = apply(contact)

  def f:((Form[Application.Contact]) => play.twirl.api.HtmlFormat.Appendable) = (contact) => apply(contact)

  def ref: this.type = this

}


}

/**/
object contact extends contact_Scope0.contact
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 14:19:19 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/contact.scala.html
                  HASH: 71a331523fd5792056119e0f9dadbbdcbb869112
                  MATRIX: 768->1|899->37|931->44|944->50|983->52|1012->55|2395->1411|2435->1429
                  LINES: 27->1|32->1|35->4|35->4|35->4|36->5|60->29|60->29
                  -- GENERATED --
              */
          