// app/models/Calculator.scala
package models

case class Calculator() {

  def add(a: Double, b: Double): CalculatorResult = {
    CalculatorResult(a + b)
  }

  def subtract(a: Double, b: Double): CalculatorResult = {
    CalculatorResult(a - b)
  }

  def multiply(a: Double, b: Double): CalculatorResult = {
    CalculatorResult(a * b)
  }

  def divide(a: Double, b: Double): Either[String, CalculatorResult] = {
    if (b != 0) {
      Right(CalculatorResult(a / b))
    } else {
      Left("Error: Division by zero")
    }
  }
}
