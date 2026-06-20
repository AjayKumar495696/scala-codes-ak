package GeeksForGeeks.ControlStatements.Break

import scala.util.control.Breaks._
object breakNestedProg {
  def main(args:Array[String]):Unit={

    var x = 10
    var y = 20

    breakable {
      while (x <= 15) {
        y = 20
        if (x == 13) {
          break;
        }
        else {
        breakable {
          while (y <= 25) {
            if (y == 23) {
              break;
            }
            else {
              println(s"The values of x and y are : $x $y")
            }
            y += 1
          }
        }

        x += 1
        println("")
      }
      }
    }

  }
}
