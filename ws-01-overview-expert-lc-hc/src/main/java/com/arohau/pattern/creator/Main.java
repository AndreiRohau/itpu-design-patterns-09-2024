package com.arohau.pattern.creator;

/*
The creation of objects is one of the most common activities in an object-oriented system.
Which class is responsible for creating objects is a fundamental property of the relationship between objects of particular classes.

Problem: Who creates object A?
Solution: In general, Assign class B the responsibility to create object A if one, or preferably more, of the following apply:

1. (B contains A) = Instances of B contain or compositely aggregate instances of A
2. (B records A) = Instances of B record instances of A
3. (B closely uses A) = Instances of B closely use instances of A
4. (B has init data for A) = Instances of B have the initializing information for instances of A and pass it on creation.

 TIP: find creator that is connected to the created object in any event
 Supports Low coupling
 */
public class Main {
}
