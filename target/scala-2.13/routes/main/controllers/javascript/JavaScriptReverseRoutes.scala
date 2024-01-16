// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseCalculatorController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalculatorController.add",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("a", a0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
    // @LINE:10
    def subtract: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalculatorController.subtract",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subtract/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("a", a0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
    // @LINE:11
    def multiply: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalculatorController.multiply",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiply/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("a", a0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
    // @LINE:12
    def divide: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CalculatorController.divide",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "divide/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("a", a0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Double]].javascriptUnbind + """)("b", b1))})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
