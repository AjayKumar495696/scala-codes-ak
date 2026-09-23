package Others_Codes

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.to_date

object stringToDateDF {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit={
    val spark : SparkSession = SparkSession.builder().master("local[1]")
      .appName("String To Date Column Conversion").getOrCreate()
    import spark.implicits._
    //val empDF = spark.read.option("header","true").csv("D:\\LEARNING\\SPARK\\CSV\\empData.csv")
    val empDF = spark.read.option("header","true").csv("src/main/resources/empData.csv")
    //empDF.printSchema()
    //empDF.show(false)
    val updatedEmpDF = empDF.withColumn("newEmpSalaryDate",to_date($"empSalaryDate","dd MMMM yyyy"))
    updatedEmpDF.printSchema()
    updatedEmpDF.show(false)
  }
}
