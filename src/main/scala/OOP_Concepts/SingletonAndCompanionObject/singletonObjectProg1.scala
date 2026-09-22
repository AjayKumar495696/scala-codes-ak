package OOP_Concepts.SingletonAndCompanionObject

// Scala program with one singleton object which is singletonObjectProg1

class ECE {
  var name = "Anusha"
  var age = 25
  def display(): Unit ={
    println(s"Her name is $name")
    println(s"Her age is $age")
  }
}

// This is the singleton object
object singletonObjectProg1 {
  def main(args:Array[String]):Unit={
    var obj = new ECE()
    obj.display()
  }

}
