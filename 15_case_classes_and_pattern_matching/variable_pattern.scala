/*
Variable patterns bind a match variable to a selector...
*/

val x: Any = 999

x match {
  case s: String     => println(s"first alt=$s")
  case a: Int       =>  println(s"second alt=$a")
  case _             => println("blah")
}

