// Traits are parameterized via abstract members.

// Traits don't support constructor parms.

// Following shows a ctor parm in action...
class WithClassParm(val x: Int, val y: String) 

val wcm = new WithClassParm(1, "two")
println(s"wcm [x=${wcm.x}, y=${wcm.y}]")


// Following shows a parameterized superclass
abstract class Super(val x: Int)

class Sub(x: Int, val y: String)  extends Super(x) 


