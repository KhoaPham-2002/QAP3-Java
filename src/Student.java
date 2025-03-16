// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Student extends Person {
    protected String myIdNum; // Student Id Number
    protected double myGPA;   // Grade point average

    // Constructor
    public Student(String name, int age, String gender, String idNum, double gpa) {
        super(name, age, gender); // Call superclass constructor
        myIdNum = idNum;
        myGPA = gpa;
    }

    // Getter methods
    public String getIdNum() {
        return myIdNum;
    }

    public double getGPA() {
        return myGPA;
    }

    // Setter methods
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }

    public void setGPA(double gpa) {
        myGPA = gpa;
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("%sStudent ID: %s%nGPA: %.2f%n", super.toString(), myIdNum, myGPA);
    }
}
