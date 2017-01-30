
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editintake_Scope0 {
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

class editintake extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],Intake,User,java.util.List[IntakeAudit],java.util.List[Comment],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeForm: Form[Application.IntakeAdd], lookups: java.util.List[Lookup], users: java.util.List[User], intake: Intake, user: User, auditTrail: java.util.List[IntakeAudit], allComments: java.util.List[Comment]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.text.SimpleDateFormat

Seq[Any](format.raw/*1.212*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(null)/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
		$(document).ready(function()"""),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""
		    
		"""),format.raw/*9.3*/("""}"""),format.raw/*9.4*/(""");
	</script>
	<input type="hidden" name="intakekey" id="intakekey" value=""""),_display_(/*11.63*/intake/*11.69*/.intakekey),format.raw/*11.79*/("""" />
	<section id="intakeEdit">
		<form class="formoid-solid-dark"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 800px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Intake Request</h2>
			</div>
			<div id="mainFormTabs" class="container">
				<ul class="nav nav-pills">
					<li class="active"><a data-toggle="tab" href="#tabPR">Project Info</a></li>
					<li><a data-toggle="tab" href="#tabBA">BA Info</a></li>
					<li><a data-toggle="tab" href="#tabSE">SE Info</a></li>
					<li><a data-toggle="tab" href="#tabCM">Comments</a></li>
				</ul>
				<div class="container" style="border:1px solid #34495E; border-radius: 0px 4px 4px 4px;">
					<div class="tab-content clearfix" style="padding: 10px;">
						<div id="tabPR" class="tab-pane fade in active">
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-input">
										<label class="title"><span class="required">*</span>Project ID:</label>
										<div class="item-cont">
											<input class="large" type="text" name="projectid" required="required"
												placeholder="Enter Project ID..." value=""""),_display_(/*35.55*/intake/*35.61*/.projectid),format.raw/*35.71*/("""" /><span class="icon-place"></span>
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
														"""),_display_(/*47.16*/for(lookup <- lookups) yield /*47.38*/ {_display_(Seq[Any](format.raw/*47.40*/("""
							                  				"""),_display_(/*48.31*/if(lookup.lookuptype == "Project Status")/*48.72*/ {_display_(Seq[Any](format.raw/*48.74*/("""<option """),_display_(/*48.83*/if(lookup.name == intake.projectstatus)/*48.122*/ {_display_(Seq[Any](format.raw/*48.124*/("""selected="selected"""")))}),format.raw/*48.144*/(""" """),format.raw/*48.145*/("""value=""""),_display_(/*48.153*/lookup/*48.159*/.name),format.raw/*48.164*/("""">"""),_display_(/*48.167*/lookup/*48.173*/.name),format.raw/*48.178*/("""</option>""")))}),format.raw/*48.188*/("""
														""")))}),format.raw/*49.16*/("""	
													"""),format.raw/*50.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-input">
										<label class="title"><span class="required">*</span>Project Name:</label>
										<div class="item-cont">
											<input class="large" type="text" name="projectname" required="required"
												placeholder="Enter Project Name..." value=""""),_display_(/*64.57*/intake/*64.63*/.projectname),format.raw/*64.75*/("""" /><span class="icon-place"></span>
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
														"""),_display_(/*76.16*/for(lookup <- lookups) yield /*76.38*/ {_display_(Seq[Any](format.raw/*76.40*/("""
							                  				"""),_display_(/*77.31*/if(lookup.lookuptype == "Agency")/*77.64*/ {_display_(Seq[Any](format.raw/*77.66*/("""<option """),_display_(/*77.75*/if(lookup.name == intake.agency)/*77.107*/ {_display_(Seq[Any](format.raw/*77.109*/("""selected="selected"""")))}),format.raw/*77.129*/(""" """),format.raw/*77.130*/("""value=""""),_display_(/*77.138*/lookup/*77.144*/.name),format.raw/*77.149*/("""">"""),_display_(/*77.152*/lookup/*77.158*/.name),format.raw/*77.163*/("""</option>""")))}),format.raw/*77.173*/("""
														""")))}),format.raw/*78.16*/("""	
													"""),format.raw/*79.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-12">
									<div class="element-input">
										<label class="title"><span class="required">*</span>Request Summary:</label>
										<div class="item-cont">
											<input class="large" type="text" name="summary" required="required"
												placeholder="Enter Request Summary..." value=""""),_display_(/*93.60*/intake/*93.66*/.summary),format.raw/*93.74*/("""" /><span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-input">
										<label class="title"><span class="required">*</span>Requestor:</label>
										<div class="item-cont">
											<input class="large" type="text" name="requestor" required="required"
												placeholder="Enter Requestor..." value=""""),_display_(/*104.54*/intake/*104.60*/.requestor),format.raw/*104.70*/("""" /><span class="icon-place"></span>
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
														"""),_display_(/*116.16*/for(lookup <- lookups) yield /*116.38*/ {_display_(Seq[Any](format.raw/*116.40*/("""
							                  				"""),_display_(/*117.31*/if(lookup.lookuptype == "Request Status")/*117.72*/ {_display_(Seq[Any](format.raw/*117.74*/("""<option """),_display_(/*117.83*/if(lookup.name == intake.requeststatus)/*117.122*/ {_display_(Seq[Any](format.raw/*117.124*/("""selected="selected"""")))}),format.raw/*117.144*/(""" """),format.raw/*117.145*/("""value=""""),_display_(/*117.153*/lookup/*117.159*/.name),format.raw/*117.164*/("""">"""),_display_(/*117.167*/lookup/*117.173*/.name),format.raw/*117.178*/("""</option>""")))}),format.raw/*117.188*/("""
														""")))}),format.raw/*118.16*/("""
													"""),format.raw/*119.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>Date Requested:</label>
										<div class="item-cont">
											<input class="large" data-format="mm/dd/yyyy" type="date" name="daterequested" placeholder="Date" value=""""),_display_(/*132.118*/if(intake.daterequested != null)/*132.150*/{_display_(_display_(/*132.152*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.daterequested))))}),format.raw/*132.218*/("""" />
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
														"""),_display_(/*145.16*/for(lookup <- lookups) yield /*145.38*/ {_display_(Seq[Any](format.raw/*145.40*/("""
							                  				"""),_display_(/*146.31*/if(lookup.lookuptype == "Intake Type")/*146.69*/ {_display_(Seq[Any](format.raw/*146.71*/("""<option """),_display_(/*146.80*/if(lookup.name == intake.howrequested)/*146.118*/ {_display_(Seq[Any](format.raw/*146.120*/("""selected="selected"""")))}),format.raw/*146.140*/(""" """),format.raw/*146.141*/("""value=""""),_display_(/*146.149*/lookup/*146.155*/.name),format.raw/*146.160*/("""">"""),_display_(/*146.163*/lookup/*146.169*/.name),format.raw/*146.174*/("""</option>""")))}),format.raw/*146.184*/("""
														""")))}),format.raw/*147.16*/("""
													"""),format.raw/*148.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div id="tabBA" class="tab-pane fade">
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>BA Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="bamanager" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
														"""),_display_(/*167.16*/for(user <- users) yield /*167.34*/ {_display_(Seq[Any](format.raw/*167.36*/("""
							                  				"""),_display_(/*168.31*/if(user.rolename == "BA Manager")/*168.64*/ {_display_(Seq[Any](format.raw/*168.66*/("""<option """),_display_(/*168.75*/if(user.fullname == intake.bamanager)/*168.112*/ {_display_(Seq[Any](format.raw/*168.114*/("""selected="selected"""")))}),format.raw/*168.134*/(""" """),format.raw/*168.135*/("""value=""""),_display_(/*168.143*/user/*168.147*/.fullname),format.raw/*168.156*/("""">"""),_display_(/*168.159*/user/*168.163*/.fullname),format.raw/*168.172*/("""</option>""")))}),format.raw/*168.182*/("""
														""")))}),format.raw/*169.16*/("""
													"""),format.raw/*170.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Assigned Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" placeholder="Date" value=""""),_display_(/*181.119*/if(intake.baassigneddate != null)/*181.152*/{_display_(_display_(/*181.154*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.baassigneddate))))}),format.raw/*181.221*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>BA Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="baassigned" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
														"""),_display_(/*196.16*/for(user <- users) yield /*196.34*/ {_display_(Seq[Any](format.raw/*196.36*/("""
							                  				"""),_display_(/*197.31*/if(user.rolename == "BA")/*197.56*/ {_display_(Seq[Any](format.raw/*197.58*/("""<option """),_display_(/*197.67*/if(user.fullname == intake.baassigned)/*197.105*/ {_display_(Seq[Any](format.raw/*197.107*/("""selected="selected"""")))}),format.raw/*197.127*/(""">"""),_display_(/*197.129*/user/*197.133*/.fullname),format.raw/*197.142*/("""</option>""")))}),format.raw/*197.152*/("""
														""")))}),format.raw/*198.16*/("""	
													"""),format.raw/*199.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>BA Deliverable:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="badeliverable" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
														"""),_display_(/*214.16*/for(lookup <- lookups) yield /*214.38*/ {_display_(Seq[Any](format.raw/*214.40*/("""
							                  				"""),_display_(/*215.31*/if(lookup.lookuptype == "BA Deliverable")/*215.72*/ {_display_(Seq[Any](format.raw/*215.74*/("""<option """),_display_(/*215.83*/if(lookup.name == intake.badeliverable)/*215.122*/ {_display_(Seq[Any](format.raw/*215.124*/("""selected="selected"""")))}),format.raw/*215.144*/(""">"""),_display_(/*215.146*/lookup/*215.152*/.name),format.raw/*215.157*/("""</option>""")))}),format.raw/*215.167*/("""
														""")))}),format.raw/*216.16*/("""
													"""),format.raw/*217.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>BA Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="bataskstatus" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
														"""),_display_(/*234.16*/for(lookup <- lookups) yield /*234.38*/ {_display_(Seq[Any](format.raw/*234.40*/("""
							                  				"""),_display_(/*235.31*/if(lookup.lookuptype == "BA Task Status")/*235.72*/ {_display_(Seq[Any](format.raw/*235.74*/("""<option """),_display_(/*235.83*/if(lookup.name == intake.bataskstatus)/*235.121*/ {_display_(Seq[Any](format.raw/*235.123*/("""selected="selected"""")))}),format.raw/*235.143*/(""">"""),_display_(/*235.145*/lookup/*235.151*/.name),format.raw/*235.156*/("""</option>""")))}),format.raw/*235.166*/("""
														""")))}),format.raw/*236.16*/("""
													"""),format.raw/*237.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-number">
										<label class="title"><span></span>BA % Time (Estimate)</label>
										<div class="item-cont">
											<input class="large" type="text" min="0" max="500" name="batimeestimate" placeholder="Number" value=""""),_display_(/*248.114*/intake/*248.120*/.batimeestimate),format.raw/*248.135*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Deliverable Target Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" placeholder="Date" value=""""),_display_(/*259.117*/if(intake.batargetdate != null)/*259.148*/{_display_(_display_(/*259.150*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.batargetdate))))}),format.raw/*259.215*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" placeholder="Date" value=""""),_display_(/*268.121*/if(intake.bacompletiondate != null)/*268.156*/{_display_(_display_(/*268.158*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.bacompletiondate))))}),format.raw/*268.227*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>Initial Customer Meeting Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" placeholder="Date"  value=""""),_display_(/*279.121*/if(intake.initialmeetdate != null)/*279.155*/{_display_(_display_(/*279.157*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*279.225*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" name="initialmeetcomments"	placeholder="Enter Comments..." value=""""),_display_(/*288.112*/intake/*288.118*/.initialmeetcomments),format.raw/*288.138*/("""" /><span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div id="tabSE" class="tab-pane fade">
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>SE Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="semanager" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
														"""),_display_(/*304.16*/for(user <- users) yield /*304.34*/ {_display_(Seq[Any](format.raw/*304.36*/("""
							                  				"""),_display_(/*305.31*/if(user.rolename == "SE Manager")/*305.64*/ {_display_(Seq[Any](format.raw/*305.66*/("""<option """),_display_(/*305.75*/if(user.fullname == intake.semanager)/*305.112*/ {_display_(Seq[Any](format.raw/*305.114*/("""selected="selected"""")))}),format.raw/*305.134*/(""" """),format.raw/*305.135*/("""value=""""),_display_(/*305.143*/user/*305.147*/.fullname),format.raw/*305.156*/("""">"""),_display_(/*305.159*/user/*305.163*/.fullname),format.raw/*305.172*/("""</option>""")))}),format.raw/*305.182*/("""
														""")))}),format.raw/*306.16*/("""
													"""),format.raw/*307.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Assigned Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" placeholder="Date" value=""""),_display_(/*318.119*/if(intake.seassigneddate != null)/*318.152*/{_display_(_display_(/*318.154*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.seassigneddate))))}),format.raw/*318.221*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>SE Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="seassigned" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
														"""),_display_(/*333.16*/for(user <- users) yield /*333.34*/ {_display_(Seq[Any](format.raw/*333.36*/("""
							                  				"""),_display_(/*334.31*/if(user.rolename == "SE")/*334.56*/ {_display_(Seq[Any](format.raw/*334.58*/("""<option """),_display_(/*334.67*/if(user.fullname == intake.seassigned)/*334.105*/ {_display_(Seq[Any](format.raw/*334.107*/("""selected="selected"""")))}),format.raw/*334.127*/(""">"""),_display_(/*334.129*/user/*334.133*/.fullname),format.raw/*334.142*/("""</option>""")))}),format.raw/*334.152*/("""
														""")))}),format.raw/*335.16*/("""	
													"""),format.raw/*336.14*/("""</select>
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
														"""),_display_(/*350.16*/for(lookup <- lookups) yield /*350.38*/ {_display_(Seq[Any](format.raw/*350.40*/("""
							                  				"""),_display_(/*351.31*/if(lookup.lookuptype == "SE Deliverable")/*351.72*/ {_display_(Seq[Any](format.raw/*351.74*/("""<option """),_display_(/*351.83*/if(lookup.name == intake.sedeliverable)/*351.122*/ {_display_(Seq[Any](format.raw/*351.124*/("""selected="selected"""")))}),format.raw/*351.144*/(""">"""),_display_(/*351.146*/lookup/*351.152*/.name),format.raw/*351.157*/("""</option>""")))}),format.raw/*351.167*/("""
														""")))}),format.raw/*352.16*/("""
													"""),format.raw/*353.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span class="required">*</span>SE Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="setaskstatus" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
														"""),_display_(/*370.16*/for(lookup <- lookups) yield /*370.38*/ {_display_(Seq[Any](format.raw/*370.40*/("""
							                  				"""),_display_(/*371.31*/if(lookup.lookuptype == "SE Task Status")/*371.72*/ {_display_(Seq[Any](format.raw/*371.74*/("""<option """),_display_(/*371.83*/if(lookup.name == intake.bataskstatus)/*371.121*/ {_display_(Seq[Any](format.raw/*371.123*/("""selected="selected"""")))}),format.raw/*371.143*/(""">"""),_display_(/*371.145*/lookup/*371.151*/.name),format.raw/*371.156*/("""</option>""")))}),format.raw/*371.166*/("""
														""")))}),format.raw/*372.16*/("""
													"""),format.raw/*373.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-number">
										<label class="title"><span></span>SE % Time (Estimate)</label>
										<div class="item-cont">
											<input class="large" type="text" min="0" max="500" name="setimeestimate" placeholder="Number" value=""""),_display_(/*384.114*/intake/*384.120*/.setimeestimate),format.raw/*384.135*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Deliverable Target Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" placeholder="Date" value=""""),_display_(/*395.117*/if(intake.setargetdate != null)/*395.148*/{_display_(_display_(/*395.150*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.setargetdate))))}),format.raw/*395.215*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" placeholder="Date" value=""""),_display_(/*404.121*/if(intake.secompletiondate != null)/*404.156*/{_display_(_display_(/*404.158*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.secompletiondate))))}),format.raw/*404.227*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>Initial Customer Meeting Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" readonly style="color: #a9a9a9;" placeholder="Date"  value=""""),_display_(/*415.131*/if(intake.initialmeetdate != null)/*415.165*/{_display_(_display_(/*415.167*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*415.235*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" readonly style="color: #a9a9a9;" placeholder="Enter Comments..." value=""""),_display_(/*424.118*/intake/*424.124*/.initialmeetcomments),format.raw/*424.144*/("""" /><span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div id="tabCM" class="tab-pane fade">
						<!-- Trigger the modal with a button -->
						<button type="button" class="buttonCustomView" style="color: #FFFFFF;" data-toggle="modal" data-target="#modalComments">Add Comments</button>
						<br><br>
						<div class="modifiedSection">
						<table class="modifiedTable">
							"""),_display_(/*436.9*/for(comment <- allComments) yield /*436.36*/ {_display_(Seq[Any](format.raw/*436.38*/("""
							"""),format.raw/*437.8*/("""<tr>
								<td width="25%">"""),_display_(/*438.26*/if(comment.datecreated != null)/*438.57*/{_display_(_display_(/*438.59*/(new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(comment.datecreated))))}),format.raw/*438.132*/("""</td>
								<td width="25%">"""),_display_(/*439.26*/comment/*439.33*/.author),format.raw/*439.40*/("""</td>
								<td width="50%">"""),_display_(/*440.26*/comment/*440.33*/.comment),format.raw/*440.41*/("""</td>
							</tr>
							""")))}),format.raw/*442.9*/("""					
							"""),format.raw/*443.8*/("""</table>
						</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Container --> 
			<div class="element-input">
				"""),_display_(/*451.6*/if(intakeForm.hasGlobalErrors)/*451.36*/ {_display_(Seq[Any](format.raw/*451.38*/("""
				"""),format.raw/*452.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*452.64*/intakeForm/*452.74*/.globalError.message),format.raw/*452.94*/("""</span>
				""")))}),format.raw/*453.6*/("""
			"""),format.raw/*454.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" /> <a href="/"
					class="buttonCancel">"""),_display_(/*457.28*/Messages("goback")),format.raw/*457.46*/("""</a>
			</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					"""),_display_(/*461.7*/for(audit <- auditTrail) yield /*461.31*/ {_display_(Seq[Any](format.raw/*461.33*/("""
					"""),format.raw/*462.6*/("""<tr>
						<td>"""),_display_(/*463.12*/audit/*463.17*/.editor),format.raw/*463.24*/(""" """),format.raw/*463.25*/("""("""),_display_(/*463.27*/audit/*463.32*/.editoremail),format.raw/*463.44*/(""") changed <b>"""),_display_(/*463.58*/audit/*463.63*/.fielddisplay),format.raw/*463.76*/("""</b> from <b>"""),_display_(/*463.90*/audit/*463.95*/.oldvalue),format.raw/*463.104*/("""</b> to <b>"""),_display_(/*463.116*/audit/*463.121*/.newvalue),format.raw/*463.130*/("""</b> on """),_display_(/*463.139*/audit/*463.144*/.editdate),format.raw/*463.153*/(""".</td>
					</tr>
					""")))}),format.raw/*465.7*/("""					
				"""),format.raw/*466.5*/("""</table>
			</div>
			<!-- This is needed for bottom shadow to appear... -->
			<div></div>
		</form>
	</section>
	
	
""")))}))
      }
    }
  }

  def render(intakeForm:Form[Application.IntakeAdd],lookups:java.util.List[Lookup],users:java.util.List[User],intake:Intake,user:User,auditTrail:java.util.List[IntakeAudit],allComments:java.util.List[Comment]): play.twirl.api.HtmlFormat.Appendable = apply(intakeForm,lookups,users,intake,user,auditTrail,allComments)

  def f:((Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],Intake,User,java.util.List[IntakeAudit],java.util.List[Comment]) => play.twirl.api.HtmlFormat.Appendable) = (intakeForm,lookups,users,intake,user,auditTrail,allComments) => apply(intakeForm,lookups,users,intake,user,auditTrail,allComments)

  def ref: this.type = this

}


}

/**/
object editintake extends editintake_Scope0.editintake
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 10:30:33 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/editintake.scala.html
                  HASH: bc01bb97d5d7257aaee2fcd5e22bd3ab670a8464
                  MATRIX: 891->1|1230->211|1260->251|1288->254|1306->264|1345->266|1374->269|1464->332|1492->333|1530->345|1557->346|1662->424|1677->430|1708->440|3026->1731|3041->1737|3072->1747|3615->2263|3653->2285|3693->2287|3752->2319|3802->2360|3842->2362|3878->2371|3927->2410|3968->2412|4020->2432|4050->2433|4086->2441|4102->2447|4129->2452|4160->2455|4176->2461|4203->2466|4245->2476|4293->2493|4337->2509|4921->3066|4936->3072|4969->3084|5508->3596|5546->3618|5586->3620|5645->3652|5687->3685|5727->3687|5763->3696|5805->3728|5846->3730|5898->3750|5928->3751|5964->3759|5980->3765|6007->3770|6038->3773|6054->3779|6081->3784|6123->3794|6171->3811|6215->3827|6802->4387|6817->4393|6846->4401|7356->4883|7372->4889|7404->4899|7948->5415|7987->5437|8028->5439|8088->5471|8139->5512|8180->5514|8217->5523|8267->5562|8309->5564|8362->5584|8393->5585|8430->5593|8447->5599|8475->5604|8507->5607|8524->5613|8552->5618|8595->5628|8644->5645|8688->5660|9234->6177|9277->6209|9309->6211|9400->6277|9962->6811|10001->6833|10042->6835|10102->6867|10150->6905|10191->6907|10228->6916|10277->6954|10319->6956|10372->6976|10403->6977|10440->6985|10457->6991|10485->6996|10517->6999|10534->7005|10562->7010|10605->7020|10654->7037|10698->7052|11433->7759|11468->7777|11509->7779|11569->7811|11612->7844|11653->7846|11690->7855|11738->7892|11780->7894|11833->7914|11864->7915|11901->7923|11916->7927|11948->7936|11980->7939|11995->7943|12027->7952|12070->7962|12119->7979|12163->7994|12641->8443|12685->8476|12717->8478|12809->8545|13427->9135|13462->9153|13503->9155|13563->9187|13598->9212|13639->9214|13676->9223|13725->9261|13767->9263|13820->9283|13851->9285|13866->9289|13898->9298|13941->9308|13990->9325|14035->9341|14651->9929|14690->9951|14731->9953|14791->9985|14842->10026|14883->10028|14920->10037|14970->10076|15012->10078|15065->10098|15096->10100|15113->10106|15141->10111|15184->10121|15233->10138|15277->10153|15958->10806|15997->10828|16038->10830|16098->10862|16149->10903|16190->10905|16227->10914|16276->10952|16318->10954|16371->10974|16402->10976|16419->10982|16447->10987|16490->10997|16539->11014|16583->11029|17061->11478|17078->11484|17116->11499|17619->11973|17661->12004|17693->12006|17783->12071|18223->12482|18269->12517|18301->12519|18395->12588|18905->13069|18950->13103|18982->13105|19075->13173|19511->13580|19528->13586|19571->13606|20239->14246|20274->14264|20315->14266|20375->14298|20418->14331|20459->14333|20496->14342|20544->14379|20586->14381|20639->14401|20670->14402|20707->14410|20722->14414|20754->14423|20786->14426|20801->14430|20833->14439|20876->14449|20925->14466|20969->14481|21447->14930|21491->14963|21523->14965|21615->15032|22233->15622|22268->15640|22309->15642|22369->15674|22404->15699|22445->15701|22482->15710|22531->15748|22573->15750|22626->15770|22657->15772|22672->15776|22704->15785|22747->15795|22796->15812|22841->15828|23349->16308|23388->16330|23429->16332|23489->16364|23540->16405|23581->16407|23618->16416|23668->16455|23710->16457|23763->16477|23794->16479|23811->16485|23839->16490|23882->16500|23931->16517|23975->16532|24656->17185|24695->17207|24736->17209|24796->17241|24847->17282|24888->17284|24925->17293|24974->17331|25016->17333|25069->17353|25100->17355|25117->17361|25145->17366|25188->17376|25237->17393|25281->17408|25759->17857|25776->17863|25814->17878|26317->18352|26359->18383|26391->18385|26481->18450|26921->18861|26967->18896|26999->18898|27093->18967|27613->19458|27658->19492|27690->19494|27783->19562|28225->19975|28242->19981|28285->20001|28771->20460|28815->20487|28856->20489|28893->20498|28952->20529|28993->20560|29024->20562|29122->20635|29182->20667|29199->20674|29228->20681|29288->20713|29305->20720|29335->20728|29395->20757|29437->20771|29603->20910|29643->20940|29684->20942|29718->20948|29805->21007|29825->21017|29867->21037|29912->21051|29945->21056|30089->21172|30129->21190|30248->21282|30289->21306|30330->21308|30365->21315|30410->21332|30425->21337|30454->21344|30484->21345|30514->21347|30529->21352|30563->21364|30605->21378|30620->21383|30655->21396|30697->21410|30712->21415|30744->21424|30785->21436|30801->21441|30833->21450|30871->21459|30887->21464|30919->21473|30976->21499|31015->21510
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|39->9|39->9|41->11|41->11|41->11|65->35|65->35|65->35|77->47|77->47|77->47|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|79->49|80->50|94->64|94->64|94->64|106->76|106->76|106->76|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|107->77|108->78|109->79|123->93|123->93|123->93|134->104|134->104|134->104|146->116|146->116|146->116|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|148->118|149->119|162->132|162->132|162->132|162->132|175->145|175->145|175->145|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|176->146|177->147|178->148|197->167|197->167|197->167|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|198->168|199->169|200->170|211->181|211->181|211->181|211->181|226->196|226->196|226->196|227->197|227->197|227->197|227->197|227->197|227->197|227->197|227->197|227->197|227->197|227->197|228->198|229->199|244->214|244->214|244->214|245->215|245->215|245->215|245->215|245->215|245->215|245->215|245->215|245->215|245->215|245->215|246->216|247->217|264->234|264->234|264->234|265->235|265->235|265->235|265->235|265->235|265->235|265->235|265->235|265->235|265->235|265->235|266->236|267->237|278->248|278->248|278->248|289->259|289->259|289->259|289->259|298->268|298->268|298->268|298->268|309->279|309->279|309->279|309->279|318->288|318->288|318->288|334->304|334->304|334->304|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|335->305|336->306|337->307|348->318|348->318|348->318|348->318|363->333|363->333|363->333|364->334|364->334|364->334|364->334|364->334|364->334|364->334|364->334|364->334|364->334|364->334|365->335|366->336|380->350|380->350|380->350|381->351|381->351|381->351|381->351|381->351|381->351|381->351|381->351|381->351|381->351|381->351|382->352|383->353|400->370|400->370|400->370|401->371|401->371|401->371|401->371|401->371|401->371|401->371|401->371|401->371|401->371|401->371|402->372|403->373|414->384|414->384|414->384|425->395|425->395|425->395|425->395|434->404|434->404|434->404|434->404|445->415|445->415|445->415|445->415|454->424|454->424|454->424|466->436|466->436|466->436|467->437|468->438|468->438|468->438|468->438|469->439|469->439|469->439|470->440|470->440|470->440|472->442|473->443|481->451|481->451|481->451|482->452|482->452|482->452|482->452|483->453|484->454|487->457|487->457|491->461|491->461|491->461|492->462|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|493->463|495->465|496->466
                  -- GENERATED --
              */
          