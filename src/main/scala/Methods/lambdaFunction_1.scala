package Methods

object lambdaFunction_1 {
  def main(args:Array[String]):Unit={
     // var exp1 = (x:Int) => x + 2
     // println(exp1(5))
    var x = List (1,2,3,4,5)
    var y = x.map(x => x*x)
    println(y)
  }
}
