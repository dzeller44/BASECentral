
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/BASECentral/conf/routes
// @DATE:Tue Feb 28 14:07:14 MST 2017

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:121
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:121
    def at(file:String): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseDashboard(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def exportIntake(_pf_escape_type:String, value:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "exportintake" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("type", _pf_escape_type)), Some(implicitly[QueryStringBindable[String]].unbind("value", value)))))
    }
  
    // @LINE:38
    def openIntake(intakekey:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "openintake/" + implicitly[PathBindable[String]].unbind("intakekey", dynamicString(intakekey)))
    }
  
    // @LINE:70
    def updateUser(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "updateuser")
    }
  
    // @LINE:81
    def openLookup(lookupkey:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "openlookup/" + implicitly[PathBindable[String]].unbind("lookupkey", dynamicString(lookupkey)))
    }
  
    // @LINE:84
    def filterLookups(_pf_escape_type:String, value:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "filterlookups" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("type", _pf_escape_type)), Some(implicitly[QueryStringBindable[String]].unbind("value", value)))))
    }
  
    // @LINE:76
    def openUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "openuser")
    }
  
    // @LINE:63
    def getAllProjects(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "searchprojects")
    }
  
    // @LINE:65
    def getProjectsWilcard(searchText:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "mainsearch/" + implicitly[PathBindable[String]].unbind("searchText", dynamicString(searchText)))
    }
  
    // @LINE:78
    def addLookup(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addlookup")
    }
  
    // @LINE:52
    def adminHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:82
    def updateLookup(lookupkey:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "openlookup/" + implicitly[PathBindable[String]].unbind("lookupkey", dynamicString(lookupkey)))
    }
  
    // @LINE:86
    def getUserByUrl(userkey:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "finduserurl" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("userkey", userkey)))))
    }
  
    // @LINE:74
    def exportOpenFile(fileName:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "exportOpenFile/" + implicitly[PathBindable[String]].unbind("fileName", dynamicString(fileName)))
    }
  
    // @LINE:28
    def saveIntake(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addintake")
    }
  
    // @LINE:13
    def contactSend(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:41
    def deleteIntakeConfirm(intakekey:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteintake/" + implicitly[PathBindable[String]].unbind("intakekey", dynamicString(intakekey)))
    }
  
    // @LINE:49
    def addComments(intakekey:String, comment:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addcomments" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("intakekey", intakekey)), Some(implicitly[QueryStringBindable[String]].unbind("comment", comment)))))
    }
  
    // @LINE:25
    def userHome(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:39
    def updateIntake(intakekey:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "openintake/" + implicitly[PathBindable[String]].unbind("intakekey", dynamicString(intakekey)))
    }
  
    // @LINE:32
    def filterIntake(_pf_escape_type:String, value:String): Call = {
    
      (_pf_escape_type: @unchecked, value: @unchecked) match {
      
        // @LINE:32
        case (_pf_escape_type, value)  =>
          import ReverseRouteContext.empty
          Call("GET", _prefix + { _defaultPrefix } + "filterintake" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("type", _pf_escape_type)), Some(implicitly[QueryStringBindable[String]].unbind("value", value)))))
      
      }
    
    }
  
    // @LINE:42
    def deleteIntake(intakekey:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteintake/" + implicitly[PathBindable[String]].unbind("intakekey", dynamicString(intakekey)))
    }
  
    // @LINE:68
    def getUserByEmailWildcard(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "finduser")
    }
  
    // @LINE:94
    def populateLookups(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "populatelookups")
    }
  
    // @LINE:10
    def logout(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:59
    def userMaintenance(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "adminuser")
    }
  
    // @LINE:57
    def lookupMaintenance(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "tablemaint")
    }
  
    // @LINE:30
    def searchIntake(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "searchintake")
    }
  
    // @LINE:16
    def openLogin(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:22
    def accessDenied(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "accessdenied")
    }
  
    // @LINE:36
    def reportsCreate(reportType:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "reports/" + implicitly[PathBindable[String]].unbind("reportType", dynamicString(reportType)))
    }
  
    // @LINE:88
    def deleteUserConfirm(userkey:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "deleteuser/" + implicitly[PathBindable[String]].unbind("userkey", dynamicString(userkey)))
    }
  
    // @LINE:67
    def findUser(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "finduser")
    }
  
    // @LINE:89
    def deleteUser(userkey:String): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "deleteuser/" + implicitly[PathBindable[String]].unbind("userkey", dynamicString(userkey)))
    }
  
    // @LINE:17
    def authenticate(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "auth")
    }
  
    // @LINE:61
    def getAllUsers(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "search")
    }
  
    // @LINE:6
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:12
    def contact(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "contact")
    }
  
    // @LINE:46
    def openUserAccount(email:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "useraccount" + queryString(List(Some(implicitly[QueryStringBindable[String]].unbind("email", email)))))
    }
  
    // @LINE:47
    def updateUserAccount(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "useraccount")
    }
  
    // @LINE:27
    def addIntake(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "addintake")
    }
  
    // @LINE:79
    def saveLookup(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "addlookup")
    }
  
    // @LINE:72
    def exportUsers(data:String): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "exportusers/" + implicitly[PathBindable[String]].unbind("data", dynamicString(data)))
    }
  
  }


}
