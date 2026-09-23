package Others_Codes

import scala.collection.mutable.ListBuffer

object listBufferOperations {
  def main(args:Array[String]):Unit={
    var myListBuffer = ListBuffer[String]()
    myListBuffer += "Apple"
    myListBuffer += "Banana"
    myListBuffer += ("Chocolate","Dhosha")
    myListBuffer.append("Egg","Flower")
    myListBuffer -= ("Egg")
    myListBuffer -= ("Dhosha","Flower")
      println(myListBuffer)
      println(myListBuffer(1))
    myListBuffer += ("Lion","Tiger","Horse")
      println(myListBuffer)
    myListBuffer.remove(1,3)
      println(myListBuffer)

    val myListBuffer1 = ListBuffer[Int]()
    myListBuffer1 ++= Seq(1,2,3,4)
      println(myListBuffer1)
    myListBuffer1.insert(1,10)
      println(myListBuffer1)
    myListBuffer1 -= 3
      println(myListBuffer1)
    myListBuffer1.update(1,20)
      println(myListBuffer1)
    val myList = myListBuffer1.toList
      println(myList)
  }

}
