/*
underscores can simplify code and remove clutter.

Applicable to function literals.

Underscores _can_ be used when more than one parameter are specified 
in a function definition.  

Underscores can only be used when each parameter appears only once 
in a function literal.

Underscores prevent the need to explicitly declare function parameter
types.  Everytime an underscore appears in a function
body, the compiler fills in this "blank" with a value from 
the function args.
*/

val strings = List("one", "two", "three")

// only the body is specified
println(strings.filter(_.startsWith("t")))

// two args
// here, because the compiler wouldn't otherwise have enough
// info to determine parameter types, we explicitly indicate...
val f=(_: Int) + (_: Int)
val s=(_: String) + " " + (_: String)

println(f(1,3))
println(s("hello", "there"))

// You cannot use underscores where a parameter is used
// multiple times in a function body.  Multiple underscores
// automatically means there are multiple parameters required.

