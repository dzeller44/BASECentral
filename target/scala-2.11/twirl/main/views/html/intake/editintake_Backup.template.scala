
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editintake_Backup_Scope0 {
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

class editintake_Backup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],Intake,User,java.util.List[IntakeAudit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeForm: Form[Application.IntakeAdd], lookups: java.util.List[Lookup], users: java.util.List[User], intake: Intake, user: User, auditTrail: java.util.List[IntakeAudit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.text.SimpleDateFormat

Seq[Any](format.raw/*1.174*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(null)/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
"""),format.raw/*6.1*/("""<script type="text/javascript">
	$(document).ready(function() """),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""
	
	"""),format.raw/*9.2*/("""}"""),format.raw/*9.3*/(""");
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
								placeholder="Enter Project ID..." value=""""),_display_(/*32.51*/intake/*32.57*/.projectid),format.raw/*32.67*/("""" /><span class="icon-place"></span>
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
										"""),_display_(/*44.12*/for(lookup <- lookups) yield /*44.34*/ {_display_(Seq[Any](format.raw/*44.36*/("""
			                  				"""),_display_(/*45.27*/if(lookup.lookuptype == "Project Status")/*45.68*/ {_display_(Seq[Any](format.raw/*45.70*/("""<option """),_display_(/*45.79*/if(lookup.name == intake.projectstatus)/*45.118*/ {_display_(Seq[Any](format.raw/*45.120*/("""selected="selected"""")))}),format.raw/*45.140*/(""" """),format.raw/*45.141*/("""value=""""),_display_(/*45.149*/lookup/*45.155*/.name),format.raw/*45.160*/("""">"""),_display_(/*45.163*/lookup/*45.169*/.name),format.raw/*45.174*/("""</option>""")))}),format.raw/*45.184*/("""
										""")))}),format.raw/*46.12*/("""	
									"""),format.raw/*47.10*/("""</select>
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
								placeholder="Enter Project Name..." value=""""),_display_(/*62.53*/intake/*62.59*/.projectname),format.raw/*62.71*/("""" /><span class="icon-place"></span>
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
										"""),_display_(/*74.12*/for(lookup <- lookups) yield /*74.34*/ {_display_(Seq[Any](format.raw/*74.36*/("""
			                  				"""),_display_(/*75.27*/if(lookup.lookuptype == "Agency")/*75.60*/ {_display_(Seq[Any](format.raw/*75.62*/("""<option """),_display_(/*75.71*/if(lookup.name == intake.agency)/*75.103*/ {_display_(Seq[Any](format.raw/*75.105*/("""selected="selected"""")))}),format.raw/*75.125*/(""" """),format.raw/*75.126*/("""value=""""),_display_(/*75.134*/lookup/*75.140*/.name),format.raw/*75.145*/("""">"""),_display_(/*75.148*/lookup/*75.154*/.name),format.raw/*75.159*/("""</option>""")))}),format.raw/*75.169*/("""
										""")))}),format.raw/*76.12*/("""	
									"""),format.raw/*77.10*/("""</select>
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
								placeholder="Enter Request Summary..." value=""""),_display_(/*92.56*/intake/*92.62*/.summary),format.raw/*92.70*/("""" /><span class="icon-place"></span>
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
								placeholder="Enter Requestor..." value=""""),_display_(/*104.50*/intake/*104.56*/.requestor),format.raw/*104.66*/("""" /><span class="icon-place"></span>
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
										"""),_display_(/*116.12*/for(lookup <- lookups) yield /*116.34*/ {_display_(Seq[Any](format.raw/*116.36*/("""
			                  				"""),_display_(/*117.27*/if(lookup.lookuptype == "Request Status")/*117.68*/ {_display_(Seq[Any](format.raw/*117.70*/("""<option """),_display_(/*117.79*/if(lookup.name == intake.requeststatus)/*117.118*/ {_display_(Seq[Any](format.raw/*117.120*/("""selected="selected"""")))}),format.raw/*117.140*/(""" """),format.raw/*117.141*/("""value=""""),_display_(/*117.149*/lookup/*117.155*/.name),format.raw/*117.160*/("""">"""),_display_(/*117.163*/lookup/*117.169*/.name),format.raw/*117.174*/("""</option>""")))}),format.raw/*117.184*/("""
										""")))}),format.raw/*118.12*/("""
									"""),format.raw/*119.10*/("""</select>
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
							<input class="large" data-format="yyyy-MM-dd" type="date" name="daterequested" required="required" placeholder="Date" value=""""),_display_(/*133.134*/if(intake.daterequested != null)/*133.166*/{_display_(_display_(/*133.168*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.daterequested))))}),format.raw/*133.234*/("""" />
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
										"""),_display_(/*146.12*/for(lookup <- lookups) yield /*146.34*/ {_display_(Seq[Any](format.raw/*146.36*/("""
			                  				"""),_display_(/*147.27*/if(lookup.lookuptype == "Intake Type")/*147.65*/ {_display_(Seq[Any](format.raw/*147.67*/("""<option """),_display_(/*147.76*/if(lookup.name == intake.howrequested)/*147.114*/ {_display_(Seq[Any](format.raw/*147.116*/("""selected="selected"""")))}),format.raw/*147.136*/(""" """),format.raw/*147.137*/("""value=""""),_display_(/*147.145*/lookup/*147.151*/.name),format.raw/*147.156*/("""">"""),_display_(/*147.159*/lookup/*147.165*/.name),format.raw/*147.170*/("""</option>""")))}),format.raw/*147.180*/("""
										""")))}),format.raw/*148.12*/("""
									"""),format.raw/*149.10*/("""</select>
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
							<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" required="required" placeholder="Date" value=""""),_display_(/*163.136*/if(intake.initialmeetdate != null)/*163.170*/{_display_(_display_(/*163.172*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*163.240*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>Initial Customer Meeting Comments:</label>
						<div class="item-cont">
							<input class="large" type="text" name="initialmeetcomments" required="required"
								placeholder="Enter Comments..."  value="""),_display_(/*173.49*/intake/*173.55*/.initialmeetcomments),format.raw/*173.75*/(""" """),format.raw/*173.76*/("""/><span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
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
			<!-- End Row 6 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Manager:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="bamanager" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
										"""),_display_(/*200.12*/for(user <- users) yield /*200.30*/ {_display_(Seq[Any](format.raw/*200.32*/("""
			                  				"""),_display_(/*201.27*/if(user.rolename == "BA Manager")/*201.60*/ {_display_(Seq[Any](format.raw/*201.62*/("""<option """),_display_(/*201.71*/if(user.fullname == intake.bamanager)/*201.108*/ {_display_(Seq[Any](format.raw/*201.110*/("""selected="selected"""")))}),format.raw/*201.130*/(""" """),format.raw/*201.131*/("""value=""""),_display_(/*201.139*/user/*201.143*/.fullname),format.raw/*201.152*/("""">"""),_display_(/*201.155*/user/*201.159*/.fullname),format.raw/*201.168*/("""</option>""")))}),format.raw/*201.178*/("""
										""")))}),format.raw/*202.12*/("""
									"""),format.raw/*203.10*/("""</select>
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
										"""),_display_(/*218.12*/for(user <- users) yield /*218.30*/ {_display_(Seq[Any](format.raw/*218.32*/("""
			                  				"""),_display_(/*219.27*/if(user.rolename == "SE Manager")/*219.60*/ {_display_(Seq[Any](format.raw/*219.62*/("""<option """),_display_(/*219.71*/if(user.fullname == intake.semanager)/*219.108*/ {_display_(Seq[Any](format.raw/*219.110*/("""selected="selected"""")))}),format.raw/*219.130*/(""" """),format.raw/*219.131*/("""value=""""),_display_(/*219.139*/user/*219.143*/.fullname),format.raw/*219.152*/("""">"""),_display_(/*219.155*/user/*219.159*/.fullname),format.raw/*219.168*/("""</option>""")))}),format.raw/*219.178*/("""
										""")))}),format.raw/*220.12*/("""
									"""),format.raw/*221.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 7 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>BA Assigned Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" required="required" placeholder="Date" value=""""),_display_(/*235.135*/if(intake.baassigneddate != null)/*235.168*/{_display_(_display_(/*235.170*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.baassigneddate))))}),format.raw/*235.237*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>SE Assigned Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" required="required" placeholder="Date" value=""""),_display_(/*244.135*/if(intake.seassigneddate != null)/*244.168*/{_display_(_display_(/*244.170*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.seassigneddate))))}),format.raw/*244.237*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 8 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Assigned:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="baassigned" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
										"""),_display_(/*260.12*/for(user <- users) yield /*260.30*/ {_display_(Seq[Any](format.raw/*260.32*/("""
			                  				"""),_display_(/*261.27*/if(user.rolename == "BA")/*261.52*/ {_display_(Seq[Any](format.raw/*261.54*/("""<option """),_display_(/*261.63*/if(user.fullname == intake.baassigned)/*261.101*/ {_display_(Seq[Any](format.raw/*261.103*/("""selected="selected"""")))}),format.raw/*261.123*/(""">"""),_display_(/*261.125*/user/*261.129*/.fullname),format.raw/*261.138*/("""</option>""")))}),format.raw/*261.148*/("""
										""")))}),format.raw/*262.12*/("""	
									"""),format.raw/*263.10*/("""</select>
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
										"""),_display_(/*278.12*/for(user <- users) yield /*278.30*/ {_display_(Seq[Any](format.raw/*278.32*/("""
			                  				"""),_display_(/*279.27*/if(user.rolename == "SE")/*279.52*/ {_display_(Seq[Any](format.raw/*279.54*/("""<option """),_display_(/*279.63*/if(user.fullname == intake.seassigned)/*279.101*/ {_display_(Seq[Any](format.raw/*279.103*/("""selected="selected"""")))}),format.raw/*279.123*/(""">"""),_display_(/*279.125*/user/*279.129*/.fullname),format.raw/*279.138*/("""</option>""")))}),format.raw/*279.148*/("""
										""")))}),format.raw/*280.12*/("""	
									"""),format.raw/*281.10*/("""</select>
									<i></i><span class="icon-place"></span>
								</span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 9 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-select">
						<label class="title"><span class="required">*</span>BA Deliverable:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="badeliverable" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
										"""),_display_(/*299.12*/for(lookup <- lookups) yield /*299.34*/ {_display_(Seq[Any](format.raw/*299.36*/("""
			                  				"""),_display_(/*300.27*/if(lookup.lookuptype == "BA Deliverable")/*300.68*/ {_display_(Seq[Any](format.raw/*300.70*/("""<option """),_display_(/*300.79*/if(lookup.name == intake.badeliverable)/*300.118*/ {_display_(Seq[Any](format.raw/*300.120*/("""selected="selected"""")))}),format.raw/*300.140*/(""">"""),_display_(/*300.142*/lookup/*300.148*/.name),format.raw/*300.153*/("""</option>""")))}),format.raw/*300.163*/("""
										""")))}),format.raw/*301.12*/("""
									"""),format.raw/*302.10*/("""</select>
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
										"""),_display_(/*316.12*/for(lookup <- lookups) yield /*316.34*/ {_display_(Seq[Any](format.raw/*316.36*/("""
			                  				"""),_display_(/*317.27*/if(lookup.lookuptype == "SE Deliverable")/*317.68*/ {_display_(Seq[Any](format.raw/*317.70*/("""<option """),_display_(/*317.79*/if(lookup.name == intake.sedeliverable)/*317.118*/ {_display_(Seq[Any](format.raw/*317.120*/("""selected="selected"""")))}),format.raw/*317.140*/(""">"""),_display_(/*317.142*/lookup/*317.148*/.name),format.raw/*317.153*/("""</option>""")))}),format.raw/*317.163*/("""
										""")))}),format.raw/*318.12*/("""
									"""),format.raw/*319.10*/("""</select>
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
						<label class="title"><span class="required">*</span>BA Task Status:</label>
						<div class="item-cont">
							<div class="large">
								<span>
									<select name="bataskstatus" required="required">
										<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
										"""),_display_(/*337.12*/for(lookup <- lookups) yield /*337.34*/ {_display_(Seq[Any](format.raw/*337.36*/("""
			                  				"""),_display_(/*338.27*/if(lookup.lookuptype == "BA Task Status")/*338.68*/ {_display_(Seq[Any](format.raw/*338.70*/("""<option """),_display_(/*338.79*/if(lookup.name == intake.bataskstatus)/*338.117*/ {_display_(Seq[Any](format.raw/*338.119*/("""selected="selected"""")))}),format.raw/*338.139*/(""">"""),_display_(/*338.141*/lookup/*338.147*/.name),format.raw/*338.152*/("""</option>""")))}),format.raw/*338.162*/("""
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
			                  				"""),_display_(/*356.27*/if(lookup.lookuptype == "SE Task Status")/*356.68*/ {_display_(Seq[Any](format.raw/*356.70*/("""<option """),_display_(/*356.79*/if(lookup.name == intake.bataskstatus)/*356.117*/ {_display_(Seq[Any](format.raw/*356.119*/("""selected="selected"""")))}),format.raw/*356.139*/(""">"""),_display_(/*356.141*/lookup/*356.147*/.name),format.raw/*356.152*/("""</option>""")))}),format.raw/*356.162*/("""
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
							<input class="large" type="text" min="0" max="500" name="batimeestimate" required="required" placeholder="Number" value=""""),_display_(/*371.130*/intake/*371.136*/.batimeestimate),format.raw/*371.151*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-number">
						<label class="title"><span class="required">*</span>SE % Time (Estimate)</label>
						<div class="item-cont">
							<input class="large" type="text" min="0" max="500" name="setimeestimate" required="required" placeholder="Number" value=""""),_display_(/*380.130*/intake/*380.136*/.setimeestimate),format.raw/*380.151*/("""" />
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
							<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" required="required" placeholder="Date" value=""""),_display_(/*391.133*/if(intake.batargetdate != null)/*391.164*/{_display_(_display_(/*391.166*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.batargetdate))))}),format.raw/*391.231*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>SE Deliverable Target Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" required="required" placeholder="Date" value=""""),_display_(/*400.133*/if(intake.setargetdate != null)/*400.164*/{_display_(_display_(/*400.166*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.setargetdate))))}),format.raw/*400.231*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
			<!-- End Row 11 -->
			<div class="row" style="padding-bottom: 16px">
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>BA Deliverable Completion Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" required="required" placeholder="Date" value=""""),_display_(/*412.137*/if(intake.bacompletiondate != null)/*412.172*/{_display_(_display_(/*412.174*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.bacompletiondate))))}),format.raw/*412.243*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="element-date">
						<label class="title"><span class="required">*</span>SE Deliverable Completion Date:</label>
						<div class="item-cont">
							<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" required="required" placeholder="Date" value=""""),_display_(/*421.137*/if(intake.secompletiondate != null)/*421.172*/{_display_(_display_(/*421.174*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.secompletiondate))))}),format.raw/*421.243*/("""" />
							<span class="icon-place"></span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- End Container --> 
		<div class="element-input">
			"""),_display_(/*430.5*/if(intakeForm.hasGlobalErrors)/*430.35*/ {_display_(Seq[Any](format.raw/*430.37*/("""
				"""),format.raw/*431.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*431.64*/intakeForm/*431.74*/.globalError.message),format.raw/*431.94*/("""</span>
			""")))}),format.raw/*432.5*/("""
		"""),format.raw/*433.3*/("""</div>
		<div class="submit">
			<input type="submit" value="Submit" />
			<a href="/" class="buttonCancel">"""),_display_(/*436.38*/Messages("goback")),format.raw/*436.56*/("""</a>
		</div>
		"""),_display_(/*438.4*/if(user.getRolename().contains("Manager"))/*438.46*/ {_display_(Seq[Any](format.raw/*438.48*/("""
			"""),format.raw/*439.4*/("""<div class="submit">
				<a href="javascript:deleteIntake('"""),_display_(/*440.40*/intake/*440.46*/.intakekey),format.raw/*440.56*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
			</div>
		""")))}),format.raw/*442.4*/("""
		"""),format.raw/*443.3*/("""<div class="modifiedSection">
				<table class="modifiedTable">
					"""),_display_(/*445.7*/for(audit <- auditTrail) yield /*445.31*/ {_display_(Seq[Any](format.raw/*445.33*/("""
						"""),format.raw/*446.7*/("""<tr>
							<td>"""),_display_(/*447.13*/audit/*447.18*/.editor),format.raw/*447.25*/(""" """),format.raw/*447.26*/("""("""),_display_(/*447.28*/audit/*447.33*/.editoremail),format.raw/*447.45*/(""") changed <b>"""),_display_(/*447.59*/audit/*447.64*/.fielddisplay),format.raw/*447.77*/("""</b> from <b>"""),_display_(/*447.91*/audit/*447.96*/.oldvalue),format.raw/*447.105*/("""</b> to <b>"""),_display_(/*447.117*/audit/*447.122*/.newvalue),format.raw/*447.131*/("""</b> on """),_display_(/*447.140*/audit/*447.145*/.editdate),format.raw/*447.154*/(""".</td>
						</tr>
					""")))}),format.raw/*449.7*/("""					
				"""),format.raw/*450.5*/("""</table>
		</div>
		<!-- This is needed for bottom shadow to appear... -->
		<div></div>
	</form>
</section>
""")))}))
      }
    }
  }

  def render(intakeForm:Form[Application.IntakeAdd],lookups:java.util.List[Lookup],users:java.util.List[User],intake:Intake,user:User,auditTrail:java.util.List[IntakeAudit]): play.twirl.api.HtmlFormat.Appendable = apply(intakeForm,lookups,users,intake,user,auditTrail)

  def f:((Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],Intake,User,java.util.List[IntakeAudit]) => play.twirl.api.HtmlFormat.Appendable) = (intakeForm,lookups,users,intake,user,auditTrail) => apply(intakeForm,lookups,users,intake,user,auditTrail)

  def ref: this.type = this

}


}

/**/
object editintake_Backup extends editintake_Backup_Scope0.editintake_Backup
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:15 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/editintake_Backup.scala.html
                  HASH: 38e6d9367f318c8468ad6dbc9c6d281f61a9eed1
                  MATRIX: 881->1|1182->173|1212->213|1240->216|1258->226|1297->228|1325->230|1415->293|1443->294|1475->300|1502->301|2418->1190|2433->1196|2464->1206|2959->1674|2997->1696|3037->1698|3092->1726|3142->1767|3182->1769|3218->1778|3267->1817|3308->1819|3360->1839|3390->1840|3426->1848|3442->1854|3469->1859|3500->1862|3516->1868|3543->1873|3585->1883|3629->1896|3669->1908|4219->2431|4234->2437|4267->2449|4758->2913|4796->2935|4836->2937|4891->2965|4933->2998|4973->3000|5009->3009|5051->3041|5092->3043|5144->3063|5174->3064|5210->3072|5226->3078|5253->3083|5284->3086|5300->3092|5327->3097|5369->3107|5413->3120|5453->3132|6006->3658|6021->3664|6050->3672|6538->4132|6554->4138|6586->4148|7082->4616|7121->4638|7162->4640|7218->4668|7269->4709|7310->4711|7347->4720|7397->4759|7439->4761|7492->4781|7523->4782|7560->4790|7577->4796|7605->4801|7637->4804|7654->4810|7682->4815|7725->4825|7770->4838|7810->4849|8364->5374|8407->5406|8439->5408|8530->5474|9040->5956|9079->5978|9120->5980|9176->6008|9224->6046|9265->6048|9302->6057|9351->6095|9393->6097|9446->6117|9477->6118|9514->6126|9531->6132|9559->6137|9591->6140|9608->6146|9636->6151|9679->6161|9724->6174|9764->6185|10335->6727|10380->6761|10412->6763|10505->6831|10951->7249|10967->7255|11009->7275|11039->7276|11875->8084|11910->8102|11951->8104|12007->8132|12050->8165|12091->8167|12128->8176|12176->8213|12218->8215|12271->8235|12302->8236|12339->8244|12354->8248|12386->8257|12418->8260|12433->8264|12465->8273|12508->8283|12553->8296|12593->8307|13137->8823|13172->8841|13213->8843|13269->8871|13312->8904|13353->8906|13390->8915|13438->8952|13480->8954|13533->8974|13564->8975|13601->8983|13616->8987|13648->8996|13680->8999|13695->9003|13727->9012|13770->9022|13815->9035|13855->9046|14412->9574|14456->9607|14488->9609|14580->9676|15006->10073|15050->10106|15082->10108|15174->10175|15754->10727|15789->10745|15830->10747|15886->10775|15921->10800|15962->10802|15999->10811|16048->10849|16090->10851|16143->10871|16174->10873|16189->10877|16221->10886|16264->10896|16309->10909|16350->10921|16891->11434|16926->11452|16967->11454|17023->11482|17058->11507|17099->11509|17136->11518|17185->11556|17227->11558|17280->11578|17311->11580|17326->11584|17358->11593|17401->11603|17446->11616|17487->11628|18128->12241|18167->12263|18208->12265|18264->12293|18315->12334|18356->12336|18393->12345|18443->12384|18485->12386|18538->12406|18569->12408|18586->12414|18614->12419|18657->12429|18702->12442|18742->12453|19194->12877|19233->12899|19274->12901|19330->12929|19381->12970|19422->12972|19459->12981|19509->13020|19551->13022|19604->13042|19635->13044|19652->13050|19680->13055|19723->13065|19768->13078|19808->13089|20444->13697|20483->13719|20524->13721|20580->13749|20631->13790|20672->13792|20709->13801|20758->13839|20800->13841|20853->13861|20884->13863|20901->13869|20929->13874|20972->13884|21017->13897|21057->13908|21607->14430|21646->14452|21687->14454|21743->14482|21794->14523|21835->14525|21872->14534|21921->14572|21963->14574|22016->14594|22047->14596|22064->14602|22092->14607|22135->14617|22180->14630|22220->14641|22754->15146|22771->15152|22809->15167|23235->15564|23252->15570|23290->15585|23786->16052|23828->16083|23860->16085|23950->16150|24384->16555|24426->16586|24458->16588|24548->16653|25076->17152|25122->17187|25154->17189|25248->17258|25690->17671|25736->17706|25768->17708|25862->17777|26058->17946|26098->17976|26139->17978|26173->17984|26260->18043|26280->18053|26322->18073|26366->18086|26398->18090|26538->18202|26578->18220|26624->18239|26676->18281|26717->18283|26750->18288|26839->18349|26855->18355|26887->18365|26993->18440|27025->18444|27124->18516|27165->18540|27206->18542|27242->18550|27288->18568|27303->18573|27332->18580|27362->18581|27392->18583|27407->18588|27441->18600|27483->18614|27498->18619|27533->18632|27575->18646|27590->18651|27622->18660|27663->18672|27679->18677|27711->18686|27749->18695|27765->18700|27797->18709|27855->18736|27894->18747
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|39->9|39->9|62->32|62->32|62->32|74->44|74->44|74->44|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|75->45|76->46|77->47|92->62|92->62|92->62|104->74|104->74|104->74|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|105->75|106->76|107->77|122->92|122->92|122->92|134->104|134->104|134->104|146->116|146->116|146->116|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|147->117|148->118|149->119|163->133|163->133|163->133|163->133|176->146|176->146|176->146|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|177->147|178->148|179->149|193->163|193->163|193->163|193->163|203->173|203->173|203->173|203->173|230->200|230->200|230->200|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|232->202|233->203|248->218|248->218|248->218|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|249->219|250->220|251->221|265->235|265->235|265->235|265->235|274->244|274->244|274->244|274->244|290->260|290->260|290->260|291->261|291->261|291->261|291->261|291->261|291->261|291->261|291->261|291->261|291->261|291->261|292->262|293->263|308->278|308->278|308->278|309->279|309->279|309->279|309->279|309->279|309->279|309->279|309->279|309->279|309->279|309->279|310->280|311->281|329->299|329->299|329->299|330->300|330->300|330->300|330->300|330->300|330->300|330->300|330->300|330->300|330->300|330->300|331->301|332->302|346->316|346->316|346->316|347->317|347->317|347->317|347->317|347->317|347->317|347->317|347->317|347->317|347->317|347->317|348->318|349->319|367->337|367->337|367->337|368->338|368->338|368->338|368->338|368->338|368->338|368->338|368->338|368->338|368->338|368->338|369->339|370->340|385->355|385->355|385->355|386->356|386->356|386->356|386->356|386->356|386->356|386->356|386->356|386->356|386->356|386->356|387->357|388->358|401->371|401->371|401->371|410->380|410->380|410->380|421->391|421->391|421->391|421->391|430->400|430->400|430->400|430->400|442->412|442->412|442->412|442->412|451->421|451->421|451->421|451->421|460->430|460->430|460->430|461->431|461->431|461->431|461->431|462->432|463->433|466->436|466->436|468->438|468->438|468->438|469->439|470->440|470->440|470->440|472->442|473->443|475->445|475->445|475->445|476->446|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|477->447|479->449|480->450
                  -- GENERATED --
              */
          