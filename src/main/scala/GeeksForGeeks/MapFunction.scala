package GeeksForGeeks

object MapFunction {
  def main(args:Array[String]):Unit= {

    /*val list = List("Hi Naveen","Naveen is nice","Hi Naveen Sir")
    val a = list.flatMap(x => x.split(" "))
    println(a)
    val b = a.map(y => (y,1))
    println(b)
    val c = b.groupBy(_._1)
    println(c)
    val d = c.mapValues(z => {z.map(_._2).sum})
    println(d)*/

    /*val list = List("Hi Naveen","Naveen is nice","Hi Naveen Sir")
    val wordCount = list
      .flatMap(_.split(" ")) // Split each string by space and flatten the result
      .groupBy(identity) // Group by each word
      .view
      .mapValues(_.size) // Count the occurrences of each word
      .toMap

    println(wordCount) // Output: Map(Hi -> 1, there -> 3, Hello -> 1)*/

    //var a = "The lines are printed in reverse order"
    //In the are lines order printed reverse.

    /*val inputString = "The lines are printed in reverse order."
    val outputString = rearrangeWords(inputString)
    println(outputString)
  }

  def rearrangeWords(input: String): String = {
    val words = input.split("\\s+")
    val rearrangedWords = Array(words(3), words(1), words(2), words(0), words(5), words(4))
    rearrangedWords.mkString(" ")*/

    /*val a = "The lines are printed in reverse order."   //0 to 7
    //output : In the are lines order printed reverse.
    val b = a.split(" ")
    val c = Array(b(4),b(0),b(2),b(1),b(6),b(3),b(5))
    val d = c.mkString(" ")
    val e = d.capitalize
    println(e)*/

    /*val inputString = "hello world"
    val outputString = capitalizeSecondSubstring(inputString)
    println(outputString) // Output: "hello World"
  }

  def capitalizeSecondSubstring(input: String): String = {
    val substrings = input.split(" ")
    if (substrings.length < 2) input // if there are not two substrings, return the input as is
    else {
      val firstPart = substrings(0)
      val secondPart = substrings(1).charAt(0).toUpper + substrings(1).substring(1)
      firstPart + " " + secondPart
    }*/

       val x = "hello world"
       val y = x.substring(0,5)
       println(y)

  }
}
