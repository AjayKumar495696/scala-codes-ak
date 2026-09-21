package ControlStatements.DecisionMaking

object ifElseProg {
  def main(args:Array[String]):Unit={

    var a : Int = 29

    if (a >= 18) {               // if this condition is true, it will execute this block
      println("He is Major");
    }
    else {                       // else it will execute this block
      println("He is Minor");
    }
  }
}
