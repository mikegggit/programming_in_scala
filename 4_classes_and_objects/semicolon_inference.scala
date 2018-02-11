/*
Normally, semicolons are optional at the end of a line.
*/
val x = 1
val y = 2

/*
Normally, if you want to write a statement spanning
multiple lines, you just do it and scala will process
the code correctly.
*/

if (x < 1)
  println("x < 1")
else
  println("ok")

/*
Where scala can't process code as intended, you can
just wrap the code in parentheses, or alternatively,
place the operator at the end of line.
*/
(x
+ y)

x + 
y


