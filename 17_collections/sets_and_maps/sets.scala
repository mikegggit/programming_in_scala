// Creation
var s: Set[Int] = Set(1,2,5,4,2,3,55)
println(s)

/*
in the above, Set is created without new by virtue
of something called apply
*/

// Empty
var t: Set[Int] = Set.empty

// The only reason we can reassign the result of add / remove 
// operations to t is that it is declared a var.
// Add an item, returns new set instance
t = t + 9
assert(t == Set(9))
t = t + 10
assert(t == Set(9, 10))

// Remove item
t = t - 10
assert(t == Set(9))

// Add multiple els
t = t ++ List(6,5,4,3)
assert(t == Set(3,4,5,6,9))

// Remove multiple els
t = t -- List(4,6)
assert(t == Set(3,5,9))

// intersect two sets
val a: Set[Int] = Set(1,2,3,4,5)
val b: Set[Int] = Set(2,3,6)

assert((a & b) == Set(2,3))

