package Yield

// Finding doubled list using yield
object yieldProg {
def main(args:Array[String]):Unit={

  val inputList = List(1,2,3)
  val doubledList = for (i <- inputList) yield i*2
  println(doubledList)

  }
}
