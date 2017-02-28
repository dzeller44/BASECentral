
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[Application.Register],Form[Application.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[Application.Register], loginForm: Form[Application.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.78*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""


		"""),format.raw/*6.3*/("""<section id="homePage">
			<div class="container">
				<h2><b>Welcome</b> to BASE Central</h2>
				<div class="testimonials" data-appear-top-offset="-200" data-animated="fadeInUp">
						<div class="item">
							<div class="testim_content">Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. </div>
						</div>
				</div>
			</div>
		</section>

""")))}))
      }
    }
  }

  def render(signupForm:Form[Application.Register],loginForm:Form[Application.Login]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm,loginForm)

  def f:((Form[Application.Register],Form[Application.Login]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm,loginForm) => apply(signupForm,loginForm)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:14 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/index.scala.html
                  HASH: 73546bc1672d4cd51ee8785c5b5e31ba28272985
                  MATRIX: 789->1|960->77|988->80|1006->90|1045->92|1076->97
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6
                  -- GENERATED --
              */
          