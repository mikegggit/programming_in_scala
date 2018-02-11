var line=""
do {
  line = readLine()
  println(s"Read: $line")
} while (line != "")

/*
while and do-while result in type Unit.  
*/

// There is a single value of type unit...()
def foo(s: String) {
  println(s"Echoing...$s")
}

// test result of foo is Unit
//assert(foo("testing") == ())

/*
functions defined without an equal sign between the declaration and 
the body are considered procedures.
*/

