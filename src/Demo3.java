// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Demo3 {
    public static void main(String[] args) {
        // Create an array of Shape references
        Shape[] shapes = new Shape[4];

        // Initialize different shapes
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(6.0, 4.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(4.0);

        // Print details of each shape using a traditional for loop
        System.out.println("=== Shape Details ===");
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println("--------------------------------");
        }
    }
}

