package isp.vending.problem;

// polluted interface
// since the cohesion between methods is LOW
public interface VendingMachine {
    // commerce
    void takeMoney(Object args);

    // hot bevs
    void brewCoffee(Object args);
    void brewHotChocolate(Object args);
    void brewTea(Object args);

    // cold bevs
    void dispenseWater(Object args);
    void dispenseCola(Object args);

    // snacks
    void dispenseSnack(Object args);
}
