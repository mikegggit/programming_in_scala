/*
traits are mixed-in, not inherited.
*/

// mix-in Philodophical trait
class Frog extends Philosophical {
  override def toString = "green"
}

val f = new Frog
assert(f.isInstanceOf[Philosophical])
assert(f.isInstanceOf[Frog])

// using member mixed in from a trait, just like inheriting 
// from a superclass
println(f.philosophize)

// declaring val of type Philosophical...
val a:Philosophical = new Frog

// declaring val of type Frog
val b: Frog = new Frog
assert(f.isInstanceOf[Philosophical])

// Trait members can be overridden 

class DumbFrog extends Philosophical {
  // toString is a member of ObjectG
  override def toString = "dumb"
  override def philosophize() {
    println(s"I'm $toString")
  }
}

val g = new DumbFrog
g.philosophize

// To mixin a trait into a class that already extends a superclass,
// use with keyword

class Animal

class GeniusRibbit extends Animal with Philosophical {
  override def toString = "Kermit!"
}

// Mixing in multiple traits...
trait HasLegs {
  def numLegs: Int = 2
  def walk() {
    for (_ <- 1 until numLegs) {
      print("thud ")
    }
    println("thud!!!")
  }
}

class LeggyFrog extends Animal with Philosophical with HasLegs {
  override def numLegs: Int = 4
}

class UprightFrog extends Animal with HasLegs {
}
val lf = new LeggyFrog()
lf.walk  

val uf = new UprightFrog()
uf.walk
