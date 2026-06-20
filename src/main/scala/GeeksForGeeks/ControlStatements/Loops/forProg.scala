package GeeksForGeeks.ControlStatements.Loops

  // printing 1 to 5 numbers
object forProg {
  def main(args:Array[String]):Unit={

    println("The values of i are :")
    for ( i <- 1 to 5) {
      println(i)
    }

  }
}
