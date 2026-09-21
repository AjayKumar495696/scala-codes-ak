package ControlStatements.Break

// importing break package
import scala.util.control.Breaks.{breakable,break}

object breakStatementProg {
  def main(args:Array[String]):Unit={

    breakable {
      println("i values are :")
      for (i <- 1 to 10) {
        if (i == 6)
          break                   // break, it will terminate the loop if i is equal to 6
        else {
          println(i);
        }
      }
    }

  }
}
