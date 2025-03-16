// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Compute area: A = πr²
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Compute perimeter: P = 2πr
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

