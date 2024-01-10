// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Calculator_0: controllers.Calculator,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

  @javax.inject.Inject()
  def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Calculator_0: controllers.Calculator,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, Calculator_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Calculator_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add""", """controllers.Calculator.add(a:Int, b:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subtract""", """controllers.Calculator.subtract(a:Int, b:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """multiply""", """controllers.Calculator.multiply(a:Int, b:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """divide""", """controllers.Calculator.divide(a:Int, b:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(Seq.empty[(String, String, String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String, String, String)]
    case l => s ++ l.asInstanceOf[List[(String, String, String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Calculator_add0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add")))
  )
  private[this] lazy val controllers_Calculator_add0_invoker = createInvoker(
    Calculator_0.add(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Calculator",
      "add",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """add""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Calculator_subtract1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subtract")))
  )
  private[this] lazy val controllers_Calculator_subtract1_invoker = createInvoker(
    Calculator_0.subtract(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Calculator",
      "subtract",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """subtract""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Calculator_multiply2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("multiply")))
  )
  private[this] lazy val controllers_Calculator_multiply2_invoker = createInvoker(
    Calculator_0.multiply(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Calculator",
      "multiply",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """multiply""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Calculator_divide3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("divide")))
  )
  private[this] lazy val controllers_Calculator_divide3_invoker = createInvoker(
    Calculator_0.divide(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Calculator",
      "divide",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """divide""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:7
    case controllers_Calculator_add0_route(params@_) =>
      call(params.fromQuery[Int]("a", None), params.fromQuery[Int]("b", None)) { (a, b) =>
        controllers_Calculator_add0_invoker.call(Calculator_0.add(a, b))
      }
  
    // @LINE:8
    case controllers_Calculator_subtract1_route(params@_) =>
      call(params.fromQuery[Int]("a", None), params.fromQuery[Int]("b", None)) { (a, b) =>
        controllers_Calculator_subtract1_invoker.call(Calculator_0.subtract(a, b))
      }
  
    // @LINE:9
    case controllers_Calculator_multiply2_route(params@_) =>
      call(params.fromQuery[Int]("a", None), params.fromQuery[Int]("b", None)) { (a, b) =>
        controllers_Calculator_multiply2_invoker.call(Calculator_0.multiply(a, b))
      }
  
    // @LINE:10
    case controllers_Calculator_divide3_route(params@_) =>
      call(params.fromQuery[Int]("a", None), params.fromQuery[Int]("b", None)) { (a, b) =>
        controllers_Calculator_divide3_invoker.call(Calculator_0.divide(a, b))
      }
  
    // @LINE:14
    case controllers_Assets_versioned4_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
