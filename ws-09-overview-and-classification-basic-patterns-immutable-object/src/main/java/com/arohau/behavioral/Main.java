package com.arohau.behavioral;

import com.arohau.behavioral.chainOfResponsibilities.AuthenticationProcessor;
import com.arohau.behavioral.chainOfResponsibilities.processor.OAuthProcessor;
import com.arohau.behavioral.chainOfResponsibilities.processor.UsernamePasswordProcessor;
import com.arohau.behavioral.chainOfResponsibilities.provider.OAuthTokenProvider;
import com.arohau.behavioral.chainOfResponsibilities.provider.SamlTokenProvider;
import com.arohau.behavioral.chainOfResponsibilities.provider.UsernamePasswordProvider;
import com.arohau.behavioral.mediator.*;
import com.arohau.behavioral.memento.TextEditor;
import com.arohau.behavioral.memento.TextWindow;
import com.arohau.behavioral.templateMethod.Computer;
import com.arohau.behavioral.templateMethod.HighEndComputerBuilder;
import com.arohau.behavioral.templateMethod.StandardComputerBuilder;
import com.arohau.behavioral.visitor.*;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        System.out.println("#".repeat(20));
        testChainOfResponsibility();
        System.out.println("#".repeat(20));
        testCommand();
        System.out.println("#".repeat(20));
        testIterator();
        System.out.println("#".repeat(20));
        testMediator();
        System.out.println("#".repeat(20));
        testMemento();
        System.out.println("#".repeat(20));
        testObserver();
        System.out.println("#".repeat(20));
        testState();
        System.out.println("#".repeat(20));
        testStrategy();
        System.out.println("#".repeat(20));
        testTemplateMethod();
        System.out.println("#".repeat(20));
        testVisitor();
        System.out.println("#".repeat(20));
    }

    /*
    ex.: https://www.baeldung.com/java-visitor-pattern
    Visitor is a behavioral design pattern that lets you separate algorithms from the objects on which they operate.
     */
    private static void testVisitor() {
        System.out.println("testVisitor");

        Visitor v = new ElementVisitor();

        Document d = new Document(generateUuid());
        d.getElements().add(new JsonElement(generateUuid()));
        d.getElements().add(new JsonElement(generateUuid()));
        d.getElements().add(new XmlElement(generateUuid()));

        d.accept(v);
    }

    private static String generateUuid() {
        return UUID.randomUUID()
                .toString();
    }

    /*
    ex.: https://www.baeldung.com/java-template-method-pattern
    It makes it easier to implement complex algorithms by encapsulating logic in a single method.
     */
    private static void testTemplateMethod() {
        System.out.println("testTemplateMethod");

        Computer computer1 = new StandardComputerBuilder().buildComputer();
        computer1.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
        System.out.println("-".repeat(20));
        Computer computer2 = new HighEndComputerBuilder().buildComputer();
        computer2.getComputerParts().forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
    }

    private static void testStrategy() {
        System.out.println("already know it");
    }

    private static void testState() {
        System.out.println("already know it");
    }

    private static void testObserver() {
        System.out.println("already know it");
    }

    /*
    ex.: https://www.baeldung.com/java-memento-design-pattern
    When to Use Memento Design Pattern?
    Memento Design Pattern will be used in situations where some actions are undoable,
    therefore requiring to rollback to a previous state.
    However, if the state of the Originator is heavy, using the Memento Design Pattern can
    lead to an expensive creation process and increased use of memory.
     */
    private static void testMemento() {
        System.out.println("testMemento");

        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");

        textEditor.hitUndo();

        System.out.println((textEditor.print()).equals("The Memento Design Pattern\nHow to implement it in Java?\n"));
    }

    /*
    ex.: https://java-design-patterns.com/patterns/mediator/#detailed-explanation-of-mediator-pattern-with-real-world-examples-1
    Use the Mediator pattern when
        A set of objects communicate in well-defined but complex ways.
            The resulting interdependencies are unstructured and difficult to understand
        Reusing an object is difficult because it refers to and communicates with many other objects
        A behavior that's distributed between several classes should be customizable without a lot of subclassing
     */
    private static void testMediator() {
        System.out.println("testMediator");
        // create party and members
        Hobbit hobbit = new Hobbit();
        Wizard wizard = new Wizard();
        Rogue rogue = new Rogue();
        Hunter hunter = new Hunter();

        Party party = new PartyImpl();
        // add party members
        party.addMember(hobbit);
        party.addMember(wizard);
        party.addMember(rogue);
        party.addMember(hunter);

        // perform actions -> the other party members
        // are notified by the party
        hobbit.act(Action.ENEMY);
        System.out.println("-".repeat(10));
        wizard.act(Action.TALE);
        System.out.println("-".repeat(10));
        rogue.act(Action.GOLD);
        System.out.println("-".repeat(10));
        hunter.act(Action.HUNT);
    }

    private static void testIterator() {
        System.out.println("already know it");
    }

    private static void testCommand() {
        System.out.println("already know it");
    }

    /*
    ex.: https://www.baeldung.com/chain-of-responsibility-pattern
    The Chain of Responsibility pattern is handy for:
        Decoupling a sender and receiver of a command
        Picking a processing strategy at processing-time
     */
    private static void testChainOfResponsibility() {
        System.out.println("testChainOfResponsibility");
        System.out.println();
        AuthenticationProcessor oAuthProcessor = new OAuthProcessor(null);
        AuthenticationProcessor authProcessorChain = new UsernamePasswordProcessor(oAuthProcessor);

        System.out.println("OAuthTokenProvider : " + authProcessorChain.isAuthorized(new OAuthTokenProvider()));
        System.out.println("UsernamePasswordProvider : " + authProcessorChain.isAuthorized(new UsernamePasswordProvider()));
        System.out.println("SamlTokenProvider : " + authProcessorChain.isAuthorized(new SamlTokenProvider()));
    }

}
