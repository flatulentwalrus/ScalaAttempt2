import scala.io.Source
import scala.collection.mutable.ArrayBuffer
val filePath = "C:\\Users\\Administrator\\Documents\\randomtext.txt"
var arrayOfWords = ArrayBuffer[String]()
for (line <- Source.fromFile(filePath).getLines()) {
  var wordsToAssign: Array[String] = line.split(" ")
  arrayOfWords += wordsToAssign(0)
}
 println(arrayOfWords)

//Create a method that reads words from a file, one per line, and stores them in an Array.
//val newTime = time.map(s=>s.split("/")).filter(_.length>1).map(a=>a(1)).grouped(10).map(a=>a(0)).toArray
