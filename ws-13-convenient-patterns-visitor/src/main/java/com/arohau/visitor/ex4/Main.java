package com.arohau.visitor.ex4;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.util.ArrayList;
import java.util.List;

// Visitor interface
interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Square square);
    void visit(Triangle triangle);
}

// Element interface
interface Shape {
    void accept(ShapeVisitor visitor);
}

// Concrete Elements
class Circle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

class Square implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

class Triangle implements Shape {
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Visitors
class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;
    double radiusOfCircle = 5;
    double sideOfSquare = 4;
    double baseOfTriangle = 3;
    double heightOfTriangle = 6;

    @Override
    public void visit(Circle circle) {
        // Calculate area of circle and update totalArea
        totalArea += Math.PI * Math.pow(radiusOfCircle, 2);
    }

    @Override
    public void visit(Square square) {
        // Calculate area of square and update totalArea
        totalArea += Math.pow(sideOfSquare, 2);
    }

    @Override
    public void visit(Triangle triangle) {
        // Calculate area of triangle and update totalArea
        totalArea += (baseOfTriangle * heightOfTriangle) / 2;
    }

    public double getTotalArea() {
        return totalArea;
    }
}

// Main class
public class Main {
//    private static final double EXPECTED = 103.53981;
    private static final double EXPECTED = 103.53981633974483;

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }

        double totalArea = areaCalculator.getTotalArea();
        System.out.println(EXPECTED == totalArea);
        System.out.println("Total area: " + totalArea);
        JavaCompiler systemJavaCompiler = ToolProvider.getSystemJavaCompiler();
    }
}
