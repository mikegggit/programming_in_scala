// Iteration
val filesHere = (new java.io.File(".")).listFiles

// the syntax of a for expression is for clauses yield body
for (file <- filesHere) {
  // this is the body of the for expression
  println(file)
}

/*
without a yield, for expressions don't return anything
*/

/*
<- syntax relates to a generator

generators create a new val for each el in the collection
being iterated over

for syntax works on any kind of collection
*/

