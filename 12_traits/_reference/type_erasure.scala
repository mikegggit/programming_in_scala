/*
generics

erasure model
no information about type arguments of generics is maintained
after compilation (at runtime)
Type parameters are typically replaced with Object during
compilation.

erasure rule
All type parameters compile to the same bytecode.
It is up to the compiler to ensure 

type reification
the opposite of erasure.
Following compilation (at runtime), type information of type arguments is
maintained.

An exception to type erasure is Arrays.

*/

object Extractor {
  def extract[T](list: List[Any]) = list.flatMap {
    case element: T => Some(element)
    case _ => None
  }
}

val list = List(1, "string1", List(), "string2")
// during compilation, [String] gets replaced w/ Object, so 
// result ends up containing everything

val result = Extractor.extract[String](list)
println(result)

