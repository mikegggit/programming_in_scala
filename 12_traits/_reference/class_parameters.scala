// class parameters
/* 
x is not a field in this example.

it is only available to the instance created when passed in.
*/
class Foo(x: Int) {
  def getX(): Int = x
}

val f = new Foo(1)
assert(f.getX == 1)

/*
This would fail, since x is inaccessible outside the scope of the 
instance of Foo.

println(f.x)
*/

// To access x externally, you need a field.
// There are a few ways to create a field.

class Bar(x: Int) {
  val a: Int = x
}

val b = new Bar(13)
assert(b.a == 13)

// Adding fields using parametric field notation...
class Baz(val x: Int=11, var y: String="testing") 

assert(new Baz().x == 11) 

val t = new Baz()
assert(t.y == "testing") 
t.y="hello"
assert(t.y == "hello")
