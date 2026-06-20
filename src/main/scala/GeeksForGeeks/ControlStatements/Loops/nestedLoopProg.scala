package GeeksForGeeks.ControlStatements.Loops

object nestedLoopProg {
  def main(args:Array[String]):Unit={
    var x = 10
    var y = 20
    while (x <= 12) {
      y = 20
      while (y <= 25) {
        println(s"The values of x and y are : $x $y")
        y += 1
      }
      println("")
      x += 1
    }
  }
}
