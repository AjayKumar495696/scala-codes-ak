package GeeksForGeeks.OOP_Concepts.Inheritance

trait area {
  var aName = "Narsampet"
  var aCount = 1000
}
trait male extends area {
  var mName = "Govardhan"
  var mAge = 45
}
trait female extends area {
  var fName = "Rajeshwari"
  var fAge = 42
}
class kid extends male with female {
  var kName = "Ajay"
  def show3(): Unit ={
    println(s"Area is $aName")
    println(s"father age is $mAge")
    println(s"mother age is $fAge")
    println(s"Kid name is $kName")
  }
}
object hybridInheritance {
  def main(args:Array[String]):Unit={
     new kid().show3()
  }
}
