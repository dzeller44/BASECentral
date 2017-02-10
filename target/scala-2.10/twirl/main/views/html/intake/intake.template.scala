
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
										<label class="title"><span></span>BA Assigned:</label>
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
										<label class="title"><span></span>BA Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="bataskstatus">
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
										<label class="title"><span></span>SE Manager:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="semanager">
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
										<label class="title"><span></span>SE Assigned:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="seassigned">
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
										<label class="title"><span></span>SE Deliverable:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="sedeliverable">
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
										<label class="title"><span></span>SE Task Status:</label>
										<div class="item-cont">
											<div class="large">
												<span>
													<select name="setaskstatus">
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
			<div class="element-input">
				"""),_display_(/*471.6*/if(intakeForm.hasGlobalErrors)/*471.36*/ {_display_(Seq[Any](format.raw/*471.38*/("""
					"""),format.raw/*472.6*/("""<span class="errorMessageDisplay" style="color: #d9534f;">"""),_display_(/*472.65*/intakeForm/*472.75*/.globalError.message),format.raw/*472.95*/("""</span>
				""")))}),format.raw/*473.6*/("""
			"""),format.raw/*474.4*/("""</div>
			<div class="submit">
				<input type="submit" value="Submit" />
				<a href="/" class="buttonCancel">"""),_display_(/*477.39*/Messages("goback")),format.raw/*477.57*/("""</a>
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
                  DATE: Fri Feb 10 14:19:21 MST 2017
                  SOURCE: C:/WebDev/workspace/BASECentral/app/views/intake/intake.scala.html
                  HASH: 29fb1cc01416813c9334d7ce527c13745df62a35
                  MATRIX: 819->1|1018->104|1048->109|1066->119|1105->121|1134->124|1223->186|1251->187|1280->190|1389->272|1417->273|1450->280|1505->308|1533->309|1571->320|1833->554|1862->555|1905->570|2006->643|2035->644|2082->663|2139->692|2168->693|2207->704|2236->705|2306->748|2334->749|2364->752|2392->753|2458->791|2487->792|2518->796|2622->873|2650->874|2714->910|2743->911|2774->915|2877->991|2905->992|2970->1029|2999->1030|3030->1034|3133->1110|3161->1111|3195->1118|3223->1119|4970->2839|5008->2861|5048->2863|5093->2881|5143->2922|5183->2924|5229->2942|5272->2958|5287->2964|5313->2969|5343->2972|5358->2978|5384->2983|5442->3010|5490->3027|5534->3043|6545->4026|6584->4048|6625->4050|6671->4068|6714->4101|6755->4103|6802->4121|6846->4137|6862->4143|6889->4148|6920->4151|6936->4157|6963->4162|7022->4189|7071->4206|7116->4222|8603->5681|8642->5703|8683->5705|8729->5723|8780->5764|8821->5766|8868->5784|8912->5800|8928->5806|8955->5811|8986->5814|9002->5820|9029->5825|9088->5852|9137->5869|9182->5885|10212->6887|10251->6909|10292->6911|10338->6929|10386->6967|10427->6969|10474->6987|10518->7003|10534->7009|10561->7014|10592->7017|10608->7023|10635->7028|10694->7055|10743->7072|10788->7088|11485->7757|11520->7775|11561->7777|11607->7795|11650->7828|11691->7830|11738->7848|11782->7864|11796->7868|11827->7877|11858->7880|11872->7884|11903->7893|11962->7920|12011->7937|12056->7953|13074->8943|13109->8961|13150->8963|13196->8981|13231->9006|13272->9008|13319->9026|13363->9042|13377->9046|13408->9055|13439->9058|13453->9062|13484->9071|13543->9098|13592->9115|13637->9131|14215->9681|14254->9703|14295->9705|14341->9723|14392->9764|14433->9766|14480->9784|14524->9800|14540->9806|14567->9811|14598->9814|14614->9820|14641->9825|14700->9852|14749->9869|14794->9885|15437->10500|15476->10522|15517->10524|15563->10542|15614->10583|15655->10585|15702->10603|15746->10619|15762->10625|15789->10630|15820->10633|15836->10639|15863->10644|15922->10671|15971->10688|16016->10704|18835->13495|18870->13513|18911->13515|18957->13533|19000->13566|19041->13568|19088->13586|19132->13602|19146->13606|19177->13615|19208->13618|19222->13622|19253->13631|19312->13658|19361->13675|19406->13691|20424->14681|20459->14699|20500->14701|20546->14719|20581->14744|20622->14746|20669->14764|20713->14780|20727->14784|20758->14793|20789->14796|20803->14800|20834->14809|20893->14836|20942->14853|20987->14869|21565->15419|21604->15441|21645->15443|21691->15461|21742->15502|21783->15504|21830->15522|21874->15538|21890->15544|21917->15549|21948->15552|21964->15558|21991->15563|22050->15590|22099->15607|22143->15622|22786->16237|22825->16259|22866->16261|22912->16279|22963->16320|23004->16322|23051->16340|23095->16356|23111->16362|23138->16367|23169->16370|23185->16376|23212->16381|23271->16408|23320->16425|23364->16440|24905->17954|24945->17984|24986->17986|25021->17993|25108->18052|25128->18062|25170->18082|25215->18096|25248->18101|25391->18216|25431->18234
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6|38->7|38->7|39->8|39->8|39->8|40->9|44->13|44->13|45->14|46->15|46->15|47->16|48->17|48->17|49->18|49->18|52->21|52->21|53->22|53->22|56->25|56->25|57->26|59->28|59->28|61->30|61->30|62->31|64->33|64->33|66->35|66->35|67->36|69->38|69->38|71->40|71->40|108->77|108->77|108->77|109->78|109->78|109->78|110->79|110->79|110->79|110->79|110->79|110->79|110->79|111->80|112->81|113->82|139->108|139->108|139->108|140->109|140->109|140->109|141->110|141->110|141->110|141->110|141->110|141->110|141->110|142->111|143->112|144->113|181->150|181->150|181->150|182->151|182->151|182->151|183->152|183->152|183->152|183->152|183->152|183->152|183->152|184->153|185->154|186->155|212->181|212->181|212->181|213->182|213->182|213->182|214->183|214->183|214->183|214->183|214->183|214->183|214->183|215->184|216->185|217->186|236->205|236->205|236->205|237->206|237->206|237->206|238->207|238->207|238->207|238->207|238->207|238->207|238->207|239->208|240->209|241->210|267->236|267->236|267->236|268->237|268->237|268->237|269->238|269->238|269->238|269->238|269->238|269->238|269->238|270->239|271->240|272->241|287->256|287->256|287->256|288->257|288->257|288->257|289->258|289->258|289->258|289->258|289->258|289->258|289->258|290->259|291->260|292->261|309->278|309->278|309->278|310->279|310->279|310->279|311->280|311->280|311->280|311->280|311->280|311->280|311->280|312->281|313->282|314->283|382->351|382->351|382->351|383->352|383->352|383->352|384->353|384->353|384->353|384->353|384->353|384->353|384->353|385->354|386->355|387->356|413->382|413->382|413->382|414->383|414->383|414->383|415->384|415->384|415->384|415->384|415->384|415->384|415->384|416->385|417->386|418->387|433->402|433->402|433->402|434->403|434->403|434->403|435->404|435->404|435->404|435->404|435->404|435->404|435->404|436->405|437->406|438->407|455->424|455->424|455->424|456->425|456->425|456->425|457->426|457->426|457->426|457->426|457->426|457->426|457->426|458->427|459->428|460->429|502->471|502->471|502->471|503->472|503->472|503->472|503->472|504->473|505->474|508->477|508->477
                  -- GENERATED --
              */
          