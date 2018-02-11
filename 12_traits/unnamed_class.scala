/*
As opposed to a named class, is created dynamically 
as a side effect of syntax similar to the following...
*/

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

// unnamed class
val queue = new BasicIntQueue with Doubling




