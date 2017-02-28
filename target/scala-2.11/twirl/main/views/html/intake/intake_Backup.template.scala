
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object intake_Backup_Scope0 {
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

class intake_Backup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeForm: Form[Application.IntakeAdd], lookups: java.util.List[Lookup], users: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.105*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
"""),format.raw/*4.1*/("""<script type="text/javascript">
	$(document).ready(function() """),format.raw/*5.31*/("""{"""),format.raw/*5.32*/("""
	
	"""),format.raw/*7.2*/("""}"""),format.raw/*7.3*/(""");
</script>
<section id="profileMain">
	<form class="formoid-solid-dark"
		style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 1500px; min-width: 150px"
		method="post" action="">
		<div class="title">
			<h2>Intake Request</h2>
		</div>
		<div class="container">
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-12">
					<div class="formSubtitle">
						Project Info
					</div>
				</div>
			</div>
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-input">
						<label class="title"><span class="required">*</span>Project ID:</label>
						<div class="item-cont">
							<input class="large" type="text" name="projectid" required="required"
								placeholder="Enter Project ID..." /><span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>Project Status:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="projectstatus" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
										"""),_display_(/*42.12*/for(lookup <- lookups) yield /*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
			                  				"""),_display_(/*43.27*/if(lookup.lookuptype == "Project Status")/*43.68*/ {_display_(Seq[Any](format.raw/*43.70*/("""<option value=""""),_display_(/*43.86*/lookup/*43.92*/.name),format.raw/*43.97*/("""">"""),_display_(/*43.100*/lookup/*43.106*/.name),format.raw/*43.111*/("""</option>""")))}),format.raw/*43.121*/("""
										""")))}),format.raw/*44.12*/("""	
									"""),format.raw/*45.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 1 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-input">
						<label class="title"><span class="required">*</span>Project Name:</label>
						<div class="item-cont">
							<input class="large" type="text" name="projectname" required="required"
								placeholder="Enter Project Name..." /><span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>Requesting Agency:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="agency" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Agency ---</option>
										"""),_display_(/*72.12*/for(lookup <- lookups) yield /*72.34*/ {_display_(Seq[Any](format.raw/*72.36*/("""
			                  				"""),_display_(/*73.27*/if(lookup.lookuptype == "Agency")/*73.60*/ {_display_(Seq[Any](format.raw/*73.62*/("""<option value=""""),_display_(/*73.78*/lookup/*73.84*/.name),format.raw/*73.89*/("""">"""),_display_(/*73.92*/lookup/*73.98*/.name),format.raw/*73.103*/("""</option>""")))}),format.raw/*73.113*/("""
										""")))}),format.raw/*74.12*/("""	
									"""),format.raw/*75.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 2 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-12">
					<div class="element-input">
						<label class="title"><span class="required">*</span>Request Summary:</label>
						<div class="item-cont">
							<input class="large" type="text" name="summary" required="required"
								placeholder="Enter Request Summary..." /><span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 3 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-input">
						<label class="title"><span class="required">*</span>Requestor:</label>
						<div class="item-cont">
							<input class="large" type="text" name="requestor" required="required"
								placeholder="Enter Requestor..." /><span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>Request Status:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="requeststatus" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
										"""),_display_(/*114.12*/for(lookup <- lookups) yield /*114.34*/ {_display_(Seq[Any](format.raw/*114.36*/("""
			                  				"""),_display_(/*115.27*/if(lookup.lookuptype == "Request Status")/*115.68*/ {_display_(Seq[Any](format.raw/*115.70*/("""<option value=""""),_display_(/*115.86*/lookup/*115.92*/.name),format.raw/*115.97*/("""">"""),_display_(/*115.100*/lookup/*115.106*/.name),format.raw/*115.111*/("""</option>""")))}),format.raw/*115.121*/("""
										""")))}),format.raw/*116.12*/("""	
									"""),format.raw/*117.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 4 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>Date Requested:</label>
						<div class="item-cont">
							<input class="large" data-format="mm/dd/yyyy" type="date" name="daterequested" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>How Requested:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="howrequested" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select How Requested ---</option>
										"""),_display_(/*144.12*/for(lookup <- lookups) yield /*144.34*/ {_display_(Seq[Any](format.raw/*144.36*/("""
			                  				"""),_display_(/*145.27*/if(lookup.lookuptype == "Intake Type")/*145.65*/ {_display_(Seq[Any](format.raw/*145.67*/("""<option value=""""),_display_(/*145.83*/lookup/*145.89*/.name),format.raw/*145.94*/("""">"""),_display_(/*145.97*/lookup/*145.103*/.name),format.raw/*145.108*/("""</option>""")))}),format.raw/*145.118*/("""
										""")))}),format.raw/*146.12*/("""	
									"""),format.raw/*147.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 5 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>Initial Customer Meeting Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>Initial Customer Meeting Comments:</label>
						<div class="item-cont">
							<input class="large" type="text" name="initialmeetcomments" required="required"
								placeholder="Enter Comments..." /><span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 6 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="formSubtitle">
						BA Info
					</div>
				</div>
				<div class="col-sm-6">
					<div class="formSubtitle">
						SE Info
					</div>
				</div>
			</div>
			<!-- End Row 7 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Manager:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="bamanager" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
										"""),_display_(/*199.12*/for(user <- users) yield /*199.30*/ {_display_(Seq[Any](format.raw/*199.32*/("""
			                  				"""),_display_(/*200.27*/if(user.rolename == "BA Manager")/*200.60*/ {_display_(Seq[Any](format.raw/*200.62*/("""<option value=""""),_display_(/*200.78*/user/*200.82*/.fullname),format.raw/*200.91*/("""">"""),_display_(/*200.94*/user/*200.98*/.fullname),format.raw/*200.107*/("""</option>""")))}),format.raw/*200.117*/("""
										""")))}),format.raw/*201.12*/("""	
									"""),format.raw/*202.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>SE Manager:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="semanager" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
										"""),_display_(/*217.12*/for(user <- users) yield /*217.30*/ {_display_(Seq[Any](format.raw/*217.32*/("""
			                  				"""),_display_(/*218.27*/if(user.rolename == "SE Manager")/*218.60*/ {_display_(Seq[Any](format.raw/*218.62*/("""<option value=""""),_display_(/*218.78*/user/*218.82*/.fullname),format.raw/*218.91*/("""">"""),_display_(/*218.94*/user/*218.98*/.fullname),format.raw/*218.107*/("""</option>""")))}),format.raw/*218.117*/("""
										""")))}),format.raw/*219.12*/("""	
									"""),format.raw/*220.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 8 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>BA Assigned Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>SE Assigned Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 9 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Assigned:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="baassigned" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
										"""),_display_(/*259.12*/for(user <- users) yield /*259.30*/ {_display_(Seq[Any](format.raw/*259.32*/("""
			                  				"""),_display_(/*260.27*/if(user.rolename == "BA")/*260.52*/ {_display_(Seq[Any](format.raw/*260.54*/("""<option value=""""),_display_(/*260.70*/user/*260.74*/.fullname),format.raw/*260.83*/("""">"""),_display_(/*260.86*/user/*260.90*/.fullname),format.raw/*260.99*/("""</option>""")))}),format.raw/*260.109*/("""
										""")))}),format.raw/*261.12*/("""	
									"""),format.raw/*262.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>SE Assigned:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="seassigned" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
										"""),_display_(/*277.12*/for(user <- users) yield /*277.30*/ {_display_(Seq[Any](format.raw/*277.32*/("""
			                  				"""),_display_(/*278.27*/if(user.rolename == "SE")/*278.52*/ {_display_(Seq[Any](format.raw/*278.54*/("""<option value=""""),_display_(/*278.70*/user/*278.74*/.fullname),format.raw/*278.83*/("""">"""),_display_(/*278.86*/user/*278.90*/.fullname),format.raw/*278.99*/("""</option>""")))}),format.raw/*278.109*/("""
										""")))}),format.raw/*279.12*/("""	
									"""),format.raw/*280.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 10 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Deliverable:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="badeliverable" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
										"""),_display_(/*298.12*/for(lookup <- lookups) yield /*298.34*/ {_display_(Seq[Any](format.raw/*298.36*/("""
			                  				"""),_display_(/*299.27*/if(lookup.lookuptype == "BA Deliverable")/*299.68*/ {_display_(Seq[Any](format.raw/*299.70*/("""<option value=""""),_display_(/*299.86*/lookup/*299.92*/.name),format.raw/*299.97*/("""">"""),_display_(/*299.100*/lookup/*299.106*/.name),format.raw/*299.111*/("""</option>""")))}),format.raw/*299.121*/("""
										""")))}),format.raw/*300.12*/("""	
									"""),format.raw/*301.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>SE Deliverable:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="sedeliverable" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
										"""),_display_(/*316.12*/for(lookup <- lookups) yield /*316.34*/ {_display_(Seq[Any](format.raw/*316.36*/("""
			                  				"""),_display_(/*317.27*/if(lookup.lookuptype == "SE Deliverable")/*317.68*/ {_display_(Seq[Any](format.raw/*317.70*/("""<option value=""""),_display_(/*317.86*/lookup/*317.92*/.name),format.raw/*317.97*/("""">"""),_display_(/*317.100*/lookup/*317.106*/.name),format.raw/*317.111*/("""</option>""")))}),format.raw/*317.121*/("""
										""")))}),format.raw/*318.12*/("""
									"""),format.raw/*319.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 11 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Task Status:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="bataskstatus" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
										"""),_display_(/*337.12*/for(lookup <- lookups) yield /*337.34*/ {_display_(Seq[Any](format.raw/*337.36*/("""
			                  				"""),_display_(/*338.27*/if(lookup.lookuptype == "BA Task Status")/*338.68*/ {_display_(Seq[Any](format.raw/*338.70*/("""<option value=""""),_display_(/*338.86*/lookup/*338.92*/.name),format.raw/*338.97*/("""">"""),_display_(/*338.100*/lookup/*338.106*/.name),format.raw/*338.111*/("""</option>""")))}),format.raw/*338.121*/("""
										""")))}),format.raw/*339.12*/("""	
									"""),format.raw/*340.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>SE Task Status:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="setaskstatus" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
										"""),_display_(/*355.12*/for(lookup <- lookups) yield /*355.34*/ {_display_(Seq[Any](format.raw/*355.36*/("""
			                  				"""),_display_(/*356.27*/if(lookup.lookuptype == "SE Task Status")/*356.68*/ {_display_(Seq[Any](format.raw/*356.70*/("""<option value=""""),_display_(/*356.86*/lookup/*356.92*/.name),format.raw/*356.97*/("""">"""),_display_(/*356.100*/lookup/*356.106*/.name),format.raw/*356.111*/("""</option>""")))}),format.raw/*356.121*/("""
										""")))}),format.raw/*357.12*/("""
									"""),format.raw/*358.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-number">
						<label class="title"><span class="required">*</span>BA % Time (Estimate)</label>
						<div class="item-cont">
							<input class="large" type="text" min="0" max="500" name="batimeestimate" required="required" placeholder="Number" value=""/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-number">
						<label class="title"><span class="required">*</span>SE % Time (Estimate)</label>
						<div class="item-cont">
							<input class="large" type="text" min="0" max="500" name="setimeestimate" required="required" placeholder="Number" value=""/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>BA Deliverable Target Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>SE Deliverable Target Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 12 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>BA Deliverable Completion Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>SE Deliverable Completion Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" required="required" placeholder="Date"/>
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End Container --> 
		<div class="element-input">
			"""),_display_(/*430.5*/if(intakeForm.hasGlobalErrors)/*430.35*/ {_display_(Seq[Any](format.raw/*430.37*/("""
			"""),format.raw/*431.4*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*431.63*/intakeForm/*431.73*/.globalError.message),format.raw/*431.93*/("""</span>
			""")))}),format.raw/*432.5*/("""
		"""),format.raw/*433.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" /> <a href="/user"
				class="buttonCancel">"""),_display_(/*436.27*/Messages("goback")),format.raw/*436.45*/("""</a>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>
""")))}))
      }
    }
  }

  def render(intakeForm:Form[Application.IntakeAdd],lookups:java.util.List[Lookup],users:java.util.List[User]): play.twirl.api.HtmlFormat.Appendable = apply(intakeForm,lookups,users)

  def f:((Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User]) => play.twirl.api.HtmlFormat.Appendable) = (intakeForm,lookups,users) => apply(intakeForm,lookups,users)

  def ref: this.type = this

}


}

