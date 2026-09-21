package List_Vs_Array

object listArrayProgramme {

  def main(args:Array[String]):Unit={
    var myList = List(1,2,3,4)
    // myList(0) = 5
    println(myList)

    var myArray = Array(1,2,3,4)
    myArray(0) = 6
    for (i <- myArray) {
      println(i)
    }

  }

}
