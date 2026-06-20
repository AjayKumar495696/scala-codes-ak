package GeeksForGeeks.OOP_Concepts.Inheritance

trait Father3 {
  var fName = "Govardhan"
}
trait Mother3 {
  var mName = "Rajeshwari"
}
class Son3 extends Father3 with Mother3 {
  var sName = "Ajay"
  def show(): Unit ={
    println(s"His father name is $fName")
    println(s"His mother name is $mName")
    println(s"His name is $sName")
  }
}
object multipleInheritance {
def main(args:Array[String]):Unit={
  var obj = new Son3()
  obj.show()
}
}
