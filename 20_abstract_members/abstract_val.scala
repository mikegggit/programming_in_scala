// Lets you define a field of a certain type, but without a value.

// cannot be implemented as a method, as a method could theoretically
// return different values across multiple invocations.

// How are abstract val's initialized?
trait Abstract {
  val foo: Int
}

class Concrete extends Abstract {
  val foo = 3

}

val c: Concrete = new Concrete()

println(c.foo)
