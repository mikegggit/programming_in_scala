/*
Class parameters are declared in a class definition.

They automatically result in generation of a primary constructor.
*/
class Foo(n: Int, d: Int) 

// class param x is not accessible anywhere but within Bar.
// To make it accessible, a field must be declared
// and assigned from the class parm.
class Bar(x: String) {
  def printx {
    println(s"x=$x")
  }
}

val b = new Bar("Mike")
b.printx

// it is legal to define a class without braces if it
// contains no members

class Rational(n: Int, d: Int) {
  /*
  any code not contained in a member is automatically copied
  into the primary constructor in the order specified
  in code
  */ 

  /*
  primary constructors are the entry point of every class...

  because aux ctors must invoke either another aux ctor
  or the primary ctor, primary ctors is the entry point.
  */
 
  // test condition as part of object creation...
  // if not valid, throws IllegalArgumentException
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  // default access is public
  // need fields to access numer / denom from another instance.
  val numer = n / g
  val denom = d / g


  /*
  this refers to the object on which a member is defined, or
  during creation, the object being created
  */

  // alternate ctor
  // all alt ctors must invoke another ctor of the same class
  // as its first action
  def this(n: Int) = this(n, 1)

  // define add (probably not necessary given + is defined below
  def add(that: Rational): Rational = {
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    ) 
  }


  // define + operator
  def + (that: Rational): Rational = 
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  // define * operator
  def * (that: Rational): Rational = 
    new Rational(
      numer * that.numer, denom * that.denom)

  // override default object toString 
  override def toString = numer + "/" + denom

  
  private def gcd(a: Int, b: Int): Int = {
    if ( b == 0) a else gcd(b, a % b)
  }
}

val r1 = new Rational(2)
println(r1)
val r2 = new Rational(1, 2)
println(r2)
println(r1 * r2)
