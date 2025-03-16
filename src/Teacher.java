// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Teacher extends Person {
    private String subject;  // Subject the teacher teaches
    private double salary;   // Teacher’s annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call superclass constructor
        this.subject = subject;
        this.salary = salary;
    }

    // Getter methods
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("%sSubject: %s%nSalary: $%.2f%n", super.toString(), subject, salary);
    }
}
