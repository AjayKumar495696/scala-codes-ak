package PracticeCodes
import scala.collection.JavaConversions.seqAsJavaList

object practice_1 {
  def main(args:Array[String]):Unit={
    val inputNumbersList = List("09123456789","+918123456789","917123456789","9161234567","5123456789")
    val finalResult = inputNumbersList.map { numbers =>
      val removingSymbols = numbers.replaceAll("[^0-9]","")
      val enrichNumber = if (removingSymbols.startsWith("91")) removingSymbols
      else "91" + removingSymbols.dropWhile(_ == '0')
      "+91 " + enrichNumber.slice(2,7) + " " + enrichNumber.slice(7,12)
    }.sorted
    println(finalResult)
    finalResult.foreach(println)
  }
}
