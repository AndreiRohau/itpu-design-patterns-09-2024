package dip.baeldungExample.stringProcessorExample;

public class Main {
}

/*
Defining the Ownership of the Abstractions
Item 3 is a direct DIP implementation,
where the high-level component and the abstraction(s) are placed in the same package.
Hence, the high-level component owns the abstractions.
In this implementation, the high-level component is responsible
for defining the abstract protocol
through which it interacts with the low-level components.

Likewise, item 4 is a more decoupled DIP implementation.
In this variant of the pattern, neither the high-level component nor the low-level ones
have the ownership of the abstractions.

The abstractions are placed in a separate layer,
which facilitates switching the low-level components.
At the same time, all the components are isolated from each other,
 which yields stronger encapsulation.
 */
