package GeeksForGeeks.ControlStatements.Loops

object doWhileProg {
  def main(args:Array[String]):Unit={
    var x : Int = 1
    do {
      println("The values of x are : "+x)
      x += 1
    } while(x <= 5)
  }
}
