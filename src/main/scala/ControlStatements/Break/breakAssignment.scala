package ControlStatements.Break

import scala.util.control.Breaks._

  // x values are from 1 to 5 and y values are from 15 to 20
  // 1.output should be x,y where x from 1 to 5 and y from 15 to 20
  // 2.output should be x,y but x is from 1 to 3 only and y is from 15 to 18

object breakAssignment {
  def main(args: Array[String]): Unit = {


    var x = 1
    var y = 15

    // 1. x from 1 to 5 and y from 15 to 20
    /*while (x <= 5) {
      y = 15
      println("x and y values are :")
      while (y <= 20) {
        println(s"$x,$y")
        y += 1
      }
      println("")
      x += 1
    }*/

    // output for this code is :
    // x and y values are :
    // 1,15
    // 1,16
    // 1,17
    // 1,18
    // 1,19
    // 1,20

    // x and y values are :
    // 2,15
    // 2,16
    // 2,17
    // 2,18
    // 2,19
    // 2,20

    // x and y values are :
    // 3,15
    // 3,16
    // 3,17
    // 3,18
    // 3,19
    // 3,20

    // x and y values are :
    // 4,15
    // 4,16
    // 4,17
    // 4,18
    // 4,19
    // 4,20

    // x and y values are :
    // 5,15
    // 5,16
    // 5,17
    // 5,18
    // 5,19
    // 5,20

    // 2. x from 1 to 3 and y from 15 to 18
    breakable {
      while (x <= 5) {
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
                println(s"$x,$y")
              }
              y += 1
            }
          }
        }
        println("")
        x += 1
      }
    }

      // output for this code is :
      // x and y values are :
      // 1,15
      // 1,16
      // 1,17
      // 1,18

      // x and y values are :
      // 2,15
      // 2,16
      // 2,17
      // 2,18

      // x and y values are :
      // 3,15
      // 3,16
      // 3,17
      // 3,18

  }
}