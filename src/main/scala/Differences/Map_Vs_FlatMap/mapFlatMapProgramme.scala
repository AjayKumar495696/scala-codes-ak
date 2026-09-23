package Differences.Map_Vs_FlatMap

// Map Vs FlatMap difference
object mapFlatMapProgramme {

  def main(args:Array[String]):Unit={
    val myList1 = List(1,2,3,4)
    val doubledList = myList1.map(x=>x*2)
    println(doubledList)

    val myList2 = List(1,2,3,4)
    val flatMapList = myList2.flatMap(x=>List(x,x*2))
    println(flatMapList)
  }

}
