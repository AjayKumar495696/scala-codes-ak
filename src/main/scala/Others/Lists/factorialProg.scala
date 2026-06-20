package Others.Lists

object factorialProg {

  def main(args: Array[String]): Unit = {
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
