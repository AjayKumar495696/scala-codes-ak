package OOP_Concepts.Polymorphism

class example2(){
  def func2(a:String,b:String): Unit ={
    println(s"Her name is $a and her state is $b")
  }
  def func2(a:String,b:Int): Unit ={
    println(s"The movie is $a and it is collected $b cr")
  }
  def func2(a:Int,b:Int): Unit ={
    println(s"The sum of both is ${a+b}")
  }
}
object polymorphism_2 {
  def main(args:Array[String]):Unit={
    var obj = new example2()
    obj.func2("Anusha","Telangana")
    obj.func2("Bahubali",1800)
    obj.func2(5,6)
  }
}
