/**
 * Created by damien on 8/17/2015.
 * Removes everything but characters a to z, numbers 0 to 9, and spaces from a text line
 */
object removePunctuation {
  def remove(x : String) = {
    x.replaceAll("[^a-zA-Z0-9 ]","").trim.toLowerCase
  }
}
