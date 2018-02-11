/*
traits extend classes as a mechanism for restricting the classes
that can mix in the trait.
*/
class Animal

// only classes extending Animal can mixin Furry.
trait Furry extends Animal
