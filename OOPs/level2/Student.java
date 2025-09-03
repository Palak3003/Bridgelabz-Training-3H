package OOPs.level2;
import java.text.DecimalFormat;

public class Student {
    private String name;
    private String rollNumber;
    private double marks;

    public Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B+";
        } else if (marks >= 60) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    public void displayDetails() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + df.format(marks) + "%");
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice Johnson", "S001", 85.5);
        Student student2 = new Student("Bob Smith", "S002", 62.0);

        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();
    }
}
