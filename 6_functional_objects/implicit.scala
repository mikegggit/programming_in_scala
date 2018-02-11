/*
implicit conversions refer to conversions of an object
of one type to another without direction by the client.

Implicit conversions depend on implicit conversion 
rules.  

Implicit conversions enable use of objects where they 
otherwise wouldn't be usable.

for example, given a Rational class, the following operations
should be possible...
r * 2
2 * r

The second scenario should be possible, but it's not possible
at first glance because there is no operator * defined 
on Int that accepts a rational parameter.

An implicit conversion will register a conversion rule
with the compiler that will enable automatic conversion of 
the integer 2 to the rational number Rational(2, 1)
*/

class Rational(n: Int, d: Int) {
  
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def toString = numer +"/"+ denom
}

implicit def intToRational(x: Int) = new Rational(x)

val r = new Rational(3,4)

println(r + 2)
println(2 + r)

