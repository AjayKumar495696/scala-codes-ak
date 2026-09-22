package Keywords

class area {            // class is a keyword and area is a class name
  var name = "Anusha"    // var is a keyword and name is variable name
  var age = 25
  var flatNum = 502
  def display(): Unit ={         // def is a keyword and display is method name
    println("My name is "+name+" and my age is "+age)
    println("My house number is "+flatNum)
  }
}

object keyWords_2 {                          // object is a keyword and keyWords_2 is object name
  def main(args:Array[String]):Unit={        // def is a keyword, main is a method name and args is variable name
  var obj = new area()                       // obj is a method name
  obj.display()

  // Here keywords are : package, class, var, def, object, new and println

  // Scala all keywords are :
  // abstract, case, catch, class, def, do, else, extends, false, final, finally, for, forSome,
  // if, implicit, import, lazy, match, new, null, object, override, package, private, protected,
  // return, sealed, super, this, throw, trait, true, try, type, val, var, while, with, yield,
  // >: , ==> , => , = , <% , <: , <-- , <- , # , @ , : , -

  }
}
