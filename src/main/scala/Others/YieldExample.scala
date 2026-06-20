package Others

// A program for how to use yield keyword in Scala
object YieldExample {
def main(args:Array[String]):Unit={
  val numbersList = List(1,2,3)
  val doubledList = for (i <- numbersList) yield i*2
  println(doubledList)
}
}
