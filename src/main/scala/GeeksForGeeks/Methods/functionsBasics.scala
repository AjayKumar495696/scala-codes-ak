package GeeksForGeeks.Methods

object functionsBasics {
  def main(args:Array[String]):Unit={
    println(s"The sum of numbers is ${sumOfNumbers(3,4)}")
  }
  def sumOfNumbers(a:Int, b:Int): Int ={
    var sum = 0
    sum = a + b
    return sum
  }
}
