package OOP_Concepts.SingletonAndCompanionObject

// Scala program with 2 singleton objects which are CSE and singletonObjectProg2

// This is singleton object
object CSE {
  var name = "Bindhu"
  var age = 26
  def display(): Unit ={
    println(s"Her name is $name")
    println(s"Her age is $age")
  }
}

// This is singleton object
object singletonObjectProg2 {
  def main(args:Array[String]):Unit={
    CSE.display()
  }

}
