/**
 * Created by damien on 8/16/2015.
 * Was created to run on a windows machine.
 * The text file was downloaded from the following url: http://www.gutenberg.org/cache/epub/100/pg100.txt
 * Word Count should output 903705 words
 */
import org.apache.spark.SparkContext

class WordCount (sc : SparkContext, filePath : String) {

  def main {
    val wordCountRdd = sc.textFile(filePath).map(removePunctuation.remove).flatMap(_.split(" ")).filter(_!="").cache
    println("Word count: " + wordCountRdd.count)
    /* Tuple of word and times it appears */
    val wordCountSum = wordCountRdd.map(x=> (x,1)).reduceByKey(_+_).cache
    /* Average number of times all words appear */
    val totalCount = wordCountSum.map(x => x._2).reduce(_+_)
    val average = totalCount/wordCountSum.distinct.count
    println("Average count of words: " + average)
    sc.stop()
  }

}
