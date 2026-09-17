package GeeksForGeeks.ControlStatements.Break

import scala.util.control.Breaks.{breakable,break}

object breakNestedProg {
  def main(args:Array[String]):Unit={

    var x = 1
    var y = 15

    breakable {
      while (x <= 6) {
        if (x == 4)
          break
        else {
          println("x and y values are :")
          y = 15
          breakable {
            while (y <= 20) {
              if (y == 19)
                break
              else {
                println(s"$x , $y")
              }
              y += 1
            }
          }
        }
        println("")
        x += 1
      }
    }

  }
}
