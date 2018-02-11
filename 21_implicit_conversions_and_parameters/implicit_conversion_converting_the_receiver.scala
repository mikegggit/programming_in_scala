/*
applicable when a caller tries to invoke a method on an object
that doesn't actually have that method.

The compiler will try to convert the object to a type that has 
the method
---
Interoperating w/ new types
receiver conversion lets you to make existing type work
more easily with newer ones.  

new.x(old)

if a receiver new doesn't have a method called x, the compiler
will look for an implicit definition converting new to a type
that has method x applied to arg of type old.

---
simulating new syntax
new syntax refers to program elements that look weird, or fancy,
or not defined in scala natively.

Where does this syntax come from?
In fact, it's probably not syntax, but rather, a method that
just looks like valid syntax.

take the map constructor...
Map(1 -> "one")

-> is actually a method.

The compiler sees that the Int has no -> method, so looks for a
type that _does_ have an -> method that applies to String var, 
then an implicit def that converts Int to that method

implicit definition that _does_ have a -> method
*/



