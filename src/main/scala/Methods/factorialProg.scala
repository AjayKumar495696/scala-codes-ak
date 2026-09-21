package Methods

object factorialProg {
  def fact(n: Int): Int = {
    if (n == 1) {
      1
    }
    else {
      n * fact(n - 1)
    }
  }
  def main(args:Array[String]):Unit={
    println(s"Factorial is ${fact(5)}")
  }
}
