/*
convenient replacement for type tests and type casting...
*/

val x: Any = "String"

x match {
  case x: Int    => println("int")
  case x: String => println("string")
  case _         => println("blah")
}

/*
In the above, the selector must be a supertype of all type
in the alternatives.
*/

// An alternative to this in a more java-like syntax would be...
if (x.isInstanceOf[Int]) println("int")
else if (x.isInstanceOf[String]) println("string")
else println("blah")

// pattern match that includes elements of both type checking 
// and type casting
def generalSize(x: Any): Int = x match {
  case s: String     => s.length
  case m: Map[_, _]  => m.size
  case _             => -1
}

assert(generalSize(x) == 6)

// the above pattern match could also have been written (badly)
// as...
def uglySize(x: Any): Int = {
  if ( x.isInstanceOf[String] )
    x.asInstanceOf[String].length
  else if ( x.isInstanceOf[Map[_, _]] )
    x.asInstanceOf[Map[_, _]].size
  else
    -1
}

assert(uglySize(x) == 6)
