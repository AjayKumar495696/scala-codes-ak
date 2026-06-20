package GeeksForGeeks.Basics.Identifiers

object identifiers {
  def main(args:Array[String]):Unit={

    var name = "Ajay"
    var Age = 27
    var `area` = "Hyderabad"
    var _country = "India"
    var branch123 = "CSE"
    var _1_GFhj_name_+ = "Hello"

    println("My name is : "+name)
    print(s"My age is : $Age\n")
    println("My area is : "+`area`)
    println("My country is : "+_country)
    println(branch123)
    println("Given word is : "+_1_GFhj_name_+)

    // keywords : package, object, def, var

    // identifiers : identifiers, main, args, name, Age, `area`, _country, branch123, _1_GFhj_name_+, +
    // here + is operator identifier and _1_GFhj_name_+ is a mixed identifier

    // invalid identifiers : 123Name, $Name, -name
  }
}
