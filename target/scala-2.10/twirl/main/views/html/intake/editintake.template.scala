
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
										<label class="title"><span></span>Project ID:</label>
										<div class="item-cont">
											<input class="large" type="text" name="projectid"
												placeholder="Enter Project ID..." value=""""),_display_(/*35.55*/intake/*35.61*/.projectid),format.raw/*35.71*/("""" """),_display_(/*35.74*/if(user.role.getValue() < 3)/*35.102*/{_display_(Seq[Any](format.raw/*35.103*/(""" """),format.raw/*35.104*/("""readonly """)))}),format.raw/*35.114*/("""/><span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Project Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*45.15*/if(user.role.getValue() < 3)/*45.43*/ {_display_(Seq[Any](format.raw/*45.45*/("""
														"""),format.raw/*46.15*/("""<input class="large" type="text" name="projectname" readonly placeholder="" value=""""),_display_(/*46.99*/intake/*46.105*/.projectstatus),format.raw/*46.119*/("""" /><span class="icon-place"></span>
													""")))}/*47.16*/else/*47.21*/{_display_(Seq[Any](format.raw/*47.22*/("""
														"""),format.raw/*48.15*/("""<select name="projectstatus">
															<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
															"""),_display_(/*50.17*/for(lookup <- lookups) yield /*50.39*/ {_display_(Seq[Any](format.raw/*50.41*/("""
																"""),_display_(/*51.18*/if(lookup.lookuptype == "Project Status")/*51.59*/ {_display_(Seq[Any](format.raw/*51.61*/("""<option """),_display_(/*51.70*/if(lookup.name == intake.projectstatus)/*51.109*/ {_display_(Seq[Any](format.raw/*51.111*/("""selected="selected"""")))}),format.raw/*51.131*/(""" """),format.raw/*51.132*/("""value=""""),_display_(/*51.140*/lookup/*51.146*/.name),format.raw/*51.151*/("""">"""),_display_(/*51.154*/lookup/*51.160*/.name),format.raw/*51.165*/("""</option>""")))}),format.raw/*51.175*/("""
															""")))}),format.raw/*52.17*/("""	
														"""),format.raw/*53.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*55.15*/("""	
												"""),format.raw/*56.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-input">
										<label class="title"><span></span>Project Name:</label>
										<div class="item-cont">
											<input class="large" type="text" name="projectname"
												placeholder="Enter Project Name..." value=""""),_display_(/*68.57*/intake/*68.63*/.projectname),format.raw/*68.75*/(""""  """),_display_(/*68.79*/if(user.role.getValue() < 3)/*68.107*/{_display_(Seq[Any](format.raw/*68.108*/(""" """),format.raw/*68.109*/("""readonly """)))}),format.raw/*68.119*/("""/><span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Requesting Agency:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*78.15*/if(user.role.getValue() < 3)/*78.43*/ {_display_(Seq[Any](format.raw/*78.45*/("""
														"""),format.raw/*79.15*/("""<input class="large" type="text" name="agency" readonly	placeholder="" value=""""),_display_(/*79.94*/intake/*79.100*/.agency),format.raw/*79.107*/("""" /><span class="icon-place"></span>
													""")))}/*80.16*/else/*80.21*/{_display_(Seq[Any](format.raw/*80.22*/("""
														"""),format.raw/*81.15*/("""<select name="agency"  """),_display_(/*81.39*/if(user.role.getValue() < 3)/*81.67*/{_display_(Seq[Any](format.raw/*81.68*/(""" """),format.raw/*81.69*/("""readonly """)))}),format.raw/*81.79*/(""">
															<option selected="selected" value="" disabled="disabled">--- Select Agency ---</option>
															"""),_display_(/*83.17*/for(lookup <- lookups) yield /*83.39*/ {_display_(Seq[Any](format.raw/*83.41*/("""
								                  				"""),_display_(/*84.32*/if(lookup.lookuptype == "Agency")/*84.65*/ {_display_(Seq[Any](format.raw/*84.67*/("""<option """),_display_(/*84.76*/if(lookup.name == intake.agency)/*84.108*/ {_display_(Seq[Any](format.raw/*84.110*/("""selected="selected"""")))}),format.raw/*84.130*/(""" """),format.raw/*84.131*/("""value=""""),_display_(/*84.139*/lookup/*84.145*/.name),format.raw/*84.150*/("""">"""),_display_(/*84.153*/lookup/*84.159*/.name),format.raw/*84.164*/("""</option>""")))}),format.raw/*84.174*/("""
															""")))}),format.raw/*85.17*/("""	
														"""),format.raw/*86.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*88.15*/("""	
												"""),format.raw/*89.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-12">
									<div class="element-input">
										<label class="title"><span></span>Request Summary:</label>
										<div class="item-cont">
											<textarea class="medium" type="text" name="summary" required="required" placeholder="Enter Request Summary..."  """),_display_(/*100.125*/if(user.role.getValue() < 3)/*100.153*/{_display_(Seq[Any](format.raw/*100.154*/(""" """),format.raw/*100.155*/("""readonly """)))}),format.raw/*100.165*/(""" """),format.raw/*100.166*/("""/>"""),_display_(/*100.169*/intake/*100.175*/.summary),format.raw/*100.183*/("""</textarea>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-input">
										<label class="title"><span></span>Requestor:</label>
										<div class="item-cont">
											<input class="large" type="text" name="requestor"
												placeholder="Enter Requestor..." value=""""),_display_(/*112.54*/intake/*112.60*/.requestor),format.raw/*112.70*/(""""  """),_display_(/*112.74*/if(user.role.getValue() < 3)/*112.102*/{_display_(Seq[Any](format.raw/*112.103*/(""" """),format.raw/*112.104*/("""readonly """)))}),format.raw/*112.114*/("""/><span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Request Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*122.15*/if(user.role.getValue() < 3)/*122.43*/ {_display_(Seq[Any](format.raw/*122.45*/("""
														"""),format.raw/*123.15*/("""<input class="large" type="text" name="requeststatus" readonly placeholder="" value=""""),_display_(/*123.101*/intake/*123.107*/.requeststatus),format.raw/*123.121*/("""" /><span class="icon-place"></span>
													""")))}/*124.16*/else/*124.21*/{_display_(Seq[Any](format.raw/*124.22*/("""
														"""),format.raw/*125.15*/("""<select name="requeststatus">
															<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
															"""),_display_(/*127.17*/for(lookup <- lookups) yield /*127.39*/ {_display_(Seq[Any](format.raw/*127.41*/("""
								                  				"""),_display_(/*128.32*/if(lookup.lookuptype == "Request Status")/*128.73*/ {_display_(Seq[Any](format.raw/*128.75*/("""<option """),_display_(/*128.84*/if(lookup.name == intake.requeststatus)/*128.123*/ {_display_(Seq[Any](format.raw/*128.125*/("""selected="selected"""")))}),format.raw/*128.145*/(""" """),format.raw/*128.146*/("""value=""""),_display_(/*128.154*/lookup/*128.160*/.name),format.raw/*128.165*/("""">"""),_display_(/*128.168*/lookup/*128.174*/.name),format.raw/*128.179*/("""</option>""")))}),format.raw/*128.189*/("""
															""")))}),format.raw/*129.17*/("""
														"""),format.raw/*130.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*132.15*/("""	
												"""),format.raw/*133.13*/("""</span>
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
											<input class="large" data-format="mm/dd/yyyy" type="date" name="daterequested" placeholder="Date" value=""""),_display_(/*144.118*/if(intake.daterequested != null)/*144.150*/{_display_(_display_(/*144.152*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.daterequested))))}),format.raw/*144.218*/(""""  """),_display_(/*144.222*/if(user.role.getValue() < 3)/*144.250*/{_display_(Seq[Any](format.raw/*144.251*/(""" """),format.raw/*144.252*/("""readonly """)))}),format.raw/*144.262*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>How Requested:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*155.15*/if(user.role.getValue() < 3)/*155.43*/ {_display_(Seq[Any](format.raw/*155.45*/("""
														"""),format.raw/*156.15*/("""<input class="large" type="text" name="howrequested" readonly placeholder="" value=""""),_display_(/*156.100*/intake/*156.106*/.howrequested),format.raw/*156.119*/("""" /><span class="icon-place"></span>
													""")))}/*157.16*/else/*157.21*/{_display_(Seq[Any](format.raw/*157.22*/("""
														"""),format.raw/*158.15*/("""<select name="howrequested">
															<option selected="selected" value="" disabled="disabled">--- Select How Requested ---</option>
															"""),_display_(/*160.17*/for(lookup <- lookups) yield /*160.39*/ {_display_(Seq[Any](format.raw/*160.41*/("""
								                  				"""),_display_(/*161.32*/if(lookup.lookuptype == "Intake Type")/*161.70*/ {_display_(Seq[Any](format.raw/*161.72*/("""<option """),_display_(/*161.81*/if(lookup.name == intake.howrequested)/*161.119*/ {_display_(Seq[Any](format.raw/*161.121*/("""selected="selected"""")))}),format.raw/*161.141*/(""" """),format.raw/*161.142*/("""value=""""),_display_(/*161.150*/lookup/*161.156*/.name),format.raw/*161.161*/("""">"""),_display_(/*161.164*/lookup/*161.170*/.name),format.raw/*161.175*/("""</option>""")))}),format.raw/*161.185*/("""
															""")))}),format.raw/*162.17*/("""
														"""),format.raw/*163.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*165.15*/("""
												"""),format.raw/*166.13*/("""</span>
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
										<label class="title"><span></span>BA Manager:</label>
										<div class="item-cont">
											<div class="large">											
												<span>
													"""),_display_(/*181.15*/if(user.role.getValue() < 3)/*181.43*/ {_display_(Seq[Any](format.raw/*181.45*/("""
														"""),format.raw/*182.15*/("""<input class="large" type="text" name="bamanager" readonly placeholder="" value=""""),_display_(/*182.97*/intake/*182.103*/.bamanager),format.raw/*182.113*/("""" /><span class="icon-place"></span>
													""")))}/*183.16*/else/*183.21*/{_display_(Seq[Any](format.raw/*183.22*/("""
														"""),format.raw/*184.15*/("""<select name="bamanager">
															<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
															"""),_display_(/*186.17*/for(user <- users) yield /*186.35*/ {_display_(Seq[Any](format.raw/*186.37*/("""
								                  				"""),_display_(/*187.32*/if(user.rolename == "BA Manager")/*187.65*/ {_display_(Seq[Any](format.raw/*187.67*/("""<option """),_display_(/*187.76*/if(user.fullname == intake.bamanager)/*187.113*/ {_display_(Seq[Any](format.raw/*187.115*/("""selected="selected"""")))}),format.raw/*187.135*/(""" """),format.raw/*187.136*/("""value=""""),_display_(/*187.144*/user/*187.148*/.fullname),format.raw/*187.157*/("""">"""),_display_(/*187.160*/user/*187.164*/.fullname),format.raw/*187.173*/("""</option>""")))}),format.raw/*187.183*/("""
															""")))}),format.raw/*188.17*/("""
														"""),format.raw/*189.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*191.15*/("""
												"""),format.raw/*192.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Assigned Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" placeholder="Date" value=""""),_display_(/*201.119*/if(intake.baassigneddate != null)/*201.152*/{_display_(_display_(/*201.154*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.baassigneddate))))}),format.raw/*201.221*/(""""  """),_display_(/*201.225*/if(user.role.getValue() < 3)/*201.253*/{_display_(Seq[Any](format.raw/*201.254*/(""" """),format.raw/*201.255*/("""readonly """)))}),format.raw/*201.265*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>BA Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*214.15*/if(user.role.getValue() < 3)/*214.43*/ {_display_(Seq[Any](format.raw/*214.45*/("""
														"""),format.raw/*215.15*/("""<input class="large" type="text" name="baassigned" readonly placeholder="" value=""""),_display_(/*215.98*/intake/*215.104*/.baassigned),format.raw/*215.115*/("""" /><span class="icon-place"></span>
													""")))}/*216.16*/else/*216.21*/{_display_(Seq[Any](format.raw/*216.22*/("""
														"""),format.raw/*217.15*/("""<select name="baassigned">
															<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
															"""),_display_(/*219.17*/for(user <- users) yield /*219.35*/ {_display_(Seq[Any](format.raw/*219.37*/("""
								                  				"""),_display_(/*220.32*/if(user.rolename == "BA")/*220.57*/ {_display_(Seq[Any](format.raw/*220.59*/("""<option """),_display_(/*220.68*/if(user.fullname == intake.baassigned)/*220.106*/ {_display_(Seq[Any](format.raw/*220.108*/("""selected="selected"""")))}),format.raw/*220.128*/(""">"""),_display_(/*220.130*/user/*220.134*/.fullname),format.raw/*220.143*/("""</option>""")))}),format.raw/*220.153*/("""
															""")))}),format.raw/*221.17*/("""	
														"""),format.raw/*222.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*224.15*/("""
												"""),format.raw/*225.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>BA Deliverable:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*236.15*/if(user.role.getValue() < 3)/*236.43*/ {_display_(Seq[Any](format.raw/*236.45*/("""
														"""),format.raw/*237.15*/("""<input class="large" type="text" name="badeliverable" readonly placeholder="" value=""""),_display_(/*237.101*/intake/*237.107*/.badeliverable),format.raw/*237.121*/("""" /><span class="icon-place"></span>
													""")))}/*238.16*/else/*238.21*/{_display_(Seq[Any](format.raw/*238.22*/("""
														"""),format.raw/*239.15*/("""<select name="badeliverable">
															<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
															"""),_display_(/*241.17*/for(lookup <- lookups) yield /*241.39*/ {_display_(Seq[Any](format.raw/*241.41*/("""
								                  				"""),_display_(/*242.32*/if(lookup.lookuptype == "BA Deliverable")/*242.73*/ {_display_(Seq[Any](format.raw/*242.75*/("""<option """),_display_(/*242.84*/if(lookup.name == intake.badeliverable)/*242.123*/ {_display_(Seq[Any](format.raw/*242.125*/("""selected="selected"""")))}),format.raw/*242.145*/(""">"""),_display_(/*242.147*/lookup/*242.153*/.name),format.raw/*242.158*/("""</option>""")))}),format.raw/*242.168*/("""
															""")))}),format.raw/*243.17*/("""
														"""),format.raw/*244.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*246.15*/("""
												"""),format.raw/*247.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>BA Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*260.15*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*260.72*/ {_display_(Seq[Any](format.raw/*260.74*/("""
														"""),format.raw/*261.15*/("""<input class="large" type="text" name="bataskstatus" readonly placeholder="" value=""""),_display_(/*261.100*/intake/*261.106*/.bataskstatus),format.raw/*261.119*/("""" /><span class="icon-place"></span>
													""")))}/*262.16*/else/*262.21*/{_display_(Seq[Any](format.raw/*262.22*/("""
														"""),format.raw/*263.15*/("""<select name="bataskstatus">
															<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
															"""),_display_(/*265.17*/for(lookup <- lookups) yield /*265.39*/ {_display_(Seq[Any](format.raw/*265.41*/("""
								                  				"""),_display_(/*266.32*/if(lookup.lookuptype == "BA Task Status")/*266.73*/ {_display_(Seq[Any](format.raw/*266.75*/("""<option """),_display_(/*266.84*/if(lookup.name == intake.bataskstatus)/*266.122*/ {_display_(Seq[Any](format.raw/*266.124*/("""selected="selected"""")))}),format.raw/*266.144*/(""">"""),_display_(/*266.146*/lookup/*266.152*/.name),format.raw/*266.157*/("""</option>""")))}),format.raw/*266.167*/("""
															""")))}),format.raw/*267.17*/("""
														"""),format.raw/*268.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*270.15*/("""
												"""),format.raw/*271.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-number">
										<label class="title"><span></span>BA % Time (Estimate)</label>
										<div class="item-cont">
											<input class="large" type="text" min="0" max="500" name="batimeestimate" placeholder="Number" value=""""),_display_(/*280.114*/intake/*280.120*/.batimeestimate),format.raw/*280.135*/("""" """),_display_(/*280.138*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*280.195*/{_display_(Seq[Any](format.raw/*280.196*/(""" """),format.raw/*280.197*/("""readonly """)))}),format.raw/*280.207*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" placeholder="Date" value=""""),_display_(/*291.117*/if(intake.batargetdate != null)/*291.148*/{_display_(_display_(/*291.150*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.batargetdate))))}),format.raw/*291.215*/("""" """),_display_(/*291.218*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*291.275*/{_display_(Seq[Any](format.raw/*291.276*/(""" """),format.raw/*291.277*/("""readonly """)))}),format.raw/*291.287*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" placeholder="Date" value=""""),_display_(/*300.121*/if(intake.bacompletiondate != null)/*300.156*/{_display_(_display_(/*300.158*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.bacompletiondate))))}),format.raw/*300.227*/("""" """),_display_(/*300.230*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*300.287*/{_display_(Seq[Any](format.raw/*300.288*/(""" """),format.raw/*300.289*/("""readonly """)))}),format.raw/*300.299*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" placeholder="Date"  value=""""),_display_(/*311.121*/if(intake.initialmeetdate != null)/*311.155*/{_display_(_display_(/*311.157*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*311.225*/("""" """),_display_(/*311.228*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*311.285*/{_display_(Seq[Any](format.raw/*311.286*/(""" """),format.raw/*311.287*/("""readonly """)))}),format.raw/*311.297*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" name="initialmeetcomments"	placeholder="Enter Comments..." value=""""),_display_(/*320.112*/intake/*320.118*/.initialmeetcomments),format.raw/*320.138*/("""" """),_display_(/*320.141*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*320.198*/{_display_(Seq[Any](format.raw/*320.199*/(""" """),format.raw/*320.200*/("""readonly """)))}),format.raw/*320.210*/("""/><span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div id="tabSE" class="tab-pane fade">
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>SE Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*334.15*/if(user.role.getValue() < 3)/*334.43*/ {_display_(Seq[Any](format.raw/*334.45*/("""
														"""),format.raw/*335.15*/("""<input class="large" type="text" name="semanager" readonly placeholder="" value=""""),_display_(/*335.97*/intake/*335.103*/.semanager),format.raw/*335.113*/("""" /><span class="icon-place"></span>
													""")))}/*336.16*/else/*336.21*/{_display_(Seq[Any](format.raw/*336.22*/("""
														"""),format.raw/*337.15*/("""<select name="semanager">
															<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
															"""),_display_(/*339.17*/for(user <- users) yield /*339.35*/ {_display_(Seq[Any](format.raw/*339.37*/("""
								                  				"""),_display_(/*340.32*/if(user.rolename == "SE Manager")/*340.65*/ {_display_(Seq[Any](format.raw/*340.67*/("""<option """),_display_(/*340.76*/if(user.fullname == intake.semanager)/*340.113*/ {_display_(Seq[Any](format.raw/*340.115*/("""selected="selected"""")))}),format.raw/*340.135*/(""" """),format.raw/*340.136*/("""value=""""),_display_(/*340.144*/user/*340.148*/.fullname),format.raw/*340.157*/("""">"""),_display_(/*340.160*/user/*340.164*/.fullname),format.raw/*340.173*/("""</option>""")))}),format.raw/*340.183*/("""
															""")))}),format.raw/*341.17*/("""
														"""),format.raw/*342.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*344.15*/("""
												"""),format.raw/*345.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Assigned Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" placeholder="Date" value=""""),_display_(/*354.119*/if(intake.seassigneddate != null)/*354.152*/{_display_(_display_(/*354.154*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.seassigneddate))))}),format.raw/*354.221*/("""" """),_display_(/*354.224*/if(user.role.getValue() <= 3)/*354.253*/ {_display_(Seq[Any](format.raw/*354.255*/(""" """),format.raw/*354.256*/("""readonly """)))}),format.raw/*354.266*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>SE Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*367.15*/if(user.role.getValue() < 3)/*367.43*/ {_display_(Seq[Any](format.raw/*367.45*/("""
														"""),format.raw/*368.15*/("""<input class="large" type="text" name="seassigned" readonly placeholder="" value=""""),_display_(/*368.98*/intake/*368.104*/.seassigned),format.raw/*368.115*/("""" /><span class="icon-place"></span>
													""")))}/*369.16*/else/*369.21*/{_display_(Seq[Any](format.raw/*369.22*/("""
														"""),format.raw/*370.15*/("""<select name="seassigned">
															<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
															"""),_display_(/*372.17*/for(user <- users) yield /*372.35*/ {_display_(Seq[Any](format.raw/*372.37*/("""
								                  				"""),_display_(/*373.32*/if(user.rolename == "SE")/*373.57*/ {_display_(Seq[Any](format.raw/*373.59*/("""<option """),_display_(/*373.68*/if(user.fullname == intake.seassigned)/*373.106*/ {_display_(Seq[Any](format.raw/*373.108*/("""selected="selected"""")))}),format.raw/*373.128*/(""">"""),_display_(/*373.130*/user/*373.134*/.fullname),format.raw/*373.143*/("""</option>""")))}),format.raw/*373.153*/("""
															""")))}),format.raw/*374.17*/("""	
														"""),format.raw/*375.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*377.15*/("""
												"""),format.raw/*378.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>SE Deliverable:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*389.15*/if(user.role.getValue() < 3)/*389.43*/ {_display_(Seq[Any](format.raw/*389.45*/("""
														"""),format.raw/*390.15*/("""<input class="large" type="text" name="sedeliverable" readonly placeholder="" value=""""),_display_(/*390.101*/intake/*390.107*/.sedeliverable),format.raw/*390.121*/("""" /><span class="icon-place"></span>
													""")))}/*391.16*/else/*391.21*/{_display_(Seq[Any](format.raw/*391.22*/("""
														"""),format.raw/*392.15*/("""<select name="sedeliverable">
															"""),_display_(/*393.17*/for(lookup <- lookups) yield /*393.39*/ {_display_(Seq[Any](format.raw/*393.41*/("""
								                  				"""),_display_(/*394.32*/if(lookup.lookuptype == "SE Deliverable")/*394.73*/ {_display_(Seq[Any](format.raw/*394.75*/("""<option """),_display_(/*394.84*/if(lookup.name == intake.sedeliverable)/*394.123*/ {_display_(Seq[Any](format.raw/*394.125*/("""selected="selected"""")))}),format.raw/*394.145*/(""">"""),_display_(/*394.147*/lookup/*394.153*/.name),format.raw/*394.158*/("""</option>""")))}),format.raw/*394.168*/("""
															""")))}),format.raw/*395.17*/("""
														"""),format.raw/*396.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*398.15*/("""
												"""),format.raw/*399.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>SE Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*412.15*/if(user.role.getValue() < 2)/*412.43*/ {_display_(Seq[Any](format.raw/*412.45*/("""
														"""),format.raw/*413.15*/("""<input class="large" type="text" name="setaskstatus" readonly placeholder="" value=""""),_display_(/*413.100*/intake/*413.106*/.setaskstatus),format.raw/*413.119*/("""" /><span class="icon-place"></span>
													""")))}/*414.16*/else/*414.21*/{_display_(Seq[Any](format.raw/*414.22*/("""
														"""),format.raw/*415.15*/("""<select name="setaskstatus">
															<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
															"""),_display_(/*417.17*/for(lookup <- lookups) yield /*417.39*/ {_display_(Seq[Any](format.raw/*417.41*/("""
								                  				"""),_display_(/*418.32*/if(lookup.lookuptype == "SE Task Status")/*418.73*/ {_display_(Seq[Any](format.raw/*418.75*/("""<option """),_display_(/*418.84*/if(lookup.name == intake.setaskstatus)/*418.122*/ {_display_(Seq[Any](format.raw/*418.124*/("""selected="selected"""")))}),format.raw/*418.144*/(""">"""),_display_(/*418.146*/lookup/*418.152*/.name),format.raw/*418.157*/("""</option>""")))}),format.raw/*418.167*/("""
															""")))}),format.raw/*419.17*/("""
														"""),format.raw/*420.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*422.15*/("""
												"""),format.raw/*423.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-number">
										<label class="title"><span></span>SE % Time (Estimate)</label>
										<div class="item-cont">
											<input class="large" type="text" min="0" max="500" name="setimeestimate" placeholder="Number" value=""""),_display_(/*432.114*/intake/*432.120*/.setimeestimate),format.raw/*432.135*/("""" """),_display_(/*432.138*/if(user.role.getValue() < 2)/*432.166*/{_display_(Seq[Any](format.raw/*432.167*/(""" """),format.raw/*432.168*/("""readonly """)))}),format.raw/*432.178*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" placeholder="Date" value=""""),_display_(/*443.117*/if(intake.setargetdate != null)/*443.148*/{_display_(_display_(/*443.150*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.setargetdate))))}),format.raw/*443.215*/("""" """),_display_(/*443.218*/if(user.role.getValue() < 2)/*443.246*/{_display_(Seq[Any](format.raw/*443.247*/(""" """),format.raw/*443.248*/("""readonly """)))}),format.raw/*443.258*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" placeholder="Date" value=""""),_display_(/*452.121*/if(intake.secompletiondate != null)/*452.156*/{_display_(_display_(/*452.158*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.secompletiondate))))}),format.raw/*452.227*/("""" """),_display_(/*452.230*/if(user.role.getValue() < 2)/*452.258*/{_display_(Seq[Any](format.raw/*452.259*/(""" """),format.raw/*452.260*/("""readonly """)))}),format.raw/*452.270*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" readonly placeholder="Date"  value=""""),_display_(/*463.107*/if(intake.initialmeetdate != null)/*463.141*/{_display_(_display_(/*463.143*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*463.211*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" readonly placeholder="Enter Comments..." value=""""),_display_(/*472.94*/intake/*472.100*/.initialmeetcomments),format.raw/*472.120*/("""" /><span class="icon-place"></span>
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
							"""),_display_(/*484.9*/for(comment <- allComments) yield /*484.36*/ {_display_(Seq[Any](format.raw/*484.38*/("""
							"""),format.raw/*485.8*/("""<tr>
								<td width="25%">"""),_display_(/*486.26*/if(comment.datecreated != null)/*486.57*/{_display_(_display_(/*486.59*/(new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(comment.datecreated))))}),format.raw/*486.132*/("""</td>
								<td width="25%">"""),_display_(/*487.26*/comment/*487.33*/.author),format.raw/*487.40*/("""</td>
								<td width="50%">"""),_display_(/*488.26*/comment/*488.33*/.comment),format.raw/*488.41*/("""</td>
							</tr>
							""")))}),format.raw/*490.9*/("""					
							"""),format.raw/*491.8*/("""</table>
						</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Container --> 
			<div class="element-input">
				"""),_display_(/*499.6*/if(intakeForm.hasGlobalErrors)/*499.36*/ {_display_(Seq[Any](format.raw/*499.38*/("""
					"""),format.raw/*500.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*500.65*/intakeForm/*500.75*/.globalError.message),format.raw/*500.95*/("""</span>
				""")))}),format.raw/*501.6*/("""
			"""),format.raw/*502.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*505.39*/Messages("goback")),format.raw/*505.57*/("""</a>
				"""),_display_(/*506.6*/if(user.role.getValue() >= 3)/*506.35*/ {_display_(Seq[Any](format.raw/*506.37*/("""
					"""),format.raw/*507.6*/("""<a href="javascript:deleteIntake('"""),_display_(/*507.41*/intake/*507.47*/.intakekey),format.raw/*507.57*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
				""")))}),format.raw/*508.6*/("""
			"""),format.raw/*509.4*/("""</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					"""),_display_(/*512.7*/for(audit <- auditTrail) yield /*512.31*/ {_display_(Seq[Any](format.raw/*512.33*/("""
					"""),format.raw/*513.6*/("""<tr>
						<td>"""),_display_(/*514.12*/audit/*514.17*/.editor),format.raw/*514.24*/(""" """),format.raw/*514.25*/("""("""),_display_(/*514.27*/audit/*514.32*/.editoremail),format.raw/*514.44*/(""") changed <b>"""),_display_(/*514.58*/audit/*514.63*/.fielddisplay),format.raw/*514.76*/("""</b> from <b>"""),_display_(/*514.90*/audit/*514.95*/.oldvalue),format.raw/*514.104*/("""</b> to <b>"""),_display_(/*514.116*/audit/*514.121*/.newvalue),format.raw/*514.130*/("""</b> on """),_display_(/*514.139*/audit/*514.144*/.editdate),format.raw/*514.153*/(""".</td>
					</tr>
					""")))}),format.raw/*516.7*/("""					
				"""),format.raw/*517.5*/("""</table>
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
                  DATE: Fri Feb 10 14:19:20 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/editintake.scala.html
                  HASH: 6a06548821209001dcd802a91adbe453b1f2d266
                  MATRIX: 891->1|1230->211|1260->251|1288->254|1306->264|1345->266|1374->269|1464->332|1492->333|1530->345|1557->346|1662->424|1677->430|1708->440|2988->1693|3003->1699|3034->1709|3064->1712|3102->1740|3142->1741|3172->1742|3214->1752|3569->2080|3606->2108|3646->2110|3690->2126|3801->2210|3817->2216|3853->2230|3924->2283|3937->2288|3976->2289|4020->2305|4198->2456|4236->2478|4276->2480|4322->2499|4372->2540|4412->2542|4448->2551|4497->2590|4538->2592|4590->2612|4620->2613|4656->2621|4672->2627|4699->2632|4730->2635|4746->2641|4773->2646|4815->2656|4864->2674|4909->2691|5020->2771|5063->2786|5532->3228|5547->3234|5580->3246|5611->3250|5649->3278|5689->3279|5719->3280|5761->3290|6119->3621|6156->3649|6196->3651|6240->3667|6346->3746|6362->3752|6391->3759|6462->3812|6475->3817|6514->3818|6558->3834|6609->3858|6646->3886|6685->3887|6714->3888|6755->3898|6905->4021|6943->4043|6983->4045|7043->4078|7085->4111|7125->4113|7161->4122|7203->4154|7244->4156|7296->4176|7326->4177|7362->4185|7378->4191|7405->4196|7436->4199|7452->4205|7479->4210|7521->4220|7570->4238|7615->4255|7726->4335|7769->4350|8248->4800|8287->4828|8328->4829|8359->4830|8402->4840|8433->4841|8465->4844|8482->4850|8513->4858|9005->5322|9021->5328|9053->5338|9085->5342|9124->5370|9165->5371|9196->5372|9239->5382|9595->5710|9633->5738|9674->5740|9719->5756|9834->5842|9851->5848|9888->5862|9960->5915|9974->5920|10014->5921|10059->5937|10238->6088|10277->6110|10318->6112|10379->6145|10430->6186|10471->6188|10508->6197|10558->6236|10600->6238|10653->6258|10684->6259|10721->6267|10738->6273|10766->6278|10798->6281|10815->6287|10843->6292|10886->6302|10936->6320|10981->6336|11093->6416|11137->6431|11606->6871|11649->6903|11681->6905|11772->6971|11805->6975|11844->7003|11885->7004|11916->7005|11959->7015|12327->7355|12365->7383|12406->7385|12451->7401|12565->7486|12582->7492|12618->7505|12690->7558|12704->7563|12744->7564|12789->7580|12974->7737|13013->7759|13054->7761|13115->7794|13163->7832|13204->7834|13241->7843|13290->7881|13332->7883|13385->7903|13416->7904|13453->7912|13470->7918|13498->7923|13530->7926|13547->7932|13575->7937|13618->7947|13668->7965|13713->7981|13825->8061|13868->8075|14354->8533|14392->8561|14433->8563|14478->8579|14588->8661|14605->8667|14638->8677|14710->8730|14724->8735|14764->8736|14809->8752|14985->8900|15020->8918|15061->8920|15122->8953|15165->8986|15206->8988|15243->8997|15291->9034|15333->9036|15386->9056|15417->9057|15454->9065|15469->9069|15501->9078|15533->9081|15548->9085|15580->9094|15623->9104|15673->9122|15718->9138|15830->9218|15873->9232|16274->9604|16318->9637|16350->9639|16442->9706|16475->9710|16514->9738|16555->9739|16586->9740|16629->9750|17066->10159|17104->10187|17145->10189|17190->10205|17301->10288|17318->10294|17352->10305|17424->10358|17438->10363|17478->10364|17523->10380|17695->10524|17730->10542|17771->10544|17832->10577|17867->10602|17908->10604|17945->10613|17994->10651|18036->10653|18089->10673|18120->10675|18135->10679|18167->10688|18210->10698|18260->10716|18306->10733|18418->10813|18461->10827|18809->11147|18847->11175|18888->11177|18933->11193|19048->11279|19065->11285|19102->11299|19174->11352|19188->11357|19228->11358|19273->11374|19457->11530|19496->11552|19537->11554|19598->11587|19649->11628|19690->11630|19727->11639|19777->11678|19819->11680|19872->11700|19903->11702|19920->11708|19948->11713|19991->11723|20041->11741|20086->11757|20198->11837|20241->11851|20660->12242|20727->12299|20768->12301|20813->12317|20927->12402|20944->12408|20980->12421|21052->12474|21066->12479|21106->12480|21151->12496|21329->12646|21368->12668|21409->12670|21470->12703|21521->12744|21562->12746|21599->12755|21648->12793|21690->12795|21743->12815|21774->12817|21791->12823|21819->12828|21862->12838|21912->12856|21957->12872|22069->12952|22112->12966|22513->13338|22530->13344|22568->13359|22600->13362|22668->13419|22709->13420|22740->13421|22783->13431|23284->13903|23326->13934|23358->13936|23448->14001|23480->14004|23548->14061|23589->14062|23620->14063|23663->14073|24101->14482|24147->14517|24179->14519|24273->14588|24305->14591|24373->14648|24414->14649|24445->14650|24488->14660|24996->15139|25041->15173|25073->15175|25166->15243|25198->15246|25266->15303|25307->15304|25338->15305|25381->15315|25815->15720|25832->15726|25875->15746|25907->15749|25975->15806|26016->15807|26047->15808|26090->15818|26573->16273|26611->16301|26652->16303|26697->16319|26807->16401|26824->16407|26857->16417|26929->16470|26943->16475|26983->16476|27028->16492|27204->16640|27239->16658|27280->16660|27341->16693|27384->16726|27425->16728|27462->16737|27510->16774|27552->16776|27605->16796|27636->16797|27673->16805|27688->16809|27720->16818|27752->16821|27767->16825|27799->16834|27842->16844|27892->16862|27937->16878|28049->16958|28092->16972|28493->17344|28537->17377|28569->17379|28661->17446|28693->17449|28733->17478|28775->17480|28806->17481|28849->17491|29286->17900|29324->17928|29365->17930|29410->17946|29521->18029|29538->18035|29572->18046|29644->18099|29658->18104|29698->18105|29743->18121|29915->18265|29950->18283|29991->18285|30052->18318|30087->18343|30128->18345|30165->18354|30214->18392|30256->18394|30309->18414|30340->18416|30355->18420|30387->18429|30430->18439|30480->18457|30526->18474|30638->18554|30681->18568|31029->18888|31067->18916|31108->18918|31153->18934|31268->19020|31285->19026|31322->19040|31394->19093|31408->19098|31448->19099|31493->19115|31568->19162|31607->19184|31648->19186|31709->19219|31760->19260|31801->19262|31838->19271|31888->19310|31930->19312|31983->19332|32014->19334|32031->19340|32059->19345|32102->19355|32152->19373|32197->19389|32309->19469|32352->19483|32771->19874|32809->19902|32850->19904|32895->19920|33009->20005|33026->20011|33062->20024|33134->20077|33148->20082|33188->20083|33233->20099|33411->20249|33450->20271|33491->20273|33552->20306|33603->20347|33644->20349|33681->20358|33730->20396|33772->20398|33825->20418|33856->20420|33873->20426|33901->20431|33944->20441|33994->20459|34039->20475|34151->20555|34194->20569|34595->20941|34612->20947|34650->20962|34682->20965|34721->20993|34762->20994|34793->20995|34836->21005|35337->21477|35379->21508|35411->21510|35501->21575|35533->21578|35572->21606|35613->21607|35644->21608|35687->21618|36125->22027|36171->22062|36203->22064|36297->22133|36329->22136|36368->22164|36409->22165|36440->22166|36483->22176|36977->22641|37022->22675|37054->22677|37147->22745|37564->23134|37581->23140|37624->23160|38110->23619|38154->23646|38195->23648|38232->23657|38291->23688|38332->23719|38363->23721|38461->23794|38521->23826|38538->23833|38567->23840|38627->23872|38644->23879|38674->23887|38734->23916|38776->23930|38942->24069|38982->24099|39023->24101|39058->24108|39145->24167|39165->24177|39207->24197|39252->24211|39285->24216|39428->24331|39468->24349|39506->24360|39545->24389|39586->24391|39621->24398|39684->24433|39700->24439|39732->24449|39829->24515|39862->24520|39972->24603|40013->24627|40054->24629|40089->24636|40134->24653|40149->24658|40178->24665|40208->24666|40238->24668|40253->24673|40287->24685|40329->24699|40344->24704|40379->24717|40421->24731|40436->24736|40468->24745|40509->24757|40525->24762|40557->24771|40595->24780|40611->24785|40643->24794|40700->24820|40739->24831
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|39->9|39->9|41->11|41->11|41->11|65->35|65->35|65->35|65->35|65->35|65->35|65->35|65->35|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|80->50|80->50|80->50|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|82->52|83->53|85->55|86->56|98->68|98->68|98->68|98->68|98->68|98->68|98->68|98->68|108->78|108->78|108->78|109->79|109->79|109->79|109->79|110->80|110->80|110->80|111->81|111->81|111->81|111->81|111->81|111->81|113->83|113->83|113->83|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|115->85|116->86|118->88|119->89|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|142->112|142->112|142->112|142->112|142->112|142->112|142->112|142->112|152->122|152->122|152->122|153->123|153->123|153->123|153->123|154->124|154->124|154->124|155->125|157->127|157->127|157->127|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|159->129|160->130|162->132|163->133|174->144|174->144|174->144|174->144|174->144|174->144|174->144|174->144|174->144|185->155|185->155|185->155|186->156|186->156|186->156|186->156|187->157|187->157|187->157|188->158|190->160|190->160|190->160|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|192->162|193->163|195->165|196->166|211->181|211->181|211->181|212->182|212->182|212->182|212->182|213->183|213->183|213->183|214->184|216->186|216->186|216->186|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|218->188|219->189|221->191|222->192|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|244->214|244->214|244->214|245->215|245->215|245->215|245->215|246->216|246->216|246->216|247->217|249->219|249->219|249->219|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|251->221|252->222|254->224|255->225|266->236|266->236|266->236|267->237|267->237|267->237|267->237|268->238|268->238|268->238|269->239|271->241|271->241|271->241|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|273->243|274->244|276->246|277->247|290->260|290->260|290->260|291->261|291->261|291->261|291->261|292->262|292->262|292->262|293->263|295->265|295->265|295->265|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|297->267|298->268|300->270|301->271|310->280|310->280|310->280|310->280|310->280|310->280|310->280|310->280|321->291|321->291|321->291|321->291|321->291|321->291|321->291|321->291|321->291|330->300|330->300|330->300|330->300|330->300|330->300|330->300|330->300|330->300|341->311|341->311|341->311|341->311|341->311|341->311|341->311|341->311|341->311|350->320|350->320|350->320|350->320|350->320|350->320|350->320|350->320|364->334|364->334|364->334|365->335|365->335|365->335|365->335|366->336|366->336|366->336|367->337|369->339|369->339|369->339|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|370->340|371->341|372->342|374->344|375->345|384->354|384->354|384->354|384->354|384->354|384->354|384->354|384->354|384->354|397->367|397->367|397->367|398->368|398->368|398->368|398->368|399->369|399->369|399->369|400->370|402->372|402->372|402->372|403->373|403->373|403->373|403->373|403->373|403->373|403->373|403->373|403->373|403->373|403->373|404->374|405->375|407->377|408->378|419->389|419->389|419->389|420->390|420->390|420->390|420->390|421->391|421->391|421->391|422->392|423->393|423->393|423->393|424->394|424->394|424->394|424->394|424->394|424->394|424->394|424->394|424->394|424->394|424->394|425->395|426->396|428->398|429->399|442->412|442->412|442->412|443->413|443->413|443->413|443->413|444->414|444->414|444->414|445->415|447->417|447->417|447->417|448->418|448->418|448->418|448->418|448->418|448->418|448->418|448->418|448->418|448->418|448->418|449->419|450->420|452->422|453->423|462->432|462->432|462->432|462->432|462->432|462->432|462->432|462->432|473->443|473->443|473->443|473->443|473->443|473->443|473->443|473->443|473->443|482->452|482->452|482->452|482->452|482->452|482->452|482->452|482->452|482->452|493->463|493->463|493->463|493->463|502->472|502->472|502->472|514->484|514->484|514->484|515->485|516->486|516->486|516->486|516->486|517->487|517->487|517->487|518->488|518->488|518->488|520->490|521->491|529->499|529->499|529->499|530->500|530->500|530->500|530->500|531->501|532->502|535->505|535->505|536->506|536->506|536->506|537->507|537->507|537->507|537->507|538->508|539->509|542->512|542->512|542->512|543->513|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|544->514|546->516|547->517
                  -- GENERATED --
              */
          