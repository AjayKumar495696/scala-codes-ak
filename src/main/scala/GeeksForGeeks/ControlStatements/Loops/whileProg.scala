package GeeksForGeeks.ControlStatements.Loops

object whileProg {
  def main(args:Array[String]):Unit={
    var x : Int = 1
    while (x <= 5) {
      println("The x values are : "+x)
      x += 1
    }
  }
}
