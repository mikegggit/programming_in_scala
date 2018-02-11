/*
they are similar but different.

both involve creating function values of lower arity than
the original.

*/

/*
a partially applied function is created when a function of N-arity
is called with fewer than N arguments.

The function represents a new function value created by the compiler 
that accepts the args not originally passed into the first
function.

This function value can be stored for later invocation, with the 
previously passed arguments already bound within the function
body.
*/

/*
A curried function is one that applies a function to two sets
of arg lists sequentially.  For N lists of args, we are essentially
chaining function calls, the first applied to the first list, etc.

Each invocation takes a set of args and returns a function value
accepting the next set of args.
*/
