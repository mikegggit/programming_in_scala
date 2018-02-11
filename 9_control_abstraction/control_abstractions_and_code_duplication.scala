/*
control abstractions are said to promote reduction in code
duplication.
*/

/*
What is a control abstraction?
A mechanism for encapsulating a more complex mechanism of program 
flow and execution behind a more generic and easy to understand
interface.

try-catch is a control abstraction and abstracts the process of 
executing logic which may fail, need to be handled, etc.

with higher order functions, custom control abstractions are
possible by virtue of being able to design invocation patterns
in which a function invokes another function parameter with
the scope of a predefined framework.
*/

/*
By parameterizing functions with functions, you can eliminate
code duplication by expressing the common logic in terms of 
a function parameter result.
*/

// This is bad...
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere; if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for (file <- filesHere; if file.getName.matches(query))
      yield file
}

// This is better...
object FileMatcher {
  private def filesHere = (new java.io.File(".")).listFiles

  private def filesMatching(matcher: String => Boolean) =
    // accessing filesHere w/ a closure...
    // removes need to pass filesHere as a parm...simplifies client code
    for (file <- filesHere; if matcher(file.getName))
      yield file

  def filesEnding(query: String) =
    filesMatching(_.endsWith(query))

  def filesContaining(query: String) =
    filesMatching(_.contains(query))

  def filesRegex(query: String) =
    filesMatching(_.matches(query))
}
