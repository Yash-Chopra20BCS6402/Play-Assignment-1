// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:9
  CalculatorController_1: controllers.CalculatorController,
  // @LINE:15
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:9
    CalculatorController_1: controllers.CalculatorController,
    // @LINE:15
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, CalculatorController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, CalculatorController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""", """controllers.CalculatorController.add(a:Double, b:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subtract/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""", """controllers.CalculatorController.subtract(a:Double, b:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiply/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""", """controllers.CalculatorController.multiply(a:Double, b:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """divide/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""", """controllers.CalculatorController.divide(a:Double, b:Double)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_CalculatorController_add1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add/"), DynamicPart("a", """[^/]+""",true), StaticPart("/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalculatorController_add1_invoker = createInvoker(
    CalculatorController_1.add(fakeValue[Double], fakeValue[Double]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "add",
      Seq(classOf[Double], classOf[Double]),
      "GET",
      this.prefix + """add/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_CalculatorController_subtract2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subtract/"), DynamicPart("a", """[^/]+""",true), StaticPart("/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalculatorController_subtract2_invoker = createInvoker(
    CalculatorController_1.subtract(fakeValue[Double], fakeValue[Double]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "subtract",
      Seq(classOf[Double], classOf[Double]),
      "GET",
      this.prefix + """subtract/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_CalculatorController_multiply3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiply/"), DynamicPart("a", """[^/]+""",true), StaticPart("/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalculatorController_multiply3_invoker = createInvoker(
    CalculatorController_1.multiply(fakeValue[Double], fakeValue[Double]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "multiply",
      Seq(classOf[Double], classOf[Double]),
      "GET",
      this.prefix + """multiply/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_CalculatorController_divide4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("divide/"), DynamicPart("a", """[^/]+""",true), StaticPart("/"), DynamicPart("b", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CalculatorController_divide4_invoker = createInvoker(
    CalculatorController_1.divide(fakeValue[Double], fakeValue[Double]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CalculatorController",
      "divide",
      Seq(classOf[Double], classOf[Double]),
      "GET",
      this.prefix + """divide/""" + "$" + """a<[^/]+>/""" + "$" + """b<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:9
    case controllers_CalculatorController_add1_route(params@_) =>
      call(params.fromPath[Double]("a", None), params.fromPath[Double]("b", None)) { (a, b) =>
        controllers_CalculatorController_add1_invoker.call(CalculatorController_1.add(a, b))
      }
  
    // @LINE:10
    case controllers_CalculatorController_subtract2_route(params@_) =>
      call(params.fromPath[Double]("a", None), params.fromPath[Double]("b", None)) { (a, b) =>
        controllers_CalculatorController_subtract2_invoker.call(CalculatorController_1.subtract(a, b))
      }
  
    // @LINE:11
    case controllers_CalculatorController_multiply3_route(params@_) =>
      call(params.fromPath[Double]("a", None), params.fromPath[Double]("b", None)) { (a, b) =>
        controllers_CalculatorController_multiply3_invoker.call(CalculatorController_1.multiply(a, b))
      }
  
    // @LINE:12
    case controllers_CalculatorController_divide4_route(params@_) =>
      call(params.fromPath[Double]("a", None), params.fromPath[Double]("b", None)) { (a, b) =>
        controllers_CalculatorController_divide4_invoker.call(CalculatorController_1.divide(a, b))
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
