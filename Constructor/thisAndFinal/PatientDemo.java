public class PatientDemo {
    private static String hospitalName;
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public PatientDemo(String patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static void displayTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    public void showDetails() {
        if (this instanceof PatientDemo) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Object is not an instance of PatientDemo.");
        }
    }

    public static void main(String[] args) {
        PatientDemo.setHospitalName("City Hospital");
        PatientDemo p1 = new PatientDemo("PID1001", "Alice", 30, "Flu");
        PatientDemo p2 = new PatientDemo("PID1002", "Bob", 45, "Broken Arm");

        PatientDemo.displayTotalPatients();

        p1.showDetails();
        p2.showDetails();
    }
}
