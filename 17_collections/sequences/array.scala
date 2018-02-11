/*
indexed collection of single-typed elements

efficient access to indexed element
*/

// Creation - unknown el's
val a: Array[Int] = Array(0, 0, 0, 0, 0)
val b = new Array[Int](5)

// ...known
val c = Array(1,2,3,4,5)

/*
scala arrays are equivilent to java arrays
*/

assert(5 == c.length)

