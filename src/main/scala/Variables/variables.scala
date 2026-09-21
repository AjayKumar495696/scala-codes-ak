package Variables

object variables {
  def main(args:Array[String]):Unit={

    val x = 4        // val is immutable variable
    // x = 5         // reassigning is not possible
    println(x)       // it will throw an error

    var y = 2      // var is mutable variable
    y = 3          // reassigning is possible with var
    println(y)     // it will print the result without any error
  }
}
