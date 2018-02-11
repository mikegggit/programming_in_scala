// What's a type member?
/*
A type declared to be a member of a class or trait.

Different from a trait or an abstract class in that a type-member
is actually a member of a class or trait.
*/

// Difference between an abstract type member vs a
// non-abstract type member?
/*
An abstract type member must be defined in a subclass.

A non-abstract one is simply an alias for another type,
intended to make an implementation more intuitive.
// Hmm...
/*
Think about it as an alias for a type.  Anywhere that alias
is reference in the implementation, it will refer to the type 
declared in the subclass.
*/

 
