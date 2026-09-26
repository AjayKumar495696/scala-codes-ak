package Interviews_Scala

// finding the largest word of an input string
object largestWordInString {

  def main(args:Array[String]):Unit={

    val inputString = "This interview is for developers role"
    // println(inputString)

    val stringToWords = inputString.split(" ")
    // stringToWords.foreach(println)

    val largestWordOfString = stringToWords.maxBy(x=>x.length)
                  // or
    // val largestWordOfString1 = stringToWords.maxBy(_.length)
    // println(largestWordOfString)

    // println(largestWordOfString.length)


    // using reduce() method
    val largestWordOfString2 = stringToWords.reduce((x,y) => if (x.length > y.length) x else y)
    // println(largestWordOfString2)

    // println(largestWordOfString2.length)

  }

}
