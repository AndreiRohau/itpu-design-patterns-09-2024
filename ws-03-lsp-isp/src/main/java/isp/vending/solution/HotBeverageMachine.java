package isp.vending.solution;

public interface HotBeverageMachine extends VendingMachine {
    void brewCoffee(Object args); // hot bevs
    void brewHotChocolate(Object args); // hot bevs
    void brewTea(Object args); // hot bevs
}
