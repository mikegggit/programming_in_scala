/*
a way of pattern matching on objects without requiring a lot of
boilerplate.

declaring a class with the case keyword adds certain things 
to your class.

*/

// case classes automatically get a factory method created
// eliminating need for new keyword
case class Foo(x: Int, s: String = "Testing") {
}

val f=new Foo(10)
println(f)

// case classes with class parameters automatically get converted 
// to fields by compiler adding val to each.

println(f.x)
println(f.s)

/*
compiler automatically adds overriden impl's of toString, 
equals and hashCode implementations.

This enables natural equality via == (delegates to equals),
nice debugging via toString, and efficient hashing.
*/

/*
compiler automatically adds copy method to class enabling
modified copies.  Useful for making a copy where only a few
members are different.
*/

println(f.copy(x = 20))
val g=f.copy(s = "blah")
assert(g == Foo(10, "blah"))
