package Differences.Recursion_Vs_TailRecursion

// Factorial Programme
object standardRecursion {

  def main(args:Array[String]):Unit={
    println(fact(5))
  }

    def fact(n:Int):Int={
      if (n==1) 1
      else n * fact(n-1)
    }

}
