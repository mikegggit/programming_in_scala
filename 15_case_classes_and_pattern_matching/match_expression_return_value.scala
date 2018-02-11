/*
match expressions can return values...
*/

val x: Any = 1

val foo = 
  x match {
    case Number(_)     => 1
    case _          => 3
  }

assert(foo == 1)

