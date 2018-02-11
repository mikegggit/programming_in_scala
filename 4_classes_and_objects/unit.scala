/*
Unit is technically a mutating function in that it is 
run for its side effects.
*/

/*
Any function defined without a return type and without
equals sign between body and declaration is 
of return type Unit and invoked solely for its
side effects, like a procedure
*/

/*
returning a value from a function defined as returning
Unit causes the return value to be lost...
*/
def foo() {
  return "String"
}

println(foo())


