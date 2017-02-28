
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
										<label class="title"><span></span>BA Assigned (Primary):</label>
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
										<label class="title"><span></span>BA Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*260.15*/if(user.role.getValue() < 3)/*260.43*/ {_display_(Seq[Any](format.raw/*260.45*/("""
														"""),format.raw/*261.15*/("""<input class="large" type="text" name="baassigned1" readonly placeholder="" value=""""),_display_(/*261.99*/intake/*261.105*/.baassigned1),format.raw/*261.117*/("""" /><span class="icon-place"></span>
													""")))}/*262.16*/else/*262.21*/{_display_(Seq[Any](format.raw/*262.22*/("""
														"""),format.raw/*263.15*/("""<select name="baassigned1">
															<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
															"""),_display_(/*265.17*/for(user <- users) yield /*265.35*/ {_display_(Seq[Any](format.raw/*265.37*/("""
								                  				"""),_display_(/*266.32*/if(user.rolename == "BA")/*266.57*/ {_display_(Seq[Any](format.raw/*266.59*/("""<option """),_display_(/*266.68*/if(user.fullname == intake.baassigned1)/*266.107*/ {_display_(Seq[Any](format.raw/*266.109*/("""selected="selected"""")))}),format.raw/*266.129*/(""">"""),_display_(/*266.131*/user/*266.135*/.fullname),format.raw/*266.144*/("""</option>""")))}),format.raw/*266.154*/("""
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
									<div class="element-select">
										<label class="title"><span></span>BA Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*282.15*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*282.72*/ {_display_(Seq[Any](format.raw/*282.74*/("""
														"""),format.raw/*283.15*/("""<input class="large" type="text" name="bataskstatus" readonly placeholder="" value=""""),_display_(/*283.100*/intake/*283.106*/.bataskstatus),format.raw/*283.119*/("""" /><span class="icon-place"></span>
													""")))}/*284.16*/else/*284.21*/{_display_(Seq[Any](format.raw/*284.22*/("""
														"""),format.raw/*285.15*/("""<select name="bataskstatus">
															<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
															"""),_display_(/*287.17*/for(lookup <- lookups) yield /*287.39*/ {_display_(Seq[Any](format.raw/*287.41*/("""
								                  				"""),_display_(/*288.32*/if(lookup.lookuptype == "BA Task Status")/*288.73*/ {_display_(Seq[Any](format.raw/*288.75*/("""<option """),_display_(/*288.84*/if(lookup.name == intake.bataskstatus)/*288.122*/ {_display_(Seq[Any](format.raw/*288.124*/("""selected="selected"""")))}),format.raw/*288.144*/(""">"""),_display_(/*288.146*/lookup/*288.152*/.name),format.raw/*288.157*/("""</option>""")))}),format.raw/*288.167*/("""
															""")))}),format.raw/*289.17*/("""
														"""),format.raw/*290.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*292.15*/("""
												"""),format.raw/*293.13*/("""</span>
											</div>
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
													"""),_display_(/*306.15*/if(user.role.getValue() < 3)/*306.43*/ {_display_(Seq[Any](format.raw/*306.45*/("""
														"""),format.raw/*307.15*/("""<input class="large" type="text" name="baassigned1" readonly placeholder="" value=""""),_display_(/*307.99*/intake/*307.105*/.baassigned2),format.raw/*307.117*/("""" /><span class="icon-place"></span>
													""")))}/*308.16*/else/*308.21*/{_display_(Seq[Any](format.raw/*308.22*/("""
														"""),format.raw/*309.15*/("""<select name="baassigned2">
															<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
															"""),_display_(/*311.17*/for(user <- users) yield /*311.35*/ {_display_(Seq[Any](format.raw/*311.37*/("""
								                  				"""),_display_(/*312.32*/if(user.rolename == "BA")/*312.57*/ {_display_(Seq[Any](format.raw/*312.59*/("""<option """),_display_(/*312.68*/if(user.fullname == intake.baassigned2)/*312.107*/ {_display_(Seq[Any](format.raw/*312.109*/("""selected="selected"""")))}),format.raw/*312.129*/(""">"""),_display_(/*312.131*/user/*312.135*/.fullname),format.raw/*312.144*/("""</option>""")))}),format.raw/*312.154*/("""
															""")))}),format.raw/*313.17*/("""	
														"""),format.raw/*314.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*316.15*/("""
												"""),format.raw/*317.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-number">
										<label class="title"><span></span>BA % Time (Estimate)</label>
										<div class="item-cont">
											<input class="large" type="text" min="0" max="500" name="batimeestimate" placeholder="Number" value=""""),_display_(/*326.114*/intake/*326.120*/.batimeestimate),format.raw/*326.135*/("""" """),_display_(/*326.138*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*326.195*/{_display_(Seq[Any](format.raw/*326.196*/(""" """),format.raw/*326.197*/("""readonly """)))}),format.raw/*326.207*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" placeholder="Date" value=""""),_display_(/*337.117*/if(intake.batargetdate != null)/*337.148*/{_display_(_display_(/*337.150*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.batargetdate))))}),format.raw/*337.215*/("""" """),_display_(/*337.218*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*337.275*/{_display_(Seq[Any](format.raw/*337.276*/(""" """),format.raw/*337.277*/("""readonly """)))}),format.raw/*337.287*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" placeholder="Date" value=""""),_display_(/*346.121*/if(intake.bacompletiondate != null)/*346.156*/{_display_(_display_(/*346.158*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.bacompletiondate))))}),format.raw/*346.227*/("""" """),_display_(/*346.230*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*346.287*/{_display_(Seq[Any](format.raw/*346.288*/(""" """),format.raw/*346.289*/("""readonly """)))}),format.raw/*346.299*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" placeholder="Date"  value=""""),_display_(/*357.121*/if(intake.initialmeetdate != null)/*357.155*/{_display_(_display_(/*357.157*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*357.225*/("""" """),_display_(/*357.228*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*357.285*/{_display_(Seq[Any](format.raw/*357.286*/(""" """),format.raw/*357.287*/("""readonly """)))}),format.raw/*357.297*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" name="initialmeetcomments"	placeholder="Enter Comments..." value=""""),_display_(/*366.112*/intake/*366.118*/.initialmeetcomments),format.raw/*366.138*/("""" """),_display_(/*366.141*/if(user.role.getValue() == 2 || user.role.getValue() < 1)/*366.198*/{_display_(Seq[Any](format.raw/*366.199*/(""" """),format.raw/*366.200*/("""readonly """)))}),format.raw/*366.210*/("""/><span class="icon-place"></span>
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
													"""),_display_(/*380.15*/if(user.role.getValue() < 3)/*380.43*/ {_display_(Seq[Any](format.raw/*380.45*/("""
														"""),format.raw/*381.15*/("""<input class="large" type="text" name="semanager" readonly placeholder="" value=""""),_display_(/*381.97*/intake/*381.103*/.semanager),format.raw/*381.113*/("""" /><span class="icon-place"></span>
													""")))}/*382.16*/else/*382.21*/{_display_(Seq[Any](format.raw/*382.22*/("""
														"""),format.raw/*383.15*/("""<select name="semanager">
															<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
															"""),_display_(/*385.17*/for(user <- users) yield /*385.35*/ {_display_(Seq[Any](format.raw/*385.37*/("""
								                  				"""),_display_(/*386.32*/if(user.rolename == "SE Manager")/*386.65*/ {_display_(Seq[Any](format.raw/*386.67*/("""<option """),_display_(/*386.76*/if(user.fullname == intake.semanager)/*386.113*/ {_display_(Seq[Any](format.raw/*386.115*/("""selected="selected"""")))}),format.raw/*386.135*/(""" """),format.raw/*386.136*/("""value=""""),_display_(/*386.144*/user/*386.148*/.fullname),format.raw/*386.157*/("""">"""),_display_(/*386.160*/user/*386.164*/.fullname),format.raw/*386.173*/("""</option>""")))}),format.raw/*386.183*/("""
															""")))}),format.raw/*387.17*/("""
														"""),format.raw/*388.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*390.15*/("""
												"""),format.raw/*391.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Assigned Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" placeholder="Date" value=""""),_display_(/*400.119*/if(intake.seassigneddate != null)/*400.152*/{_display_(_display_(/*400.154*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.seassigneddate))))}),format.raw/*400.221*/("""" """),_display_(/*400.224*/if(user.role.getValue() <= 3)/*400.253*/ {_display_(Seq[Any](format.raw/*400.255*/(""" """),format.raw/*400.256*/("""readonly """)))}),format.raw/*400.266*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
							<div class="row" style="padding-bottom: 10px;">
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>SE Assigned (Primary):</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*413.15*/if(user.role.getValue() < 3)/*413.43*/ {_display_(Seq[Any](format.raw/*413.45*/("""
														"""),format.raw/*414.15*/("""<input class="large" type="text" name="seassigned" readonly placeholder="" value=""""),_display_(/*414.98*/intake/*414.104*/.seassigned),format.raw/*414.115*/("""" /><span class="icon-place"></span>
													""")))}/*415.16*/else/*415.21*/{_display_(Seq[Any](format.raw/*415.22*/("""
														"""),format.raw/*416.15*/("""<select name="seassigned">
															<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
															"""),_display_(/*418.17*/for(user <- users) yield /*418.35*/ {_display_(Seq[Any](format.raw/*418.37*/("""
								                  				"""),_display_(/*419.32*/if(user.rolename == "SE")/*419.57*/ {_display_(Seq[Any](format.raw/*419.59*/("""<option """),_display_(/*419.68*/if(user.fullname == intake.seassigned)/*419.106*/ {_display_(Seq[Any](format.raw/*419.108*/("""selected="selected"""")))}),format.raw/*419.128*/(""">"""),_display_(/*419.130*/user/*419.134*/.fullname),format.raw/*419.143*/("""</option>""")))}),format.raw/*419.153*/("""
															""")))}),format.raw/*420.17*/("""	
														"""),format.raw/*421.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*423.15*/("""
												"""),format.raw/*424.13*/("""</span>
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
													"""),_display_(/*435.15*/if(user.role.getValue() < 3)/*435.43*/ {_display_(Seq[Any](format.raw/*435.45*/("""
														"""),format.raw/*436.15*/("""<input class="large" type="text" name="sedeliverable" readonly placeholder="" value=""""),_display_(/*436.101*/intake/*436.107*/.sedeliverable),format.raw/*436.121*/("""" /><span class="icon-place"></span>
													""")))}/*437.16*/else/*437.21*/{_display_(Seq[Any](format.raw/*437.22*/("""
														"""),format.raw/*438.15*/("""<select name="sedeliverable">
															"""),_display_(/*439.17*/for(lookup <- lookups) yield /*439.39*/ {_display_(Seq[Any](format.raw/*439.41*/("""
								                  				"""),_display_(/*440.32*/if(lookup.lookuptype == "SE Deliverable")/*440.73*/ {_display_(Seq[Any](format.raw/*440.75*/("""<option """),_display_(/*440.84*/if(lookup.name == intake.sedeliverable)/*440.123*/ {_display_(Seq[Any](format.raw/*440.125*/("""selected="selected"""")))}),format.raw/*440.145*/(""">"""),_display_(/*440.147*/lookup/*440.153*/.name),format.raw/*440.158*/("""</option>""")))}),format.raw/*440.168*/("""
															""")))}),format.raw/*441.17*/("""
														"""),format.raw/*442.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*444.15*/("""
												"""),format.raw/*445.13*/("""</span>
											</div>
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
													"""),_display_(/*458.15*/if(user.role.getValue() < 3)/*458.43*/ {_display_(Seq[Any](format.raw/*458.45*/("""
														"""),format.raw/*459.15*/("""<input class="large" type="text" name="seassigned1" readonly placeholder="" value=""""),_display_(/*459.99*/intake/*459.105*/.seassigned1),format.raw/*459.117*/("""" /><span class="icon-place"></span>
													""")))}/*460.16*/else/*460.21*/{_display_(Seq[Any](format.raw/*460.22*/("""
														"""),format.raw/*461.15*/("""<select name="seassigned1">
															<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
															"""),_display_(/*463.17*/for(user <- users) yield /*463.35*/ {_display_(Seq[Any](format.raw/*463.37*/("""
								                  				"""),_display_(/*464.32*/if(user.rolename == "SE")/*464.57*/ {_display_(Seq[Any](format.raw/*464.59*/("""<option """),_display_(/*464.68*/if(user.fullname == intake.seassigned1)/*464.107*/ {_display_(Seq[Any](format.raw/*464.109*/("""selected="selected"""")))}),format.raw/*464.129*/(""">"""),_display_(/*464.131*/user/*464.135*/.fullname),format.raw/*464.144*/("""</option>""")))}),format.raw/*464.154*/("""
															""")))}),format.raw/*465.17*/("""	
														"""),format.raw/*466.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*468.15*/("""
												"""),format.raw/*469.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>SE Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													"""),_display_(/*480.15*/if(user.role.getValue() < 2)/*480.43*/ {_display_(Seq[Any](format.raw/*480.45*/("""
														"""),format.raw/*481.15*/("""<input class="large" type="text" name="setaskstatus" readonly placeholder="" value=""""),_display_(/*481.100*/intake/*481.106*/.setaskstatus),format.raw/*481.119*/("""" /><span class="icon-place"></span>
													""")))}/*482.16*/else/*482.21*/{_display_(Seq[Any](format.raw/*482.22*/("""
														"""),format.raw/*483.15*/("""<select name="setaskstatus">
															<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
															"""),_display_(/*485.17*/for(lookup <- lookups) yield /*485.39*/ {_display_(Seq[Any](format.raw/*485.41*/("""
								                  				"""),_display_(/*486.32*/if(lookup.lookuptype == "SE Task Status")/*486.73*/ {_display_(Seq[Any](format.raw/*486.75*/("""<option """),_display_(/*486.84*/if(lookup.name == intake.setaskstatus)/*486.122*/ {_display_(Seq[Any](format.raw/*486.124*/("""selected="selected"""")))}),format.raw/*486.144*/(""">"""),_display_(/*486.146*/lookup/*486.152*/.name),format.raw/*486.157*/("""</option>""")))}),format.raw/*486.167*/("""
															""")))}),format.raw/*487.17*/("""
														"""),format.raw/*488.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*490.15*/("""
												"""),format.raw/*491.13*/("""</span>
											</div>
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
													"""),_display_(/*504.15*/if(user.role.getValue() < 3)/*504.43*/ {_display_(Seq[Any](format.raw/*504.45*/("""
														"""),format.raw/*505.15*/("""<input class="large" type="text" name="seassigned2" readonly placeholder="" value=""""),_display_(/*505.99*/intake/*505.105*/.seassigned2),format.raw/*505.117*/("""" /><span class="icon-place"></span>
													""")))}/*506.16*/else/*506.21*/{_display_(Seq[Any](format.raw/*506.22*/("""
														"""),format.raw/*507.15*/("""<select name="seassigned2">
															<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
															"""),_display_(/*509.17*/for(user <- users) yield /*509.35*/ {_display_(Seq[Any](format.raw/*509.37*/("""
								                  				"""),_display_(/*510.32*/if(user.rolename == "SE")/*510.57*/ {_display_(Seq[Any](format.raw/*510.59*/("""<option """),_display_(/*510.68*/if(user.fullname == intake.seassigned2)/*510.107*/ {_display_(Seq[Any](format.raw/*510.109*/("""selected="selected"""")))}),format.raw/*510.129*/(""">"""),_display_(/*510.131*/user/*510.135*/.fullname),format.raw/*510.144*/("""</option>""")))}),format.raw/*510.154*/("""
															""")))}),format.raw/*511.17*/("""	
														"""),format.raw/*512.15*/("""</select>
														<i></i><span class="icon-place"></span>
													""")))}),format.raw/*514.15*/("""
												"""),format.raw/*515.13*/("""</span>
											</div>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-number">
										<label class="title"><span></span>SE % Time (Estimate)</label>
										<div class="item-cont">
											<input class="large" type="text" min="0" max="500" name="setimeestimate" placeholder="Number" value=""""),_display_(/*524.114*/intake/*524.120*/.setimeestimate),format.raw/*524.135*/("""" """),_display_(/*524.138*/if(user.role.getValue() < 2)/*524.166*/{_display_(Seq[Any](format.raw/*524.167*/(""" """),format.raw/*524.168*/("""readonly """)))}),format.raw/*524.178*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" placeholder="Date" value=""""),_display_(/*535.117*/if(intake.setargetdate != null)/*535.148*/{_display_(_display_(/*535.150*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.setargetdate))))}),format.raw/*535.215*/("""" """),_display_(/*535.218*/if(user.role.getValue() < 2)/*535.246*/{_display_(Seq[Any](format.raw/*535.247*/(""" """),format.raw/*535.248*/("""readonly """)))}),format.raw/*535.258*/("""/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" placeholder="Date" value=""""),_display_(/*544.121*/if(intake.secompletiondate != null)/*544.156*/{_display_(_display_(/*544.158*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.secompletiondate))))}),format.raw/*544.227*/("""" """),_display_(/*544.230*/if(user.role.getValue() < 2)/*544.258*/{_display_(Seq[Any](format.raw/*544.259*/(""" """),format.raw/*544.260*/("""readonly """)))}),format.raw/*544.270*/("""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" readonly placeholder="Date"  value=""""),_display_(/*555.107*/if(intake.initialmeetdate != null)/*555.141*/{_display_(_display_(/*555.143*/(new SimpleDateFormat("yyyy-MM-dd").format(intake.initialmeetdate))))}),format.raw/*555.211*/("""" />
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" readonly placeholder="Enter Comments..." value=""""),_display_(/*564.94*/intake/*564.100*/.initialmeetcomments),format.raw/*564.120*/("""" /><span class="icon-place"></span>
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
							"""),_display_(/*576.9*/for(comment <- allComments) yield /*576.36*/ {_display_(Seq[Any](format.raw/*576.38*/("""
							"""),format.raw/*577.8*/("""<tr>
								<td width="25%">"""),_display_(/*578.26*/if(comment.datecreated != null)/*578.57*/{_display_(_display_(/*578.59*/(new SimpleDateFormat("MM/dd/yyyy hh:mm a").format(comment.datecreated))))}),format.raw/*578.132*/("""</td>
								<td width="25%">"""),_display_(/*579.26*/comment/*579.33*/.author),format.raw/*579.40*/("""</td>
								<td width="50%">"""),_display_(/*580.26*/comment/*580.33*/.comment),format.raw/*580.41*/("""</td>
							</tr>
							""")))}),format.raw/*582.9*/("""					
							"""),format.raw/*583.8*/("""</table>
						</div>
						</div>
					</div>
				</div>
			</div>
			<!-- End Container --> 
			<div class="element-input">
				"""),_display_(/*591.6*/if(intakeForm.hasGlobalErrors)/*591.36*/ {_display_(Seq[Any](format.raw/*591.38*/("""
					"""),format.raw/*592.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*592.65*/intakeForm/*592.75*/.globalError.message),format.raw/*592.95*/("""</span>
				""")))}),format.raw/*593.6*/("""
			"""),format.raw/*594.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*597.39*/Messages("goback")),format.raw/*597.57*/("""</a>
				"""),_display_(/*598.6*/if(user.role.getValue() >= 3)/*598.35*/ {_display_(Seq[Any](format.raw/*598.37*/("""
					"""),format.raw/*599.6*/("""<a href="javascript:deleteIntake('"""),_display_(/*599.41*/intake/*599.47*/.intakekey),format.raw/*599.57*/("""')" class="buttonDelete" style="color: #FFFFFF;">Delete</a>
				""")))}),format.raw/*600.6*/("""
			"""),format.raw/*601.4*/("""</div>
			<div class="modifiedSection">
				<table class="modifiedTable">
					"""),_display_(/*604.7*/for(audit <- auditTrail) yield /*604.31*/ {_display_(Seq[Any](format.raw/*604.33*/("""
					"""),format.raw/*605.6*/("""<tr>
						<td>"""),_display_(/*606.12*/audit/*606.17*/.editor),format.raw/*606.24*/(""" """),format.raw/*606.25*/("""("""),_display_(/*606.27*/audit/*606.32*/.editoremail),format.raw/*606.44*/(""") changed <b>"""),_display_(/*606.58*/audit/*606.63*/.fielddisplay),format.raw/*606.76*/("""</b> from <b>"""),_display_(/*606.90*/audit/*606.95*/.oldvalue),format.raw/*606.104*/("""</b> to <b>"""),_display_(/*606.116*/audit/*606.121*/.newvalue),format.raw/*606.130*/("""</b> on """),_display_(/*606.139*/audit/*606.144*/.editdate),format.raw/*606.153*/(""".</td>
					</tr>
					""")))}),format.raw/*608.7*/("""					
				"""),format.raw/*609.5*/("""</table>
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
                  DATE: Tue Feb 28 14:07:15 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/editintake.scala.html
                  HASH: b95431ff2c2cd9a90c117bd6c04c3f7cd62e418b
                  MATRIX: 891->1|1230->211|1260->251|1288->254|1306->264|1345->266|1374->269|1464->332|1492->333|1530->345|1557->346|1662->424|1677->430|1708->440|2988->1693|3003->1699|3034->1709|3064->1712|3102->1740|3142->1741|3172->1742|3214->1752|3569->2080|3606->2108|3646->2110|3690->2126|3801->2210|3817->2216|3853->2230|3924->2283|3937->2288|3976->2289|4020->2305|4198->2456|4236->2478|4276->2480|4322->2499|4372->2540|4412->2542|4448->2551|4497->2590|4538->2592|4590->2612|4620->2613|4656->2621|4672->2627|4699->2632|4730->2635|4746->2641|4773->2646|4815->2656|4864->2674|4909->2691|5020->2771|5063->2786|5532->3228|5547->3234|5580->3246|5611->3250|5649->3278|5689->3279|5719->3280|5761->3290|6119->3621|6156->3649|6196->3651|6240->3667|6346->3746|6362->3752|6391->3759|6462->3812|6475->3817|6514->3818|6558->3834|6609->3858|6646->3886|6685->3887|6714->3888|6755->3898|6905->4021|6943->4043|6983->4045|7043->4078|7085->4111|7125->4113|7161->4122|7203->4154|7244->4156|7296->4176|7326->4177|7362->4185|7378->4191|7405->4196|7436->4199|7452->4205|7479->4210|7521->4220|7570->4238|7615->4255|7726->4335|7769->4350|8248->4800|8287->4828|8328->4829|8359->4830|8402->4840|8433->4841|8465->4844|8482->4850|8513->4858|9005->5322|9021->5328|9053->5338|9085->5342|9124->5370|9165->5371|9196->5372|9239->5382|9595->5710|9633->5738|9674->5740|9719->5756|9834->5842|9851->5848|9888->5862|9960->5915|9974->5920|10014->5921|10059->5937|10238->6088|10277->6110|10318->6112|10379->6145|10430->6186|10471->6188|10508->6197|10558->6236|10600->6238|10653->6258|10684->6259|10721->6267|10738->6273|10766->6278|10798->6281|10815->6287|10843->6292|10886->6302|10936->6320|10981->6336|11093->6416|11137->6431|11606->6871|11649->6903|11681->6905|11772->6971|11805->6975|11844->7003|11885->7004|11916->7005|11959->7015|12327->7355|12365->7383|12406->7385|12451->7401|12565->7486|12582->7492|12618->7505|12690->7558|12704->7563|12744->7564|12789->7580|12974->7737|13013->7759|13054->7761|13115->7794|13163->7832|13204->7834|13241->7843|13290->7881|13332->7883|13385->7903|13416->7904|13453->7912|13470->7918|13498->7923|13530->7926|13547->7932|13575->7937|13618->7947|13668->7965|13713->7981|13825->8061|13868->8075|14354->8533|14392->8561|14433->8563|14478->8579|14588->8661|14605->8667|14638->8677|14710->8730|14724->8735|14764->8736|14809->8752|14985->8900|15020->8918|15061->8920|15122->8953|15165->8986|15206->8988|15243->8997|15291->9034|15333->9036|15386->9056|15417->9057|15454->9065|15469->9069|15501->9078|15533->9081|15548->9085|15580->9094|15623->9104|15673->9122|15718->9138|15830->9218|15873->9232|16274->9604|16318->9637|16350->9639|16442->9706|16475->9710|16514->9738|16555->9739|16586->9740|16629->9750|17076->10169|17114->10197|17155->10199|17200->10215|17311->10298|17328->10304|17362->10315|17434->10368|17448->10373|17488->10374|17533->10390|17705->10534|17740->10552|17781->10554|17842->10587|17877->10612|17918->10614|17955->10623|18004->10661|18046->10663|18099->10683|18130->10685|18145->10689|18177->10698|18220->10708|18270->10726|18316->10743|18428->10823|18471->10837|18819->11157|18857->11185|18898->11187|18943->11203|19058->11289|19075->11295|19112->11309|19184->11362|19198->11367|19238->11368|19283->11384|19467->11540|19506->11562|19547->11564|19608->11597|19659->11638|19700->11640|19737->11649|19787->11688|19829->11690|19882->11710|19913->11712|19930->11718|19958->11723|20001->11733|20051->11751|20096->11767|20208->11847|20251->11861|20667->12249|20705->12277|20746->12279|20791->12295|20903->12379|20920->12385|20955->12397|21027->12450|21041->12455|21081->12456|21126->12472|21299->12617|21334->12635|21375->12637|21436->12670|21471->12695|21512->12697|21549->12706|21599->12745|21641->12747|21694->12767|21725->12769|21740->12773|21772->12782|21815->12792|21865->12810|21911->12827|22023->12907|22066->12921|22414->13241|22481->13298|22522->13300|22567->13316|22681->13401|22698->13407|22734->13420|22806->13473|22820->13478|22860->13479|22905->13495|23083->13645|23122->13667|23163->13669|23224->13702|23275->13743|23316->13745|23353->13754|23402->13792|23444->13794|23497->13814|23528->13816|23545->13822|23573->13827|23616->13837|23666->13855|23711->13871|23823->13951|23866->13965|24282->14353|24320->14381|24361->14383|24406->14399|24518->14483|24535->14489|24570->14501|24642->14554|24656->14559|24696->14560|24741->14576|24914->14721|24949->14739|24990->14741|25051->14774|25086->14799|25127->14801|25164->14810|25214->14849|25256->14851|25309->14871|25340->14873|25355->14877|25387->14886|25430->14896|25480->14914|25526->14931|25638->15011|25681->15025|26082->15397|26099->15403|26137->15418|26169->15421|26237->15478|26278->15479|26309->15480|26352->15490|26853->15962|26895->15993|26927->15995|27017->16060|27049->16063|27117->16120|27158->16121|27189->16122|27232->16132|27670->16541|27716->16576|27748->16578|27842->16647|27874->16650|27942->16707|27983->16708|28014->16709|28057->16719|28565->17198|28610->17232|28642->17234|28735->17302|28767->17305|28835->17362|28876->17363|28907->17364|28950->17374|29384->17779|29401->17785|29444->17805|29476->17808|29544->17865|29585->17866|29616->17867|29659->17877|30142->18332|30180->18360|30221->18362|30266->18378|30376->18460|30393->18466|30426->18476|30498->18529|30512->18534|30552->18535|30597->18551|30773->18699|30808->18717|30849->18719|30910->18752|30953->18785|30994->18787|31031->18796|31079->18833|31121->18835|31174->18855|31205->18856|31242->18864|31257->18868|31289->18877|31321->18880|31336->18884|31368->18893|31411->18903|31461->18921|31506->18937|31618->19017|31661->19031|32062->19403|32106->19436|32138->19438|32230->19505|32262->19508|32302->19537|32344->19539|32375->19540|32418->19550|32865->19969|32903->19997|32944->19999|32989->20015|33100->20098|33117->20104|33151->20115|33223->20168|33237->20173|33277->20174|33322->20190|33494->20334|33529->20352|33570->20354|33631->20387|33666->20412|33707->20414|33744->20423|33793->20461|33835->20463|33888->20483|33919->20485|33934->20489|33966->20498|34009->20508|34059->20526|34105->20543|34217->20623|34260->20637|34608->20957|34646->20985|34687->20987|34732->21003|34847->21089|34864->21095|34901->21109|34973->21162|34987->21167|35027->21168|35072->21184|35147->21231|35186->21253|35227->21255|35288->21288|35339->21329|35380->21331|35417->21340|35467->21379|35509->21381|35562->21401|35593->21403|35610->21409|35638->21414|35681->21424|35731->21442|35776->21458|35888->21538|35931->21552|36347->21940|36385->21968|36426->21970|36471->21986|36583->22070|36600->22076|36635->22088|36707->22141|36721->22146|36761->22147|36806->22163|36979->22308|37014->22326|37055->22328|37116->22361|37151->22386|37192->22388|37229->22397|37279->22436|37321->22438|37374->22458|37405->22460|37420->22464|37452->22473|37495->22483|37545->22501|37591->22518|37703->22598|37746->22612|38094->22932|38132->22960|38173->22962|38218->22978|38332->23063|38349->23069|38385->23082|38457->23135|38471->23140|38511->23141|38556->23157|38734->23307|38773->23329|38814->23331|38875->23364|38926->23405|38967->23407|39004->23416|39053->23454|39095->23456|39148->23476|39179->23478|39196->23484|39224->23489|39267->23499|39317->23517|39362->23533|39474->23613|39517->23627|39933->24015|39971->24043|40012->24045|40057->24061|40169->24145|40186->24151|40221->24163|40293->24216|40307->24221|40347->24222|40392->24238|40565->24383|40600->24401|40641->24403|40702->24436|40737->24461|40778->24463|40815->24472|40865->24511|40907->24513|40960->24533|40991->24535|41006->24539|41038->24548|41081->24558|41131->24576|41177->24593|41289->24673|41332->24687|41733->25059|41750->25065|41788->25080|41820->25083|41859->25111|41900->25112|41931->25113|41974->25123|42475->25595|42517->25626|42549->25628|42639->25693|42671->25696|42710->25724|42751->25725|42782->25726|42825->25736|43263->26145|43309->26180|43341->26182|43435->26251|43467->26254|43506->26282|43547->26283|43578->26284|43621->26294|44115->26759|44160->26793|44192->26795|44285->26863|44702->27252|44719->27258|44762->27278|45248->27737|45292->27764|45333->27766|45370->27775|45429->27806|45470->27837|45501->27839|45599->27912|45659->27944|45676->27951|45705->27958|45765->27990|45782->27997|45812->28005|45872->28034|45914->28048|46080->28187|46120->28217|46161->28219|46196->28226|46283->28285|46303->28295|46345->28315|46390->28329|46423->28334|46566->28449|46606->28467|46644->28478|46683->28507|46724->28509|46759->28516|46822->28551|46838->28557|46870->28567|46967->28633|47000->28638|47110->28721|47151->28745|47192->28747|47227->28754|47272->28771|47287->28776|47316->28783|47346->28784|47376->28786|47391->28791|47425->28803|47467->28817|47482->28822|47517->28835|47559->28849|47574->28854|47606->28863|47647->28875|47663->28880|47695->28889|47733->28898|47749->28903|47781->28912|47838->28938|47877->28949
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|37->7|37->7|39->9|39->9|41->11|41->11|41->11|65->35|65->35|65->35|65->35|65->35|65->35|65->35|65->35|75->45|75->45|75->45|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|80->50|80->50|80->50|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|81->51|82->52|83->53|85->55|86->56|98->68|98->68|98->68|98->68|98->68|98->68|98->68|98->68|108->78|108->78|108->78|109->79|109->79|109->79|109->79|110->80|110->80|110->80|111->81|111->81|111->81|111->81|111->81|111->81|113->83|113->83|113->83|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|114->84|115->85|116->86|118->88|119->89|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|142->112|142->112|142->112|142->112|142->112|142->112|142->112|142->112|152->122|152->122|152->122|153->123|153->123|153->123|153->123|154->124|154->124|154->124|155->125|157->127|157->127|157->127|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|158->128|159->129|160->130|162->132|163->133|174->144|174->144|174->144|174->144|174->144|174->144|174->144|174->144|174->144|185->155|185->155|185->155|186->156|186->156|186->156|186->156|187->157|187->157|187->157|188->158|190->160|190->160|190->160|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|191->161|192->162|193->163|195->165|196->166|211->181|211->181|211->181|212->182|212->182|212->182|212->182|213->183|213->183|213->183|214->184|216->186|216->186|216->186|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|217->187|218->188|219->189|221->191|222->192|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|231->201|244->214|244->214|244->214|245->215|245->215|245->215|245->215|246->216|246->216|246->216|247->217|249->219|249->219|249->219|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|250->220|251->221|252->222|254->224|255->225|266->236|266->236|266->236|267->237|267->237|267->237|267->237|268->238|268->238|268->238|269->239|271->241|271->241|271->241|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|272->242|273->243|274->244|276->246|277->247|290->260|290->260|290->260|291->261|291->261|291->261|291->261|292->262|292->262|292->262|293->263|295->265|295->265|295->265|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|296->266|297->267|298->268|300->270|301->271|312->282|312->282|312->282|313->283|313->283|313->283|313->283|314->284|314->284|314->284|315->285|317->287|317->287|317->287|318->288|318->288|318->288|318->288|318->288|318->288|318->288|318->288|318->288|318->288|318->288|319->289|320->290|322->292|323->293|336->306|336->306|336->306|337->307|337->307|337->307|337->307|338->308|338->308|338->308|339->309|341->311|341->311|341->311|342->312|342->312|342->312|342->312|342->312|342->312|342->312|342->312|342->312|342->312|342->312|343->313|344->314|346->316|347->317|356->326|356->326|356->326|356->326|356->326|356->326|356->326|356->326|367->337|367->337|367->337|367->337|367->337|367->337|367->337|367->337|367->337|376->346|376->346|376->346|376->346|376->346|376->346|376->346|376->346|376->346|387->357|387->357|387->357|387->357|387->357|387->357|387->357|387->357|387->357|396->366|396->366|396->366|396->366|396->366|396->366|396->366|396->366|410->380|410->380|410->380|411->381|411->381|411->381|411->381|412->382|412->382|412->382|413->383|415->385|415->385|415->385|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|416->386|417->387|418->388|420->390|421->391|430->400|430->400|430->400|430->400|430->400|430->400|430->400|430->400|430->400|443->413|443->413|443->413|444->414|444->414|444->414|444->414|445->415|445->415|445->415|446->416|448->418|448->418|448->418|449->419|449->419|449->419|449->419|449->419|449->419|449->419|449->419|449->419|449->419|449->419|450->420|451->421|453->423|454->424|465->435|465->435|465->435|466->436|466->436|466->436|466->436|467->437|467->437|467->437|468->438|469->439|469->439|469->439|470->440|470->440|470->440|470->440|470->440|470->440|470->440|470->440|470->440|470->440|470->440|471->441|472->442|474->444|475->445|488->458|488->458|488->458|489->459|489->459|489->459|489->459|490->460|490->460|490->460|491->461|493->463|493->463|493->463|494->464|494->464|494->464|494->464|494->464|494->464|494->464|494->464|494->464|494->464|494->464|495->465|496->466|498->468|499->469|510->480|510->480|510->480|511->481|511->481|511->481|511->481|512->482|512->482|512->482|513->483|515->485|515->485|515->485|516->486|516->486|516->486|516->486|516->486|516->486|516->486|516->486|516->486|516->486|516->486|517->487|518->488|520->490|521->491|534->504|534->504|534->504|535->505|535->505|535->505|535->505|536->506|536->506|536->506|537->507|539->509|539->509|539->509|540->510|540->510|540->510|540->510|540->510|540->510|540->510|540->510|540->510|540->510|540->510|541->511|542->512|544->514|545->515|554->524|554->524|554->524|554->524|554->524|554->524|554->524|554->524|565->535|565->535|565->535|565->535|565->535|565->535|565->535|565->535|565->535|574->544|574->544|574->544|574->544|574->544|574->544|574->544|574->544|574->544|585->555|585->555|585->555|585->555|594->564|594->564|594->564|606->576|606->576|606->576|607->577|608->578|608->578|608->578|608->578|609->579|609->579|609->579|610->580|610->580|610->580|612->582|613->583|621->591|621->591|621->591|622->592|622->592|622->592|622->592|623->593|624->594|627->597|627->597|628->598|628->598|628->598|629->599|629->599|629->599|629->599|630->600|631->601|634->604|634->604|634->604|635->605|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|636->606|638->608|639->609
                  -- GENERATED --
              */
          