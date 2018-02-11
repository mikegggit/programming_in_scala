implicit def doubleToInt(d: Double) = d.toInt

val i: Int = 3.5
// behind the scenes, the compiler replaces the above
// val i: Int = doubleToInt(3.5)

println(i)

/*
Several implicit definitions are contained in scala.Predef.
*/
