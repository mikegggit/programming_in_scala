// What is a superclass ctor?
/*
A ctor defined in a class extended by another.  The superclass 
may be either concrete or abstract.
*/

// Can a superclass contain more than one ctor?
/*
yes.  There can be a primary ctor and one or more secondary
stor.
*/


// How is a superclass ctor defined?
/*

abstract class Super {
  this(val x: Int) {
    this.x = x
  }
}

class Sub extends Super {
  this(
