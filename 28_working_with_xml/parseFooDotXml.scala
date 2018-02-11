val xmlcontent=xml.XML.loadFile("foo.xml")

xmlcontent match {
  case a: scala.xml.Elem => println("xmlcontent is a scala.xml.Elem instance")
  case _ => println("")
}

/*
Other API classes...
scala.xml.Node
scala.xml.Text
scala.xml.NodeSeq
scala.xml.MetaData
*/

/*
Seq[Node]
|
|
NodeSeq
|
|
Node
|
|
*/

assert(xmlcontent.label == "parser")
val package = xmlcontent \@ "package"
val type = xmlcontent \@ "type"
val mode = xmlcontent \@ "mode"

val constantsPrefix = xmlcontent \ "constants" \@ "class"

// msgTypes
val msgTypes: Map[String:Char] = Map()
val msgTypeNames = ""
val msgTypeValues = ""

