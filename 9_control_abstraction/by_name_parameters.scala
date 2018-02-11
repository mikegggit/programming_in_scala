/*
allow expressions to be passed as arguments to functions with
the intention that they are not evaluated until invoked within
the function.
*/

// naive assert implementation...
var assertionsEnabled = true

def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError

myAssert(() => 3 < 5)

// what you want...
def byNameAssert(predicate: => Boolean) = // => Boolean defines a by-name parm
  if (assertionsEnabled && !predicate)
    throw new AssertionError

byNameAssert(3 < 5)

