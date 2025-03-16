// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Ellipse extends Shape {
    private double a; // Major axis
    private double b; // Minor axis

    // Constructor
    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        // Ensure a is the larger axis and b is the smaller axis
        if (axis1 > axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    // Compute area: A = πab
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    // Compute perimeter approximation: P = π * sqrt((a^2 + b^2) - (a - b)^2 / 2)
    @Override
    public double getPerimeter() {
        return Math.PI * Math.sqrt((a * a + b * b) - ((a - b) * (a - b)) / 2);
    }
    // Implement scale method
    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
    }
}

