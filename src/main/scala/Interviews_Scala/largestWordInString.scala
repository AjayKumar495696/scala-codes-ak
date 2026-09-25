package Interviews_Scala

object largestWordInString {
  def main(args:Array[String]):Unit={
    val a = "This is the interview for a developers role"
    val words = a.split(" ")
    val largestWord = words.maxBy(_.length)
    //val largestWord1 = words.reduce((x,y) => if (x.length > y.length) x else y)
    println(largestWord)
    val lengthOfLargestWord = largestWord.length
    println(lengthOfLargestWord)
  }
}
