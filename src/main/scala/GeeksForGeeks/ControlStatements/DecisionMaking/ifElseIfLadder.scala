package GeeksForGeeks.ControlStatements.DecisionMaking

object ifElseIfLadder {
  def main(args:Array[String]):Unit={

    var a : Int = 95

    if (a == 100) {
      println("a is 100")
    }
    else if (a == 50) {
      println("a is 50")
    }
    else if (a == 25) {
      println("a is 25")
    }
    else {
      println("No match found")
    }

  }
}
