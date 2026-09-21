package ControlStatements.Literals

object literalsProg {
  def main(args:Array[String]):Unit={

    var a = 5            // This is integer literal
    var b = 'H'          // This is character literal
    var c = true         // This is boolean literal
    var d = "Hi there"   // This is a string literal

    var e =
      """Hello
        |there
        |Ajay
        |""".stripMargin       // This is a multi-line string literal

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

  }
}
