import scala.io.Source

/*
first run scalac findLongLines.scala

scala FindLongLines 45 findLongLines.scala
*/

object FindLongLines {
  def main(args: Array[String]) {
    val width = args(0).toInt

    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}

object LongLines {
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    
    for (line <- source.getLines())
      processLine(filename, width, line)
}

private def processLine(
  filename: String, width: Int, line: String) {
    if (line.length > width)
      println(filename +": "+ line.trim)
    }
}
