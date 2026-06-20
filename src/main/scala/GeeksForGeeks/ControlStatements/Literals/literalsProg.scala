package GeeksForGeeks.ControlStatements.Literals

object literalsProg {
  def main(args:Array[String]):Unit={
    var x = "Hi there"  // This is a single line string literal
    var y =
      """Hello
        |there
        |Ajay
        |""".stripMargin       // This is a multi line string

    println(x)
    println(y)

    // single line comment

    /*multi
    line
    comment*/
  }
}
