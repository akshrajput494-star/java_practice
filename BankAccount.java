import java.util.Scanner;
public class BankAccount{
    int accountNumber;
    String customersName;
    double balance;
    
    BankAccount(){
        accountNumber = 0;
        customersName = "Default";
        balance = 0;
    }    
    BankAccount(int accountNumber , String customerName , double balance){
        this.accountNumber = accountNumber;
        this.customersName = customerName;
        this.balance = balance;

    }
    BankAccount(BankAccount obj){
        this.accountNumber = obj.accountNumber;
        this.customersName = obj.customersName;
        this.balance = obj.balance;

    }
    void display() {
        System.out.println(" Account Number : " +accountNumber);
        System.out.println("Customer Name : "+ customersName);
        System.out.println("Balance: " + balance);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accNo = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter  Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter balance: ");
        double bal= sc.nextDouble();


        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(accNo ,name ,bal);

        System.out.println("\nDefaut Account: ");
        account1.display();

        System.out.println("\nCustomer Account: ");
        account2.display();

        sc.close();


    
    }
}