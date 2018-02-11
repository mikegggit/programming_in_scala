// simple example
var fname = "default.txt"
if (!args.isEmpty)
  fname = args(0)

println(fname)


// better, without need for a temporary variable
// and without the need for that variable to be
// a var.

// Here, we can initialize a val as the control structure 
// returns a value, acting like a function.

val fname2 = 
  if (!args.isEmpty) args(0)
  else "default.txt"

println(fname2)
