import scala.collection.mutable

val text = "See Spot run. Run, Spot. Run!"
val wordsArray = text.split("[ !,.]+")

// Creating an empty set, two different ways, same result...
val words: mutable.Set[String] = mutable.Set()
val words2: mutable.Set[String] = mutable.Set.empty[String]

for ( word <- wordsArray ) 
  words += word.toLowerCase

println(words)
