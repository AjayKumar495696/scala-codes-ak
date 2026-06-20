package GeeksForGeeks.Methods

class Animals {
  def numbers(): Unit ={
    println("We have two Animals")
  }
}
class Dogs extends Animals {
  override def numbers(): Unit ={
    println("We have two Dogs")
  }
}
object methodOverriding {
   def main(args:Array[String]):Unit={
      var obj = new Dogs()
      obj.numbers()
   }
}
