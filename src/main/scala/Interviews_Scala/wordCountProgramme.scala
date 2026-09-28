package Interviews_Scala

// scala word count programme using collection operations
object wordCountProgramme {

  def main(args:Array[String]):Unit={

    val inputList = List("Anusha is good", "Anusha is nice", "Anusha")
    val words = inputList.flatMap(x=>x.split(" "))
    val keyWords = words.map(x=>(x,1))
    val groupedData = keyWords.groupBy(_._1)
    val finalResult = groupedData.mapValues(x=>{x.map(_._2).sum})
    println(finalResult)

  }

}
