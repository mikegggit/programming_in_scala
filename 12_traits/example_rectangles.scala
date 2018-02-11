// traits makes it easy to provide a large number of methods
// automatically to a class.

// traits can eliminate duplication across classes where each
// contains the same methods and implementation.

// enrichment traits provide a set of members that can be provided 
// for free to any class.  Typically consists of concrete members
// which invoke abstract methods to be implemented by classes
// which mixin the trait.

class Point(val x: Int, val y: Int)
 
trait Rectangular {
  // abstract methods
  def topLeft: Point
  def bottomRight: Point

  // concrete members
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
// other methods...
}

val r = new Rectangle(new Point(1,1), new Point(10, 10))
assert(r.topLeft.x == 1)
assert(r.width == 9)
