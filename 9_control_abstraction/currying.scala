/*
currying enables creation of control abstractions that feel
"native".

feeling "native" means the syntax is such that writing code
using these abstractions feels natural and not forced,
as if the language was designed to support it.

*/

/*
A curried function is applied to multiple argument lists
*/

def curriedSum(x: Int)(y: Int) = x + y
assert(curriedSum(1)(20)==21)
