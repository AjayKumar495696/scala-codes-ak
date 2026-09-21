package Methods

object closure_1 {
  def main(args:Array[String]):Unit={
    var a = 5
    var sum = (b: Int) => a + b
    println(s"The sum is "+sum(2))
  }
}
