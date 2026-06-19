// Creating a mapList and FlatMapList
object MapVsFlatMapExample {
  def main(args:Array[String]):Unit={
    val inputList = List(1,2,3)
    val mapList = inputList.map(x => x * 2)
    println(mapList)  //List(2,4,6)
    val flatMapList = inputList.flatMap(x => List(x,x*2))
    println(flatMapList) //List(1,2,2,4,3,6)
  }
}
