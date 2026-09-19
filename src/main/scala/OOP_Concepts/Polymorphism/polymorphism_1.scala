package OOP_Concepts.Polymorphism

class example1(){
  def func1(a:Int): Unit ={
    println(s"The given value is $a")
  }
  def func1(a:Int,b:Int): Unit ={
    println(s"The sum of a and b is ${a+b}")
  }
  def func1(a:Int,b:Int,c:Int): Unit ={
    println(s"The multiplication of a, b and c is ${a*b*c}")
  }
}
object polymorphism_1 {
  def main(args:Array[String]):Unit={
     var obj= new example1()
     obj.func1(2)
    obj.func1(2,3)
    obj.func1(2,3,4)
  }
}
