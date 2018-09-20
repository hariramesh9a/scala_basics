#Scala basics - theory
## Scala case class and class

stateful classes introduce a notion of identity that does not exist in case classes.

for e.g. case Money(denomination:Int,currency:String)

val m1=new Money(1,2)
val m2= new Money(1,2)

here m1 and m2 are equal. Since case classes are just a special case of classes, whose purpose is to aggregate several values into a single value.


where as if it done to class it will not be equal. Becuase it bring notion of identity.


scala var/ref all are instance of classes- unified type system .

java val and reference type must exit.

unified type system . Any, AnyVal, AnyRef (ref types)

## None, Nothing, Null, Nil


None is a value not type

Nothing is type - cannot be instantiated - inherited form Any - absence of value

Null ~ java null

Nil is list of nothing. End with Nothing


## first class function
    
function can be stored in a val/var

return value can be function

input argument can be function
higher order fucntion: ret val/argumnet are functions


## Functions and Methods:

Function is a first class citizen in scala methods are not

Functions are objects with behavior, methods are not objects - function can be stored val

Methods not r-val - methods are trait descend from anyRef

option presence or absence

None- absence

Some

## Higher order function

scan fold reduce apply on multiple elements at same time

for each iterate over element
