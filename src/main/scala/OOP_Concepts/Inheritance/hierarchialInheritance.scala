package OOP_Concepts.Inheritance

class parents3 {
  var fName = "Chiranjeevi"
  var mName = "Surekha"
}

class son3 extends parents3 {
  var sName = "Ram Charan"
  def display1(): Unit ={
    println(s"Father name is $fName")
    println(s"Son name is $sName")
  }
}

class daughter3 extends parents3 {
  var dName = "Susmitha"
  def display2(): Unit ={
    println(s"Mother name is $mName")
    println(s"Daughter name is $dName")
  }
}
object hierarchialInheritance {
  def main(args:Array[String]):Unit={
    var obj1 = new son3()
    var obj2 = new daughter3()
    obj1.display1()
    obj2.display2()
  }
}
