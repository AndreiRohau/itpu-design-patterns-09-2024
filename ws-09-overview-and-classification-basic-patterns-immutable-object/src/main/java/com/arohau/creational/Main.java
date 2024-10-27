package com.arohau.creational;

import com.arohau.creational.builder.BankAccount;
import com.arohau.creational.factoryMethod.Polygon;
import com.arohau.creational.factoryMethod.PolygonFactory;
import com.arohau.creational.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        testSingleton();
        System.out.println("#".repeat(20));
        testFactoryMethod();
        System.out.println("#".repeat(20));
        testBuilder();
    }

    /*
    When to Use Builder Pattern
        When the process involved in creating an object is extremely complex, with lots of mandatory and optional parameters
        When an increase in the number of constructor parameters leads to a large list of constructors
        When client expects different representations for the object that’s constructed
     */
    private static void testBuilder() {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("Jon", "22738022275")
                .withEmail("jon@example.com")
                .wantNewsletter(true)
                .build();

        System.out.println(newAccount);
    }

    /*
    When to Use Factory Method Design Pattern
        When the implementation of an interface or an abstract class is expected to change frequently
        When the current implementation cannot comfortably accommodate new change
        When the initialization process is relatively simple, and the constructor only requires a handful of parameters
     */
    private static void testFactoryMethod() {
        PolygonFactory polygonFactory = new PolygonFactory();

        Polygon p0 = polygonFactory.getPolygon(0);
        assert p0 != null;
        System.out.println("Is circle ? " + p0.getType());

        Polygon p3 = polygonFactory.getPolygon(3);
        assert p3 != null;
        System.out.println("Is triangle ? " + p3.getType());

        Polygon p4 = polygonFactory.getPolygon(4);
        assert p4 != null;
        System.out.println("Is square ? " + p4.getType());

        Polygon p404 = polygonFactory.getPolygon(404);
        System.out.println("Is null ? " + p404);
    }

    /*
    When to Use Singleton Design Pattern
        For resources that are expensive to create (like database connection objects)
        It’s good practice to keep all loggers as Singletons which increases performance
        Classes which provide access to configuration settings for the application
        Classes that contain resources that are accessed in shared mode
     */
    private static void testSingleton() {
        System.out.println("there");
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton3);

        assert singleton1 == singleton2 && singleton2 == singleton3;
    }
}
