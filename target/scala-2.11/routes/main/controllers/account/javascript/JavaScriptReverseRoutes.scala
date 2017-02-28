
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/WebDev/workspace/BASECentral/conf/routes
// @DATE:Tue Feb 28 14:07:14 MST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:54
package controllers.account.javascript {
  import ReverseRouteContext.empty

  // @LINE:54
  class ReverseSignup(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:104
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.create",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:54
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.createUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:55
    def saveUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.saveUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "adduser"})
        }
      """
    )
  
    // @LINE:108
    def confirm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.confirm",
      """
        function(confirmToken0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "confirm/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("confirmToken", encodeURIComponent(confirmToken0))})
        }
      """
    )
  
    // @LINE:105
    def save: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Signup.save",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:91
  class ReverseReset(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:115
    def reset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.reset",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:92
    def runResetUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runResetUser",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resetuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:116
    def runReset: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runReset",
      """
        function(token0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:91
    def resetUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.resetUser",
      """
        function(token0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "resetuser/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", encodeURIComponent(token0))})
        }
      """
    )
  
    // @LINE:111
    def ask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.ask",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
    // @LINE:112
    def runAsk: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.account.Reset.runAsk",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "reset/ask"})
        }
      """
    )
  
  }


}
