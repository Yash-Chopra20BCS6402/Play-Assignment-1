package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class Calculator @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def add(a: Int,b: Int)= Action { implicit request: Request[AnyContent] =>
    Ok (views.html.Add.render (a+b) )
  }

  def subtract(a: Int,b: Int)= Action { implicit request: Request[AnyContent] =>
    Ok (views.html.Subtract.render (a-b) )
  }

  def multiply(a: Int,b: Int)= Action { implicit request: Request[AnyContent] =>
    Ok (views.html.Multiply.render (a*b) )
  }

  def divide(a: Int,b: Int)= Action { implicit request: Request[AnyContent] =>
    Ok (views.html.Divide.render (a/b) )
  }
}
