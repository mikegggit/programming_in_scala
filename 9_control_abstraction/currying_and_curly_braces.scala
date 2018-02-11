/*
The combination of currying and curly braces can be used
to write code that looks natural and easy to understand.
*/
import java.io.{File, PrintWriter}
// Two arg lists allows callers to use braces around either, or both...
def withPrintWriter(file: File)(op: PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

withPrintWriter(new File("./foo.txt")) {
  _.println(new java.util.Date)
}
