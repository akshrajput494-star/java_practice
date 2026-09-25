public class Employeee {
    // Instance Variables
    private String name;
    private String department;

    // Static Variable
    private static int totalEmployees = 0;

    // Constructor
    public Employeee(String name, String department) {
        this.name = name;
        this.department = department;
        totalEmployees++; // Increments the shared class-level counter
    }

    // Instance Method
    public void printEmployeeDetails() {
        System.out.println("Name: " + this.name + " | Department: " + this.department);
    }

    // Static Method
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Main method to test the system
    public static void main(String[] args) {
        System.out.println("Initial Employee Count: " + Employeee.getTotalEmployees());

        Employeee emp1 = new Employeee("Alice", "Engineering");
        Employeee emp2 = new Employeee("Bob", "Design");
        Employeee emp3 = new Employeee("Charlie", "Marketing");

        System.out.println("\n--- Employee Details ---");
        emp1.printEmployeeDetails();
        emp2.printEmployeeDetails();
        emp3.printEmployeeDetails();

        System.out.println("\nFinal Employee Count: " + Employeee.getTotalEmployees());
    }
}