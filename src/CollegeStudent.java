// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class CollegeStudent extends Student {
    private String major; // College major
    private int year;     // Year in college

    // Constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa); // Call superclass constructor
        this.year = year;
        this.major = major;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    // Setter methods
    public void setYear(int year) {
        this.year = year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // toString() method
    @Override
    public String toString() {
        return String.format("%sYear: %d%nMajor: %s%n", super.toString(), year, major);
    }
}

