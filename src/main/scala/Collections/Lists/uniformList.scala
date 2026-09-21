package Collections.Lists

import scala.collection.immutable._

object uniformList {
  def main(args:Array[String]):Unit={

    val inputList1 = List.fill(3)("Scala")                  // repeats Scala 3 times
    println("The uniform list is :"+inputList1)

    val inputList2 = List.fill(4)(6)                       // repeats 6, 4 times
    println(s"The second uniform list is : $inputList2")

  }
}
