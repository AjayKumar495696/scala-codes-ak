package OOP_Concepts.SingletonAndCompanionObject

// Scala program with companion object
class companionObject {
  var name = "Chitra"
  var age = 27
  def display(): Unit ={
    println(s"Her name is $name")
    println(s"Her age is $age")
  }
}
object companionObject {
  def main(args:Array[String])={
     var obj = new companionObject()
     obj.display()

  }
}
