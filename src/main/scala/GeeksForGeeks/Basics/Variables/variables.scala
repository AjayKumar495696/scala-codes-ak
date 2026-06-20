package GeeksForGeeks.Basics.Variables

object variables {
  def main(args:Array[String]):Unit={

    var x = 2       // var is mutable variable
    x = 3           // reassigning is possible with var
    println(x)      // it will print the result without any error

    val y = 4       // val is immutable variable
    //y = 5         // reassigning is not possible
    println(y)      // it will throw an error
  }
}
