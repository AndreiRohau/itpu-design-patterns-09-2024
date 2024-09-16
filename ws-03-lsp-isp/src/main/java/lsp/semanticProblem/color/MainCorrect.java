package lsp.semanticProblem.color;

public class MainCorrect {
    public static void main(String[] args) {
        Color color = new BlueV2();
        color.getColor();
        //output: Blue
    }
}
interface Color{
    public void getColor();
}

class GreenV2 implements Color {
    public void getColor() {
        System.out.println("Green");
    }
}

class BlueV2 implements Color {
    public void getColor() {
        System.out.println("Blue");
    }
}
