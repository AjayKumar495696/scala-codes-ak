package Interview
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.expressions.Window
import org.apache.spark.sql.functions.{desc,row_number,rank,dense_rank}

object secondHighestMarks {
  Logger.getLogger("org").setLevel(Level.ERROR)

  def main(args: Array[String]): Unit = {
    val spark: SparkSession = SparkSession.builder().master("local[1]")
      .appName("Finding RowNumber,Rank and DenseRank").getOrCreate()
    import spark.implicits._
    val cols = Seq("stDept", "stName", "stMarks")
    val data = Seq(
      ("ECE", "Akhil", 96),
      ("IT", "Lohit", 55),
      ("ECE", "Balu", 95),
      ("CSE", "Eshwar", 88),
      ("ECE", "Chandhu", 95),
      ("IT", "Indra", 60),
      ("CSE", "Farukh", 88),
      ("ECE", "Dhanush", 25),
      ("IT", "Jay", 60),
      ("CSE", "Ganesh", 37),
      ("IT", "Krishna", 60),
      ("IT", "Hari", 66)
    )
    val inputDF = spark.createDataFrame(data).toDF(cols: _*)
    //inputDF.show(false)

    val windowSpec = Window.partitionBy("stDept").orderBy(desc("stMarks"))
    val secondHighestDF = inputDF.withColumn("Dense Rank", dense_rank().over(windowSpec))
      .filter($"Dense Rank" === 2)
      .drop("Dense Rank")

    secondHighestDF.show(false)
  }
}
