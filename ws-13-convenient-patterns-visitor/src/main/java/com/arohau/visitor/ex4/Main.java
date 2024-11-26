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
    private double radiusOfCircle;
    public Circle(double radiusOfCircle) {
        this.radiusOfCircle = radiusOfCircle;
    }
    public double getRadiusOfCircle() {
        return radiusOfCircle;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

class Square implements Shape {
    private double sideOfSquare;
    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }
    public double getSideOfSquare() {
        return sideOfSquare;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

class Triangle implements Shape {
    private double baseOfTriangle;
    private double heightOfTriangle;
    public Triangle(double baseOfTriangle, double heightOfTriangle) {
        this.baseOfTriangle = baseOfTriangle;
        this.heightOfTriangle = heightOfTriangle;
    }
    public double getBaseOfTriangle() {
        return baseOfTriangle;
    }
    public double getHeightOfTriangle() {
        return heightOfTriangle;
    }
    @Override
    public void accept(ShapeVisitor visitor) {
        visitor.visit(this);
    }
}

// Concrete Visitors
class AreaCalculator implements ShapeVisitor {
    private double totalArea = 0;

    public void processShapes(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.accept(this);
        }
    }

    @Override
    public void visit(Circle circle) {
        // Calculate area of circle and update totalArea
        totalArea += Math.PI * Math.pow(circle.getRadiusOfCircle(), 2);
    }

    @Override
    public void visit(Square square) {
        // Calculate area of square and update totalArea
        totalArea += Math.pow(square.getSideOfSquare(), 2);
    }

    @Override
    public void visit(Triangle triangle) {
        // Calculate area of triangle and update totalArea
        totalArea += (triangle.getBaseOfTriangle() * triangle.getHeightOfTriangle()) / 2;
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
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Triangle(3, 6));

        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.processShapes(shapes);

        double totalArea = areaCalculator.getTotalArea();
        System.out.println(EXPECTED == totalArea);
        System.out.println("Total area: " + totalArea);
    }
}
