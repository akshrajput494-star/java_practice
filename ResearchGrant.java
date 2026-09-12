public class ResearchGrant {
    // 1. Data Hiding
    private String grantId;
    private String scholarName;
    private double availableFunds;

    // 2. Controlled Access
    public ResearchGrant(String grantId, String scholarName) {
        this.grantId = grantId;
        this.scholarName = scholarName;
        this.availableFunds = 0.0; 
    }

    // 3. Validation
    public void addFunds(double amount) {
        if (amount > 0) {
            this.availableFunds += amount;
            System.out.println("Added: $" + amount + " | Current Balance: $" + this.availableFunds);
        } else {
            System.out.println("Error: Cannot add a zero or negative amount.");
        }
    }

    public void spendFunds(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Spend amount must be greater than zero.");
        } else if (amount > this.availableFunds) {
            System.out.println("Error: Insufficient funds.");
        } else {
            this.availableFunds -= amount;
            System.out.println("Spent: $" + amount + " | Remaining Balance: $" + this.availableFunds);
        }
    }

    // 4. Getters
    public String getGrantId() { return this.grantId; }
    public String getScholarName() { return this.scholarName; }
    public double getAvailableFunds() { return this.availableFunds; }

    // 5. Execution Entry Point (Moved inside ResearchGrant)
    public static void main(String[] args) {
        ResearchGrant grant = new ResearchGrant("RG-2026-X", "Jane Doe");

        System.out.println("Grant ID: " + grant.getGrantId());
        System.out.println("Scholar: " + grant.getScholarName());

        System.out.println("\n--- Testing Valid Transactions ---");
        grant.addFunds(5000.00);
        grant.spendFunds(1500.00);

        System.out.println("\n--- Testing Invalid Transactions ---");
        grant.spendFunds(4000.00); 
        grant.spendFunds(-200.00); 
        grant.addFunds(-50.00);    

        System.out.println("\nFinal Verified Balance: $" + grant.getAvailableFunds());
    }
}