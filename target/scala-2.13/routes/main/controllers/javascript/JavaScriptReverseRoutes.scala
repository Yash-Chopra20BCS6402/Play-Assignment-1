// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseCalculator(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def add: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Calculator.add",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("a", a0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("b", b1)])})
        }
      """
    )
  
    // @LINE:8
    def subtract: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Calculator.subtract",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subtract" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("a", a0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("b", b1)])})
        }
      """
    )
  
    // @LINE:9
    def multiply: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Calculator.multiply",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "multiply" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("a", a0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("b", b1)])})
        }
      """
    )
  
    // @LINE:10
    def divide: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Calculator.divide",
      """
        function(a0,b1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "divide" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("a", a0), (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("b", b1)])})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
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
