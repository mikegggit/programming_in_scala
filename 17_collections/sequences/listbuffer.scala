/*
addresses lack of fast tail-based access to lists

Mutable version of a list.

Prevents need to possibly handle tail-based removal / addition
using reverse operation on a normal list

constant time prepend and append to list.

+= is append, +=: is prepend

convert to list using toList
*/
import scala.collection.mutable.ListBuffer

val buf = new ListBuffer[Int]
buf += 1
println(buf)

buf += 2
println(buf)

3 +=: buf
assert(buf.toList == List[Int](3,1,2))

