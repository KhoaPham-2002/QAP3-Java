// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Demo2 {
    public static void main(String[] args) {
        // Testing Point class
        System.out.println("=== Testing Point Class ===");
        Point p1 = new Point();
        System.out.println("Default point: " + p1);

        Point p2 = new Point(3.5f, 4.5f);
        System.out.println("Point with values: " + p2);

        p2.setXY(2.2f, 3.3f);
        System.out.println("Updated point: " + p2);
        System.out.println("--------------------------------");

        // Testing MovablePoint class
        System.out.println("=== Testing MovablePoint Class ===");
        MovablePoint mp1 = new MovablePoint();
        System.out.println("Default movable point: " + mp1);

        MovablePoint mp2 = new MovablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println("Initial state: " + mp2);

        // Move the point
        mp2.move();
        System.out.println("After move: " + mp2);

        // Change speed and move again
        mp2.setSpeed(1.0f, 1.5f);
        mp2.move();
        System.out.println("After changing speed and moving: " + mp2);
    }
}
