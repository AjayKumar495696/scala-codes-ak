package OOP_Concepts.SingletonAndCompanionObject

class SingletonAndCompanionObject {
  var name = "Ajay"
  def show(): Unit ={
    println(s"Name of the person is $name")
  }
}
object SingletonAndCompanionObject {
  def main(args:Array[String])={
     var obj = new SingletonAndCompanionObject
     obj.show()
  }
}
