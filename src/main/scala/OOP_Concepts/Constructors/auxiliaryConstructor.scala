package OOP_Concepts.Constructors

class language(lName:String,lCount:Int){
  var lState:String = ""
  def show(): Unit ={
   println(s"The language name is $lName")
   println(s"The language count is $lCount")
   println(s"The state of the language is $lState")
  }
  def this(lName:String,lCount:Int,lState:String) {
    this (lName, lCount)
    this.lState=lState
  }
}
object auxiliaryConstructor {
  def main(args:Array[String]):Unit={
    var obj = new language("Scala",100,"Telangana")
    obj.show()
  }
}
