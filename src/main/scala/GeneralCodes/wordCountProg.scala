package GeneralCodes

object wordCountProg {
  def main(args:Array[String]):Unit={
    val inputList = List("Akhil is nice","Arun is good","Akhil is great")
    val words = inputList.flatMap(x => x.split(" "))
    println(words)
    val keyData = words.map(x => (x,1))
    println(keyData)
    val groupedData = keyData.groupBy(_._1)
    println(groupedData)
    val result = groupedData.mapValues(x => {x.map(_._2).sum})
    println(result)
    result.foreach(println)
  }
}
