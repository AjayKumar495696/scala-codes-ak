package Yield

// my input list is : List(1,2,3)
  // my output list is : List(2,4,6) means double the each element of the list
  // 1.achieve this using map function 2.using yield keyword

object yieldProg {
def main(args:Array[String]):Unit={

  // finding doubled list using map
  val inputList1 = List(1,2,3)
  val doubledList1 = inputList1.map(x => x*2)
  println(doubledList1)

  // finding doubled list using yield
  val inputList2 = List(1,2,3)
  val doubledList2 = for (i <- inputList2) yield i*2
  println(doubledList2)

}
}
