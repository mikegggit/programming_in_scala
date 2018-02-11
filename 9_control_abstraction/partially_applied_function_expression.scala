def curriedSum(x: Int)(y: Int): Int = x + y

// this returns a partially applied function, as
// curriedSum is invoked without the second arg.
// This is essentially what is applied to the second
// arg during normal invocation of a curried function.
def xAlreadyApplied=curriedSum(10)_

assert(xAlreadyApplied(20)==30)
