package SomeProgrammes.Tables
import scala.util.control.Breaks.{breakable,break}

// On top of 1 to 20 tables code, I want tables from 1 to 10 only

object tables_1to10_withBreak {
  def main(args:Array[String]):Unit={

    breakable {
      for (i <- 1 to 20) {
        if (i == 11) break
        else {
        println(s"$i table :")
        for (j <- 1 to 10) {
            println(s"$i * $j = ${i * j}")
          }
        }
        println("")
      }
    }

  }
}
