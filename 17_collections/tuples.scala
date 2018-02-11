// tuples can hold any number of elements

// They can hold elements of different types.

val t = (1, "two", 3)

// Tuple literals are converted to TupleN[...]
assert((1, "two", List(1)).isInstanceOf[Tuple3[Int, String, List[Int]]])
 
