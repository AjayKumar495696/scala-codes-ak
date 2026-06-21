package GeeksForGeeks.Collections.Lists

import scala.collection.immutable.List
object immutableListProg {
  def main(args:Array[String]):Unit={

    val list1 : List[String] = List("Apple", "Banana", "1234", "Carrot")

    // printing the list
    println("list1 is :")
    println(list1)

    // printing all the elements of a list using for loop
    println("Elements in list1 are :")
    for (i <- list1) {
      println(i)
    }

    // printing all the elements of a list using foreach method
    println("Elements in list1 are :")
    list1.foreach(println)

  }

}
