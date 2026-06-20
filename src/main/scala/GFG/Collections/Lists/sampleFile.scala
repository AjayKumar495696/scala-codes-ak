package GeeksForGeeks.Collections.Lists
import org.apache.log4j._
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions.{dense_rank, desc, rank, row_number}
import org.apache.spark.sql.expressions.Window

object sampleFile {
  Logger.getLogger("org").setLevel(Level.ERROR)
   def main(args:Array[String]):Unit={
     val spark:SparkSession = SparkSession.builder()
       .master("local[1]").appName("sparkByExamples1").getOrCreate()
     import spark.implicits._
     var data = Seq(
       (101,"Ajay",95),
       (102,"Sravanthi",75),
       (103,"Sandeep",80),
       (104,"Rakesh",60),
       (105,"Karthik",70),
       (106,"Gowtham",75),
       (107,"varun",75)
     )
     var cols = Seq("Id","Name","Marks")
     var df = spark.createDataFrame(data).toDF(cols:_*)
     //df.show(false)
     var windowSpec = Window.orderBy(desc("Marks"))
     var windowFunctions = df.withColumn("RowNumber",row_number().over(windowSpec))
       .withColumn("Rank",rank().over(windowSpec))
       .withColumn("DenseRank",dense_rank().over(windowSpec))
     windowFunctions.show(false)
   }
}
