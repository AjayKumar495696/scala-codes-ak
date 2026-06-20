package GeeksForGeeks.OOP_Concepts.Inheritance

class Father {
  println("My father name is Govardhan")
}
class Son extends Father {
  var name : String = "Ajay"
  def display(): Unit ={
    println(s"My name is $name")
  }
}
object singleInheritance {
  def main(args:Array[String]):Unit={
     new Son().display()
  }
}
