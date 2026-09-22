package OOP_Concepts.Constructors

class country(){
  def show(): Unit = {
    println("The number of ppl is 120 Billion")
  }
}
object defaultPrimaryConstructor {
  def main(args:Array[String]):Unit={
    var obj = new country()
    obj.show()
  }
}
