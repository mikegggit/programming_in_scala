/*
Marking rule
Only definitions marked implicit may be used to fix a type
error.

Function, variable, and object defs may all be marked implicit.
---
Scope rule
Any implicit eligible for insertion must be in scope as a single
identifier.

What makes an implicit in scope?
TODO

Single identifier?
it can't be accessed using someVar.identifier.  It must be 
available as identifier.  So first, import someVar, making 
identifier available as a "single identifier".

Exception to single identifier rule
the Compiler will look for implicit defs in the companion
object of the source type or target type of the conversion.

Association
A conversion is said to be associated to a type if defined
in that type's companion object.

Scope rule makes it easier to reason about things.  You only
need to look in imported classes, or companion objects of
source / target types.

---
One at a time rule - only one implicit is tried
only a single implicit def will be applied to a source type
to fix a type error.  You'll never have nexted conversions
like convertx(convertY(a))
---
explicits first rule - compiler will never attempt type 
conversion using implicits when code already works.  
Remember that you can always replace implicit definitions
with explicit conversions.  

---
naming implicit definitions
implicit definitions don't have any naming requirements.

Names are only important in terms of the following...
If you only want to use one of several implicit definitions
in an imported variable, you will want to only import
the one definition.  To make it each to see which implicit
to import, use a good name.

---
Where implicits are tried.
conversions to an expected type
a type is converted to match the expected type.

conversions of the receiver
the receiver is converted to a certain type since the receiver
doesn't contain the invoked method, for example.

implicit parameters
TODO


*/




