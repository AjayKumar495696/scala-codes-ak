package OOP_Concepts.Inheritance

class grandfather2 {
  var gfName = "Nageshwar Rao"
}

class father2 extends grandfather2 {
  var fName = "Nagarjuna"
}

class son2 extends father2 {
  var sName = "Naga Chaithanya"
  def display(): Unit ={
    println(s"Grand father name is $gfName")
    println(s"Father name is $fName")
    println(s"Son name is $sName")
  }
}
object multilevelInheritance {
  def main(args:Array[String]):Unit={
     var obj = new son2()
     obj.display()
  }
}
