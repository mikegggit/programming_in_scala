/*
array variables maintain their type at runtime, so type
matching of arrays will work
*/

val s: Array[+Any] = Array(1, 2, 3, 4)
val result = s match {
  case a: Array[String]    => "string"
  case b: Array[Int]       => "int"
  case _                   => "junk"
}
assert(result == "int")
