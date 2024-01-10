// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseCalculator(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def add(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "add" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("a", a)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("b", b)))))
    }
  
    // @LINE:8
    def subtract(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subtract" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("a", a)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("b", b)))))
    }
  
    // @LINE:9
    def multiply(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "multiply" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("a", a)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("b", b)))))
    }
  
    // @LINE:10
    def divide(a:Int, b:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "divide" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("a", a)), Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("b", b)))))
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
