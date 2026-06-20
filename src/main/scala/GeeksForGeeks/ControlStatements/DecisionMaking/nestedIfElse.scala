package GeeksForGeeks.ControlStatements.DecisionMaking

object nestedIfElse {
  def main(args:Array[String]):Unit={

    var a : Int = 120
    var b : Int = 180
    var c : Int = 500

    if (a > b) {
      if (a > c) {
        println("1. a is the greatest number "+a)
      }
      else {
        println("2. c is the greatest number "+c)
      }
    }
    else {
      if (b > c) {
        println("3. b is the greatest number "+b)
      }
      else {
        println("4. c is the greatest number "+c)
      }
    }
  }
}
