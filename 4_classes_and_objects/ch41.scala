class Foo {
  // public is default access modifier
  val sum: Int = 0

  // private field
  private val foo: List[String] = List("hello", "there")

  def getfoo(i: Int): String = {
    foo(i)
  }
}

val f: Foo = new Foo()
println(f.sum)

// private members can only be accessed by members in the same class
println(f.getfoo(0))

// method parms in scala are all val's
// you cannot re-assign a method parm

// while scala technically allows returning multiple values,
// try to avoid it.  Similarly, try to avoid using the return keyword
// at all


