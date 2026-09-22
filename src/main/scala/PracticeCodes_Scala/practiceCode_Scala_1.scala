package PracticeCodes_Scala


object practiceCode_Scala_1 {
  def main(args:Array[String]):Unit={
    var list1 = List("He is good", "He is nice", "He")
    var words = list1.flatMap(x=>x.split(" "))
    var keyData = words.map(x=>(x,1))
    var groupedData = keyData.groupBy(_._1)
    var finalResult = groupedData.mapValues(x=>{
      x.map(_._2).sum
    })
    println(finalResult)
    finalResult.foreach(println)
  }
}