// What is a primary ctor?
/*
A constructor created as a side-effect of the class parameters 
declared in a class.
*/

class Foo(val x: Int, val y: String) {
  var z: Int = 3 // z is not included in the ctor
}

val x = new Foo(1, "two")
println(s"foo [x=${x.x}, y=${x.y}, z=${x.z}]")

x.z = 23
println(s"foo [x=${x.x}, y=${x.y}, z=${x.z}]")


