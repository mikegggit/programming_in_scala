/*
A class field / method that doesn't have a complete definition in the class
in which it is declared.

4 abstract member types
- abstract type
- abstract method
- abstract val
- abstract var

Abstract val has no value

A definition means a given member declaration has an associated implementation / value.
*/

/*
Abstract members may be contained in either class or traits.

If in a class, the class must be marked abstract.
*/

// in the following, we have all abstract types represented...
abstract class Foo {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}

//...same idea w/ a trait
/*
Traits are inherently abstract
*/
trait Abstract {
  type T
  def transform(x: T): T
  val initial: T
  var current: T
}

/*
  class extending an Abstract trait, implementing abstract 
  members defined...

  Where implementation is defined separate from interface, 
  don't re-declare type on val / var...
*/
class Another extends Abstract {
  type T = String
  def transform(x: String): String = {
    x + x
  }
  val initial = "here"
  var current = initial  
}

/*
Abstract vals constrain the possible implementations.

Declare a name and type.
 
Implementations may only be vals

Trying to override an abstract val w/ a def is unallowed since
the method could theoretically provide different values for each
invocation.
*/

/*
Abstract var declarations in a class cause getter / setters to automatically
be generated
*/
trait A {
  val i = "Hello"
  var v: String
}

class ABC extends A {
  var v = i
}

class DEF extends A {
  // v defined as a method
  def v: String = {
    return i
  }
}

  
/*
Traits cannot accept constructor parameters.

Traits are "parameterized" via abstract vals

*/
