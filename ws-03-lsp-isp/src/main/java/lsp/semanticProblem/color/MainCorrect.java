package lsp.semanticProblem.color;

public class MainCorrect {
    public static void main(String[] args) {
        IColor color = new BlueV2();
        color.getColor();
        //output: Blue
    }
}
interface IColor{
    public void getColor();
}

class GreenV2 implements IColor {
    public void getColor() {
        System.out.println("Green");
    }
}

class BlueV2 implements IColor {
    public void getColor() {
        System.out.println("Blue");
    }
}
