package GeeksForGeeks.OOP_Concepts.Inheritance

class Father2 {
  var fName = "Govardhan"
  var sName = "Ajay"
  var dName = "Saritha"
}
class Son2 extends Father2 {
  var sAge = 27
  def show1(): Unit ={
    println(s"His son name is $sName")
    println(s"His son age is $sAge")
  }
}
class Daughter2 extends Father2 {
  var dAge = 29
  def show2(): Unit ={
    println(s"His daughter name is $dName")
    println(s"His daughter age is $dAge")
  }
}
object hierarchialInheritance {
  def main(args:Array[String]):Unit={
    var obj1 = new Son2()
    var obj2 = new Daughter2
    obj1.show1()
    obj2.show2()
  }
}
