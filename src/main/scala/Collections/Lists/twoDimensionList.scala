package Collections.Lists

import scala.collection.immutable._

// creating a two dimensional list
object twoDimensionList {
  def main(args:Array[String]):Unit={

    val twoDimList1 : List[List[Int]] = List(List(1,2,3),List(4,5,6),List(7,8,9))
    println("Two dimensional list is :"+twoDimList1)

  }

}
