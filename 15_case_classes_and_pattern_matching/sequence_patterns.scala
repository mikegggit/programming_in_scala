/*
Examples of seq types are List and Array.
*/

assert(List(1, "Hello").isInstanceOf[List[Any]])
assert(List(1, 2).isInstanceOf[List[Int]])

/* 
there is not type erasure applicable in the above since
the classes are constructed at runtime
*/

val l = List(1, "two", 3)

// we only care about the list having three elements ans
// the first one equaling constant 1.
var result: Option[Int] = {
  l match {
    case List(1, _, _) => Some(0)
    case _             => None
  }
}

assert(result == Some(0))

// we only care about the secone elem being equal to "two"...
result = {
  l match {
    case Nil                   => Some(0)
    case List(_, _, a: String) => Some(1)
    case List(_, "two", _*)    => Some(2)
    case _                     => None
  }
}

assert(result == Some(2))


