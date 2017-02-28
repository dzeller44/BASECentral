
package views.html.intake

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object intake_Scope0 {
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

class intake extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[Application.IntakeAdd],java.util.List[Lookup],java.util.List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(intakeForm: Form[Application.IntakeAdd], lookups: java.util.List[Lookup], users: java.util.List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.105*/("""

"""),_display_(/*3.2*/main(null)/*3.12*/ {_display_(Seq[Any](format.raw/*3.14*/("""
	"""),format.raw/*4.2*/("""<script type="text/javascript">
	$(document).ready(function()"""),format.raw/*5.30*/("""{"""),format.raw/*5.31*/("""
	"""),format.raw/*6.2*/("""var validator = $("#intakeForm").validate();
	var tabs = $("#mainFormTabs").tabs("""),format.raw/*7.37*/("""{"""),format.raw/*7.38*/("""
	    """),format.raw/*8.6*/("""select: function(event, ui) """),format.raw/*8.34*/("""{"""),format.raw/*8.35*/("""
	        """),format.raw/*9.10*/("""var valid = true;
	        var current = $(this).tabs("option", "selected");
	        var panelId = $("#mainFormTabs ul a").eq(current).attr("href");
	        console.log("HERE");
	        $(panelId).find("input").each(function() """),format.raw/*13.51*/("""{"""),format.raw/*13.52*/("""
	            """),format.raw/*14.14*/("""console.log(valid);
	            if (!validator.element(this) && valid) """),format.raw/*15.53*/("""{"""),format.raw/*15.54*/("""
	                """),format.raw/*16.18*/("""valid = false;
	            """),format.raw/*17.14*/("""}"""),format.raw/*17.15*/("""
	        """),format.raw/*18.10*/("""}"""),format.raw/*18.11*/(""");
	       
	        return valid;
	    """),format.raw/*21.6*/("""}"""),format.raw/*21.7*/("""
	"""),format.raw/*22.2*/("""}"""),format.raw/*22.3*/(""");


	$("#BATab").click(function() """),format.raw/*25.31*/("""{"""),format.raw/*25.32*/("""
		"""),format.raw/*26.3*/("""console.log("BA");
	        $("#mainFormTabs").tabs("select", this.hash);
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/(""");

	$("#SETab").click(function() """),format.raw/*30.31*/("""{"""),format.raw/*30.32*/("""
		"""),format.raw/*31.3*/("""console.log("SE");
        $("#mainFormTabs").tabs("select", this.hash);
	"""),format.raw/*33.2*/("""}"""),format.raw/*33.3*/(""");
	
	$("#PRTab").click(function() """),format.raw/*35.31*/("""{"""),format.raw/*35.32*/("""
		"""),format.raw/*36.3*/("""console.log("PR");
        $("#mainFormTabs").tabs("select", this.hash);
	"""),format.raw/*38.2*/("""}"""),format.raw/*38.3*/(""");

	"""),format.raw/*40.2*/("""}"""),format.raw/*40.3*/(""");

	</script>
	<section id="profileMain">
		<form class="formoid-solid-dark" id="intakeForm"
			style="background-color: #FFFFFF; font-size: 14px; font-family: 'Trebuchet MS','Roboto', Arial, Helvetica, sans-serif; color: #34495E; max-width: 800px; min-width: 150px"
			method="post" action="">
			<div class="title">
				<h2>Intake Request</h2>
			</div>
			<div id="mainFormTabs" class="container">
				<ul class="nav nav-pills">
					<li class="active"><a data-toggle="tab" id="PRTab" href="#tabPR">Project Info</a></li>
					<li><a data-toggle="tab" id="BATab" href="#tabBA">BA Info</a></li>
					<li><a data-toggle="tab" id="SETab" href="#tabSE">SE Info</a></li>
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
												placeholder="Enter Project ID..." /><span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Project Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="projectstatus">
														<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
														"""),_display_(/*77.16*/for(lookup <- lookups) yield /*77.38*/ {_display_(Seq[Any](format.raw/*77.40*/("""
															"""),_display_(/*78.17*/if(lookup.lookuptype == "Project Status")/*78.58*/ {_display_(Seq[Any](format.raw/*78.60*/("""
																"""),format.raw/*79.17*/("""<option value=""""),_display_(/*79.33*/lookup/*79.39*/.name),format.raw/*79.44*/("""">"""),_display_(/*79.47*/lookup/*79.53*/.name),format.raw/*79.58*/("""</option>
															""")))}),format.raw/*80.17*/("""
														""")))}),format.raw/*81.16*/("""	
													"""),format.raw/*82.14*/("""</select>
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
										<label class="title"><span></span>Project Name:</label>
										<div class="item-cont">
											<input class="large" type="text" name="projectname"
												placeholder="Enter Project Name..." /><span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Requesting Agency:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="agency">
														<option selected="selected" value="" disabled="disabled">--- Select Agency ---</option>
														"""),_display_(/*108.16*/for(lookup <- lookups) yield /*108.38*/ {_display_(Seq[Any](format.raw/*108.40*/("""
															"""),_display_(/*109.17*/if(lookup.lookuptype == "Agency")/*109.50*/ {_display_(Seq[Any](format.raw/*109.52*/("""
																"""),format.raw/*110.17*/("""<option value=""""),_display_(/*110.33*/lookup/*110.39*/.name),format.raw/*110.44*/("""">"""),_display_(/*110.47*/lookup/*110.53*/.name),format.raw/*110.58*/("""</option>
															""")))}),format.raw/*111.17*/("""
														""")))}),format.raw/*112.16*/("""	
													"""),format.raw/*113.14*/("""</select>
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
										<label class="title"><span></span>Request Summary:</label>
										<div class="item-cont">
											<textarea class="medium" type="text" name="summary" required="required" placeholder="Enter Request Summary..." /></textarea>
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
												placeholder="Enter Requestor..." /><span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Request Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="requeststatus">
														<option selected="selected" value="" disabled="disabled">--- Select status ---</option>
														"""),_display_(/*150.16*/for(lookup <- lookups) yield /*150.38*/ {_display_(Seq[Any](format.raw/*150.40*/("""
															"""),_display_(/*151.17*/if(lookup.lookuptype == "Request Status")/*151.58*/ {_display_(Seq[Any](format.raw/*151.60*/("""
																"""),format.raw/*152.17*/("""<option value=""""),_display_(/*152.33*/lookup/*152.39*/.name),format.raw/*152.44*/("""">"""),_display_(/*152.47*/lookup/*152.53*/.name),format.raw/*152.58*/("""</option>
															""")))}),format.raw/*153.17*/("""
														""")))}),format.raw/*154.16*/("""	
													"""),format.raw/*155.14*/("""</select>
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
											<input class="large" data-format="mm/dd/yyyy" type="date" name="daterequested" placeholder="Date"/>
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
													<select name="howrequested">
														<option selected="selected" value="" disabled="disabled">--- Select How Requested ---</option>
														"""),_display_(/*181.16*/for(lookup <- lookups) yield /*181.38*/ {_display_(Seq[Any](format.raw/*181.40*/("""
															"""),_display_(/*182.17*/if(lookup.lookuptype == "Intake Type")/*182.55*/ {_display_(Seq[Any](format.raw/*182.57*/("""
																"""),format.raw/*183.17*/("""<option value=""""),_display_(/*183.33*/lookup/*183.39*/.name),format.raw/*183.44*/("""">"""),_display_(/*183.47*/lookup/*183.53*/.name),format.raw/*183.58*/("""</option>
															""")))}),format.raw/*184.17*/("""
														""")))}),format.raw/*185.16*/("""	
													"""),format.raw/*186.14*/("""</select>
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
										<label class="title"><span></span>BA Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="bamanager">
														<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
														"""),_display_(/*205.16*/for(user <- users) yield /*205.34*/ {_display_(Seq[Any](format.raw/*205.36*/("""
															"""),_display_(/*206.17*/if(user.rolename == "BA Manager")/*206.50*/ {_display_(Seq[Any](format.raw/*206.52*/("""
																"""),format.raw/*207.17*/("""<option value=""""),_display_(/*207.33*/user/*207.37*/.fullname),format.raw/*207.46*/("""">"""),_display_(/*207.49*/user/*207.53*/.fullname),format.raw/*207.62*/("""</option>
															""")))}),format.raw/*208.17*/("""
														""")))}),format.raw/*209.16*/("""	
													"""),format.raw/*210.14*/("""</select>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="baassigneddate" placeholder="Date"/>
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
													<select name="baassigned">
														<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
														"""),_display_(/*236.16*/for(user <- users) yield /*236.34*/ {_display_(Seq[Any](format.raw/*236.36*/("""
															"""),_display_(/*237.17*/if(user.rolename == "BA")/*237.42*/ {_display_(Seq[Any](format.raw/*237.44*/("""
																"""),format.raw/*238.17*/("""<option value=""""),_display_(/*238.33*/user/*238.37*/.fullname),format.raw/*238.46*/("""">"""),_display_(/*238.49*/user/*238.53*/.fullname),format.raw/*238.62*/("""</option>
															""")))}),format.raw/*239.17*/("""
														""")))}),format.raw/*240.16*/("""	
													"""),format.raw/*241.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
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
													<select name="badeliverable">
														<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
														"""),_display_(/*256.16*/for(lookup <- lookups) yield /*256.38*/ {_display_(Seq[Any](format.raw/*256.40*/("""
															"""),_display_(/*257.17*/if(lookup.lookuptype == "BA Deliverable")/*257.58*/ {_display_(Seq[Any](format.raw/*257.60*/("""
																"""),format.raw/*258.17*/("""<option value=""""),_display_(/*258.33*/lookup/*258.39*/.name),format.raw/*258.44*/("""">"""),_display_(/*258.47*/lookup/*258.53*/.name),format.raw/*258.58*/("""</option>
															""")))}),format.raw/*259.17*/("""
														""")))}),format.raw/*260.16*/("""	
													"""),format.raw/*261.14*/("""</select>
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
										<label class="title"><span></span>BA Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="baassigned1">
														<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
														"""),_display_(/*278.16*/for(user <- users) yield /*278.34*/ {_display_(Seq[Any](format.raw/*278.36*/("""
															"""),_display_(/*279.17*/if(user.rolename == "BA")/*279.42*/ {_display_(Seq[Any](format.raw/*279.44*/("""
																"""),format.raw/*280.17*/("""<option value=""""),_display_(/*280.33*/user/*280.37*/.fullname),format.raw/*280.46*/("""">"""),_display_(/*280.49*/user/*280.53*/.fullname),format.raw/*280.62*/("""</option>
															""")))}),format.raw/*281.17*/("""
														""")))}),format.raw/*282.16*/("""	
													"""),format.raw/*283.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
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
													<select name="bataskstatus">
														<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
														"""),_display_(/*298.16*/for(lookup <- lookups) yield /*298.38*/ {_display_(Seq[Any](format.raw/*298.40*/("""
															"""),_display_(/*299.17*/if(lookup.lookuptype == "BA Task Status")/*299.58*/ {_display_(Seq[Any](format.raw/*299.60*/("""
																"""),format.raw/*300.17*/("""<option value=""""),_display_(/*300.33*/lookup/*300.39*/.name),format.raw/*300.44*/("""">"""),_display_(/*300.47*/lookup/*300.53*/.name),format.raw/*300.58*/("""</option>
															""")))}),format.raw/*301.17*/("""
														""")))}),format.raw/*302.16*/("""	
													"""),format.raw/*303.14*/("""</select>
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
										<label class="title"><span></span>BA Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="baassigned2">
														<option selected="selected" value="" disabled="disabled">--- Select BA ---</option>
														"""),_display_(/*320.16*/for(user <- users) yield /*320.34*/ {_display_(Seq[Any](format.raw/*320.36*/("""
															"""),_display_(/*321.17*/if(user.rolename == "BA")/*321.42*/ {_display_(Seq[Any](format.raw/*321.44*/("""
																"""),format.raw/*322.17*/("""<option value=""""),_display_(/*322.33*/user/*322.37*/.fullname),format.raw/*322.46*/("""">"""),_display_(/*322.49*/user/*322.53*/.fullname),format.raw/*322.62*/("""</option>
															""")))}),format.raw/*323.17*/("""
														""")))}),format.raw/*324.16*/("""	
													"""),format.raw/*325.14*/("""</select>
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
											<input class="large" type="text" min="0" max="500" name="batimeestimate" placeholder="Number" value=""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="batargetdate" placeholder="Date"/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>BA Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="bacompletiondate" placeholder="Date"/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="initialmeetdate" placeholder="Date"/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-select">
										<label class="title"><span></span>Initial Customer Meeting Comments:</label>
										<div class="item-cont">
											<input class="large" type="text" name="initialmeetcomments"
												placeholder="Enter Comments..." /><span class="icon-place"></span>
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
													<select name="semanager">
														<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
														"""),_display_(/*393.16*/for(user <- users) yield /*393.34*/ {_display_(Seq[Any](format.raw/*393.36*/("""
															"""),_display_(/*394.17*/if(user.rolename == "SE Manager")/*394.50*/ {_display_(Seq[Any](format.raw/*394.52*/("""
																"""),format.raw/*395.17*/("""<option value=""""),_display_(/*395.33*/user/*395.37*/.fullname),format.raw/*395.46*/("""">"""),_display_(/*395.49*/user/*395.53*/.fullname),format.raw/*395.62*/("""</option>
															""")))}),format.raw/*396.17*/("""
														""")))}),format.raw/*397.16*/("""	
													"""),format.raw/*398.14*/("""</select>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="seassigneddate" placeholder="Date"/>
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
													<select name="seassigned">
														<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
														"""),_display_(/*424.16*/for(user <- users) yield /*424.34*/ {_display_(Seq[Any](format.raw/*424.36*/("""
															"""),_display_(/*425.17*/if(user.rolename == "SE")/*425.42*/ {_display_(Seq[Any](format.raw/*425.44*/("""
																"""),format.raw/*426.17*/("""<option value=""""),_display_(/*426.33*/user/*426.37*/.fullname),format.raw/*426.46*/("""">"""),_display_(/*426.49*/user/*426.53*/.fullname),format.raw/*426.62*/("""</option>
															""")))}),format.raw/*427.17*/("""
														""")))}),format.raw/*428.16*/("""	
													"""),format.raw/*429.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
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
													<select name="sedeliverable">
														<option selected="selected" value="" disabled="disabled">--- Select Deliverable ---</option>
														"""),_display_(/*444.16*/for(lookup <- lookups) yield /*444.38*/ {_display_(Seq[Any](format.raw/*444.40*/("""
															"""),_display_(/*445.17*/if(lookup.lookuptype == "SE Deliverable")/*445.58*/ {_display_(Seq[Any](format.raw/*445.60*/("""
																"""),format.raw/*446.17*/("""<option value=""""),_display_(/*446.33*/lookup/*446.39*/.name),format.raw/*446.44*/("""">"""),_display_(/*446.47*/lookup/*446.53*/.name),format.raw/*446.58*/("""</option>
															""")))}),format.raw/*447.17*/("""
														""")))}),format.raw/*448.16*/("""
													"""),format.raw/*449.14*/("""</select>
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
										<label class="title"><span></span>SE Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="seassigned1">
														<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
														"""),_display_(/*466.16*/for(user <- users) yield /*466.34*/ {_display_(Seq[Any](format.raw/*466.36*/("""
															"""),_display_(/*467.17*/if(user.rolename == "SE")/*467.42*/ {_display_(Seq[Any](format.raw/*467.44*/("""
																"""),format.raw/*468.17*/("""<option value=""""),_display_(/*468.33*/user/*468.37*/.fullname),format.raw/*468.46*/("""">"""),_display_(/*468.49*/user/*468.53*/.fullname),format.raw/*468.62*/("""</option>
															""")))}),format.raw/*469.17*/("""
														""")))}),format.raw/*470.16*/("""	
													"""),format.raw/*471.14*/("""</select>
													<i></i><span class="icon-place"></span>
												</span>
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
													<select name="setaskstatus">
														<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
														"""),_display_(/*486.16*/for(lookup <- lookups) yield /*486.38*/ {_display_(Seq[Any](format.raw/*486.40*/("""
															"""),_display_(/*487.17*/if(lookup.lookuptype == "SE Task Status")/*487.58*/ {_display_(Seq[Any](format.raw/*487.60*/("""
																"""),format.raw/*488.17*/("""<option value=""""),_display_(/*488.33*/lookup/*488.39*/.name),format.raw/*488.44*/("""">"""),_display_(/*488.47*/lookup/*488.53*/.name),format.raw/*488.58*/("""</option>
															""")))}),format.raw/*489.17*/("""
														""")))}),format.raw/*490.16*/("""
													"""),format.raw/*491.14*/("""</select>
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
										<label class="title"><span></span>SE Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="seassigned2">
														<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
														"""),_display_(/*508.16*/for(user <- users) yield /*508.34*/ {_display_(Seq[Any](format.raw/*508.36*/("""
															"""),_display_(/*509.17*/if(user.rolename == "SE")/*509.42*/ {_display_(Seq[Any](format.raw/*509.44*/("""
																"""),format.raw/*510.17*/("""<option value=""""),_display_(/*510.33*/user/*510.37*/.fullname),format.raw/*510.46*/("""">"""),_display_(/*510.49*/user/*510.53*/.fullname),format.raw/*510.62*/("""</option>
															""")))}),format.raw/*511.17*/("""
														""")))}),format.raw/*512.16*/("""	
													"""),format.raw/*513.14*/("""</select>
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
											<input class="large" type="text" min="0" max="500" name="setimeestimate" placeholder="Number" value=""/>
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
											<input class="large" data-format="yyyy-mm-dd" type="date" name="setargetdate" placeholder="Date"/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="element-date">
										<label class="title"><span></span>SE Deliverable Completion Date:</label>
										<div class="item-cont">
											<input class="large" data-format="yyyy-mm-dd" type="date" name="secompletiondate" placeholder="Date"/>
											<span class="icon-place"></span>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="element-input">
				"""),_display_(/*555.6*/if(intakeForm.hasGlobalErrors)/*555.36*/ {_display_(Seq[Any](format.raw/*555.38*/("""
					"""),format.raw/*556.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*556.65*/intakeForm/*556.75*/.globalError.message),format.raw/*556.95*/("""</span>
				""")))}),format.raw/*557.6*/("""
			"""),format.raw/*558.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*561.39*/Messages("goback")),format.raw/*561.57*/("""</a>
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
object intake extends intake_Scope0.intake
              /*
                  -- GENERATED --
                  DATE: Tue Feb 28 14:07:16 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intake.scala.html
                  HASH: 9c4d1c7ab1b43ea91bf6e37e5ea5d2c25f71f8d5
                  MATRIX: 819->1|1018->104|1048->109|1066->119|1105->121|1134->124|1223->186|1251->187|1280->190|1389->272|1417->273|1450->280|1505->308|1533->309|1571->320|1833->554|1862->555|1905->570|2006->643|2035->644|2082->663|2139->692|2168->693|2207->704|2236->705|2306->748|2334->749|2364->752|2392->753|2458->791|2487->792|2518->796|2622->873|2650->874|2714->910|2743->911|2774->915|2877->991|2905->992|2970->1029|2999->1030|3030->1034|3133->1110|3161->1111|3195->1118|3223->1119|4970->2839|5008->2861|5048->2863|5093->2881|5143->2922|5183->2924|5229->2942|5272->2958|5287->2964|5313->2969|5343->2972|5358->2978|5384->2983|5442->3010|5490->3027|5534->3043|6545->4026|6584->4048|6625->4050|6671->4068|6714->4101|6755->4103|6802->4121|6846->4137|6862->4143|6889->4148|6920->4151|6936->4157|6963->4162|7022->4189|7071->4206|7116->4222|8603->5681|8642->5703|8683->5705|8729->5723|8780->5764|8821->5766|8868->5784|8912->5800|8928->5806|8955->5811|8986->5814|9002->5820|9029->5825|9088->5852|9137->5869|9182->5885|10212->6887|10251->6909|10292->6911|10338->6929|10386->6967|10427->6969|10474->6987|10518->7003|10534->7009|10561->7014|10592->7017|10608->7023|10635->7028|10694->7055|10743->7072|10788->7088|11485->7757|11520->7775|11561->7777|11607->7795|11650->7828|11691->7830|11738->7848|11782->7864|11796->7868|11827->7877|11858->7880|11872->7884|11903->7893|11962->7920|12011->7937|12056->7953|13084->8953|13119->8971|13160->8973|13206->8991|13241->9016|13282->9018|13329->9036|13373->9052|13387->9056|13418->9065|13449->9068|13463->9072|13494->9081|13553->9108|13602->9125|13647->9141|14225->9691|14264->9713|14305->9715|14351->9733|14402->9774|14443->9776|14490->9794|14534->9810|14550->9816|14577->9821|14608->9824|14624->9830|14651->9835|14710->9862|14759->9879|14804->9895|15439->10502|15474->10520|15515->10522|15561->10540|15596->10565|15637->10567|15684->10585|15728->10601|15742->10605|15773->10614|15804->10617|15818->10621|15849->10630|15908->10657|15957->10674|16002->10690|16574->11234|16613->11256|16654->11258|16700->11276|16751->11317|16792->11319|16839->11337|16883->11353|16899->11359|16926->11364|16957->11367|16973->11373|17000->11378|17059->11405|17108->11422|17153->11438|17788->12045|17823->12063|17864->12065|17910->12083|17945->12108|17986->12110|18033->12128|18077->12144|18091->12148|18122->12157|18153->12160|18167->12164|18198->12173|18257->12200|18306->12217|18351->12233|21170->15024|21205->15042|21246->15044|21292->15062|21335->15095|21376->15097|21423->15115|21467->15131|21481->15135|21512->15144|21543->15147|21557->15151|21588->15160|21647->15187|21696->15204|21741->15220|22769->16220|22804->16238|22845->16240|22891->16258|22926->16283|22967->16285|23014->16303|23058->16319|23072->16323|23103->16332|23134->16335|23148->16339|23179->16348|23238->16375|23287->16392|23332->16408|23910->16958|23949->16980|23990->16982|24036->17000|24087->17041|24128->17043|24175->17061|24219->17077|24235->17083|24262->17088|24293->17091|24309->17097|24336->17102|24395->17129|24444->17146|24488->17161|25123->17768|25158->17786|25199->17788|25245->17806|25280->17831|25321->17833|25368->17851|25412->17867|25426->17871|25457->17880|25488->17883|25502->17887|25533->17896|25592->17923|25641->17940|25686->17956|26258->18500|26297->18522|26338->18524|26384->18542|26435->18583|26476->18585|26523->18603|26567->18619|26583->18625|26610->18630|26641->18633|26657->18639|26684->18644|26743->18671|26792->18688|26836->18703|27471->19310|27506->19328|27547->19330|27593->19348|27628->19373|27669->19375|27716->19393|27760->19409|27774->19413|27805->19422|27836->19425|27850->19429|27881->19438|27940->19465|27989->19482|28034->19498|29575->21012|29615->21042|29656->21044|29691->21051|29778->21110|29798->21120|29840->21140|29885->21154|29918->21159|30061->21274|30101->21292
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|38->7|38->7|39->8|39->8|39->8|40->9|44->13|44->13|45->14|46->15|46->15|47->16|48->17|48->17|49->18|49->18|52->21|52->21|53->22|53->22|56->25|56->25|57->26|59->28|59->28|61->30|61->30|62->31|64->33|64->33|66->35|66->35|67->36|69->38|69->38|71->40|71->40|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|112->81|113->82|139->108|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|141->110|142->111|143->112|144->113|181->150|181->150|181->150|182->151|182->151|182->151|183->152|183->152|183->152|183->152|183->152|183->152|183->152|184->153|185->154|186->155|212->181|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183|214->183|214->183|214->183|214->183|215->184|216->185|217->186|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|238->207|238->207|238->207|238->207|239->208|240->209|241->210|267->236|267->236|267->236|268->237|268->237|268->237|269->238|269->238|269->238|269->238|269->238|269->238|269->238|270->239|271->240|272->241|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258|289->258|289->258|289->258|289->258|290->259|291->260|292->261|309->278|309->278|309->278|310->279|310->279|310->279|311->280|311->280|311->280|311->280|311->280|311->280|311->280|312->281|313->282|314->283|329->298|329->298|329->298|330->299|330->299|330->299|331->300|331->300|331->300|331->300|331->300|331->300|331->300|332->301|333->302|334->303|351->320|351->320|351->320|352->321|352->321|352->321|353->322|353->322|353->322|353->322|353->322|353->322|353->322|354->323|355->324|356->325|424->393|424->393|424->393|425->394|425->394|425->394|426->395|426->395|426->395|426->395|426->395|426->395|426->395|427->396|428->397|429->398|455->424|455->424|455->424|456->425|456->425|456->425|457->426|457->426|457->426|457->426|457->426|457->426|457->426|458->427|459->428|460->429|475->444|475->444|475->444|476->445|476->445|476->445|477->446|477->446|477->446|477->446|477->446|477->446|477->446|478->447|479->448|480->449|497->466|497->466|497->466|498->467|498->467|498->467|499->468|499->468|499->468|499->468|499->468|499->468|499->468|500->469|501->470|502->471|517->486|517->486|517->486|518->487|518->487|518->487|519->488|519->488|519->488|519->488|519->488|519->488|519->488|520->489|521->490|522->491|539->508|539->508|539->508|540->509|540->509|540->509|541->510|541->510|541->510|541->510|541->510|541->510|541->510|542->511|543->512|544->513|586->555|586->555|586->555|587->556|587->556|587->556|587->556|588->557|589->558|592->561|592->561
                  -- GENERATED --
              */
          