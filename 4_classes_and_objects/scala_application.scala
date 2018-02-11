/*
A scala application is defined as a standalone 
object having a main method accepting Array[String] 
argument and returning Unit.

It's not necessary in scala, though recommended,
to name the file after the class defined inside.
*/

object Foo {
  def main(args: Array[String]): Unit = {
    // println is actually defined PreDef
    println("Running Foo app!!!")
  }
}

