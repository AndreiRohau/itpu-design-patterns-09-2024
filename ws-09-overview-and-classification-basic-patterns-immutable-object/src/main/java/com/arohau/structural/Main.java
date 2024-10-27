package com.arohau.structural;

import com.arohau.structural.adapter.MediaAdapter;
import com.arohau.structural.adapter.MediaPlayer;
import com.arohau.structural.adapter.Mp3Player;
import com.arohau.structural.bridge.ConcreteRemoteControl;
import com.arohau.structural.bridge.Device;
import com.arohau.structural.bridge.RemoteControl;
import com.arohau.structural.bridge.impl.PhilipsDVDPlayer;
import com.arohau.structural.bridge.impl.SonyTV;
import com.arohau.structural.composite.Department;
import com.arohau.structural.composite.Developer;
import com.arohau.structural.composite.Employee;
import com.arohau.structural.composite.Manager;
import com.arohau.structural.decorator.*;
import com.arohau.structural.facade.*;
import com.arohau.structural.flyweight.CharacterFactory;
import com.arohau.structural.flyweight.DisplayableCharacter;
import com.arohau.structural.proxy.InternetConnection;
import com.arohau.structural.proxy.InternetProxy;

public class Main {
    public static void main(String[] args) {
        System.out.println("#".repeat(20));
        testAdapter();
        System.out.println("#".repeat(20));
        testBridge();
        System.out.println("#".repeat(20));
        testComposite();
        System.out.println("#".repeat(20));
        testDecorator();
        System.out.println("#".repeat(20));
        testFacade();
        System.out.println("#".repeat(20));
        testFlyweight();
        System.out.println("#".repeat(20));
        testProxy();
        System.out.println("#".repeat(20));
    }

    /*
    The Proxy Design Pattern provides a surrogate or placeholder for another object to control access to it.
    It allows you to create a representative object that can act as a substitute for the real object.
    This pattern is useful for implementing lazy initialization, access control, logging, monitoring, and more.
     */
    private static void testProxy() {
        InternetConnection internetConnection = new InternetProxy();

        internetConnection.connect("example.com"); // Allowed
        internetConnection.connect("google.com"); // Allowed
        internetConnection.connect("facebook.com"); // Not allowed
    }

    /*
    The Flyweight Design Pattern aims to minimize memory usage and improve performance
    by sharing object instances across multiple contexts.
    It achieves this by splitting the object state into intrinsic (shared) and
    extrinsic (context-dependent) parts.
    This pattern is particularly useful when dealing with a large number of similar
    objects that can share common state.
     */
    private static void testFlyweight() {
        CharacterFactory characterFactory = new CharacterFactory();

        DisplayableCharacter characterA = characterFactory.getCharacter('A');
        characterA.display(10, 20);

        DisplayableCharacter characterB = characterFactory.getCharacter('B');
        characterB.display(30, 40);

        DisplayableCharacter characterA2 = characterFactory.getCharacter('A');
        characterA2.display(50, 60);

        // Output:
        // Character A displayed at position (10, 20)
        // Character B displayed at position (30, 40)
        // Character A displayed at position (50, 60)
    }

    /*
    The Facade Design Pattern provides a simplified interface to a set of interfaces in a subsystem.
    It hides the complexity of the subsystem and provides a unified interface to interact with it.
    This pattern promotes loose coupling between clients and the subsystem,
    making the system easier to use and maintain.
     */
    private static void testFacade() {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade facade = new HomeTheaterFacadeImpl(dvdPlayer, television, soundSystem);

        facade.watchMovie("Inception");
        // Watching movie...

        facade.endMovie();
        // Movie ended...

        facade.listenToMusic();
        // Listening to music...

        facade.stopMusic();
        // Music stopped...
    }

    /*
    The Decorator Design Pattern is a structural pattern that allows behavior to be added to
    individual objects dynamically, without affecting the behavior of other objects from the same class.
    It is used to extend the functionality of objects in a flexible and reusable
    way by wrapping them with additional functionality at runtime.
     */
    private static void testDecorator() {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: $" + simpleCoffee.cost() + ", Description: " + simpleCoffee.getDescription());

        Coffee coffeeWithMilkAndSugar = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.cost() + ", Description: " + coffeeWithMilkAndSugar.getDescription());

        Coffee coffeeWithWhippedCream = new WhippedCreamDecorator(new SimpleCoffee());
        System.out.println("Cost: $" + coffeeWithWhippedCream.cost() + ", Description: " + coffeeWithWhippedCream.getDescription());
    }

    /*
    The Composite Design Pattern allows you to compose objects into tree structures to represent part-whole hierarchies.
    It lets clients treat individual objects and compositions of objects uniformly.
    This pattern is useful when dealing with hierarchical structures
    where individual objects and compositions of objects need to be treated in the same way.
     */
    private static void testComposite() {
        Employee dev1 = new Developer("John");
        Employee dev2 = new Developer("Alice");
        Employee manager = new Manager("Bob");

        Department engineering = new Department("Engineering");
        engineering.addEmployee(dev1);
        engineering.addEmployee(dev2);
        engineering.addEmployee(manager);

        engineering.showDetails();
    }

    /*
    The Bridge Pattern decouples an abstraction from its implementation, allowing both to vary independently.
    It provides a way to separate abstraction and implementation hierarchies,
    making the system more flexible and easier to maintain.
     */
    private static void testBridge() {
        Device sonyTV = new SonyTV();
        RemoteControl remoteControl = new ConcreteRemoteControl(sonyTV);

        remoteControl.powerOn();
        remoteControl.setChannel(5);
        remoteControl.volumeUp();

        Device philipsDVDPlayer = new PhilipsDVDPlayer();
        RemoteControl remoteControl2 = new ConcreteRemoteControl(philipsDVDPlayer);

        remoteControl2.powerOn();
        remoteControl2.setChannel(3);
        remoteControl2.volumeUp();
    }

    /*
    The Adapter Design Pattern allows objects with incompatible interfaces to collaborate.
     */
    private static void testAdapter() {
        MediaPlayer mediaPlayer1 = new Mp3Player();
        mediaPlayer1.play("song.mp3"); // Plays MP3 file

        MediaPlayer mediaPlayer2 = new MediaAdapter("mp4");
        mediaPlayer2.play("movie.mp4"); // Plays MP4 file (via adapter)

    }
}
