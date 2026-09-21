package Datatypes

object dataTypes {
  def main(args:Array[String]):Unit={

    var a1 : Boolean = true
    var a2 : Byte = 120
    var a3 : Float = 2.345612f
    var a4 : Int = 4
    var a5 : Short = 38
    var a6 : Double = 3.47586
    var a7 : Char = 'F'

    if (a1 == true ) {
      println("boolean : Hi there")
    }
    println("byte : "+a2)
    println(s"float : $a3")
    println("int : "+a4)
    println("short : "+a5)
    println("double : "+a6)
    println("char : "+a7)
  }
}
