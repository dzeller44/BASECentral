
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
										<label class="title"><span class="required">*</span>Request Summary:</label>
										<div class="item-cont">
											<input class="large" type="text" name="summary" required="required"
												placeholder="Enter Request Summary..." /><span class="icon-place"></span>
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
										<label class="title"><span class="required">*</span>How Requested:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="howrequested" required="required">
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
										<label class="title"><span class="required">*</span>BA Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="bamanager" required="required">
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
										<label class="title"><span class="required">*</span>BA Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="baassigned" required="required">
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
										<label class="title"><span class="required">*</span>BA Deliverable:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="badeliverable" required="required">
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
										<label class="title"><span class="required">*</span>BA Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="bataskstatus" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Status ---</option>
														"""),_display_(/*278.16*/for(lookup <- lookups) yield /*278.38*/ {_display_(Seq[Any](format.raw/*278.40*/("""
															"""),_display_(/*279.17*/if(lookup.lookuptype == "BA Task Status")/*279.58*/ {_display_(Seq[Any](format.raw/*279.60*/("""
																"""),format.raw/*280.17*/("""<option value=""""),_display_(/*280.33*/lookup/*280.39*/.name),format.raw/*280.44*/("""">"""),_display_(/*280.47*/lookup/*280.53*/.name),format.raw/*280.58*/("""</option>
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
										<label class="title"><span class="required">*</span>SE Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="semanager" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select Manager ---</option>
														"""),_display_(/*351.16*/for(user <- users) yield /*351.34*/ {_display_(Seq[Any](format.raw/*351.36*/("""
															"""),_display_(/*352.17*/if(user.rolename == "SE Manager")/*352.50*/ {_display_(Seq[Any](format.raw/*352.52*/("""
																"""),format.raw/*353.17*/("""<option value=""""),_display_(/*353.33*/user/*353.37*/.fullname),format.raw/*353.46*/("""">"""),_display_(/*353.49*/user/*353.53*/.fullname),format.raw/*353.62*/("""</option>
															""")))}),format.raw/*354.17*/("""
														""")))}),format.raw/*355.16*/("""	
													"""),format.raw/*356.14*/("""</select>
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
										<label class="title"><span class="required">*</span>SE Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="seassigned" required="required">
														<option selected="selected" value="" disabled="disabled">--- Select SE ---</option>
														"""),_display_(/*382.16*/for(user <- users) yield /*382.34*/ {_display_(Seq[Any](format.raw/*382.36*/("""
															"""),_display_(/*383.17*/if(user.rolename == "SE")/*383.42*/ {_display_(Seq[Any](format.raw/*383.44*/("""
																"""),format.raw/*384.17*/("""<option value=""""),_display_(/*384.33*/user/*384.37*/.fullname),format.raw/*384.46*/("""">"""),_display_(/*384.49*/user/*384.53*/.fullname),format.raw/*384.62*/("""</option>
															""")))}),format.raw/*385.17*/("""
														""")))}),format.raw/*386.16*/("""	
													"""),format.raw/*387.14*/("""</select>
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
														"""),_display_(/*402.16*/for(lookup <- lookups) yield /*402.38*/ {_display_(Seq[Any](format.raw/*402.40*/("""
															"""),_display_(/*403.17*/if(lookup.lookuptype == "SE Deliverable")/*403.58*/ {_display_(Seq[Any](format.raw/*403.60*/("""
																"""),format.raw/*404.17*/("""<option value=""""),_display_(/*404.33*/lookup/*404.39*/.name),format.raw/*404.44*/("""">"""),_display_(/*404.47*/lookup/*404.53*/.name),format.raw/*404.58*/("""</option>
															""")))}),format.raw/*405.17*/("""
														""")))}),format.raw/*406.16*/("""
													"""),format.raw/*407.14*/("""</select>
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
														"""),_display_(/*424.16*/for(lookup <- lookups) yield /*424.38*/ {_display_(Seq[Any](format.raw/*424.40*/("""
															"""),_display_(/*425.17*/if(lookup.lookuptype == "SE Task Status")/*425.58*/ {_display_(Seq[Any](format.raw/*425.60*/("""
																"""),format.raw/*426.17*/("""<option value=""""),_display_(/*426.33*/lookup/*426.39*/.name),format.raw/*426.44*/("""">"""),_display_(/*426.47*/lookup/*426.53*/.name),format.raw/*426.58*/("""</option>
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
			<!-- End Container --> 
			<div class="element-input">
				"""),_display_(/*472.6*/if(intakeForm.hasGlobalErrors)/*472.36*/ {_display_(Seq[Any](format.raw/*472.38*/("""
				"""),format.raw/*473.5*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*473.64*/intakeForm/*473.74*/.globalError.message),format.raw/*473.94*/("""</span>
				""")))}),format.raw/*474.6*/("""
			"""),format.raw/*475.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*478.39*/Messages("goback")),format.raw/*478.57*/("""</a>
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
                  DATE: Mon Jan 30 10:30:34 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intake.scala.html
                  HASH: 400df89200fde9dc9b25da8c2a6748850be17394
                  MATRIX: 819->1|1018->104|1048->109|1066->119|1105->121|1134->124|1223->186|1251->187|1280->190|1389->272|1417->273|1450->280|1505->308|1533->309|1571->320|1833->554|1862->555|1905->570|2006->643|2035->644|2082->663|2139->692|2168->693|2207->704|2236->705|2306->748|2334->749|2364->752|2392->753|2458->791|2487->792|2518->796|2622->873|2650->874|2714->910|2743->911|2774->915|2877->991|2905->992|2970->1029|2999->1030|3030->1034|3133->1110|3161->1111|3195->1118|3223->1119|5046->2915|5084->2937|5124->2939|5169->2957|5219->2998|5259->3000|5305->3018|5348->3034|5363->3040|5389->3045|5419->3048|5434->3054|5460->3059|5518->3086|5566->3103|5610->3119|6697->4178|6736->4200|6777->4202|6823->4220|6866->4253|6907->4255|6954->4273|6998->4289|7014->4295|7041->4300|7072->4303|7088->4309|7115->4314|7174->4341|7223->4358|7268->4374|8834->5912|8873->5934|8914->5936|8960->5954|9011->5995|9052->5997|9099->6015|9143->6031|9159->6037|9186->6042|9217->6045|9233->6051|9260->6056|9319->6083|9368->6100|9413->6116|10481->7156|10520->7178|10561->7180|10607->7198|10655->7236|10696->7238|10743->7256|10787->7272|10803->7278|10830->7283|10861->7286|10877->7292|10904->7297|10963->7324|11012->7341|11057->7357|11792->8064|11827->8082|11868->8084|11914->8102|11957->8135|11998->8137|12045->8155|12089->8171|12103->8175|12134->8184|12165->8187|12179->8191|12210->8200|12269->8227|12318->8244|12363->8260|13419->9288|13454->9306|13495->9308|13541->9326|13576->9351|13617->9353|13664->9371|13708->9387|13722->9391|13753->9400|13784->9403|13798->9407|13829->9416|13888->9443|13937->9460|13982->9476|14598->10064|14637->10086|14678->10088|14724->10106|14775->10147|14816->10149|14863->10167|14907->10183|14923->10189|14950->10194|14981->10197|14997->10203|15024->10208|15083->10235|15132->10252|15177->10268|15858->10921|15897->10943|15938->10945|15984->10963|16035->11004|16076->11006|16123->11024|16167->11040|16183->11046|16210->11051|16241->11054|16257->11060|16284->11065|16343->11092|16392->11109|16437->11125|19294->13954|19329->13972|19370->13974|19416->13992|19459->14025|19500->14027|19547->14045|19591->14061|19605->14065|19636->14074|19667->14077|19681->14081|19712->14090|19771->14117|19820->14134|19865->14150|20921->15178|20956->15196|20997->15198|21043->15216|21078->15241|21119->15243|21166->15261|21210->15277|21224->15281|21255->15290|21286->15293|21300->15297|21331->15306|21390->15333|21439->15350|21484->15366|22100->15954|22139->15976|22180->15978|22226->15996|22277->16037|22318->16039|22365->16057|22409->16073|22425->16079|22452->16084|22483->16087|22499->16093|22526->16098|22585->16125|22634->16142|22678->16157|23359->16810|23398->16832|23439->16834|23485->16852|23536->16893|23577->16895|23624->16913|23668->16929|23684->16935|23711->16940|23742->16943|23758->16949|23785->16954|23844->16981|23893->16998|23937->17013|25506->18555|25546->18585|25587->18587|25621->18593|25708->18652|25728->18662|25770->18682|25815->18696|25848->18701|25991->18816|26031->18834
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|38->7|38->7|39->8|39->8|39->8|40->9|44->13|44->13|45->14|46->15|46->15|47->16|48->17|48->17|49->18|49->18|52->21|52->21|53->22|53->22|56->25|56->25|57->26|59->28|59->28|61->30|61->30|62->31|64->33|64->33|66->35|66->35|67->36|69->38|69->38|71->40|71->40|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|112->81|113->82|139->108|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|141->110|142->111|143->112|144->113|181->150|181->150|181->150|182->151|182->151|182->151|183->152|183->152|183->152|183->152|183->152|183->152|183->152|184->153|185->154|186->155|212->181|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183|214->183|214->183|214->183|214->183|215->184|216->185|217->186|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|238->207|238->207|238->207|238->207|239->208|240->209|241->210|267->236|267->236|267->236|268->237|268->237|268->237|269->238|269->238|269->238|269->238|269->238|269->238|269->238|270->239|271->240|272->241|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258|289->258|289->258|289->258|289->258|290->259|291->260|292->261|309->278|309->278|309->278|310->279|310->279|310->279|311->280|311->280|311->280|311->280|311->280|311->280|311->280|312->281|313->282|314->283|382->351|382->351|382->351|383->352|383->352|383->352|384->353|384->353|384->353|384->353|384->353|384->353|384->353|385->354|386->355|387->356|413->382|413->382|413->382|414->383|414->383|414->383|415->384|415->384|415->384|415->384|415->384|415->384|415->384|416->385|417->386|418->387|433->402|433->402|433->402|434->403|434->403|434->403|435->404|435->404|435->404|435->404|435->404|435->404|435->404|436->405|437->406|438->407|455->424|455->424|455->424|456->425|456->425|456->425|457->426|457->426|457->426|457->426|457->426|457->426|457->426|458->427|459->428|460->429|503->472|503->472|503->472|504->473|504->473|504->473|504->473|505->474|506->475|509->478|509->478
                  -- GENERATED --
              */
          