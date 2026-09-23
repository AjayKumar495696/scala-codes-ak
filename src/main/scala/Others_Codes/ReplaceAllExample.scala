package Others_Codes

object ReplaceAllExample extends App {

  val original = "I borned at 06:00 am on 24th June in 1997"

  // '\\d' regular expression matches any digit.
  val replaced1 = original.replaceAll("\\d", "#")

  val replaced2 = original.replaceAll("9", "X")

  // . matches any character except the new line like '\n'.
  val replaced3 = original.replaceAll(".", "A")

  // [A-Za-z] matches all the Uppercase and Lowercase letters
  val replaced4 = original.replaceAll("[A-Za-z]", "K")

  // [A-Z] matches all the Uppercase letters
  val replaced5 = original.replaceAll("[A-Z]", "L")

  // [a-z] matches all the Lowercase letters
  val replaced6 = original.replaceAll("[a-z]", "M")

  println(original)

  println(replaced1)
  println(replaced2)
  println(replaced3)
  println(replaced4)
  println(replaced5)
  println(replaced6)

}
