package Collections.Lists

import scala.collection.immutable._

object operationsOnList {
  def main(args:Array[String]):Unit={

    val inputList1 = List(1,2,3,4,5,6)

    // finding head of the list
    println("The head of the list is :")
    println(inputList1.head)

    // finding tail of the list
    println("The tail of the list is :")
    println(inputList1.tail)

    // checking whether the list is empty or not
    println("Checking the input list is empty or not :")
    println(inputList1.isEmpty)

    // reversing the list
    println("Reversing the input list :")
    println(inputList1.reverse)

    // printing 3rd element of a list
    println("The third element of list is :")
    println(inputList1(2))

  }

}
