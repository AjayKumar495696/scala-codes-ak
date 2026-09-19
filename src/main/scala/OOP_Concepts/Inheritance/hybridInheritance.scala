package OOP_Concepts.Inheritance

trait parents5 {
  var fName = "Mahesh Babu"
  var mName = "Namratha"
}

trait son5 extends parents5 {
  var sName = "Goutham"
}

trait daughter5 extends parents5 {
  var dName = "Sithara"
}

class highschool5 extends son5 with daughter5 {
  var hName = "Delhi Public School"
  def display1(): Unit ={
    println(s"Father Name is $fName")
    println(s"Son name is $sName")
    println(s"Mother name is $mName")
    println(s"Daughter name is $dName")
    println(s"High School name is $hName")
  }
}
object hybridInheritance {
  def main(args:Array[String]):Unit={
     var obj = new highschool5()
     obj.display1()
  }
}
