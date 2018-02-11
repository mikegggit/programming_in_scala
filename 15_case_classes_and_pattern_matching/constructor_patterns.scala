/*
ctor patterns first check that a selector is an instance
of the indicated class.

next, the individual constructor parameters match the selector

scala calls this deep matching, in that not only does matching
occur on the object type, but also on the ctor parms.

deep refers to the fact that the patterns applied to ctor
parms may themselves refer to case classes.

*/
case class Bar(x: String, y: Foo) {

}

case class Foo(x: Int) {

}

val bar = Bar("hello", Foo(10))

bar match {
  case Bar("blah", _)    => println(s"match1")
  case Bar(_, Foo(a))    => println(s"match2=$a")
  case _                 => println("blah")
}


