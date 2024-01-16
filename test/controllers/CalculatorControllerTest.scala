// test/controllers/CalculatorControllerSpec.scala
package controllers

import org.scalatestplus.play.PlaySpec
import play.api.test.Helpers._
import play.api.test._

class CalculatorControllerTest extends PlaySpec {

  "CalculatorController" should {

    "add two numbers" in {
      val controller = new CalculatorController(stubControllerComponents())
      val result = controller.add(5.0, 3.0).apply(FakeRequest())
      contentAsString(result) mustBe "Result: 8.0"
    }

    "subtract two numbers" in {
      val controller = new CalculatorController(stubControllerComponents())
      val result = controller.subtract(5.0, 3.0).apply(FakeRequest())
      contentAsString(result) mustBe "Result: 2.0"
    }

    "multiply two numbers" in {
      val controller = new CalculatorController(stubControllerComponents())
      val result = controller.multiply(5.0, 3.0).apply(FakeRequest())
      contentAsString(result) mustBe "Result: 15.0"
    }

    "divide two numbers" in {
      val controller = new CalculatorController(stubControllerComponents())
      val result = controller.divide(6.0, 2.0).apply(FakeRequest())
      contentAsString(result) mustBe "Result: 3.0"
    }

    "handle division by zero" in {
      val controller = new CalculatorController(stubControllerComponents())
      val result = controller.divide(6.0, 0.0).apply(FakeRequest())
      contentAsString(result) mustBe "Error: Division by zero"
    }
  }
}
