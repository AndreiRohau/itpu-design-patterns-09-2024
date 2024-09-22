package dip.learningExample.daoExample.step2;

public class Main {
}
/*
Alternative DIP Implementation
It’s possible to use an alternative DIP implementation,
where we place the high-level components,
the abstractions,
and the low-level ones
all are in different packages.

For obvious reasons, this variant is more flexible, yields
better encapsulation of the components,
and makes it easier to replace the low-level components.

Of course, implementing this variant of the pattern boils down to just
placing CustomerService, MapCustomerDao, and CustomerDao in separate packages.

Therefore, a diagram is sufficient for showing how each component is laid out with this implementation:
 */
