package OOP_Concepts.Inheritance

trait father4 {
  var fName = "Dhoni"
}

trait mother4 {
  var mName = "Sakshi"
}

class daughter4 extends father4 with mother4 {
  var dName = "Jeeva"
  def display(): Unit ={
    println(s"father name is $fName")
    println(s"Mother name is $mName")
    println(s"Daughter name is $dName")
  }
}
object multipleInheritance {
def main(args:Array[String]):Unit={
    var obj = new daughter4()
    obj.display()
 }
}
