package GeeksForGeeks.ControlStatements
import scala.util.control.Breaks._
// 1.Print 1 to 20 tables
// 2.From Above print 1 to 10 tables
// 3.From above print each table till first 5 multiples

object AssignmentOnWhileLoop {
  def main(args:Array[String]):Unit={

    breakable {
      for (i <- 1 to 20) {
        if (i == 11) {
          break;
        }
        else {
          println(s"$i table :")
          breakable {
            for (j <- 1 to 10) {
              if (j == 6) {
                break;
              }
              else {
                println(s"$i * $j = ${i * j}")
              }
            }
          }
        }
        println("")
      }
    }

  }
}
