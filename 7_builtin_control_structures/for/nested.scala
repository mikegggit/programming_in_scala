val filesHere = (new java.io.File(".")).listFiles

def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for (
    // semicolons are needed in here to guide
    // the compiler where generator and filters
    // are inside parens.

    // we could use curly braces instead of parens and avoid 
    // the need for semicolons...
    file <- filesHere
      if file.getName.endsWith(".scala");
    line <- fileLines(file)
      if line.trim.matches(pattern)
  ) println(file +": "+ line.trim)

grep(".*gcd.*")

def grep2(pattern: String) =
  for {
    file <- filesHere
      if file.getName.endsWith(".scala")
    line <- fileLines(file)
      if line.trim.matches(pattern)
  } println(file +": "+ line.trim)

grep2(".*gcd.*")
