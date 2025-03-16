// Name: Khoa Pham
// Project: QAP3 Java
// Date: 03/16/2025

public class Demo {
    public static void main(String[] args) {
        // === Testing Person Class ===
        System.out.println("=== Testing Person Class ===");
        Person person = new Person("Loan Bui", 53, "F");
        System.out.println("Initial state:\n" + person);

        // Updating person's details using setters
        person.setName("Khoa Pham");
        person.setAge(22);
        person.setGender("M");
        System.out.println("Updated state:\n" + person);
        System.out.println("--------------------------------");

        // === Testing Student Class ===
        System.out.println("=== Testing Student Class ===");
        Student student = new Student("Christopher Pham", 40, "M", "S1985", 3.5);
        System.out.println("Initial state:\n" + student);

        // Updating student details using setters
        student.setIdNum("S2025");
        student.setGPA(3.75);
        System.out.println("Updated state:\n" + student);
        System.out.println("--------------------------------");

        // === Testing Teacher Class ===
        System.out.println("=== Testing Teacher Class ===");
        Teacher teacher = new Teacher("Matthew English", 37, "M", "Computer Science", 70000.00);
        System.out.println("Initial state:\n" + teacher);

        // Updating teacher details using setters
        teacher.setSubject("Information Technology");
        teacher.setSalary(65000.00);
        System.out.println("Updated state:\n" + teacher);
        System.out.println("--------------------------------");

        // === Testing CollegeStudent Class ===
        System.out.println("=== Testing CollegeStudent Class ===");
        CollegeStudent collegeStudent = new CollegeStudent("Tien Bui", 19, "M", "S2023", 3.8, 2, "Computer Science");
        System.out.println("Initial state:\n" + collegeStudent);

        // Updating college student details using setters
        collegeStudent.setYear(3);
        collegeStudent.setMajor("Information Technology");
        System.out.println("Updated state:\n" + collegeStudent);
        System.out.println("--------------------------------");

    }
}


