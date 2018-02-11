
// trait definition
trait Philosophical {
  def philosophize() {
    println("I consume memory, therefore I am.")
  }
}

/*
traits don't have class parameters

traits are used by being "mixed-in"

Traits can be mixed in using either extends or with keywords.
*/

/*
like a class with no superclass defined, the default superclass
of a trait is AnyRef
*/

// Traits cannot be instantiated.


assert(
