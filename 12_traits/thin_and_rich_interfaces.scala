/*
tradeoff between callers of an interface and implementers
of an interface.

thin interface
fewer methods (more convenient to implementers)
caller likely needs to write more code to adapt a more generic
method to the desired need.

rich interface
has many methods
convenient the caller (client)
caller can pick a method specific to the use-case desired.
rich interfaces are a burden to implementors because to create
an implementation means many methods must be implemented.

traits make it easier to implement rich interfaces since
they can provide concrete implementations.

scala makes it more reasonable to lean towards rick interfaces.

A thin interface might only offer < and ==.
A rich interface might offer all of <, == and <=.  Using a thin 
interface, you'd be forced to write...

if x < 1 || x == 1
*/
