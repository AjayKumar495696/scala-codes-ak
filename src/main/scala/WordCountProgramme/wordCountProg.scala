package WordCountProgramme

   // my input list is : List("David is good","David is Nice","David")
   // my output should be : Map(David -> 3, is -> 2, good -> 1, Nice -> 1)
   // (or)
    /* (David,3)
       (is,2)
       (good,1)
       (Nice,1) */

object wordCountProg {
  def main(args:Array[String]):Unit={

    val inputList = List("David is good","David is Nice","David")
    val words = inputList.flatMap(x => x.split(" "))
    //println(words)
    val keyData = words.map(x => (x,1))
    //println(keyData)
    val groupedData = keyData.groupBy(_._1)
    //println(groupedData)
    val result = groupedData.mapValues(x => {x.map(_._2).sum})
    println(result)
    result.foreach(println)

  }
}
