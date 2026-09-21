package ControlStatements.Loops

// 1.print 1 to 10 using do while
  // 2.print 10 to 1 using do while
  // 3.create infinite while loop

object doWhileProg {
  def main(args:Array[String]):Unit={

    // 1.printing 1 to 10 using do while
    var x = 1
    println("x values are :")
    do {
      println(x)
      x += 1
    } while(x <= 10)

    println("")

    // 2.printing 10 to 1 using do while
    var y = 10
    println("y values are :")
    do {
      println(y)
      y -= 1
    } while(y >= 1)

    println("")

    // 3.creating infinite loop using do while
    /*var z = 1
    println("z values are :")
    do {
      println(z)
    } while ( z <= 10)*/

  }
}
