/*
companion objects
improvement on oo in java by the fact that classes
can't contain static members.

companion objects are singletons.
They are named the same as their related classes.
*/
class Foo {
  val x: String = "abc"
  def getx: String = {
    x
  }
}

object Foo {
  def foo {
    println("foo")
  }
}

val x: Foo = new Foo()
Foo.foo
println(x.getx)

/*
A singleton named the same as a class is called the
class's companion object

A class and it's companion object can access each other's 
private members.

*/

/*
Singleton objects cannot take parameters.
*/

/*
Singleton objects without a class of the same name are called
standalone objects.  

These are useful for either gathering related utility methods,
or defining the entry point to an application.
*/
