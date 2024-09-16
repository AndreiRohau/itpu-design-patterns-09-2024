package lsp.semanticProblem.color;

public class MainProblem {
    public static void main(String[] args) {
        // violate LSP because color of green object is blue
        Green green = new Blue();
        green.getColor();
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
