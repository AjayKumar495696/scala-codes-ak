package ControlStatements.Loops

// 1.create a nested for loop
// 2.create a nested while loop
// 3.for in while loop
// 4.while in for loop

object nestedLoopProg {
  def main(args:Array[String]):Unit={

    // 1.nested for loop means for in for loop
    for (i <- 1 to 3) {
      println("i and j values are :")
      for (j <- 10 to 15) {
        println(s"$i,$j")
      }
      println("")
    }

    // 2.nested while loop means while in while loop
    /*var x = 7
    var y = 17
    while (x < 10) {
      y = 17
      println("x and y values are :")
      while (y <= 20 ) {
        println(s"$x , $y")
        y += 1
      }
      x += 1
      println("")
    }*/

    // 3.for in while loop
    /*var a = 1
    while ( a <= 5) {
      println("a and b values are :")
      for (b <- 10 to 14) {
        println(s"$a , $b")
      }
      a += 1
      println("")
    }*/

    // 4.while in for loop
    /*for (k <- 1 to 3) {
      println("k and l values are :")
      var l = 8
      while (l <= 10) {
        println(s"$k , $l")
        l += 1
      }
      println("")
    }*/

  }
}
