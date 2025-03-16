// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Constructors
    public MovablePoint() {
        // Default constructor
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Call Point constructor
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter and Setter methods
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // Move the point by xSpeed and ySpeed
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("%s, speed=(%.2f,%.2f)", super.toString(), xSpeed, ySpeed);
    }
}
