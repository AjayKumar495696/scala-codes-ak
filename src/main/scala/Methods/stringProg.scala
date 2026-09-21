package Methods

object stringProg {
  def main(args:Array[String]):Unit={
   var x = "Hello"
   var y = "There"
   var z = 23.4567
   var a = 45
   var b = "Hello\nMadam"
   var c = raw"Hello\nMadam"
   println(x)
   println(x.length)
   println(x.concat(y))
   println(f"The value of z is $z%.4f")
   println(f"The value of a is $a%05d")
   println(b)
   println(c)
  }
}
