/*
Useful for working with libraries you don't have control of.

Lets you adapt libraries to use cases not natively supported
by library.  Libraries aren't written to support types a developer
creates.

Implicits centralize certain mechanisms related to type conversions
, make them available for use by compiler when needed, removing
the need to include conversion code inline to normal code.

Makes code clearer, focusing on its primary purpose and not secondary
concerns like type conversion.

Implicits are useful when working with different codebases, each
developed without knowing anything about the other.

*/
