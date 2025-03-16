// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Triangle extends Shape {
    private double side1, side2, side3;

    // Constructor with validation
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid Triangle: The sum of any two sides must be greater than the third side.");
        }
    }

    // Compute perimeter: P = A + B + C
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Compute area: A = sqrt(S(S-A)(S-B)(S-C))
    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

