package Collections.Lists

// Printing a list in different ways
object printingList {

  def main(args:Array[String]):Unit={

    val myList1 : List[String] = List("Anusha", "Bindhu", "Chitra", "Divya")
    val myList2 : List[Int] = List(1,2,3,4)
    val myList3 : List[Char] = List('A','B','c', 'd')

    println("First list is :")
    println(myList1)

    println("Second list is :")
    for (i <- myList2) {
      println(i)
    }

    println("Third list is :")
    myList3.foreach{x => println(x)}

  }
}
