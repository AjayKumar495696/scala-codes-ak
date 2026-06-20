package GeeksForGeeks.Methods

object anonymousFunction {
   def main(args:Array[String]):Unit={
     var func1 = (a:Int,b:Int) => a + b
     var func2 = (_:Int) + (_:Int)
     println(func1(1,2))
     println(func2(2,3))
   }
}
