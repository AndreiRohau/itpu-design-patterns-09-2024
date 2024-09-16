package lsp.behavioralProblem.animal;

public class MainProblem {
}

interface Bird{
    public void fly();
    public void walk();
}


class Parrot implements Bird{
    public void fly(){
        // to do
    }
        public void walk(){
        // to do
    }
}

class Penguin implements Bird{
    public void fly() {
        // to do
    }
    public void walk () {
        // to do
    }
}  // it's break the principle of LSP. Penguin can not fly.

