/**
 * Created by damien on 8/18/2015.
 */
import sys.process._
import java.net.URL
import java.io.File

object downloadFile {
  def download(url: String, filename: String) = {
    new URL(url) #> new File(filename) !!
  }
}
