/**
 * Created by damien on 8/19/2015.
 */
class countShakespeare {
  val url = "http://www.gutenberg.org/cache/epub/100/pg100.txt"
  val fileName = "shakespeare.txt"

  def main {
    downloadFile.download(url, fileName)
    val sc = createSparkContext.createContext
    val wc = new WordCount(sc, fileName)
    wc.main
  }
}
