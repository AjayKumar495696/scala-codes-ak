package Others.Lists

object matchingPatternProg {
  def main(args:Array[String]):Unit= {
    val l1 = List(1,3,6,7,8)
    val l2 = List(2,3,4,5,7,12,13)
    for ((value,index) <- l2.zipWithIndex) {
      println(listMatchPatrn(value,index,l1))
    }

  }
  def listMatchPatrn(value:Int,index:Int,l1:List[Int]):Int = value match {
    case x if l1.contains(x) => index
    case _ => -1
  }
}
