/**
 * Created by damien on 8/16/2015.
 * Change logging level to errors only
 * Create a spark context using 4 threads with Spark App as the name
 */
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.log4j.{Level, Logger}

object createSparkContext {
  def createContext : SparkContext = {
    val level = Level.ERROR
    Logger.getLogger("org").setLevel(level)
    Logger.getLogger("akka").setLevel(level)
    val appName : String = "Spark App"
    val master : String = "local[4]"
    /* returns spark context object */
    new SparkContext(new SparkConf().setAppName(appName).setMaster(master))
  }
}
