package GeeksForGeeks.OOP_Concepts.Operators

object operatorsProg {
  def main(args:Array[String]):Unit={
    var a = 40
    var b = 30
    println(s"Sum of a and b is ${a+b}")
    println(s"Subtraction of a and b is ${a-b}")
    println(s"Multiplication of a and b is ${a*b}")
    println(s"Division of a and b is ${a/b}")
    println(s"Modulus of a and b is ${a%b}")
    println(s"a and b are equal ${a==b}")
    println(s"a and b are not equal ${a!=b}")
    println(s"a is greater than b ${a>b}")
    println(s"a is less than b ${a<b}")
    println(s"a is greater than or equal to b ${a>=b}")
    println(s"a is less than or equal to b ${a<=b}")
  }
}
