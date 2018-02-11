// create range 1 to 10 inclusive...
val x=1 to 10
assert(x.size == 10)
assert(x.contains(10))

// range 1 to 10 exclusive of upper bound (10)
val y = 1 until 10
assert(y.size == 9)
assert(!(y.contains(10)))

// range 1 to 10 by 2 
val z = 1 to 10 by 2
assert(z.size == 5)
assert(Range(1,10,2) == z)
assert((1 to 10 by 2) == z)
