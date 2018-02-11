/*
When defining operators like + and * in a class,
scala native operator precedence affects these just
like the native implementations.

In other words, implementations of * have precedence 
over +.
*/

/*
operators are defined using one or more "operator
characters".  An operator character is a printable ascii char.

Consecutive operator chars will be considered as a whole.
If you want operator characters considered separately, sep
them by a space.
*/
