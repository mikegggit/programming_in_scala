val filesHere = (new java.io.File(".")).listFiles

val filenames = for ( file <- filesHere )
   yield {
  file.getName
}

filenames foreach( f => println(f))
