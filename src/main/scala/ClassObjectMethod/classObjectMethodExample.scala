package ClassObjectMethod

class branch {

  var branchName = "ECE"
  var totalStudents = 300

  def studentsData()={
    println(s"The branch name is $branchName")
    println(s"The total students in the branch are $totalStudents")
  }

}

object classObjectMethodExample {

  def main(args:Array[String]):Unit={

    var obj = new branch()
    obj.studentsData()

  }
}

// Here branch is class name
// classObjectMethodExample is object name
// studentData, main are method names
