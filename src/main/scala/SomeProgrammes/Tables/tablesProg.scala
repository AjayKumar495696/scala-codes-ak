package SomeProgrammes.Tables
import scala.util.control.Breaks._

  // 1. print 1 to 20 tables
  // 2. print 1 to 10 tables from above code
  // 3. print 1 to 10 tables upto 5 multiples each from above code

object tablesProg {
  def main(args: Array[String]): Unit = {

    // 1. printing 1 to 20 tables
    for (i <- 1 to 20) {
      println(s"$i table :")
      for (j <- 1 to 10) {
        println(s"$i * $j = ${i * j}")
      }
      println("")
    }

    // 2. printing 1 to 10 tables from above code
    /*breakable {
      for (i <- 1 to 20) {
        if (i == 11)
          break
        else {
          println(s"$i table :")
          for (j <- 1 to 10) {
            println(s"$i * $j = ${i * j}")
          }
          println("")
        }
      }
    }*/

    // 3. printing 1 to 10 tables upto 5 multiples each from above code
    /*breakable {
      for (i <- 1 to 20) {
        if (i == 11)
          break
        else {
          println(s"$i table :")
          breakable {
          for (j <- 1 to 10) {
              if (j == 6)
                break
              else {
                println(s"$i * $j = ${i * j}")
              }
            }
          }
        }
        println("")
      }
    }*/

  }
}