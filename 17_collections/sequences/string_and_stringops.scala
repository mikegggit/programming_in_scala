/*
Stringops provides many Seq operations to strings via implicits
defined in PreDef.  This lets you treat strings similar to 
Seq.
*/

// exists is a sequence method...
val s: String = "hello"
print(s.exists(c => c == 'l'))




