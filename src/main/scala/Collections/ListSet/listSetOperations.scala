package Collections.ListSet

// All operations on ListSet
import scala.collection.immutable.ListSet

object listSetOperations {

  def main(args:Array[String]):Unit={

    // Creating a ListSet
    val listSet1 : ListSet[String] = ListSet("Anusha","Bindhu","Chitra","Divya")
    val listSetInt1 : ListSet[Int] = ListSet(1,2,3,4)
    // println(s"My listSet1 is : $listSet1")
    // println(s"My listSetInt1 is : $listSetInt1")

    // Checking elements in a ListSet
    // println(listSet1("Anusha"))
    // println(listSetInt1(3))
    // println(listSet1("Eesha"))
    // println(listSetInt1(5))
    // println(s"Anusha = ${listSet1("Anusha")}")
    // println(s"Bindhu = ${listSet1("Bindhu")}")
    // println(s"Fathima = ${listSet1("Fathima")}")
    // println(s"1 = ${listSetInt1(1)}")
    // println(s"2 = ${listSetInt1(2)}")
    // println(s"6 = ${listSetInt1(6)}")

    // Checking elements in a ListSet using contains method
    val containsListSet1 = listSet1.contains("Anusha")
    // println(containsListSet1)
    val containsListSetInt1 = listSetInt1.contains(1)
    // println(containsListSetInt1)
    val containsListSet2 = listSet1.contains("Ganga")
    // println(containsListSet2)
    val containsListSetInt2 = listSetInt1.contains(7)
    // println(containsListSetInt2)

    // Adding an element to a ListSet
    val listSet2 : ListSet[String] = listSet1 + "Eesha"
    val listSetInt2 = listSetInt1 + 5
    // println(listSet2)
    // println(listSetInt2)

    // Adding two ListSet
    val listSet3 = listSet2 ++ ListSet("Fathima","Ganga","Harika")
    val listSetInt3 = listSetInt2 ++ ListSet(6,7,8)
    // println(listSet3)
    // println(listSetInt3)

    // Removing an element from a ListSet
    val listSet4 = listSet3 - "Anusha"
    val listSetInt4 = listSetInt2 - 1
    // println(listSet4)
    // println(listSetInt4)

    // Creating an empty ListSet
    val emptyListSet1 : ListSet[String] = ListSet.empty[String]
    val emptyListSetInt1 : ListSet[Int] = ListSet.empty[Int]
    // println(emptyListSet1)
    // println(emptyListSetInt1)

    // Union of two ListSet
    val listSet5 = ListSet("Anusha","Bindhu","Indhu","Jamuna")
    val unionListSet1 = listSet1.union(listSet5)
    // println(unionListSet1)
    val listSetInt5 = ListSet(1,2,9,10)
    val unionListSetInt1 = listSetInt1.union(listSetInt5)
    // println(unionListSetInt1)

  }
}
