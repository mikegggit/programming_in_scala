val filesHere = (new java.io.File(".")).listFiles

for (file <- filesHere if file.getName.indexOf("for") >= 0)
  println(s"Filtered match=$file")

// with multiple filters
for (
  file <- filesHere
  if file.getName.indexOf("for") >= 0
  if file.isFile
) println(s"Filtered match=$file")


for (
  file <- filesHere
  if file.getName.indexOf("for") >= 0
  if file.isFile
) {
  // multiline code-block
  println("winning...")
  println(s"Filtered match=$file")
}
