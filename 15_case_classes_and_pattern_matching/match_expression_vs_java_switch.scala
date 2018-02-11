/*
In scala, only one alternative is ever executed, as opposed to java
in which alternatives may fall through.

In scala, match is an expression, meaning it always returns a value.
Unit is a valid return value...that is, an expression that simply
runs println is valid.

In scala, if no alternative is matched, a MatchException is thrown.
It is important to handle all possible cases in the match expression,
if by no other means than using wildcard pattern.
*/
