package GeeksForGeeks.Collections.Lists
import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object allJoinsProg {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit={
    var spark : SparkSession = SparkSession.builder().master("local[1]")
      .appName("JoinsProgramme").getOrCreate()

    var empDF = spark.read.option("header","true").
      csv("D:\\LEARNING\\Spark\\Coding Part\\employeesFile.csv")
    var deptDF = spark.read.option("header","true").
      csv("D:\\LEARNING\\Spark\\Coding Part\\departmentFile.csv")
    //empDF.printSchema()
    //empDF.show(false)
    //deptDF.printSchema()
    //deptDF.show(false)
    var innerDF = empDF.join(deptDF,empDF("empID")===deptDF("deptID"),"inner")
    //innerDF.show(false)
    var leftDF = empDF.join(deptDF, empDF("empID") === deptDF("deptID"), "left")
    //leftDF.show(false)
    var rightDF = empDF.join(deptDF, empDF("empID") === deptDF("deptID"), "right")
    //rightDF.show(false)
    var fullDF = empDF.join(deptDF, empDF("empID") === deptDF("deptID"), "full")
    //fullDF.show(false)
    var leftsemiDF = empDF.join(deptDF, empDF("empID") === deptDF("deptID"), "leftsemi")
    //leftsemiDF.show(false)
    var leftantiDF = empDF.join(deptDF, empDF("empID") === deptDF("deptID"), "leftanti")
    //leftantiDF.show(false)
    empDF.createOrReplaceTempView("employees")
    deptDF.createOrReplaceTempView("department")
    var allJoinDF = spark.sql("select * from employees e " +
      "inner join department d on e.empID=d.deptID")
    allJoinDF.show(false)

  }
}
