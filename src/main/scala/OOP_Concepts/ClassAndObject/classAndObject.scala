package OOP_Concepts.ClassAndObject

class Smartphone(name : String, price : Int) {
  println(s"The mobile is $name")
  println(s"The cost is $price")
}

class Smartphone2 {
  var country: String = "India"
  var count: Int = 20

  def show(): Unit = {
    println(s"It is from $country")
    println(s"Total mobiles are $count")
  }
}
object classAndObject {
  def main(args:Array[String]):Unit={
    var obj = new Smartphone("OnePlus",500)
    new Smartphone2().show()
  }
}