/**/
object intake_Backup extends intake_Backup_Scope0.intake_Backup
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:16 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intake_Backup.scala.html
                  HASH: 2d6a193b123e0d864278d20f95768f53a8333460
                  MATRIX: 833->1|1032->104|1062->109|1080->119|1119->121|1147->123|1237->186|1265->187|1297->193|1324->194|2698->1541|2736->1563|2776->1565|2831->1593|2881->1634|2921->1636|2964->1652|2979->1658|3005->1663|3036->1666|3052->1672|3079->1677|3121->1687|3165->1700|3205->1712|4209->2689|4247->2711|4287->2713|4342->2741|4384->2774|4424->2776|4467->2792|4482->2798|4508->2803|4538->2806|4553->2812|4580->2817|4622->2827|4666->2840|4706->2852|6168->4286|6207->4308|6248->4310|6304->4338|6355->4379|6396->4381|6440->4397|6456->4403|6483->4408|6515->4411|6532->4417|6560->4422|6603->4432|6648->4445|6689->4457|7713->5453|7752->5475|7793->5477|7849->5505|7897->5543|7938->5545|7982->5561|7998->5567|8025->5572|8056->5575|8073->5581|8101->5586|8144->5596|8189->5609|8230->5621|10030->7393|10065->7411|10106->7413|10162->7441|10205->7474|10246->7476|10290->7492|10304->7496|10335->7505|10366->7508|10380->7512|10412->7521|10455->7531|10500->7544|10541->7556|11085->8072|11120->8090|11161->8092|11217->8120|11260->8153|11301->8155|11345->8171|11359->8175|11390->8184|11421->8187|11435->8191|11467->8200|11510->8210|11555->8223|11596->8235|13079->9690|13114->9708|13155->9710|13211->9738|13246->9763|13287->9765|13331->9781|13345->9785|13376->9794|13407->9797|13421->9801|13452->9810|13495->9820|13540->9833|13581->9845|14122->10358|14157->10376|14198->10378|14254->10406|14289->10431|14330->10433|14374->10449|14388->10453|14419->10462|14450->10465|14464->10469|14495->10478|14538->10488|14583->10501|14624->10513|15266->11127|15305->11149|15346->11151|15402->11179|15453->11220|15494->11222|15538->11238|15554->11244|15581->11249|15613->11252|15630->11258|15658->11263|15701->11273|15746->11286|15787->11298|16343->11826|16382->11848|16423->11850|16479->11878|16530->11919|16571->11921|16615->11937|16631->11943|16658->11948|16690->11951|16707->11957|16735->11962|16778->11972|16823->11985|16863->11996|17499->12604|17538->12626|17579->12628|17635->12656|17686->12697|17727->12699|17771->12715|17787->12721|17814->12726|17846->12729|17863->12735|17891->12740|17934->12750|17979->12763|18020->12775|18570->13297|18609->13319|18650->13321|18706->13349|18757->13390|18798->13392|18842->13408|18858->13414|18885->13419|18917->13422|18934->13428|18962->13433|19005->13443|19050->13456|19090->13467|21924->16274|21964->16304|22005->16306|22038->16311|22125->16370|22145->16380|22187->16400|22231->16413|22263->16417|22408->16534|22448->16552
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|38->7|38->7|73->42|73->42|73->42|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|74->43|75->44|76->45|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|104->73|105->74|106->75|145->114|145->114|145->114|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|146->115|147->116|148->117|175->144|175->144|175->144|176->145|176->145|176->145|176->145|176->145|176->145|176->145|176->145|176->145|176->145|177->146|178->147|230->199|230->199|230->199|231->200|231->200|231->200|231->200|231->200|231->200|231->200|231->200|231->200|231->200|232->201|233->202|248->217|248->217|248->217|249->218|249->218|249->218|249->218|249->218|249->218|249->218|249->218|249->218|249->218|250->219|251->220|290->259|290->259|290->259|291->260|291->260|291->260|291->260|291->260|291->260|291->260|291->260|291->260|291->260|292->261|293->262|308->277|308->277|308->277|309->278|309->278|309->278|309->278|309->278|309->278|309->278|309->278|309->278|309->278|310->279|311->280|329->298|329->298|329->298|330->299|330->299|330->299|330->299|330->299|330->299|330->299|330->299|330->299|330->299|331->300|332->301|347->316|347->316|347->316|348->317|348->317|348->317|348->317|348->317|348->317|348->317|348->317|348->317|348->317|349->318|350->319|368->337|368->337|368->337|369->338|369->338|369->338|369->338|369->338|369->338|369->338|369->338|369->338|369->338|370->339|371->340|386->355|386->355|386->355|387->356|387->356|387->356|387->356|387->356|387->356|387->356|387->356|387->356|387->356|388->357|389->358|461->430|461->430|461->430|462->431|462->431|462->431|462->431|463->432|464->433|467->436|467->436
                  -- GENERATED --
              */
          