
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editintake_3Column_Scope0 {
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

class editintake_3Column extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],Intake,User,java.util.List[IntakeAudit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeForm: Form[Application.IntakeAdd], lookups: java.util.List[Lookup], users: java.util.List[User], intake: Intake, user: User, auditTrail: java.util.List[IntakeAudit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import java.text.SimpleDateFormat

Seq[Any](format.raw/*1.174*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(null)/*5.12*/ {_display_(Seq[Any](format.raw/*5.14*/("""
	"""),format.raw/*6.2*/("""<script type="text/javascript">
		$(document).ready(function() """),format.raw/*7.32*/("""{"""),format.raw/*7.33*/("""
		
		"""),format.raw/*9.3*/("""}"""),format.raw/*9.4*/(""");
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
									placeholder="Enter Project ID..." value=""""),_display_(/*42.52*/intake/*42.58*/.projectid),format.raw/*42.68*/("""" /><span class="icon-place"></span>
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
											"""),_display_(/*54.13*/for(user <- users) yield /*54.31*/ {_display_(Seq[Any](format.raw/*54.33*/("""
												"""),_display_(/*55.14*/if(user.rolename == "BA Manager")/*55.47*/ {_display_(Seq[Any](format.raw/*55.49*/("""<option """),_display_(/*55.58*/if(user.fullname == intake.bamanager)/*55.95*/ {_display_(Seq[Any](format.raw/*55.97*/("""selected="selected"""")))}),format.raw/*55.117*/(""" """),format.raw/*55.118*/("""value=""""),_display_(/*55.126*/user/*55.130*/.fullname),format.raw/*55.139*/("""">"""),_display_(/*55.142*/user/*55.146*/.fullname),format.raw/*55.155*/("""</option>""")))}),format.raw/*55.165*/("""
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
												"""),_display_(/*73.14*/if(user.rolename == "SE Manager")/*73.47*/ {_display_(Seq[Any](format.raw/*73.49*/("""<option """),_display_(/*73.58*/if(user.fullname == intake.semanager)/*73.95*/ {_display_(Seq[Any](format.raw/*73.97*/("""selected="selected"""")))}),format.raw/*73.117*/(""" """),format.raw/*73.118*/("""value=""""),_display_(/*73.126*/user/*73.130*/.fullname),format.raw/*73.139*/("""">"""),_display_(/*73.142*/user/*73.146*/.fullname),format.raw/*73.155*/("""</option>""")))}),format.raw/*73.165*/("""
											""")))}),format.raw/*74.13*/("""
										"""),format.raw/*75.11*/("""</select>
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
									placeholder="Enter Project Name..." value=""""),_display_(/*89.54*/intake/*89.60*/.projectname),format.raw/*89.72*/("""" /><span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>BA Assigned Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" required="required" placeholder="Date" value=""""),_display_(/*97.136*/if(intake.baassigneddate != null)/*97.169*/{_display_(_display_(/*97.171*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.baassigneddate))))}),format.raw/*97.238*/("""" />
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>SE Assigned Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" required="required" placeholder="Date" value=""""),_display_(/*106.136*/if(intake.seassigneddate != null)/*106.169*/{_display_(_display_(/*106.171*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.seassigneddate))))}),format.raw/*106.238*/("""" />
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
											"""),_display_(/*121.13*/for(lookup <- lookups) yield /*121.35*/ {_display_(Seq[Any](format.raw/*121.37*/("""
												"""),_display_(/*122.14*/if(lookup.lookuptype == "Project Status")/*122.55*/ {_display_(Seq[Any](format.raw/*122.57*/("""<option """),_display_(/*122.66*/if(lookup.name == intake.projectstatus)/*122.105*/ {_display_(Seq[Any](format.raw/*122.107*/("""selected="selected"""")))}),format.raw/*122.127*/(""" """),format.raw/*122.128*/("""value=""""),_display_(/*122.136*/lookup/*122.142*/.name),format.raw/*122.147*/("""">"""),_display_(/*122.150*/lookup/*122.156*/.name),format.raw/*122.161*/("""</option>""")))}),format.raw/*122.171*/("""
											""")))}),format.raw/*123.13*/("""	
										"""),format.raw/*124.11*/("""</select>
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
											"""),_display_(/*139.13*/for(user <- users) yield /*139.31*/ {_display_(Seq[Any](format.raw/*139.33*/("""
												"""),_display_(/*140.14*/if(user.rolename == "BA")/*140.39*/ {_display_(Seq[Any](format.raw/*140.41*/("""<option """),_display_(/*140.50*/if(user.fullname == intake.baassigned)/*140.88*/ {_display_(Seq[Any](format.raw/*140.90*/("""selected="selected"""")))}),format.raw/*140.110*/(""">"""),_display_(/*140.112*/user/*140.116*/.fullname),format.raw/*140.125*/("""</option>""")))}),format.raw/*140.135*/("""
											""")))}),format.raw/*141.13*/("""	
										"""),format.raw/*142.11*/("""</select>
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
											"""),_display_(/*157.13*/for(user <- users) yield /*157.31*/ {_display_(Seq[Any](format.raw/*157.33*/("""
												"""),_display_(/*158.14*/if(user.rolename == "SE")/*158.39*/ {_display_(Seq[Any](format.raw/*158.41*/("""<option """),_display_(/*158.50*/if(user.fullname == intake.seassigned)/*158.88*/ {_display_(Seq[Any](format.raw/*158.90*/("""selected="selected"""")))}),format.raw/*158.110*/(""">"""),_display_(/*158.112*/user/*158.116*/.fullname),format.raw/*158.125*/("""</option>""")))}),format.raw/*158.135*/("""
											""")))}),format.raw/*159.13*/("""	
										"""),format.raw/*160.11*/("""</select>
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
											"""),_display_(/*177.13*/for(lookup <- lookups) yield /*177.35*/ {_display_(Seq[Any](format.raw/*177.37*/("""
												"""),_display_(/*178.14*/if(lookup.lookuptype == "Agency")/*178.47*/ {_display_(Seq[Any](format.raw/*178.49*/("""<option """),_display_(/*178.58*/if(lookup.name == intake.agency)/*178.90*/ {_display_(Seq[Any](format.raw/*178.92*/("""selected="selected"""")))}),format.raw/*178.112*/(""" """),format.raw/*178.113*/("""value=""""),_display_(/*178.121*/lookup/*178.127*/.name),format.raw/*178.132*/("""">"""),_display_(/*178.135*/lookup/*178.141*/.name),format.raw/*178.146*/("""</option>""")))}),format.raw/*178.156*/("""
											""")))}),format.raw/*179.13*/("""	
										"""),format.raw/*180.11*/("""</select>
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
											"""),_display_(/*195.13*/for(lookup <- lookups) yield /*195.35*/ {_display_(Seq[Any](format.raw/*195.37*/("""
													"""),_display_(/*196.15*/if(lookup.lookuptype == "BA Deliverable")/*196.56*/ {_display_(Seq[Any](format.raw/*196.58*/("""<option """),_display_(/*196.67*/if(lookup.name == intake.badeliverable)/*196.106*/ {_display_(Seq[Any](format.raw/*196.108*/("""selected="selected"""")))}),format.raw/*196.128*/(""">"""),_display_(/*196.130*/lookup/*196.136*/.name),format.raw/*196.141*/("""</option>""")))}),format.raw/*196.151*/("""
											""")))}),format.raw/*197.13*/("""
										"""),format.raw/*198.11*/("""</select>
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
									"""),_display_(/*212.11*/for(lookup <- lookups) yield /*212.33*/ {_display_(Seq[Any](format.raw/*212.35*/("""
										"""),_display_(/*213.12*/if(lookup.lookuptype == "SE Deliverable")/*213.53*/ {_display_(Seq[Any](format.raw/*213.55*/("""<option """),_display_(/*213.64*/if(lookup.name == intake.sedeliverable)/*213.103*/ {_display_(Seq[Any](format.raw/*213.105*/("""selected="selected"""")))}),format.raw/*213.125*/(""">"""),_display_(/*213.127*/lookup/*213.133*/.name),format.raw/*213.138*/("""</option>""")))}),format.raw/*213.148*/("""
									""")))}),format.raw/*214.11*/("""
									"""),format.raw/*215.10*/("""</select>
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
									placeholder="Enter Request Summary..." value=""""),_display_(/*229.57*/intake/*229.63*/.summary),format.raw/*229.71*/("""" /><span class="icon-place"></span>
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
											"""),_display_(/*241.13*/for(lookup <- lookups) yield /*241.35*/ {_display_(Seq[Any](format.raw/*241.37*/("""
												"""),_display_(/*242.14*/if(lookup.lookuptype == "BA Task Status")/*242.55*/ {_display_(Seq[Any](format.raw/*242.57*/("""<option """),_display_(/*242.66*/if(lookup.name == intake.bataskstatus)/*242.104*/ {_display_(Seq[Any](format.raw/*242.106*/("""selected="selected"""")))}),format.raw/*242.126*/(""">"""),_display_(/*242.128*/lookup/*242.134*/.name),format.raw/*242.139*/("""</option>""")))}),format.raw/*242.149*/("""
											""")))}),format.raw/*243.13*/("""
										"""),format.raw/*244.11*/("""</select>
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
											"""),_display_(/*259.13*/for(lookup <- lookups) yield /*259.35*/ {_display_(Seq[Any](format.raw/*259.37*/("""
												"""),_display_(/*260.14*/if(lookup.lookuptype == "SE Task Status")/*260.55*/ {_display_(Seq[Any](format.raw/*260.57*/("""<option """),_display_(/*260.66*/if(lookup.name == intake.bataskstatus)/*260.104*/ {_display_(Seq[Any](format.raw/*260.106*/("""selected="selected"""")))}),format.raw/*260.126*/(""">"""),_display_(/*260.128*/lookup/*260.134*/.name),format.raw/*260.139*/("""</option>""")))}),format.raw/*260.149*/("""
											""")))}),format.raw/*261.13*/("""
										"""),format.raw/*262.11*/("""</select>
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
									placeholder="Enter Requestor..." value=""""),_display_(/*276.51*/intake/*276.57*/.requestor),format.raw/*276.67*/("""" /><span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-number">
							<label class="title"><span class="required">*</span>BA % Time (Estimate)</label>
							<div class="item-cont">
								<input class="large" type="text" min="0" max="500" name="batimeestimate" required="required" placeholder="Number" value=""""),_display_(/*284.131*/intake/*284.137*/.batimeestimate),format.raw/*284.152*/("""" />
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-number">
							<label class="title"><span class="required">*</span>SE % Time (Estimate)</label>
							<div class="item-cont">
								<input class="large" type="text" min="0" max="500" name="setimeestimate" required="required" placeholder="Number" value=""""),_display_(/*293.131*/intake/*293.137*/.setimeestimate),format.raw/*293.152*/("""" />
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
											"""),_display_(/*308.13*/for(lookup <- lookups) yield /*308.35*/ {_display_(Seq[Any](format.raw/*308.37*/("""
												"""),_display_(/*309.14*/if(lookup.lookuptype == "Request Status")/*309.55*/ {_display_(Seq[Any](format.raw/*309.57*/("""<option """),_display_(/*309.66*/if(lookup.name == intake.requeststatus)/*309.105*/ {_display_(Seq[Any](format.raw/*309.107*/("""selected="selected"""")))}),format.raw/*309.127*/(""" """),format.raw/*309.128*/("""value=""""),_display_(/*309.136*/lookup/*309.142*/.name),format.raw/*309.147*/("""">"""),_display_(/*309.150*/lookup/*309.156*/.name),format.raw/*309.161*/("""</option>""")))}),format.raw/*309.171*/("""
											""")))}),format.raw/*310.13*/("""
										"""),format.raw/*311.11*/("""</select>
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
								<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" required="required" placeholder="Date" value=""""),_display_(/*322.134*/if(intake.batargetdate != null)/*322.165*/{_display_(_display_(/*322.167*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.batargetdate))))}),format.raw/*322.232*/("""" />
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>SE Deliverable Target Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" required="required" placeholder="Date" value=""""),_display_(/*331.134*/if(intake.setargetdate != null)/*331.165*/{_display_(_display_(/*331.167*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.setargetdate))))}),format.raw/*331.232*/("""" />
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
								<input class="large" data-format="yyyy-MM-dd" type="date" name="daterequested" required="required" placeholder="Date" value=""""),_display_(/*342.135*/if(intake.daterequested != null)/*342.167*/{_display_(_display_(/*342.169*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.daterequested))))}),format.raw/*342.235*/("""" />
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>BA Deliverable Completion Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" required="required" placeholder="Date" value=""""),_display_(/*351.138*/if(intake.bacompletiondate != null)/*351.173*/{_display_(_display_(/*351.175*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.bacompletiondate))))}),format.raw/*351.244*/("""" />
								<span class="icon-place"></span>
							</div>
						</div>
					</div>
					<div class="col-sm-4">
						<div class="element-date">
							<label class="title"><span class="required">*</span>SE Deliverable Completion Date:</label>
							<div class="item-cont">
								<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" required="required" placeholder="Date" value=""""),_display_(/*360.138*/if(intake.secompletiondate != null)/*360.173*/{_display_(_display_(/*360.175*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.secompletiondate))))}),format.raw/*360.244*/("""" />
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
											"""),_display_(/*375.13*/for(lookup <- lookups) yield /*375.35*/ {_display_(Seq[Any](format.raw/*375.37*/("""
												"""),_display_(/*376.14*/if(lookup.lookuptype == "Intake Type")/*376.52*/ {_display_(Seq[Any](format.raw/*376.54*/("""<option """),_display_(/*376.63*/if(lookup.name == intake.howrequested)/*376.101*/ {_display_(Seq[Any](format.raw/*376.103*/("""selected="selected"""")))}),format.raw/*376.123*/(""" """),format.raw/*376.124*/("""value=""""),_display_(/*376.132*/lookup/*376.138*/.name),format.raw/*376.143*/("""">"""),_display_(/*376.146*/lookup/*376.152*/.name),format.raw/*376.157*/("""</option>""")))}),format.raw/*376.167*/("""
											""")))}),format.raw/*377.13*/("""
										"""),format.raw/*378.11*/("""</select>
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
								<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" required="required" placeholder="Date" value=""""),_display_(/*391.137*/if(intake.initialmeetdate != null)/*391.171*/{_display_(_display_(/*391.173*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*391.241*/("""" />
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
									placeholder="Enter Comments..."  value="""),_display_(/*403.50*/intake/*403.56*/.initialmeetcomments),format.raw/*403.76*/(""" """),format.raw/*403.77*/("""/><span class="icon-place"></span>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Container --> 
			<div class="element-input">
				"""),_display_(/*411.6*/if(intakeForm.hasGlobalErrors)/*411.36*/ {_display_(Seq[Any](format.raw/*411.38*/("""
				"""),format.raw/*412.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*412.64*/intakeForm/*412.74*/.globalError.message),format.raw/*412.94*/("""</span>
				""")))}),format.raw/*413.6*/("""
			"""),format.raw/*414.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*417.39*/Messages("goback")),format.raw/*417.57*/("""</a>
			</div>
			"""),_display_(/*419.5*/if(user.getRolename().contains("Manager"))/*419.47*/ {_display_(Seq[Any](format.raw/*419.49*/("""
			"""),format.raw/*420.4*/("""<div class="submit">
				<a href="javascript:deleteIntake('"""),_display_(/*421.40*/intake/*421.46*/.intakekey),format.raw/*421.56*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
			</div>
			""")))}),format.raw/*423.5*/("""
			"""),format.raw/*424.4*/("""<div class="modifiedSection">
				<table class="modifiedTable">
					"""),_display_(/*426.7*/for(audit <- auditTrail) yield /*426.31*/ {_display_(Seq[Any](format.raw/*426.33*/("""
					"""),format.raw/*427.6*/("""<tr>
						<td>"""),_display_(/*428.12*/audit/*428.17*/.editor),format.raw/*428.24*/(""" """),format.raw/*428.25*/("""("""),_display_(/*428.27*/audit/*428.32*/.editoremail),format.raw/*428.44*/(""") changed <b>"""),_display_(/*428.58*/audit/*428.63*/.fielddisplay),format.raw/*428.76*/("""</b> from <b>"""),_display_(/*428.90*/audit/*428.95*/.oldvalue),format.raw/*428.104*/("""</b> to <b>"""),_display_(/*428.116*/audit/*428.121*/.newvalue),format.raw/*428.130*/("""</b> on """),_display_(/*428.139*/audit/*428.144*/.editdate),format.raw/*428.153*/(""".</td>
					</tr>
					""")))}),format.raw/*430.7*/("""					
				"""),format.raw/*431.5*/("""</table>
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
object editintake_3Column extends editintake_3Column_Scope0.editintake_3Column
              /*
                  -- GENERATED --
                  DATE: Mon Jan 30 10:30:34 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/editintake_3Column.scala.html
                  HASH: 89b4929937f1df74c37104878a1a779e26868683
                  MATRIX: 883->1|1184->173|1214->213|1242->216|1260->226|1299->228|1328->231|1419->295|1447->296|1481->304|1508->305|2658->1428|2673->1434|2704->1444|3204->1917|3238->1935|3278->1937|3320->1952|3362->1985|3402->1987|3438->1996|3484->2033|3524->2035|3576->2055|3606->2056|3642->2064|3656->2068|3687->2077|3718->2080|3732->2084|3763->2093|3805->2103|3850->2117|3890->2129|4448->2660|4482->2678|4522->2680|4564->2695|4606->2728|4646->2730|4682->2739|4728->2776|4768->2778|4820->2798|4850->2799|4886->2807|4900->2811|4931->2820|4962->2823|4976->2827|5007->2836|5049->2846|5094->2860|5134->2872|5675->3386|5690->3392|5723->3404|6147->3800|6190->3833|6221->3835|6312->3902|6747->4308|6791->4341|6823->4343|6915->4410|7497->4964|7536->4986|7577->4988|7620->5003|7671->5044|7712->5046|7749->5055|7799->5094|7841->5096|7894->5116|7925->5117|7962->5125|7979->5131|8007->5136|8039->5139|8056->5145|8084->5150|8127->5160|8173->5174|8215->5187|8771->5715|8806->5733|8847->5735|8890->5750|8925->5775|8966->5777|9003->5786|9051->5824|9092->5826|9145->5846|9176->5848|9191->5852|9223->5861|9266->5871|9312->5885|9354->5898|9910->6426|9945->6444|9986->6446|10029->6461|10064->6486|10105->6488|10142->6497|10190->6535|10231->6537|10284->6557|10315->6559|10330->6563|10362->6572|10405->6582|10451->6596|10493->6609|11119->7207|11158->7229|11199->7231|11242->7246|11285->7279|11326->7281|11363->7290|11405->7322|11446->7324|11499->7344|11530->7345|11567->7353|11584->7359|11612->7364|11644->7367|11661->7373|11689->7378|11732->7388|11778->7402|11820->7415|12391->7958|12430->7980|12471->7982|12515->7998|12566->8039|12607->8041|12644->8050|12694->8089|12736->8091|12789->8111|12820->8113|12837->8119|12865->8124|12908->8134|12954->8148|12995->8160|13458->8595|13497->8617|13538->8619|13579->8632|13630->8673|13671->8675|13708->8684|13758->8723|13800->8725|13853->8745|13884->8747|13901->8753|13929->8758|13972->8768|14016->8780|14056->8791|14599->9306|14615->9312|14645->9320|15152->9799|15191->9821|15232->9823|15275->9838|15326->9879|15367->9881|15404->9890|15453->9928|15495->9930|15548->9950|15579->9952|15596->9958|15624->9963|15667->9973|15713->9987|15754->9999|16319->10536|16358->10558|16399->10560|16442->10575|16493->10616|16534->10618|16571->10627|16620->10665|16662->10667|16715->10687|16746->10689|16763->10695|16791->10700|16834->10710|16880->10724|16921->10736|17455->11242|17471->11248|17503->11258|17928->11654|17945->11660|17983->11675|18418->12081|18435->12087|18473->12102|19055->12656|19094->12678|19135->12680|19178->12695|19229->12736|19270->12738|19307->12747|19357->12786|19399->12788|19452->12808|19483->12809|19520->12817|19537->12823|19565->12828|19597->12831|19614->12837|19642->12842|19685->12852|19731->12866|19772->12878|20263->13340|20305->13371|20337->13373|20427->13438|20870->13852|20912->13883|20944->13885|21034->13950|21530->14417|21573->14449|21605->14451|21696->14517|22147->14939|22193->14974|22225->14976|22319->15045|22770->15467|22816->15502|22848->15504|22942->15573|23529->16132|23568->16154|23609->16156|23652->16171|23700->16209|23741->16211|23778->16220|23827->16258|23869->16260|23922->16280|23953->16281|23990->16289|24007->16295|24035->16300|24067->16303|24084->16309|24112->16314|24155->16324|24201->16338|24242->16350|24803->16882|24848->16916|24880->16918|24973->16986|25493->17478|25509->17484|25551->17504|25581->17505|25774->17671|25814->17701|25855->17703|25889->17709|25976->17768|25996->17778|26038->17798|26083->17812|26116->17817|26259->17932|26299->17950|26347->17971|26399->18013|26440->18015|26473->18020|26562->18081|26578->18087|26610->18097|26717->18173|26750->18178|26849->18250|26890->18274|26931->18276|26966->18283|27011->18300|27026->18305|27055->18312|27085->18313|27115->18315|27130->18320|27164->18332|27206->18346|27221->18351|27256->18364|27298->18378|27313->18383|27345->18392|27386->18404|27402->18409|27434->18418|27472->18427|27488->18432|27520->18441|27577->18467|27616->18478
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|39->9|39->9|72->42|72->42|72->42|84->54|84->54|84->54|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|85->55|86->56|87->57|102->72|102->72|102->72|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|103->73|104->74|105->75|119->89|119->89|119->89|127->97|127->97|127->97|127->97|136->106|136->106|136->106|136->106|151->121|151->121|151->121|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|152->122|153->123|154->124|169->139|169->139|169->139|170->140|170->140|170->140|170->140|170->140|170->140|170->140|170->140|170->140|170->140|170->140|171->141|172->142|187->157|187->157|187->157|188->158|188->158|188->158|188->158|188->158|188->158|188->158|188->158|188->158|188->158|188->158|189->159|190->160|207->177|207->177|207->177|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|208->178|209->179|210->180|225->195|225->195|225->195|226->196|226->196|226->196|226->196|226->196|226->196|226->196|226->196|226->196|226->196|226->196|227->197|228->198|242->212|242->212|242->212|243->213|243->213|243->213|243->213|243->213|243->213|243->213|243->213|243->213|243->213|243->213|244->214|245->215|259->229|259->229|259->229|271->241|271->241|271->241|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|273->243|274->244|289->259|289->259|289->259|290->260|290->260|290->260|290->260|290->260|290->260|290->260|290->260|290->260|290->260|290->260|291->261|292->262|306->276|306->276|306->276|314->284|314->284|314->284|323->293|323->293|323->293|338->308|338->308|338->308|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|339->309|340->310|341->311|352->322|352->322|352->322|352->322|361->331|361->331|361->331|361->331|372->342|372->342|372->342|372->342|381->351|381->351|381->351|381->351|390->360|390->360|390->360|390->360|405->375|405->375|405->375|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|406->376|407->377|408->378|421->391|421->391|421->391|421->391|433->403|433->403|433->403|433->403|441->411|441->411|441->411|442->412|442->412|442->412|442->412|443->413|444->414|447->417|447->417|449->419|449->419|449->419|450->420|451->421|451->421|451->421|453->423|454->424|456->426|456->426|456->426|457->427|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|458->428|460->430|461->431
                  -- GENERATED --
              */
          