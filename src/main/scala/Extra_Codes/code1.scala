package Extra_Codes

// splitting the string
// splitting the elements of a List

object code1 {

  def main(args:Array[String]):Unit={

    val a : String = "He is going to market"
    val b = a.split(" ")
    b.foreach(println)

    val c : List[String] = List("He is an hero", "He acts in movies")
    val words = c.flatMap(x => x.split(" "))
    println(words)
  }

}
