/*
first class functions are functions that are treated 
the same as other types in terms of...
- passing to other functions as parameters
- being returned as a return value
- refer to as a literal

A literal is a syntactic mechanism for declaring a function
without needing to bind it to a variable reference.

It is simply a blueprint to be "used" at compile time.  A
function literal is transformed into a more concrete
form at compile-time.

At compile time, scala converts function literals into 
classes of type FunctionX.

At runtime, instances of this class are created, creating 
function values.

A function value can be returned, passed around, etc.
*/

/*
A function value is an object that can be stored, but
is also a function that can be invoked.
*/
def incrByTwo = (x:Int) => x + 2

// This gets expanded into Function2(x:Int, y:Int)
assert(incrByTwo(2) == 4)


// function with multi-line body...
def incrByTwoMultiline = (x: Int) => {
  println("in incrByTwoMultiline")
  x + 2
}
assert(incrByTwoMultiline(5) == 7)
