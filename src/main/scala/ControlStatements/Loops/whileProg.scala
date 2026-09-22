package ControlStatements.Loops

// 1.print 1 to 10 numbers using while
// 2.print 10 to 1 numbers using while
// 3.create infinite while loop

object whileProg {
  def main(args:Array[String]):Unit={

    // 1.printing 1 to 10 here
    var x = 1
    println("x values are :")
    while (x <= 10) {
      println(x)
      x += 1
    }

    println("")

    // 2.printing 10 to 1 here
    var y = 10
    println("y values are :")
    while (y >= 1) {
      println(y)
      y -= 1
    }

    println("")

    // 3.infinite while loop
    /*var z = 1
    println("z values are :")
    while(z <= 10) {
      println(z)
    }*/


  }
}
