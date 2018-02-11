/*
A partially applied function is a function which hasn't had all
the parameters provided to fully apply the function.

Applying a function refers to the mechanism by which scala
actually invokes functions.

A function value is an instance of a FunctionX class containing
an apply method.  When a function is invoked, what actually happens
is that the function's apply methodis applied to the parameters
to the apply function.

When a function is invoked without all parameters being provided,
the compiler creates a new function with the missing parameters 
in the apply method.

*/

def add3 = (_: Int) + (_: Int) + (_: Int)

val plus_2_and_6 = add3(2, 6, _: Int)
assert(plus_2_and_6(11) == 19)

