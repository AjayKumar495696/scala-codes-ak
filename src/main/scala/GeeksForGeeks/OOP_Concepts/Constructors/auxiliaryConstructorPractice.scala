package GeeksForGeeks.OOP_Concepts.Constructors

class area(aName:String, aState:String){
  var aCount:Int = 0
  def display(): Unit ={
    println(s"The area is $aName")
    println(s"The state of the area is $aState")
    println(s"The number of people is $aCount")
  }
  def this(aName:String, aState:String, aCount:Int){
    this(aName, aState)
    this.aCount=aCount
  }
}
object auxiliaryConstructorPractice {
  def main(args:Array[String]):Unit={
    var obj = new area("Miyapur","Telangana", 500)
    obj.display()
  }
}
