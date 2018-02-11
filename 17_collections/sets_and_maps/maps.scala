/*
like other collections, there are mutable and immutable versions of a map...
*/

// Creation - immutable
val map = Map("KEY" -> 'A', "KEY2" -> 'B')
val emptyMap = Map()

// Performing modifying operations on immutable maps results in a new
// collection being returned
val orig = map
assert(orig eq map) // object identity equals

map + ("KEY3" -> 'C')
assert(orig eq map) // object identity equals

// you can't reassign to a val.
// following would fail...
// map = map + ("ABC" -> 'C')

assert(Map("ABC" -> 'A') == Map() + ("ABC" -> 'A'))

// Remove el
assert(map - "KEY2" == Map("KEY" -> 'A'))

// Add multiple el's
assert(map ++ List("KEY3" -> 'C', "KEY4" -> 'D') == Map("KEY" -> 'A', "KEY2" -> 'B',"KEY3" -> 'C', "KEY4" -> 'D'))

// Inquiry
assert(map.size == 2)
assert(map.contains("KEY2"))
assert(map("KEY2") == 'B')
for ( k <- map.keys ) {
  println(s"key=$k")
}

for ( v <- map.values ) {
  println(s"value=$v")
}

