package GeeksForGeeks
class PlayerInventory {
  private var items: Vector[String] = Vector("lumber", "stone", "magic potion")

  def getItems(): Vector[String] = {
    items
  }

  def addToInventory(item: String): Unit = {
    items = items :+ item  // Reassign items to include the new item
  }

  def dropFromInventory(item: String): Unit = {
    val index = items.indexOf(item)
    if (index != -1) {
      items = items.patch(index, Nil, 1) // Remove the item at the found index
    }
  }
}

object codingQsns {
  def main(args: Array[String]): Unit = {
    val p = new PlayerInventory  // Use val instead of var as the reference does not change

    p.addToInventory("lumber")
    p.dropFromInventory("stone")

    println(p.getItems().mkString(", "))  // Print items separated by commas
  }
}
