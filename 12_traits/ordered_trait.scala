/*
comparison

provides implementations for <, >, <= and >=.

All the above four operations are defined in terms
of a member called compare

*/

// compare member of Ordered is an abstract method

case class Person(name: String, age: Int) extends Ordered[Person] {
  def compare(that: Person) = this.age compare that.age
}

assert(Person("mike", 20) > Person("joe", 15)) 

/*
== is not defined in Ordered.  == cannot be defined in terms
of compare because any definition of equals requires the types 
of the instances to be compared.  

Since Ordered uses type parameters, erasure prevents ordered 
from determining the type of the objects being compared.
*/
