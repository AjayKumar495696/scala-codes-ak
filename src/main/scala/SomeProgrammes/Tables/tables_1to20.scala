package SomeProgrammes.Tables

// printing all the tables from 1 to 20

object tables_1to20 {
  def main(args:Array[String]):Unit={

    for (i <- 1 to 20) {
      println(s"$i table :")
      for (j <- 1 to 10) {
        println(s"$i * $j = ${i * j}")
      }
      println("")
    }

  }
}
