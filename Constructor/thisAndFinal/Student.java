package Constructor.thisAndFinal;
public class Student {
    private static String universityName;
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String uniName) {
        universityName = uniName;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Object is not an instance of Student class.");
        }
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            grade = newGrade;
            System.out.println("Grade updated to: " + grade);
        } else {
            System.out.println("Cannot update grade. Not a Student instance.");
        }
    }
}

public class University {
    public static void main(String[] args) {
        Student.setUniversityName("Global University");
        Student s1 = new Student("Alice", 1, "A");
        Student s2 = new Student("Bob", 2, "B");

        Student.displayTotalStudents();

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        s2.updateGrade("A+");
        s2.displayStudentDetails();
    }
}
