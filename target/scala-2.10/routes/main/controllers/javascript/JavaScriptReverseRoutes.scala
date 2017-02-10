
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/BASECentral/conf/routes
// @DATE:Fri Feb 10 14:19:19 MST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:118
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:118
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
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

  
    // @LINE:35
    def openIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openIntake",
      """
        function(intakekey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey))})
        }
      """
    )
  
    // @LINE:67
    def updateUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateuser"})
        }
      """
    )
  
    // @LINE:78
    def openLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openLookup",
      """
        function(lookupkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openlookup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lookupkey", encodeURIComponent(lookupkey))})
        }
      """
    )
  
    // @LINE:81
    def filterLookups: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.filterLookups",
      """
        function(type,value) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filterlookups" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value)])})
        }
      """
    )
  
    // @LINE:73
    def openUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "openuser"})
        }
      """
    )
  
    // @LINE:60
    def getAllProjects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getAllProjects",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchprojects"})
        }
      """
    )
  
    // @LINE:62
    def getProjectsWilcard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getProjectsWilcard",
      """
        function(searchText) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "mainsearch/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("searchText", encodeURIComponent(searchText))})
        }
      """
    )
  
    // @LINE:75
    def addLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addLookup",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addlookup"})
        }
      """
    )
  
    // @LINE:49
    def adminHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.adminHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:79
    def updateLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateLookup",
      """
        function(lookupkey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "openlookup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("lookupkey", encodeURIComponent(lookupkey))})
        }
      """
    )
  
    // @LINE:83
    def getUserByUrl: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByUrl",
      """
        function(userkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduserurl" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("userkey", userkey)])})
        }
      """
    )
  
    // @LINE:71
    def exportOpenFile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportOpenFile",
      """
        function(fileName) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "exportOpenFile/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("fileName", encodeURIComponent(fileName))})
        }
      """
    )
  
    // @LINE:25
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
  
    // @LINE:38
    def deleteIntakeConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteIntakeConfirm",
      """
        function(intakekey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey))})
        }
      """
    )
  
    // @LINE:46
    def addComments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addComments",
      """
        function(intakekey,comment) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addcomments" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("intakekey", intakekey), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("comment", comment)])})
        }
      """
    )
  
    // @LINE:41
    def exportIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportIntake",
      """
        function(data) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("data", encodeURIComponent(data))})
        }
      """
    )
  
    // @LINE:22
    def userHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:36
    def updateIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateIntake",
      """
        function(intakekey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "openintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey))})
        }
      """
    )
  
    // @LINE:29
    def filterIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.filterIntake",
      """
        function(type,value) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "filterintake" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("type", type), (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("value", value)])})
          }
        
        }
      """
    )
  
    // @LINE:39
    def deleteIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteIntake",
      """
        function(intakekey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteintake/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("intakekey", encodeURIComponent(intakekey))})
        }
      """
    )
  
    // @LINE:65
    def getUserByEmailWildcard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.getUserByEmailWildcard",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:91
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
  
    // @LINE:56
    def userMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.userMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adminuser"})
        }
      """
    )
  
    // @LINE:54
    def lookupMaintenance: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.lookupMaintenance",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tablemaint"})
        }
      """
    )
  
    // @LINE:27
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
  
    // @LINE:19
    def accessDenied: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.accessDenied",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "accessdenied"})
        }
      """
    )
  
    // @LINE:33
    def reportsCreate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.reportsCreate",
      """
        function(reportType) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reports/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("reportType", encodeURIComponent(reportType))})
        }
      """
    )
  
    // @LINE:85
    def deleteUserConfirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUserConfirm",
      """
        function(userkey) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userkey", encodeURIComponent(userkey))})
        }
      """
    )
  
    // @LINE:64
    def findUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.findUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "finduser"})
        }
      """
    )
  
    // @LINE:86
    def deleteUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.deleteUser",
      """
        function(userkey) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("userkey", encodeURIComponent(userkey))})
        }
      """
    )
  
    // @LINE:9
    def authenticate: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.authenticate",
      """
        function() {
        
          if (true) {
            return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
          }
        
        }
      """
    )
  
    // @LINE:58
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
  
    // @LINE:43
    def openUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.openUserAccount",
      """
        function(email) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount" + _qS([(""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("email", email)])})
        }
      """
    )
  
    // @LINE:44
    def updateUserAccount: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.updateUserAccount",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "useraccount"})
        }
      """
    )
  
    // @LINE:24
    def addIntake: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.addIntake",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "addintake"})
        }
      """
    )
  
    // @LINE:76
    def saveLookup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.saveLookup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addlookup"})
        }
      """
    )
  
    // @LINE:69
    def exportUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.exportUsers",
      """
        function(data) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "exportusers/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("data", encodeURIComponent(data))})
        }
      """
    )
  
  }


}