// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseCalculatorController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def add(a:Double, b:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("b", b)))
    }
  
    // @LINE:10
    def subtract(a:Double, b:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subtract/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("b", b)))
    }
  
    // @LINE:11
    def multiply(a:Double, b:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiply/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("b", b)))
    }
  
    // @LINE:12
    def divide(a:Double, b:Double): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "divide/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("a", a)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Double]].unbind("b", b)))
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
