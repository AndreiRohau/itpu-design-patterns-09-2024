package lsp.behavioralProblem.animal;

public class MainCorrect {
}

interface Bird_ {
}

interface FlyingBird_ extends Bird_ {
    public void fly();
}

interface WalkingBird_ extends Bird_ {
    public void walk();
}

class Parrot_ implements FlyingBird_, WalkingBird_ {
    public void fly(){
    }
    public void walk(){
    }
}

class Penguin_ implements WalkingBird_ {
    public void walk(){
    }
}