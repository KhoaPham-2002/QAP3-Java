// Demo.java
// Demo4.java
public class Demo4 {
    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = new Scalable[4];

        // Initialize different shapes
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(6.0, 4.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(4.0);
        shapes[4] = new Ellipse(7.0, 3.0);

        // Print original shapes
        System.out.println("=== Original Shapes ===");
        printShapes(shapes);

        // Scale all shapes by a factor of 2
        scaleShapes(shapes, 2.0);

        // Print shapes after scaling
        System.out.println("\n=== Shapes After Scaling (Factor 2.0) ===");
        printShapes(shapes);
    }

    // Method to scale all objects in the array
    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].scale(factor);
        }
    }

    // Method to print all shape details
    public static void printShapes(Scalable[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
            System.out.println("--------------------------------");
        }
    }
}


