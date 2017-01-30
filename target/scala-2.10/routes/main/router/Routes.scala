
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/BASECentral/conf/routes
// @DATE:Mon Jan 30 10:30:31 MST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_6: controllers.Application,
  // @LINE:7
  Dashboard_2: controllers.Dashboard,
  // @LINE:51
  Signup_5: controllers.account.Signup,
  // @LINE:88
  Reset_0: controllers.account.Reset,
  // @LINE:94
  Index_7: controllers.account.settings.Index,
  // @LINE:95
  Password_1: controllers.account.settings.Password,
  // @LINE:97
  Email_3: controllers.account.settings.Email,
  // @LINE:118
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:7
    Dashboard_2: controllers.Dashboard,
    // @LINE:51
    Signup_5: controllers.account.Signup,
    // @LINE:88
    Reset_0: controllers.account.Reset,
    // @LINE:94
    Index_7: controllers.account.settings.Index,
    // @LINE:95
    Password_1: controllers.account.settings.Password,
    // @LINE:97
    Email_3: controllers.account.settings.Email,
    // @LINE:118
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_6, Dashboard_2, Signup_5, Reset_0, Index_7, Password_1, Email_3, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, Dashboard_2, Signup_5, Reset_0, Index_7, Password_1, Email_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.Dashboard.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Application.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contact()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contact""", """controllers.Application.contactSend()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.openLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Application.authenticate()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """accessdenied""", """controllers.Application.accessDenied()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.Application.userHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addintake""", """controllers.Application.addIntake()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addintake""", """controllers.Application.saveIntake()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchintake""", """controllers.Application.searchIntake()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filterintake""", """controllers.Application.filterIntake(type:String, value:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filtersearch""", """controllers.Application.filterIntake(type:String, value:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reports/$reportType<[^/]+>""", """controllers.Application.reportsCreate(reportType:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openintake/$intakekey<[^/]+>""", """controllers.Application.openIntake(intakekey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openintake/$intakekey<[^/]+>""", """controllers.Application.updateIntake(intakekey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteintake/$intakekey<[^/]+>""", """controllers.Application.deleteIntakeConfirm(intakekey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteintake/$intakekey<[^/]+>""", """controllers.Application.deleteIntake(intakekey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportintake/$data<[^/]+>""", """controllers.Application.exportIntake(data:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useraccount""", """controllers.Application.openUserAccount(email:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """useraccount""", """controllers.Application.updateUserAccount()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addcomments""", """controllers.Application.addComments(intakekey:String, comment:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Application.adminHome()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.account.Signup.createUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adduser""", """controllers.account.Signup.saveUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tablemaint""", """controllers.Application.lookupMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """adminuser""", """controllers.Application.userMaintenance()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Application.getAllUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchprojects""", """controllers.Application.getAllProjects()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """mainsearch/$searchText<[^/]+>""", """controllers.Application.getProjectsWilcard(searchText:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduser""", """controllers.Application.findUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduser""", """controllers.Application.getUserByEmailWildcard()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateuser""", """controllers.Application.updateUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportusers/$data<[^/]+>""", """controllers.Application.exportUsers(data:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """exportOpenFile/$fileName<[^/]+>""", """controllers.Application.exportOpenFile(fileName:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openuser""", """controllers.Application.openUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addlookup""", """controllers.Application.addLookup()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addlookup""", """controllers.Application.saveLookup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openlookup/$lookupkey<[^/]+>""", """controllers.Application.openLookup(lookupkey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """openlookup/$lookupkey<[^/]+>""", """controllers.Application.updateLookup(lookupkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """filterlookups""", """controllers.Application.filterLookups(type:String, value:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """finduserurl""", """controllers.Application.getUserByUrl(userkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/$userkey<[^/]+>""", """controllers.Application.deleteUserConfirm(userkey:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteuser/$userkey<[^/]+>""", """controllers.Application.deleteUser(userkey:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetuser/$token<[^/]+>""", """controllers.account.Reset.resetUser(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """resetuser/$token<[^/]+>""", """controllers.account.Reset.runResetUser(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """populatelookups""", """controllers.Application.populateLookups()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings""", """controllers.account.settings.Index.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/password""", """controllers.account.settings.Password.runPassword()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """settings/email""", """controllers.account.settings.Email.runEmail()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.create()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.account.Signup.save()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirm/$confirmToken<[^/]+>""", """controllers.account.Signup.confirm(confirmToken:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.ask()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/ask""", """controllers.account.Reset.runAsk()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.reset(token:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """reset/$token<[^/]+>""", """controllers.account.Reset.runReset(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """email/$token<[^/]+>""", """controllers.account.settings.Email.validateEmail(token:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_6.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Dashboard_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_Dashboard_index1_invoker = createInvoker(
    Dashboard_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Dashboard",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """dashboard"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_authenticate2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Application_authenticate2_invoker = createInvoker(
    Application_6.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_logout3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Application_logout3_invoker = createInvoker(
    Application_6.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Application_contact4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contact4_invoker = createInvoker(
    Application_6.contact(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contact",
      Nil,
      "GET",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_contactSend5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contact")))
  )
  private[this] lazy val controllers_Application_contactSend5_invoker = createInvoker(
    Application_6.contactSend(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "contactSend",
      Nil,
      "POST",
      """""",
      this.prefix + """contact"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_openLogin6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_openLogin6_invoker = createInvoker(
    Application_6.openLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openLogin",
      Nil,
      "GET",
      """ Authenticates/Logins the user...""",
      this.prefix + """auth"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_authenticate7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Application_authenticate7_invoker = createInvoker(
    Application_6.authenticate(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "authenticate",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_accessDenied8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("accessdenied")))
  )
  private[this] lazy val controllers_Application_accessDenied8_invoker = createInvoker(
    Application_6.accessDenied(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "accessDenied",
      Nil,
      "GET",
      """""",
      this.prefix + """accessdenied"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_userHome9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_Application_userHome9_invoker = createInvoker(
    Application_6.userHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userHome",
      Nil,
      "GET",
      """ User pages...""",
      this.prefix + """user"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_addIntake10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addintake")))
  )
  private[this] lazy val controllers_Application_addIntake10_invoker = createInvoker(
    Application_6.addIntake(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addIntake",
      Nil,
      "GET",
      """""",
      this.prefix + """addintake"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_saveIntake11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addintake")))
  )
  private[this] lazy val controllers_Application_saveIntake11_invoker = createInvoker(
    Application_6.saveIntake(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveIntake",
      Nil,
      "POST",
      """""",
      this.prefix + """addintake"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_searchIntake12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchintake")))
  )
  private[this] lazy val controllers_Application_searchIntake12_invoker = createInvoker(
    Application_6.searchIntake(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "searchIntake",
      Nil,
      "GET",
      """""",
      this.prefix + """searchintake"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_filterIntake13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filterintake")))
  )
  private[this] lazy val controllers_Application_filterIntake13_invoker = createInvoker(
    Application_6.filterIntake(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "filterIntake",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """filterintake"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_Application_filterIntake14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filtersearch")))
  )
  private[this] lazy val controllers_Application_filterIntake14_invoker = createInvoker(
    Application_6.filterIntake(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "filterIntake",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """filtersearch"""
    )
  )

  // @LINE:33
  private[this] lazy val controllers_Application_reportsCreate15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reports/"), DynamicPart("reportType", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_reportsCreate15_invoker = createInvoker(
    Application_6.reportsCreate(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "reportsCreate",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """reports/$reportType<[^/]+>"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Application_openIntake16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openintake/"), DynamicPart("intakekey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openIntake16_invoker = createInvoker(
    Application_6.openIntake(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openIntake",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """openintake/$intakekey<[^/]+>"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_Application_updateIntake17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openintake/"), DynamicPart("intakekey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateIntake17_invoker = createInvoker(
    Application_6.updateIntake(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateIntake",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """openintake/$intakekey<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_Application_deleteIntakeConfirm18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteintake/"), DynamicPart("intakekey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteIntakeConfirm18_invoker = createInvoker(
    Application_6.deleteIntakeConfirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteIntakeConfirm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteintake/$intakekey<[^/]+>"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Application_deleteIntake19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteintake/"), DynamicPart("intakekey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteIntake19_invoker = createInvoker(
    Application_6.deleteIntake(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteIntake",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deleteintake/$intakekey<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Application_exportIntake20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportintake/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportIntake20_invoker = createInvoker(
    Application_6.exportIntake(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportIntake",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """exportintake/$data<[^/]+>"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Application_openUserAccount21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useraccount")))
  )
  private[this] lazy val controllers_Application_openUserAccount21_invoker = createInvoker(
    Application_6.openUserAccount(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openUserAccount",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """useraccount"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_Application_updateUserAccount22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("useraccount")))
  )
  private[this] lazy val controllers_Application_updateUserAccount22_invoker = createInvoker(
    Application_6.updateUserAccount(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUserAccount",
      Nil,
      "POST",
      """""",
      this.prefix + """useraccount"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_Application_addComments23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addcomments")))
  )
  private[this] lazy val controllers_Application_addComments23_invoker = createInvoker(
    Application_6.addComments(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addComments",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """addcomments"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Application_adminHome24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Application_adminHome24_invoker = createInvoker(
    Application_6.adminHome(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "adminHome",
      Nil,
      "GET",
      """ Admin pages...""",
      this.prefix + """admin"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_account_Signup_createUser25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_account_Signup_createUser25_invoker = createInvoker(
    Signup_5.createUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "createUser",
      Nil,
      "GET",
      """""",
      this.prefix + """adduser"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_account_Signup_saveUser26_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adduser")))
  )
  private[this] lazy val controllers_account_Signup_saveUser26_invoker = createInvoker(
    Signup_5.saveUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "saveUser",
      Nil,
      "POST",
      """""",
      this.prefix + """adduser"""
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Application_lookupMaintenance27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tablemaint")))
  )
  private[this] lazy val controllers_Application_lookupMaintenance27_invoker = createInvoker(
    Application_6.lookupMaintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "lookupMaintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """tablemaint"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Application_userMaintenance28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("adminuser")))
  )
  private[this] lazy val controllers_Application_userMaintenance28_invoker = createInvoker(
    Application_6.userMaintenance(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "userMaintenance",
      Nil,
      "GET",
      """""",
      this.prefix + """adminuser"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Application_getAllUsers29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Application_getAllUsers29_invoker = createInvoker(
    Application_6.getAllUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """search"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Application_getAllProjects30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchprojects")))
  )
  private[this] lazy val controllers_Application_getAllProjects30_invoker = createInvoker(
    Application_6.getAllProjects(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getAllProjects",
      Nil,
      "GET",
      """""",
      this.prefix + """searchprojects"""
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Application_getProjectsWilcard31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("mainsearch/"), DynamicPart("searchText", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_getProjectsWilcard31_invoker = createInvoker(
    Application_6.getProjectsWilcard(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getProjectsWilcard",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """mainsearch/$searchText<[^/]+>"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Application_findUser32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_findUser32_invoker = createInvoker(
    Application_6.findUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "findUser",
      Nil,
      "GET",
      """""",
      this.prefix + """finduser"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_Application_getUserByEmailWildcard33_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduser")))
  )
  private[this] lazy val controllers_Application_getUserByEmailWildcard33_invoker = createInvoker(
    Application_6.getUserByEmailWildcard(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByEmailWildcard",
      Nil,
      "POST",
      """""",
      this.prefix + """finduser"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_Application_updateUser34_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateuser")))
  )
  private[this] lazy val controllers_Application_updateUser34_invoker = createInvoker(
    Application_6.updateUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateUser",
      Nil,
      "POST",
      """""",
      this.prefix + """updateuser"""
    )
  )

  // @LINE:69
  private[this] lazy val controllers_Application_exportUsers35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportusers/"), DynamicPart("data", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportUsers35_invoker = createInvoker(
    Application_6.exportUsers(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportUsers",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """exportusers/$data<[^/]+>"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_Application_exportOpenFile36_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("exportOpenFile/"), DynamicPart("fileName", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_exportOpenFile36_invoker = createInvoker(
    Application_6.exportOpenFile(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "exportOpenFile",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """exportOpenFile/$fileName<[^/]+>"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_Application_openUser37_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openuser")))
  )
  private[this] lazy val controllers_Application_openUser37_invoker = createInvoker(
    Application_6.openUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openUser",
      Nil,
      "GET",
      """""",
      this.prefix + """openuser"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_Application_addLookup38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addlookup")))
  )
  private[this] lazy val controllers_Application_addLookup38_invoker = createInvoker(
    Application_6.addLookup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "addLookup",
      Nil,
      "GET",
      """""",
      this.prefix + """addlookup"""
    )
  )

  // @LINE:76
  private[this] lazy val controllers_Application_saveLookup39_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addlookup")))
  )
  private[this] lazy val controllers_Application_saveLookup39_invoker = createInvoker(
    Application_6.saveLookup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "saveLookup",
      Nil,
      "POST",
      """""",
      this.prefix + """addlookup"""
    )
  )

  // @LINE:78
  private[this] lazy val controllers_Application_openLookup40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openlookup/"), DynamicPart("lookupkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_openLookup40_invoker = createInvoker(
    Application_6.openLookup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "openLookup",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """openlookup/$lookupkey<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_Application_updateLookup41_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("openlookup/"), DynamicPart("lookupkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_updateLookup41_invoker = createInvoker(
    Application_6.updateLookup(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "updateLookup",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """openlookup/$lookupkey<[^/]+>"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_Application_filterLookups42_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("filterlookups")))
  )
  private[this] lazy val controllers_Application_filterLookups42_invoker = createInvoker(
    Application_6.filterLookups(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "filterLookups",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """filterlookups"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_Application_getUserByUrl43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("finduserurl")))
  )
  private[this] lazy val controllers_Application_getUserByUrl43_invoker = createInvoker(
    Application_6.getUserByUrl(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "getUserByUrl",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """finduserurl"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_Application_deleteUserConfirm44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("userkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUserConfirm44_invoker = createInvoker(
    Application_6.deleteUserConfirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUserConfirm",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """deleteuser/$userkey<[^/]+>"""
    )
  )

  // @LINE:86
  private[this] lazy val controllers_Application_deleteUser45_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteuser/"), DynamicPart("userkey", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_deleteUser45_invoker = createInvoker(
    Application_6.deleteUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "deleteUser",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """deleteuser/$userkey<[^/]+>"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_account_Reset_resetUser46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetuser/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_resetUser46_invoker = createInvoker(
    Reset_0.resetUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "resetUser",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """resetuser/$token<[^/]+>"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_account_Reset_runResetUser47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("resetuser/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runResetUser47_invoker = createInvoker(
    Reset_0.runResetUser(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runResetUser",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """resetuser/$token<[^/]+>"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_Application_populateLookups48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("populatelookups")))
  )
  private[this] lazy val controllers_Application_populateLookups48_invoker = createInvoker(
    Application_6.populateLookups(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "populateLookups",
      Nil,
      "GET",
      """""",
      this.prefix + """populatelookups"""
    )
  )

  // @LINE:94
  private[this] lazy val controllers_account_settings_Index_index49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings")))
  )
  private[this] lazy val controllers_account_settings_Index_index49_invoker = createInvoker(
    Index_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Index",
      "index",
      Nil,
      "GET",
      """ User settings...""",
      this.prefix + """settings"""
    )
  )

  // @LINE:95
  private[this] lazy val controllers_account_settings_Password_index50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_index50_invoker = createInvoker(
    Password_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_account_settings_Password_runPassword51_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/password")))
  )
  private[this] lazy val controllers_account_settings_Password_runPassword51_invoker = createInvoker(
    Password_1.runPassword(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Password",
      "runPassword",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/password"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_account_settings_Email_index52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_index52_invoker = createInvoker(
    Email_3.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_account_settings_Email_runEmail53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("settings/email")))
  )
  private[this] lazy val controllers_account_settings_Email_runEmail53_invoker = createInvoker(
    Email_3.runEmail(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "runEmail",
      Nil,
      "POST",
      """""",
      this.prefix + """settings/email"""
    )
  )

  // @LINE:101
  private[this] lazy val controllers_account_Signup_create54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_create54_invoker = createInvoker(
    Signup_5.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "create",
      Nil,
      "GET",
      """ Registers the user, sending an email to confirm the account.""",
      this.prefix + """signup"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_account_Signup_save55_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_account_Signup_save55_invoker = createInvoker(
    Signup_5.save(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "save",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:105
  private[this] lazy val controllers_account_Signup_confirm56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirm/"), DynamicPart("confirmToken", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Signup_confirm56_invoker = createInvoker(
    Signup_5.confirm(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Signup",
      "confirm",
      Seq(classOf[String]),
      "GET",
      """ Accessed when the user confirms the registration.""",
      this.prefix + """confirm/$confirmToken<[^/]+>"""
    )
  )

  // @LINE:108
  private[this] lazy val controllers_account_Reset_ask57_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_ask57_invoker = createInvoker(
    Reset_0.ask(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "ask",
      Nil,
      "GET",
      """ Displays a page to send a reset email given the user's email.""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:109
  private[this] lazy val controllers_account_Reset_runAsk58_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/ask")))
  )
  private[this] lazy val controllers_account_Reset_runAsk58_invoker = createInvoker(
    Reset_0.runAsk(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runAsk",
      Nil,
      "POST",
      """""",
      this.prefix + """reset/ask"""
    )
  )

  // @LINE:112
  private[this] lazy val controllers_account_Reset_reset59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_reset59_invoker = createInvoker(
    Reset_0.reset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "reset",
      Seq(classOf[String]),
      "GET",
      """ Resets the password using the password.""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:113
  private[this] lazy val controllers_account_Reset_runReset60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("reset/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_Reset_runReset60_invoker = createInvoker(
    Reset_0.runReset(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.Reset",
      "runReset",
      Seq(classOf[String]),
      "POST",
      """""",
      this.prefix + """reset/$token<[^/]+>"""
    )
  )

  // @LINE:115
  private[this] lazy val controllers_account_settings_Email_validateEmail61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("email/"), DynamicPart("token", """[^/]+""",true)))
  )
  private[this] lazy val controllers_account_settings_Email_validateEmail61_invoker = createInvoker(
    Email_3.validateEmail(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.account.settings.Email",
      "validateEmail",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """email/$token<[^/]+>"""
    )
  )

  // @LINE:118
  private[this] lazy val controllers_Assets_at62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at62_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_6.index())
      }
  
    // @LINE:7
    case controllers_Dashboard_index1_route(params) =>
      call { 
        controllers_Dashboard_index1_invoker.call(Dashboard_2.index())
      }
  
    // @LINE:9
    case controllers_Application_authenticate2_route(params) =>
      call { 
        controllers_Application_authenticate2_invoker.call(Application_6.authenticate())
      }
  
    // @LINE:10
    case controllers_Application_logout3_route(params) =>
      call { 
        controllers_Application_logout3_invoker.call(Application_6.logout())
      }
  
    // @LINE:12
    case controllers_Application_contact4_route(params) =>
      call { 
        controllers_Application_contact4_invoker.call(Application_6.contact())
      }
  
    // @LINE:13
    case controllers_Application_contactSend5_route(params) =>
      call { 
        controllers_Application_contactSend5_invoker.call(Application_6.contactSend())
      }
  
    // @LINE:16
    case controllers_Application_openLogin6_route(params) =>
      call { 
        controllers_Application_openLogin6_invoker.call(Application_6.openLogin())
      }
  
    // @LINE:17
    case controllers_Application_authenticate7_route(params) =>
      call { 
        controllers_Application_authenticate7_invoker.call(Application_6.authenticate())
      }
  
    // @LINE:19
    case controllers_Application_accessDenied8_route(params) =>
      call { 
        controllers_Application_accessDenied8_invoker.call(Application_6.accessDenied())
      }
  
    // @LINE:22
    case controllers_Application_userHome9_route(params) =>
      call { 
        controllers_Application_userHome9_invoker.call(Application_6.userHome())
      }
  
    // @LINE:24
    case controllers_Application_addIntake10_route(params) =>
      call { 
        controllers_Application_addIntake10_invoker.call(Application_6.addIntake())
      }
  
    // @LINE:25
    case controllers_Application_saveIntake11_route(params) =>
      call { 
        controllers_Application_saveIntake11_invoker.call(Application_6.saveIntake())
      }
  
    // @LINE:27
    case controllers_Application_searchIntake12_route(params) =>
      call { 
        controllers_Application_searchIntake12_invoker.call(Application_6.searchIntake())
      }
  
    // @LINE:29
    case controllers_Application_filterIntake13_route(params) =>
      call(params.fromQuery[String]("type", None), params.fromQuery[String]("value", None)) { (_pf_escape_type, value) =>
        controllers_Application_filterIntake13_invoker.call(Application_6.filterIntake(_pf_escape_type, value))
      }
  
    // @LINE:31
    case controllers_Application_filterIntake14_route(params) =>
      call(params.fromQuery[String]("type", None), params.fromQuery[String]("value", None)) { (_pf_escape_type, value) =>
        controllers_Application_filterIntake14_invoker.call(Application_6.filterIntake(_pf_escape_type, value))
      }
  
    // @LINE:33
    case controllers_Application_reportsCreate15_route(params) =>
      call(params.fromPath[String]("reportType", None)) { (reportType) =>
        controllers_Application_reportsCreate15_invoker.call(Application_6.reportsCreate(reportType))
      }
  
    // @LINE:35
    case controllers_Application_openIntake16_route(params) =>
      call(params.fromPath[String]("intakekey", None)) { (intakekey) =>
        controllers_Application_openIntake16_invoker.call(Application_6.openIntake(intakekey))
      }
  
    // @LINE:36
    case controllers_Application_updateIntake17_route(params) =>
      call(params.fromPath[String]("intakekey", None)) { (intakekey) =>
        controllers_Application_updateIntake17_invoker.call(Application_6.updateIntake(intakekey))
      }
  
    // @LINE:38
    case controllers_Application_deleteIntakeConfirm18_route(params) =>
      call(params.fromPath[String]("intakekey", None)) { (intakekey) =>
        controllers_Application_deleteIntakeConfirm18_invoker.call(Application_6.deleteIntakeConfirm(intakekey))
      }
  
    // @LINE:39
    case controllers_Application_deleteIntake19_route(params) =>
      call(params.fromPath[String]("intakekey", None)) { (intakekey) =>
        controllers_Application_deleteIntake19_invoker.call(Application_6.deleteIntake(intakekey))
      }
  
    // @LINE:41
    case controllers_Application_exportIntake20_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportIntake20_invoker.call(Application_6.exportIntake(data))
      }
  
    // @LINE:43
    case controllers_Application_openUserAccount21_route(params) =>
      call(params.fromQuery[String]("email", None)) { (email) =>
        controllers_Application_openUserAccount21_invoker.call(Application_6.openUserAccount(email))
      }
  
    // @LINE:44
    case controllers_Application_updateUserAccount22_route(params) =>
      call { 
        controllers_Application_updateUserAccount22_invoker.call(Application_6.updateUserAccount())
      }
  
    // @LINE:46
    case controllers_Application_addComments23_route(params) =>
      call(params.fromQuery[String]("intakekey", None), params.fromQuery[String]("comment", None)) { (intakekey, comment) =>
        controllers_Application_addComments23_invoker.call(Application_6.addComments(intakekey, comment))
      }
  
    // @LINE:49
    case controllers_Application_adminHome24_route(params) =>
      call { 
        controllers_Application_adminHome24_invoker.call(Application_6.adminHome())
      }
  
    // @LINE:51
    case controllers_account_Signup_createUser25_route(params) =>
      call { 
        controllers_account_Signup_createUser25_invoker.call(Signup_5.createUser())
      }
  
    // @LINE:52
    case controllers_account_Signup_saveUser26_route(params) =>
      call { 
        controllers_account_Signup_saveUser26_invoker.call(Signup_5.saveUser())
      }
  
    // @LINE:54
    case controllers_Application_lookupMaintenance27_route(params) =>
      call { 
        controllers_Application_lookupMaintenance27_invoker.call(Application_6.lookupMaintenance())
      }
  
    // @LINE:56
    case controllers_Application_userMaintenance28_route(params) =>
      call { 
        controllers_Application_userMaintenance28_invoker.call(Application_6.userMaintenance())
      }
  
    // @LINE:58
    case controllers_Application_getAllUsers29_route(params) =>
      call { 
        controllers_Application_getAllUsers29_invoker.call(Application_6.getAllUsers())
      }
  
    // @LINE:60
    case controllers_Application_getAllProjects30_route(params) =>
      call { 
        controllers_Application_getAllProjects30_invoker.call(Application_6.getAllProjects())
      }
  
    // @LINE:62
    case controllers_Application_getProjectsWilcard31_route(params) =>
      call(params.fromPath[String]("searchText", None)) { (searchText) =>
        controllers_Application_getProjectsWilcard31_invoker.call(Application_6.getProjectsWilcard(searchText))
      }
  
    // @LINE:64
    case controllers_Application_findUser32_route(params) =>
      call { 
        controllers_Application_findUser32_invoker.call(Application_6.findUser())
      }
  
    // @LINE:65
    case controllers_Application_getUserByEmailWildcard33_route(params) =>
      call { 
        controllers_Application_getUserByEmailWildcard33_invoker.call(Application_6.getUserByEmailWildcard())
      }
  
    // @LINE:67
    case controllers_Application_updateUser34_route(params) =>
      call { 
        controllers_Application_updateUser34_invoker.call(Application_6.updateUser())
      }
  
    // @LINE:69
    case controllers_Application_exportUsers35_route(params) =>
      call(params.fromPath[String]("data", None)) { (data) =>
        controllers_Application_exportUsers35_invoker.call(Application_6.exportUsers(data))
      }
  
    // @LINE:71
    case controllers_Application_exportOpenFile36_route(params) =>
      call(params.fromPath[String]("fileName", None)) { (fileName) =>
        controllers_Application_exportOpenFile36_invoker.call(Application_6.exportOpenFile(fileName))
      }
  
    // @LINE:73
    case controllers_Application_openUser37_route(params) =>
      call { 
        controllers_Application_openUser37_invoker.call(Application_6.openUser())
      }
  
    // @LINE:75
    case controllers_Application_addLookup38_route(params) =>
      call { 
        controllers_Application_addLookup38_invoker.call(Application_6.addLookup())
      }
  
    // @LINE:76
    case controllers_Application_saveLookup39_route(params) =>
      call { 
        controllers_Application_saveLookup39_invoker.call(Application_6.saveLookup())
      }
  
    // @LINE:78
    case controllers_Application_openLookup40_route(params) =>
      call(params.fromPath[String]("lookupkey", None)) { (lookupkey) =>
        controllers_Application_openLookup40_invoker.call(Application_6.openLookup(lookupkey))
      }
  
    // @LINE:79
    case controllers_Application_updateLookup41_route(params) =>
      call(params.fromPath[String]("lookupkey", None)) { (lookupkey) =>
        controllers_Application_updateLookup41_invoker.call(Application_6.updateLookup(lookupkey))
      }
  
    // @LINE:81
    case controllers_Application_filterLookups42_route(params) =>
      call(params.fromQuery[String]("type", None), params.fromQuery[String]("value", None)) { (_pf_escape_type, value) =>
        controllers_Application_filterLookups42_invoker.call(Application_6.filterLookups(_pf_escape_type, value))
      }
  
    // @LINE:83
    case controllers_Application_getUserByUrl43_route(params) =>
      call(params.fromQuery[String]("userkey", None)) { (userkey) =>
        controllers_Application_getUserByUrl43_invoker.call(Application_6.getUserByUrl(userkey))
      }
  
    // @LINE:85
    case controllers_Application_deleteUserConfirm44_route(params) =>
      call(params.fromPath[String]("userkey", None)) { (userkey) =>
        controllers_Application_deleteUserConfirm44_invoker.call(Application_6.deleteUserConfirm(userkey))
      }
  
    // @LINE:86
    case controllers_Application_deleteUser45_route(params) =>
      call(params.fromPath[String]("userkey", None)) { (userkey) =>
        controllers_Application_deleteUser45_invoker.call(Application_6.deleteUser(userkey))
      }
  
    // @LINE:88
    case controllers_account_Reset_resetUser46_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_resetUser46_invoker.call(Reset_0.resetUser(token))
      }
  
    // @LINE:89
    case controllers_account_Reset_runResetUser47_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runResetUser47_invoker.call(Reset_0.runResetUser(token))
      }
  
    // @LINE:91
    case controllers_Application_populateLookups48_route(params) =>
      call { 
        controllers_Application_populateLookups48_invoker.call(Application_6.populateLookups())
      }
  
    // @LINE:94
    case controllers_account_settings_Index_index49_route(params) =>
      call { 
        controllers_account_settings_Index_index49_invoker.call(Index_7.index())
      }
  
    // @LINE:95
    case controllers_account_settings_Password_index50_route(params) =>
      call { 
        controllers_account_settings_Password_index50_invoker.call(Password_1.index())
      }
  
    // @LINE:96
    case controllers_account_settings_Password_runPassword51_route(params) =>
      call { 
        controllers_account_settings_Password_runPassword51_invoker.call(Password_1.runPassword())
      }
  
    // @LINE:97
    case controllers_account_settings_Email_index52_route(params) =>
      call { 
        controllers_account_settings_Email_index52_invoker.call(Email_3.index())
      }
  
    // @LINE:98
    case controllers_account_settings_Email_runEmail53_route(params) =>
      call { 
        controllers_account_settings_Email_runEmail53_invoker.call(Email_3.runEmail())
      }
  
    // @LINE:101
    case controllers_account_Signup_create54_route(params) =>
      call { 
        controllers_account_Signup_create54_invoker.call(Signup_5.create())
      }
  
    // @LINE:102
    case controllers_account_Signup_save55_route(params) =>
      call { 
        controllers_account_Signup_save55_invoker.call(Signup_5.save())
      }
  
    // @LINE:105
    case controllers_account_Signup_confirm56_route(params) =>
      call(params.fromPath[String]("confirmToken", None)) { (confirmToken) =>
        controllers_account_Signup_confirm56_invoker.call(Signup_5.confirm(confirmToken))
      }
  
    // @LINE:108
    case controllers_account_Reset_ask57_route(params) =>
      call { 
        controllers_account_Reset_ask57_invoker.call(Reset_0.ask())
      }
  
    // @LINE:109
    case controllers_account_Reset_runAsk58_route(params) =>
      call { 
        controllers_account_Reset_runAsk58_invoker.call(Reset_0.runAsk())
      }
  
    // @LINE:112
    case controllers_account_Reset_reset59_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_reset59_invoker.call(Reset_0.reset(token))
      }
  
    // @LINE:113
    case controllers_account_Reset_runReset60_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_Reset_runReset60_invoker.call(Reset_0.runReset(token))
      }
  
    // @LINE:115
    case controllers_account_settings_Email_validateEmail61_route(params) =>
      call(params.fromPath[String]("token", None)) { (token) =>
        controllers_account_settings_Email_validateEmail61_invoker.call(Email_3.validateEmail(token))
      }
  
    // @LINE:118
    case controllers_Assets_at62_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at62_invoker.call(Assets_4.at(path, file))
      }
  }
}