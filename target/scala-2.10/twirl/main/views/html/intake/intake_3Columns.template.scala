
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object intake_3Columns_Scope0 {
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

class intake_3Columns extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeForm: Form[Application.IntakeAdd], lookups: java.util.List[Lookup], users: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.105*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">
		$(document).ready(function() """),format.raw/*5.32*/("""{"""),format.raw/*5.33*/("""
		
		"""),format.raw/*7.3*/("""}"""),format.raw/*7.4*/(""");
	</script>
	<section id="profileMain">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 1200px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Intake Request</h2>
			</div>
			<div class="container">
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="formSubtitle">
							Project Info
						</div>
					</div>
					<div class="col-sm-4">
						<div class="formSubtitle">
							BA Info
						</div>
					</div>
					<div class="col-sm-4">
						<div class="formSubtitle">
							SE Info
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-input">
							<label class="title"><span class="required">*</span>Project ID:</label>
							<div class="item-cont">
								<input class="large" type="text" name="projectid" required="required"
									placeholder="Enter Project ID..." /><span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>BA Manager:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="bamanager" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
											"""),_display_(/*52.13*/for(user <- users) yield /*52.31*/ {_display_(Seq[Any](format.raw/*52.33*/("""
												"""),_display_(/*53.14*/if(user.rolename == "BA Manager")/*53.47*/ {_display_(Seq[Any](format.raw/*53.49*/("""
													"""),format.raw/*54.14*/("""<option value=""""),_display_(/*54.30*/user/*54.34*/.fullname),format.raw/*54.43*/("""">"""),_display_(/*54.46*/user/*54.50*/.fullname),format.raw/*54.59*/("""</option>
												""")))}),format.raw/*55.14*/("""
											""")))}),format.raw/*56.13*/("""	
										"""),format.raw/*57.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>SE Manager:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="semanager" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
											"""),_display_(/*72.13*/for(user <- users) yield /*72.31*/ {_display_(Seq[Any](format.raw/*72.33*/("""
												"""),_display_(/*73.14*/if(user.rolename == "SE Manager")/*73.47*/ {_display_(Seq[Any](format.raw/*73.49*/("""
													"""),format.raw/*74.14*/("""<option value=""""),_display_(/*74.30*/user/*74.34*/.fullname),format.raw/*74.43*/("""">"""),_display_(/*74.46*/user/*74.50*/.fullname),format.raw/*74.59*/("""</option>
												""")))}),format.raw/*75.14*/("""
											""")))}),format.raw/*76.13*/("""	
										"""),format.raw/*77.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-input">
							<label class="title"><span class="required">*</span>Project Name:</label>
							<div class="item-cont">
								<input class="large" type="text" name="projectname" required="required"
									placeholder="Enter Project Name..." /><span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>BA Assigned Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>SE Assigned Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>Project Status:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="projectstatus" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
											"""),_display_(/*123.13*/for(lookup <- lookups) yield /*123.35*/ {_display_(Seq[Any](format.raw/*123.37*/("""
												"""),_display_(/*124.14*/if(lookup.lookuptype == "Project Status")/*124.55*/ {_display_(Seq[Any](format.raw/*124.57*/("""
													"""),format.raw/*125.14*/("""<option value=""""),_display_(/*125.30*/lookup/*125.36*/.name),format.raw/*125.41*/("""">"""),_display_(/*125.44*/lookup/*125.50*/.name),format.raw/*125.55*/("""</option>
												""")))}),format.raw/*126.14*/("""
											""")))}),format.raw/*127.13*/("""	
										"""),format.raw/*128.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>BA Assigned:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="baassigned" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
											"""),_display_(/*143.13*/for(user <- users) yield /*143.31*/ {_display_(Seq[Any](format.raw/*143.33*/("""
												"""),_display_(/*144.14*/if(user.rolename == "BA")/*144.39*/ {_display_(Seq[Any](format.raw/*144.41*/("""
													"""),format.raw/*145.14*/("""<option value=""""),_display_(/*145.30*/user/*145.34*/.fullname),format.raw/*145.43*/("""">"""),_display_(/*145.46*/user/*145.50*/.fullname),format.raw/*145.59*/("""</option>
												""")))}),format.raw/*146.14*/("""
											""")))}),format.raw/*147.13*/("""	
										"""),format.raw/*148.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>SE Assigned:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="seassigned" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
											"""),_display_(/*163.13*/for(user <- users) yield /*163.31*/ {_display_(Seq[Any](format.raw/*163.33*/("""
												"""),_display_(/*164.14*/if(user.rolename == "SE")/*164.39*/ {_display_(Seq[Any](format.raw/*164.41*/("""
													"""),format.raw/*165.14*/("""<option value=""""),_display_(/*165.30*/user/*165.34*/.fullname),format.raw/*165.43*/("""">"""),_display_(/*165.46*/user/*165.50*/.fullname),format.raw/*165.59*/("""</option>
												""")))}),format.raw/*166.14*/("""
											""")))}),format.raw/*167.13*/("""	
										"""),format.raw/*168.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>Requesting Agency:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="agency" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Agency ---</option>
											"""),_display_(/*185.13*/for(lookup <- lookups) yield /*185.35*/ {_display_(Seq[Any](format.raw/*185.37*/("""
												"""),_display_(/*186.14*/if(lookup.lookuptype == "Agency")/*186.47*/ {_display_(Seq[Any](format.raw/*186.49*/("""
													"""),format.raw/*187.14*/("""<option value=""""),_display_(/*187.30*/lookup/*187.36*/.name),format.raw/*187.41*/("""">"""),_display_(/*187.44*/lookup/*187.50*/.name),format.raw/*187.55*/("""</option>
												""")))}),format.raw/*188.14*/("""
											""")))}),format.raw/*189.13*/("""	
										"""),format.raw/*190.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>BA Deliverable:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="badeliverable" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
											"""),_display_(/*205.13*/for(lookup <- lookups) yield /*205.35*/ {_display_(Seq[Any](format.raw/*205.37*/("""
												"""),_display_(/*206.14*/if(lookup.lookuptype == "BA Deliverable")/*206.55*/ {_display_(Seq[Any](format.raw/*206.57*/("""
													"""),format.raw/*207.14*/("""<option value=""""),_display_(/*207.30*/lookup/*207.36*/.name),format.raw/*207.41*/("""">"""),_display_(/*207.44*/lookup/*207.50*/.name),format.raw/*207.55*/("""</option>
												""")))}),format.raw/*208.14*/("""
											""")))}),format.raw/*209.13*/("""	
										"""),format.raw/*210.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>SE Deliverable:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="sedeliverable" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
											"""),_display_(/*225.13*/for(lookup <- lookups) yield /*225.35*/ {_display_(Seq[Any](format.raw/*225.37*/("""
												"""),_display_(/*226.14*/if(lookup.lookuptype == "SE Deliverable")/*226.55*/ {_display_(Seq[Any](format.raw/*226.57*/("""
													"""),format.raw/*227.14*/("""<option value=""""),_display_(/*227.30*/lookup/*227.36*/.name),format.raw/*227.41*/("""">"""),_display_(/*227.44*/lookup/*227.50*/.name),format.raw/*227.55*/("""</option>
												""")))}),format.raw/*228.14*/("""
											""")))}),format.raw/*229.13*/("""
										"""),format.raw/*230.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-input">
							<label class="title"><span class="required">*</span>Request Summary:</label>
							<div class="item-cont">
								<input class="large" type="text" name="summary" required="required"
									placeholder="Enter Request Summary..." /><span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>BA Task Status:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="bataskstatus" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
											"""),_display_(/*256.13*/for(lookup <- lookups) yield /*256.35*/ {_display_(Seq[Any](format.raw/*256.37*/("""
												"""),_display_(/*257.14*/if(lookup.lookuptype == "BA Task Status")/*257.55*/ {_display_(Seq[Any](format.raw/*257.57*/("""
													"""),format.raw/*258.14*/("""<option value=""""),_display_(/*258.30*/lookup/*258.36*/.name),format.raw/*258.41*/("""">"""),_display_(/*258.44*/lookup/*258.50*/.name),format.raw/*258.55*/("""</option>
												""")))}),format.raw/*259.14*/("""
											""")))}),format.raw/*260.13*/("""	
										"""),format.raw/*261.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>SE Task Status:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="setaskstatus" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
											"""),_display_(/*276.13*/for(lookup <- lookups) yield /*276.35*/ {_display_(Seq[Any](format.raw/*276.37*/("""
												"""),_display_(/*277.14*/if(lookup.lookuptype == "SE Task Status")/*277.55*/ {_display_(Seq[Any](format.raw/*277.57*/("""
													"""),format.raw/*278.14*/("""<option value=""""),_display_(/*278.30*/lookup/*278.36*/.name),format.raw/*278.41*/("""">"""),_display_(/*278.44*/lookup/*278.50*/.name),format.raw/*278.55*/("""</option>
												""")))}),format.raw/*279.14*/("""
											""")))}),format.raw/*280.13*/("""
										"""),format.raw/*281.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-input">
							<label class="title"><span class="required">*</span>Requestor:</label>
							<div class="item-cont">
								<input class="large" type="text" name="requestor" required="required"
									placeholder="Enter Requestor..." /><span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-number">
							<label class="title"><span class="required">*</span>BA % Time (Estimate)</label>
							<div class="item-cont">
								<input class="large" type="text" min="0" max="500" name="batimeestimate" required="required" placeholder="Number" value=""/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
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
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>Request Status:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="requeststatus" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
											"""),_display_(/*327.13*/for(lookup <- lookups) yield /*327.35*/ {_display_(Seq[Any](format.raw/*327.37*/("""
												"""),_display_(/*328.14*/if(lookup.lookuptype == "Request Status")/*328.55*/ {_display_(Seq[Any](format.raw/*328.57*/("""
													"""),format.raw/*329.14*/("""<option value=""""),_display_(/*329.30*/lookup/*329.36*/.name),format.raw/*329.41*/("""">"""),_display_(/*329.44*/lookup/*329.50*/.name),format.raw/*329.55*/("""</option>
												""")))}),format.raw/*330.14*/("""
											""")))}),format.raw/*331.13*/("""	
										"""),format.raw/*332.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>BA Deliverable Target Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>SE Deliverable Target Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>Date Requested:</label>
							<div class="item-cont">
								<input class="large" data-format="mm/dd/yyyy" type="date" name="daterequested" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>BA Deliverable Completion Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>SE Deliverable Completion Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>How Requested:</label>
							<div class="item-cont">
								<div class="large">
									<span>
										<select name="howrequested" required="required">
											<option selected="selected" value="" disabled="disabled">--- Select How Requested ---</option>
											"""),_display_(/*396.13*/for(lookup <- lookups) yield /*396.35*/ {_display_(Seq[Any](format.raw/*396.37*/("""
												"""),_display_(/*397.14*/if(lookup.lookuptype == "Intake Type")/*397.52*/ {_display_(Seq[Any](format.raw/*397.54*/("""
													"""),format.raw/*398.14*/("""<option value=""""),_display_(/*398.30*/lookup/*398.36*/.name),format.raw/*398.41*/("""">"""),_display_(/*398.44*/lookup/*398.50*/.name),format.raw/*398.55*/("""</option>
												""")))}),format.raw/*399.14*/("""
											""")))}),format.raw/*400.13*/("""	
										"""),format.raw/*401.11*/("""</select>
										<i></i><span class="icon-place"></span>
									</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>Initial Customer Meeting Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" required="required" placeholder="Date"/>
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
				</div>
				<div class="row" style="padding-bottom: 16px">
					<div class="col-sm-4">
						<div class="element-select">
							<label class="title"><span class="required">*</span>Initial Customer Meeting Comments:</label>
							<div class="item-cont">
								<input class="large" type="text" name="initialmeetcomments" required="required"
									placeholder="Enter Comments..." /><span class="icon-place"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Container --> 
			<div class="element-input">
				"""),_display_(/*434.6*/if(intakeForm.hasGlobalErrors)/*434.36*/ {_display_(Seq[Any](format.raw/*434.38*/("""
				"""),format.raw/*435.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*435.64*/intakeForm/*435.74*/.globalError.message),format.raw/*435.94*/("""</span>
				""")))}),format.raw/*436.6*/("""
			"""),format.raw/*437.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" /> <a href="/user"
					class="buttonCancel">"""),_display_(/*440.28*/Messages("goback")),format.raw/*440.46*/("""</a>
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
object intake_3Columns extends intake_3Columns_Scope0.intake_3Columns
              /*
                  -- GENERATED --
                  DATE: Fri Feb 10 14:19:21 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intake_3Columns.scala.html
                  HASH: 6978ed3281f9625c56c778b545ea3e7951cd6323
                  MATRIX: 837->1|1036->104|1066->109|1084->119|1123->121|1152->124|1243->188|1271->189|1305->197|1332->198|2945->1784|2979->1802|3019->1804|3061->1819|3103->1852|3143->1854|3186->1869|3229->1885|3242->1889|3272->1898|3302->1901|3315->1905|3345->1914|3400->1938|3445->1952|3486->1965|4044->2496|4078->2514|4118->2516|4160->2531|4202->2564|4242->2566|4285->2581|4328->2597|4341->2601|4371->2610|4401->2613|4414->2617|4444->2626|4499->2650|4544->2664|4585->2677|6451->4515|6490->4537|6531->4539|6574->4554|6625->4595|6666->4597|6710->4612|6754->4628|6770->4634|6797->4639|6828->4642|6844->4648|6871->4653|6927->4677|6973->4691|7015->4704|7571->5232|7606->5250|7647->5252|7690->5267|7725->5292|7766->5294|7810->5309|7854->5325|7868->5329|7899->5338|7930->5341|7944->5345|7975->5354|8031->5378|8077->5392|8119->5405|8675->5933|8710->5951|8751->5953|8794->5968|8829->5993|8870->5995|8914->6010|8958->6026|8972->6030|9003->6039|9034->6042|9048->6046|9079->6055|9135->6079|9181->6093|9223->6106|9849->6704|9888->6726|9929->6728|9972->6743|10015->6776|10056->6778|10100->6793|10144->6809|10160->6815|10187->6820|10218->6823|10234->6829|10261->6834|10317->6858|10363->6872|10405->6885|10976->7428|11015->7450|11056->7452|11099->7467|11150->7508|11191->7510|11235->7525|11279->7541|11295->7547|11322->7552|11353->7555|11369->7561|11396->7566|11452->7590|11498->7604|11540->7617|12111->8160|12150->8182|12191->8184|12234->8199|12285->8240|12326->8242|12370->8257|12414->8273|12430->8279|12457->8284|12488->8287|12504->8293|12531->8298|12587->8322|12633->8336|12674->8348|13687->9333|13726->9355|13767->9357|13810->9372|13861->9413|13902->9415|13946->9430|13990->9446|14006->9452|14033->9457|14064->9460|14080->9466|14107->9471|14163->9495|14209->9509|14251->9522|14816->10059|14855->10081|14896->10083|14939->10098|14990->10139|15031->10141|15075->10156|15119->10172|15135->10178|15162->10183|15193->10186|15209->10192|15236->10197|15292->10221|15338->10235|15379->10247|17255->12095|17294->12117|17335->12119|17378->12134|17429->12175|17470->12177|17514->12192|17558->12208|17574->12214|17601->12219|17632->12222|17648->12228|17675->12233|17731->12257|17777->12271|17819->12284|20538->14975|20577->14997|20618->14999|20661->15014|20709->15052|20750->15054|20794->15069|20838->15085|20854->15091|20881->15096|20912->15099|20928->15105|20955->15110|21011->15134|21057->15148|21099->15161|22297->16332|22337->16362|22378->16364|22412->16370|22499->16429|22519->16439|22561->16459|22606->16473|22639->16478|22787->16598|22827->16616
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|38->7|38->7|83->52|83->52|83->52|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|85->54|85->54|86->55|87->56|88->57|103->72|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|105->74|105->74|106->75|107->76|108->77|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|156->125|156->125|156->125|156->125|157->126|158->127|159->128|174->143|174->143|174->143|175->144|175->144|175->144|176->145|176->145|176->145|176->145|176->145|176->145|176->145|177->146|178->147|179->148|194->163|194->163|194->163|195->164|195->164|195->164|196->165|196->165|196->165|196->165|196->165|196->165|196->165|197->166|198->167|199->168|216->185|216->185|216->185|217->186|217->186|217->186|218->187|218->187|218->187|218->187|218->187|218->187|218->187|219->188|220->189|221->190|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|238->207|238->207|238->207|238->207|239->208|240->209|241->210|256->225|256->225|256->225|257->226|257->226|257->226|258->227|258->227|258->227|258->227|258->227|258->227|258->227|259->228|260->229|261->230|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258|289->258|289->258|289->258|289->258|290->259|291->260|292->261|307->276|307->276|307->276|308->277|308->277|308->277|309->278|309->278|309->278|309->278|309->278|309->278|309->278|310->279|311->280|312->281|358->327|358->327|358->327|359->328|359->328|359->328|360->329|360->329|360->329|360->329|360->329|360->329|360->329|361->330|362->331|363->332|427->396|427->396|427->396|428->397|428->397|428->397|429->398|429->398|429->398|429->398|429->398|429->398|429->398|430->399|431->400|432->401|465->434|465->434|465->434|466->435|466->435|466->435|466->435|467->436|468->437|471->440|471->440
                  -- GENERATED --
              */
          