// app/controllers/CalculatorController.scala
package controllers

import javax.inject._
import models.{Calculator, CalculatorResult}
import play.api.mvc._

@Singleton
class CalculatorController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  val calculator = Calculator()

  def add(a: Double, b: Double): Action[AnyContent] = Action {
    val result = calculator.add(a, b)
    Ok(s"Result: ${result.result}")
  }

  def subtract(a: Double, b: Double): Action[AnyContent] = Action {
    val result = calculator.subtract(a, b)
    Ok(s"Result: ${result.result}")
  }

  def multiply(a: Double, b: Double): Action[AnyContent] = Action {
    val result = calculator.multiply(a, b)
    Ok(s"Result: ${result.result}")
  }

  def divide(a: Double, b: Double): Action[AnyContent] = Action {
    calculator.divide(a, b) match {
      case Right(result) => Ok(s"Result: ${result.result}")
      case Left(error) => BadRequest(error)
    }
  }
}

