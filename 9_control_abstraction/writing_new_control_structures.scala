/*
New control structures can be useful anytime you see yourself
writing code in different places that follows the same pattern
of control flow.
*/

// if you constantly see yourself performing an operation twice 
// on a double, harden it into an explicit code structure.
import java.io.File
import java.io.PrintWriter
def twice(op: Double => Double, x: Double) = op(op(x))
assert(twice(_ + 9, 10) == 28)


// here, we harden the usage of a printwriter...
def withPrintWriter(file: File, op: PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

withPrintWriter(
  new File("date.txt"),
  writer => writer.println(new java.util.Date)
)

// the above ensures resources are cleaned up without any
// intervention needed by the client.

/*
scala supports small syntactic sugar to make even the above syntax 
look more natural...

In any method invocation in scala, if you're only passing in one
arg, you can surround the arg with curly braces instead of parens.
*/

// the following are equivilent...
println("hello world")
println {
  "hello world"
}


