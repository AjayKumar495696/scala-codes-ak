package Others.Lists

import scala.collection.immutable._

object twoDimensionalList {
  def main(args:Array[String]):Unit={
    val twodimlist : List[List[Int]] = List(
      List(1,2,3),List(4,5,6),List(7,8,9)
    )
    println("The twodimensional list is : "+twodimlist)
  }
}
