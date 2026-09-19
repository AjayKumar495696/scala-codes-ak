package OOP_Concepts.Inheritance

class father1 {
  var fName = "Sachin Tendulkar"
}

class son1 extends father1 {
  var sName = "Arjun Tendulkar"
  def display(): Unit ={
    println(s"Father name is $fName")
    println(s"Son name is $sName")
  }
}
object singleInheritance {
  def main(args:Array[String]):Unit={
    var obj = new son1()
    obj.display()

  }
}
