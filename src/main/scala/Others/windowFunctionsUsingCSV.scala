package Others

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{dense_rank, desc, rank, row_number}
object windowFunctionsUsingCSV {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit={
    val spark : SparkSession = SparkSession.builder().master("local[1]")
      .appName("Finding rownumber,rank,denserank from empFile").getOrCreate()
    import spark.implicits._
    val empDF = spark.read.option("header","true").csv("src\\main\\resources\\Interviews\\empFile.csv")
    val deptDF = spark.read.option("header","true").csv("src\\main\\resources\\Interviews\\deptFile.csv")
    //empDF.show(false)
    //deptDF.show(false)
    val innerJoinDF = empDF.join(deptDF,empDF("deptid")===deptDF("deptid"),"inner")
    //innerJoinDF.show(false)
    val windowSpec = Window.partitionBy(empDF("deptid")).orderBy(desc("empsal"))
    val windowFunctionsDF = innerJoinDF
      .withColumn("rownumber",row_number().over(Window.partitionBy(empDF("deptid")).orderBy(desc("empsal"))))
      .withColumn("rank",rank().over(Window.partitionBy(empDF("deptid")).orderBy(desc("empsal"))))
      .withColumn("denserank",dense_rank().over(Window.partitionBy(empDF("deptid")).orderBy(desc("empsal"))))
    val requiredWindowFunctionsDF = windowFunctionsDF
      .select("empid","empname","deptname","empsal","rownumber","rank","denserank")
    //requiredWindowFunctionsDF.show(false)
    val secondHighestSalaryDF = requiredWindowFunctionsDF.filter($"denserank"===2)
      //.drop("rownumber","rank","denserank")
    //secondHighestSalaryDF.show(false)
  }
}
