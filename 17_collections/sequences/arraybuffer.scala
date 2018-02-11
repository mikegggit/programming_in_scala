/*
like a normal array but supporting adding elements to 
beginning and end of array.

Normally the new operations are constant time, but
in some cases, the impl needs to allocate a new array,
resulting in linear time.

contains all the normal array methods, incl length and 
access by index.
*/

import scala.collection.mutable.ArrayBuffer

/*
when creating an arraybuffer, you don't need to specify
a length.  The impl will automatically adjust allocated
space as needed.
*/
val a:ArrayBuffer[Int] = new ArrayBuffer[Int]()
a += 12
3 +=: a

println(a)
assert(a.length == 2)
assert(a(0) == 3)

/*
prepending / appending an arraybuffer doesn't result in a new array
like doing the same on a normal array does.
*/

