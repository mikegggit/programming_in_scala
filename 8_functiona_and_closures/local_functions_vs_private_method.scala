/*
In java, the main mechanism for cleaning up an API
while still extracting functionality into reusable 
methods is the private method.

A private method can only be invoked within the
class it is defined.

In scala, we also have the ability to hide composable
functionality with a local function.

To run this test...

scalac local_functions_vs_private_method.scala

scala Foo
*/

object Foo {
  def main(args: Array[String]) {
    println("in Foo")
    Runner.run
    Runner.run_localf
  }
}


