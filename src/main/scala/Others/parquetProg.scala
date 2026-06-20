package Others

import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object parquetProg {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit={
     var spark:SparkSession = SparkSession.builder().master("local[1]")
     .appName("EmpManagerProg").getOrCreate()
    //val csvDF = spark.read.option("header","true").csv("D:\\LEARNING\\SPARK\\empManagerFile.csv")
    //csvDF.write.option("header","true").parquet("D:\\LEARNING\\SPARK\\empManagerFile.parquet")
    val parquetDF = spark.read.option("header","true").parquet("D:\\LEARNING\\SPARK\\empManagerFile.parquet")
    // parquetDF.show(false)
    parquetDF.createOrReplaceTempView("empManagerFile")
    spark.sql("|SELECT e.emp_id, e.emp_name, e.manager_name, e.salary\n        |FROM empManagerFile e\n        |JOIN empManagerFile m ON e.manager_name = m.emp_name\n        |WHERE CAST(e.salary AS INT) > CAST(m.salary AS INT)").show(false)
  }
}
