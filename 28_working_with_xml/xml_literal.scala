val e: scala.xml.Elem = <parser>this is a parser</parser>

/*
Elem defines an xml element with a label and children.
*/

// xml literal using an embedded expression...
val x = 123
val f = <foo>{x}</foo>
println(f)


val yearMade = 1955
val x2 = <a> { if (yearMade < 2000) <old>{yearMade}</old>
else xml.NodeSeq.Empty }
</a>

println(x2)

/*
expressions in an xml literal don't have to evaluate to an XML 
node...

If expression resolves to another type, it is converted to
a string and inserted as a text node...
*/
