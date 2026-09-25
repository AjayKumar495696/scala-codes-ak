package Interviews_Scala

object distinctElements {
  def main(args:Array[String]):Unit={
    val a = List(12,13,14,12,12,14,15,16,16,17,18,18,19)
    val distinctElements = a.distinct
    println(distinctElements)
    val counts = a.groupBy(identity).mapValues(_.size)
    println(counts)
    val duplicates = counts.filter(_._2 > 1)
    println(duplicates)
    println("Duplicates and their counts :")
    duplicates.foreach{case (x,y) => println(s"$x appears $y times")}
  }
}
