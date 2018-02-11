val l = List(1,2,3,4,5,6,7)
assert(l.exists(_ % 5 == 0))
assert(!l.exists(_ % 9 == 0))
