package PracticeCodes_Scala

object practiceCode_Scala_1 {
  def main(args:Array[String]):Unit={

    val a = List(1,2,3,4)
    val b = a.flatMap(x=>List(x,x*x))
    println(b)

  }
}