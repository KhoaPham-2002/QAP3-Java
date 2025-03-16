// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class EquilateralTriangle extends Triangle {

    // Constructor (all sides are equal)
    public EquilateralTriangle(double side) {
        super(side, side, side);
        super.name = "Equilateral Triangle"; // Update name for toString
    }
}

