package Others

//// This is the actual code
object fibonacci {
  def main(args:Array[String]):Unit={
    // example: 3 4 5 6 7 8 9
    // fibonacci series: 0 1 1 2 3 5 8 13
    // output: 4 -1 5 -1 -1 6 -1
    val a1 = Array(3, 4, 5, 6, 7, 8, 9)
    val f1 = Array(0, 1, 1, 2, 3, 5, 8, 13)
    for (value <- a1) {
      println(matchPatrn1(value, f1))
    }
  }

  def matchPatrn1(value: Int, f1: Array[Int]): Int = {
    //case x if f1.contains(x) => index
    //case _ => -1
    f1.indexOf(value) match {
      case -1 => -1
      case idx => idx
    }
  }
}
