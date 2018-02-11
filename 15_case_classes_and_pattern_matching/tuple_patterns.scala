
val t = (1, 2, 3)

def tupleDemo(expr: Any) = 
  expr match {
    case (a: Int, _, _)    => a
    case _            => -1
  }

assert(tupleDemo(1, "two", 3) == 1)
 
