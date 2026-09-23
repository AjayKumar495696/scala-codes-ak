package Others_Codes

object fibonacci_2 {
  def main(args:Array[String]):Unit={
    // example: 3 4 5 6 7 8 9
    // fibonacci series: 0 1 1 2 3 5 8 13
    // output: 4 -1 5 -1 -1 6 -1
    val a1 = Array(3,4,5,6,7,8,9)
    val f1 = Array(0,1,1,2,3,5,8,13)
    for ((value,index) <- f1.zipWithIndex){
      println(matchPatrn1(value,index,a1))
    }
  }
  def matchPatrn1(value:Int,index:Int,a1:Array[Int]): Int = value match {
    case x if a1.contains(x) => index
    case _ => -1
  }
}