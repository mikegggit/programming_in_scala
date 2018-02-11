/*
uses any literal or val as a pattern...
*/

val i = 3

def matchit(x: Any) = x match {
  case 1         => println("1")
  case "String"  => println("2")
  case `i`       => println("3") // matching on outer val using literal string
  case Nil       => println("4")
  case _         => println("blah")
}

matchit(i)
