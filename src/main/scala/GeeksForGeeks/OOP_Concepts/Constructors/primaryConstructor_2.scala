package GeeksForGeeks.OOP_Concepts.Constructors

class state (var sName:String = "Telangana", sCount:Int = 100){
  def display(): Unit ={
    println(s"The name of the state is $sName")
    println(s"The number of people are $sCount")
  }
}
object primaryConstructor_2 {
  def main(args:Array[String]):Unit={
     var obj = new state()
     obj.display()
  }
}
