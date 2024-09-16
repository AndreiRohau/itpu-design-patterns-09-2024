package lsp.semanticProblem.color;

public class MainProblem {
    public static void main(String[] args) {
        // violate LSP because color of green object is blue
        Green inFactBlue = new Blue();
        inFactBlue.getColor();
        //output: Blue
    }
}

class Green {
    public void getColor() {
        System.out.println("Green");
    }
}

class Blue extends Green {
    public void getColor() {
        System.out.println("Blue");
    }
}
