/*
Traits are just like a class with a few exceptions...
*/

// Classes can have class parameters...
class Foo(x: Int, y: String) {

}

// Traits cannot.
// There are workarounds to this restriction.


/*
Classes have statically bound super calls.  When you 
invoke super.foo, you know exactly which class is 
receiving the invocation when you write the the class 
definition.

Traits have dynamically bound super calls, meaning
you have no idea which class will be targetted
when you write the trait definition.
*/

