package Others_Codes.Lists

import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.col

object listPrint {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit={
    var spark : SparkSession = SparkSession.builder().master("local[1]")
      .appName("Reading JSON data").getOrCreate()
    var jsonDF = spark.read.option("header","true").json("D:\\LEARNING\\Spark\\JSON\\employeesJSONFile.json")
    //jsonDF.printSchema()
    //jsonDF.show(false)
    //jsonDF.write.option("header","true").csv("D:\\LEARNING\\Spark\\CSV\\employeesCSVFile.csv")
    var csvDF = spark.read.option("header","true").csv("D:\\LEARNING\\Spark\\CSV\\employeesCSVFile.csv")
    //csvDF.printSchema()
    //csvDF.show(false)
    //var csvCastedDF = csvDF.withColumn("empID",col("empID").cast("Integer")).withColumn("empSalary",col("empSalary").cast("Integer"))
    //csvCastedDF.printSchema()
    //csvCastedDF.show(false)
    //csvCastedDF.write.option("header","true").parquet("D:\\LEARNING\\Spark\\PARQUET\\employeesParquetFile.parquet")
    var parquetDF = spark.read.option("header","true").parquet("D:\\LEARNING\\Spark\\PARQUET\\employeesParquetFile.parquet")
    //parquetDF.printSchema()
    //parquetDF.show(false)
    var textDF = parquetDF.select("empName")
    //textDF.printSchema()
    //textDF.show(false)
    textDF.write.option("infer","schema").option("header","true").text("D:\\LEARNING\\Spark\\TEXT\\employeesTextFile1.txt")
    //var textDF = spark.read.option("header","true").text("D:\\LEARNING\\Spark\\TEXT\\employeesTextFile.txt")
    //textDF.printSchema()
    //textDF.show(false)
  }
}
