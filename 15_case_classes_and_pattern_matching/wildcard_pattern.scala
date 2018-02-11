abstract class Expr
case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

/*
used often as a catchall to prevent match expression 
throwing MatchException
*/

val x = Var("foo")
x match {
  case _ => println("default")
}

val y: Any = (1, "Hello", 9)
println(y)
y match {
  case a: Int                         => println("int")
  case (_: String, _, _)              => println("tuple1")
  case _                              => println("blah")
}

