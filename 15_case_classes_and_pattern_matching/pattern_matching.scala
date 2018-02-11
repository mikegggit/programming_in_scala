/*
pattern matching in scala is similar to java's switch
statement.

pattern matching is of general form...
selector match { alternatives }

java's switch statement has the syntax...
switch (selector) { alternatives }

alternatives in scala pattern matching consists of a 
sequence of alternatives, each prefixed with the "case"
keyword.

Each alternative consists of a pattern and one or
more expressions.

An alternative expression only gets evaluated if
the associated pattern is matched.

=> separates the pattern from the expression(s)

A match expression consists of "match {alternatives}"

In a match expression, each alternative is evaluated in the
order specified.  The first matching pattern is then
selected, with the associated expression(s) then evaluated

*/



