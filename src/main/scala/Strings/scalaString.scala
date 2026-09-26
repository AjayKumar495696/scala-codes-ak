package Strings

object scalaString {

  def main(args:Array[String]):Unit={

    // Printing an input string
    val inputString : String = "Hello there"
    // println(inputString)

    // printing each element of the string one by one using for loop
    /*for (i <- inputString) {
      println(i)
    }*/

    // printing each element of the string one by one using foreach method
    // inputString.foreach(println)

    // finding the first element of a string
    // println(inputString(0))

    // finding the second element of a string
    // println(inputString(1))

    // finding the first element of a string using charAt() method
    val firstElement = inputString.charAt(0)
    // println(firstElement)

    // finding the length of a string
    val stringLength = inputString.length
    // println(stringLength)                  // it took space and all characters of a string

    // finding the last character of a string
    val lastCharacter = inputString.last
    // println(lastCharacter)

    // finding the index of a string using indexOf() method
    val stringIndex = inputString.indexOf("H")
    // println(stringIndex)

  }

}
