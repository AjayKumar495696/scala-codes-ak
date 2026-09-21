package Collections.ListBuffer

import scala.collection.mutable.ListBuffer

  // different operations on list buffer

object operationsOnListBuffer {
  def main(args:Array[String]):Unit={

    var name1 = ListBuffer[String]()
    name1 += "Apple"
    name1 += "Banana"
    name1 += "Carrot"
    //println(name1)

    // accessing 2nd index element of listBuffer
    //println(name1(2))


    // creating instance of a listBuffer
    var name2 = ListBuffer[String]()

    // adding single element to listBuffer
    name2 += "Ajay"
    //println(name2)

    // adding two or more elements to listBuffer
    name2 += ("Bharath","Chandhu","Dinesh")
    //println(name2)

    // adding one or more elements to listBuffer using append method
    name2.append("Eshwar","Falgun","Ganesh")
    //println(name2)

    // removing one element from listBuffer
    name2 -= "Ganesh"
    //println(name2)

    // removing two or more elements from listBuffer
    name2 -= ("Falgun","Eshwar")
    //println(name2)


    var name3 = ListBuffer("Akhil","Balu","Charan","Devesh","Eshwar","Falgun","Gopi")

    // removing 3rd index element from listBuffer
    name3.remove(3)
    //println(name3)


    var name4 = ListBuffer("Akhil","Balu","Charan","Devesh","Eshwar","Falgun","Gopi")

    // removing start from 2nd index element to next 4 elements
    name4.remove(2,4)
    //println(name4)


    var name5 = ListBuffer(1,2,3)

    // appending sequence of elements to list buffer
    name5 ++= Seq(4,5,6)
    //println(name5)

    // adding element 10 at 2nd index of the list buffer
    name5.insert(2,10)
    //println(name5)

    // updating 1st index element with 35
    name5.update(1,35)
    //println(name5)

    // converting list buffer to immutable list
    val list = name5.toList
    //println(list)

  }
}
