/*
Refers to the ability to rewrite various logic by means of
the fact that certain structures in scala are replaceable with
each other.

Val enables this concept.

That is, given the value of a val is assigned via an expression,
one can replace all usages of the val with the expression, assuming
the expression has no side effects.
*/

val fname = 
  if (!args.isEmpty) 
    args(0)
  else
    "default.txt"

// instead of this...
println(fname)

//...you could just write this...
println(if (!args.isEmpty) args(0) else "default.txt")

