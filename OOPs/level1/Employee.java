package OOPs.level1;

public class Employee {
    private String name;
    private String id;
    private double salary;
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.printf("Employee Salary: $%.2f%n", salary);
    }
    public static void main(String[] args) {
        // Creating employee instances
        Employee emp1 = new Employee("John Doe", "E123", 50000.00);
        Employee emp2 = new Employee("Jane Smith", "E456", 75000.00);
        System.out.println("Employee 1 Details:");
        emp1.displayDetails();
        System.out.println("\nEmployee 2 Details:");
        emp2.displayDetails();
    }
}
