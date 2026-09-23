package Others_Codes

object formatPhoneNumbersAndSort {
  def main(args:Array[String]):Unit={
    val Ind_Phone_Numbers = List("07895462130", "919875641230", "9195969878", "9912345678", "+919876543210")

    val formatted = Ind_Phone_Numbers.map { numbr =>
      val formatNum = numbr.replaceAll("[^0-9]", "")
      val enrichNum = if
      (formatNum.startsWith("91")) formatNum else "91" + formatNum.dropWhile(_ == '0')
      "+91 " + enrichNum.slice(2, 7) + " " + enrichNum.slice(7, 12)
    }.sorted

    //println(formatted)
    formatted.foreach(println)
  }
}
