/*
source - the object being passed to the receiver as a 
method argument. 

receiver - refers to the target of a method call, meaning
the object that owns the method.

What triggers the use of implicit conversions?
Compiler fails to compile.
Before giving up and failing, it looks for any in-scope 
implicit conversions that are eligible to handle the
compilation issue(s).

How does the compiler decide that an implicit conversion is 
eligible to try?

Implicits allow you to leave out cluttering code to make 
the code that's left more meaningful and clear.

Implicit definitions are the only kind of code the
compiler is allowed to apply in order to fix any
type errors.

Implicits can only be used where type checks aren't present.

Any of the following may be marked implicit...
- variable
- function
- object
*/
