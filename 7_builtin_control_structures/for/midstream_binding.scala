/*
sometimes you want to avoid evaluating an expression
twice, once in a generator / filter, another in 
the iteration code block...
*/
val a=1 to 10
val b=1 to 10

for (
  x <- a;
  y <- b;
  remainder = y % x
  if remainder != 0
) println(s"x=$x, y=$y, y%x=$remainder")
