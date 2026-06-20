package GeeksForGeeks.OOP_Concepts.Constructors

class c4 (name:String, age:Int, branch:String) {
  def show(): Unit ={
   println(s"Name of the student is $name")
    println(s"Age of the student is $age")
    println(s"Branch of the student is $branch")
  }
}

object primaryConstructor_1 {
  def main(args:Array[String]):Unit={
  var obj = new c4("Ajay",27,"ECE")
  obj.show()
  }
}
