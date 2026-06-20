package GeeksForGeeks.ControlStatements.Break

import scala.util.control.Breaks.{break, breakable}

object breakStatementProg {
  def main(args:Array[String]):Unit={
    breakable {
      for (i <- 1 to 10) {
        if (i == 6) {
          break;
        }
        else {
          println("The values of i are : " + i)
        }
      }
    }

  }
}
