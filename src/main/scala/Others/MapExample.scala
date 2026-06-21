package Others

import org.apache.log4j._
import org.apache.spark.sql.SparkSession

object MapExample {
  Logger.getLogger("org").setLevel(Level.ERROR)
  def main(args:Array[String]):Unit= {

    val spark:SparkSession = SparkSession.builder()
      .master("local[1]").appName("SparkSessionObject").getOrCreate()

    val data = Seq(
      ("Akhil",101,1000),
      ("Balu",202,2000),
      ("Chandu",301,3000)
    )
    val cols = Seq("EmpName","EmpID","EmpSalary")
    val df = spark.createDataFrame(data).toDF(cols:_*)
    //df.show(false)
    //df.write.option("header","true").csv("D:\\Learning\\Spark\\EmpCSVFile.csv")
    //val df1 = spark.read.option("header","true").csv("D:\\Learning\\Spark\\EmpCSVFile.csv")
    //df1.show(false)
    //df1.write.mode("overwrite").json("D:\\Learning\\Spark\\EmpJSONFile.json")
    val df2 = spark.read.json("D:\\Learning\\Spark\\HeroesFile.json")
    df2.show(false)
    val df3 = df2.select("Name","Age","Area")
    df3.show(false)
  }
}
