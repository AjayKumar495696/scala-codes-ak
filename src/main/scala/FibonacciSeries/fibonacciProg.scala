package FibonacciSeries

// First 8 numbers of Fibonacci series
object fibonacciProg {

  def main(args:Array[String]):Unit={

    var a = 0
    var b = 1
    print(s"$a $b ")
    for (i <- 3 to 8) {
      var c = a + b
      print(s"$c ")
      a = b
      b = c
    }

  }
}
