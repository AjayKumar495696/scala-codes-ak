package Others

// Pattern Matching example in Scala
object PatternMatchingExample {
  def main(args:Array[String]):Unit={
    println(patrnMatching(0))
    println(patrnMatching(1))
    println(patrnMatching(2))
    println(patrnMatching("Wgl"))
    println(patrnMatching("Wgl1"))
  }
  def patrnMatching(x : Any):String = x match {
    case 0 => "Zero"
    case 1 => "One"
    case "Wgl" => "Warangal"
    case _ => "Others"
  }
}
