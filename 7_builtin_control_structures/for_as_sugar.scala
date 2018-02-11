/*
for expressions are just sugar over a combination of
other methods.
*/

val m = Map(1 -> "One", 2 -> "Two")

// different ways of iterating a map...
// foreach...
m.foreach( (e) => println(s"key=${e._1}, value=${e._2}"))
m.foreach {
  case (k, v) => println(s"key=${k}, value=${v}")
}
// TODO: case statement in a foreach.


// for comprehension...
for ( e <- m )
  println(s"key=${e._1}, value=${e._2}")
