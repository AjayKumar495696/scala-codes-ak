package Others.Lists

import scala.collection.immutable._

object printingList {
  def main(args:Array[String]):Unit={
    val myList1 : List[String] = List("Apple","Banana","Carrot","Dilkush")
    val myList2 : List[Int] = List(11,12,13,14,15)
    val emptyList : List[Nothing] = List()
    println("First list is : ")
    println(myList1)

    println("Second list is : ")
    for (i <- myList2) {
      println(i)
    }

    println("Third list is : ")
    myList1.foreach(x=>{println(x)})

    println("Fourth list is : ")
    println(emptyList)
  }
}
