package Others

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{dense_rank, desc, rank, row_number}

object windowFunctionsProg {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit={
    val spark : SparkSession = SparkSession.builder().master("local[1]")
      .appName("Window Functions Programme").getOrCreate()
    val data = Seq(
      (101, "Ajay", "IT", 950),
      (301, "Harish", "Marketing", 9000),
      (201, "Eshwar", "Sales", 1500),
      (304, "Kalyan", "Marketing", 8000),
      (102, "Bharath", "IT", 900),
      (303, "Javed", "Marketing", 8000),
      (202, "Farukh", "Sales", 1500),
      (203, "Ganesh", "Sales", 1300),
      (103, "Chandhu", "IT", 900),
      (104, "Dinesh", "IT", 850),
      (302, "Indra", "Marketing", 8000),
      (305, "Lohit", "Marketing", 7000)
    )
    val cols = Seq("empID","empName","empDepartment","empSalary")
    val empDF = spark.createDataFrame(data).toDF(cols:_*)
    //empDF.show(false)
    val windowSpec = Window.partitionBy("empDepartment").orderBy(desc("empSalary"))
    val windowFunctionsDF = empDF.withColumn("Row Number",row_number().over(windowSpec))
      .withColumn("Rank",rank().over(windowSpec))
      .withColumn("Dense Rank",dense_rank().over(windowSpec))
    windowFunctionsDF.show(false)
  }
}
