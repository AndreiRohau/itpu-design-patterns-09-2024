package isp.vending.problem;

// polluted interface
// since the cohesion between methods is LOW
public interface VendingMachine {
    void takeMoney(Object args); // commerce

    void brewCoffee(Object args); // hot bevs
    void brewHotChocolate(Object args); // hot bevs
    void brewTea(Object args); // hot bevs

    void dispenseWater(Object args); // cold bevs
    void dispenseCola(Object args); // cold bevs

    void dispenseSnack(Object args); // snacks
}
