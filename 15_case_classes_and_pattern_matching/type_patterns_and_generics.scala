/*
scala replaces explicitly declared generic instances of their
type parameter info during compilation, replacing them w/
object.

the following generates a warning since the second case class 
is unreachable as the map's type info, along with the pattern's,
is erased.  
*/
val m: Map[_, _] = Map(1 -> 34)

assert((m match {
  case a: Map[String, String]    => "string"
  case b: Map[Int, Int]          => "int"
  case _                         => "blah"
}) == "string")

