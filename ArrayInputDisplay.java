import java.util.Scanner;

public class ArrayInputDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nYou entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.print("\nAs a single line: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        scanner.close();
    }
}