/*
closures are functions involving free variables.

A free variable is one not declared in the function signature.

A closure refers to the behavior of a function that
depends on free variables.

A closure, when invoked, attempts to bind the free variable
to a variable in scope at the time the closure is created.

*/

/*
In contrast to a free variable, a bound variable is one
declared in the function definition.

An attempt to create a closure when no free variable 
exists having the name referenced in the closure will
result in a compilation error.
*/

var num: Int = 0

def addToNum(x: Int): Int = {
  num += x
  num
}
assert(addToNum(10) == 10)
assert(num == 10)

// updates to the free variable after the closure
// was originally created _are_ visible to the closure.

num = 100
assert(addToNum(4) == 104)
assert(num == 104)

/*
Similarly, changes made to free variables within the
closure body _are_ visible outside the closure
*/
var sum = 0
val nums=List(1,6,10,11)

def summer = {
  nums.foreach (
    sum += _
  )
}

summer
assert(sum == 28)

/*
Closures will maintain reference to free variables even 
if they go out of scope after the time at which they 
were created.

This is possible because free variables are stored on the heap, 
not the stack.
*/

// Here a free variable is only in scope momentarily...
def multiplierFactory(multiplier: Int) = (x: Int) => multiplier * x

var times5=multiplierFactory(5)
var times10=multiplierFactory(10)

assert(times5(5) == 25)
assert(times10(5) == 50)


