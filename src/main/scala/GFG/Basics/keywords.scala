package GeeksForGeeks.Basics

class sectionA {
  var name = "Akhil"
  var age = 20
  def show(): Unit ={
    println(s"His name is $name")
    println("His age is "+age)
  }
}
object keywords {
  def main(args:Array[String]):Unit={

    var obj = new sectionA
    obj.show()
  }
}

//here package, class, var, def, object, new, Unit are keywords.