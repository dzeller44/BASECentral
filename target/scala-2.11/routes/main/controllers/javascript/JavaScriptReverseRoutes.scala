
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/BASECentral/conf/routes
// @DATE:Tue Feb 28 14:07:14 MST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:121
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:121
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseDashboard(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Dashboard.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:44
    def exportIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportIntake",
      """
        function(type0,value1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportintake" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value1)])})
        }
      """
    )
  
    // @LINE:38
    def openIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openIntake",
      """
        function(intakekey0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey0))})
        }
      """
    )
  
    // @LINE:70
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser"})
        }
      """
    )
  
    // @LINE:81
    def openLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openLookup",
      """
        function(lookupkey0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openlookup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lookupkey", encodeURIComponent(lookupkey0))})
        }
      """
    )
  
    // @LINE:84
    def filterLookups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.filterLookups",
      """
        function(type0,value1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filterlookups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value1)])})
        }
      """
    )
  
    // @LINE:76
    def openUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openuser"})
        }
      """
    )
  
    // @LINE:63
    def getAllProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllProjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchprojects"})
        }
      """
    )
  
    // @LINE:65
    def getProjectsWilcard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProjectsWilcard",
      """
        function(searchText0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainsearch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("searchText", encodeURIComponent(searchText0))})
        }
      """
    )
  
    // @LINE:78
    def addLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addLookup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addlookup"})
        }
      """
    )
  
    // @LINE:52
    def adminHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.adminHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:82
    def updateLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateLookup",
      """
        function(lookupkey0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "openlookup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lookupkey", encodeURIComponent(lookupkey0))})
        }
      """
    )
  
    // @LINE:86
    def getUserByUrl: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByUrl",
      """
        function(userkey0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduserurl" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userkey", userkey0)])})
        }
      """
    )
  
    // @LINE:74
    def exportOpenFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportOpenFile",
      """
        function(fileName0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exportOpenFile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("fileName", encodeURIComponent(fileName0))})
        }
      """
    )
  
    // @LINE:28
    def saveIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveIntake",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addintake"})
        }
      """
    )
  
    // @LINE:13
    def contactSend: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contactSend",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:41
    def deleteIntakeConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteIntakeConfirm",
      """
        function(intakekey0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey0))})
        }
      """
    )
  
    // @LINE:49
    def addComments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addComments",
      """
        function(intakekey0,comment1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcomments" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("intakekey", intakekey0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("comment", comment1)])})
        }
      """
    )
  
    // @LINE:25
    def userHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:39
    def updateIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateIntake",
      """
        function(intakekey0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "openintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey0))})
        }
      """
    )
  
    // @LINE:32
    def filterIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.filterIntake",
      """
        function(type0,value1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filterintake" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type0), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value1)])})
          }
        
        }
      """
    )
  
    // @LINE:42
    def deleteIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteIntake",
      """
        function(intakekey0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey0))})
        }
      """
    )
  
    // @LINE:68
    def getUserByEmailWildcard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByEmailWildcard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:94
    def populateLookups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.populateLookups",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "populatelookups"})
        }
      """
    )
  
    // @LINE:10
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:59
    def userMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminuser"})
        }
      """
    )
  
    // @LINE:57
    def lookupMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.lookupMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablemaint"})
        }
      """
    )
  
    // @LINE:30
    def searchIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.searchIntake",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchintake"})
        }
      """
    )
  
    // @LINE:16
    def openLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:22
    def accessDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.accessDenied",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessdenied"})
        }
      """
    )
  
    // @LINE:36
    def reportsCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.reportsCreate",
      """
        function(reportType0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("reportType", encodeURIComponent(reportType0))})
        }
      """
    )
  
    // @LINE:88
    def deleteUserConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserConfirm",
      """
        function(userkey0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userkey", encodeURIComponent(userkey0))})
        }
      """
    )
  
    // @LINE:67
    def findUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:89
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUser",
      """
        function(userkey0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userkey", encodeURIComponent(userkey0))})
        }
      """
    )
  
    // @LINE:17
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
        }
      """
    )
  
    // @LINE:61
    def getAllUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:12
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.contact",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
        }
      """
    )
  
    // @LINE:46
    def openUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUserAccount",
      """
        function(email0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email0)])})
        }
      """
    )
  
    // @LINE:47
    def updateUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUserAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount"})
        }
      """
    )
  
    // @LINE:27
    def addIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addIntake",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addintake"})
        }
      """
    )
  
    // @LINE:79
    def saveLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveLookup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addlookup"})
        }
      """
    )
  
    // @LINE:72
    def exportUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportUsers",
      """
        function(data0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportusers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("data", encodeURIComponent(data0))})
        }
      """
    )
  
  }


}
