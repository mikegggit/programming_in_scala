/*
assignment of a value to a var returns Unit.
*/

var x=123
println(x)

var y=(x=345)
println(y)
println(x)

assert(y == ())
assert(x == 345)
