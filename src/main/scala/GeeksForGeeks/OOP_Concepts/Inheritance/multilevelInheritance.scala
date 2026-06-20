package GeeksForGeeks.OOP_Concepts.Inheritance

class Father1 {
  var fName = "Govardhan"
}
class Son1 extends Father1{
  var sName = "Ajay"
}
class Daughter1 extends Son1 {
  var dName = "Saritha"
  def display(): Unit ={
    println(s"My father name is $fName")
    println(s"My name is $sName")
    println(s"My sister name is $dName")
  }
}
object multilevelInheritance {
  def main(args:Array[String]):Unit={
    var obj = new Daughter1()
    obj.display()
  }
}
