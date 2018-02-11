/*
In general, try to avoid while loops, just
like you'd challenge var's.

while loops are an imperative structure, as vars
are a stateful one.

what one can do with a while might be better
represented as a recursive function with an if,
for example.

*/

// calculate the gcd
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b%a
    b = temp
  } 
  b
}

println(gcdLoop(10, 3))

// while and do-while loops are called loops, not expressions,
// since they don't return values.


// calculate gcd without a loop
def gcd(x: Long, y: Long): Long = {
  if (y == 0) x else gcd(y, x%y)
}

println(gcd(10,3))
