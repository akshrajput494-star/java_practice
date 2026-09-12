
class LabEquipment {
    public String equipmentName;

    String assignedLab;

    private double cost;
    
    public LabEquipment(double cost) {
        this.cost = cost;
    }

    public void displayDetails() {
        System.out.println("Equipment Name: " + equipmentName);
        System.out.println("Assigned Lab: " + assignedLab);
        System.out.println("Cost: $" + cost);
    }
}

public class LabEquipmentTest {
    public static void main(String[] args) {
        LabEquipment equipment = new LabEquipment(5000.0);

        equipment.equipmentName = "Centrifuge X-100";

        equipment.assignedLab = "Biology Wing, Room 402";

        System.out.println("--- Equipment Registry Details ---");
        equipment.displayDetails();
    }
}