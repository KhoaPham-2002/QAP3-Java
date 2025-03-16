// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public abstract class Shape implements Scalable {
    protected String name;

    // Constructor
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    // toString() method to display shape information
    @Override
    public String toString() {
        return String.format("Shape: %s%nArea: %.2f%nPerimeter: %.2f%n", name, getArea(), getPerimeter());
    }
}
