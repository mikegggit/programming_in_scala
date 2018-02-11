/*
demonstrate passing function value to another function
*/

def mapWithFunction(f: Int => Int): List[Int] = {
  val l = List(1,2,3,4)
  l.map(f)
}


println(mapWithFunction(x => x * 5))

