/*
a literal identifier is an arbitrary string enclosed in backticks.

why? to allow use of certain strings where they would otherwise
not work for some reason.

in pattern matching, any lowercase symbol is interpretted as a 
match variable, otherwise an identifer in the outer scope (???).

using a literal identifier allows you to match on a val from the
outer scope that starts with an underscore.
*/


