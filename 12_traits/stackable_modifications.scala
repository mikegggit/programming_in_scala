/*
Along with creating rich interfaces, a major use case
for Traits is stackable modifications to class.

Stackable modifications refer to the ability of traits 
to modify member methods of a class.

The manner in which Traits may modify member methods of 
a class is the origin of the term stackable.

In this context, traits are modifiers.

Modifiers in that they modify an existing class, and don't
define a complete class with full behavior.

Stackable in that you can apply many traits, in other 
words stack a set of traits, and enjoy the benefits
of all modifications to the original class, resulting
in a completely new class.
*/

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

val q = new BasicIntQueue
q.put(10)
q.put(20)
assert(q.get == 10)


// Stackable modification trait

/* 
The following modification trait can only be mixed into
classes that extend IntQueue.  This is because it extends
IntQueue, an abstract class.

Also, it contains a method that is marked with abstract override
modifiers.  This is a combination of keywords specific to
traits.  It means the class being modified must already
have a put implementation before being modified by this
trait, either defined in it's body, a superclass, or a mixin.

Normally, calling super.foo from an abstract foo method 
defined on a class would certainly fail since clearly 
there is no super implementation of foo.


*/

trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

class MyQueue extends BasicIntQueue with Doubling

val mq = new MyQueue
mq.put(10)
assert(mq.get == 20)

// stacked modifications
// modification traits...
trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { 
    super.put(x + 1) 
  }
}

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  }
}

// Ordering matters when stacking modifications (traits)
/*
Traits furthest to the right are applied first.  If member defined in 
furthest right calls super, the next modification to the
left gets invoked, etc.

*/
val qif = new BasicIntQueue with Incrementing with Filtering

qif.put(-1)
qif.put(10)
assert(qif.get == 11)

val qfi = new BasicIntQueue with Filtering with Incrementing

qfi.put(-1)
qfi.put(-2)
qfi.put(0)
assert(qfi.get == 0)
assert(qfi.get == 1)

