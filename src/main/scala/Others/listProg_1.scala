package Others
object listProg_1 {
  def main(args:Array[String]):Unit= {
    var a = Map("Ajay"->"Hello", "Bharath"->"Hi")
    var b = a.get("Ajay")
    var c = a.get("Charan")
    println(patternMatc1(a.get("Ajay")))
    println(patternMatc1(c))
  }
  def patternMatc1 (x: Option[String]) = x match {
    case Some(z) => (z)
    case None => ("Key not Found")
  }
}
