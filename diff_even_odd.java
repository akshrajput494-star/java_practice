import java.util.Scanner;
public class diff_even_odd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter starting number: ");
            int start = scanner.nextInt();

            System.out.print("Enter ending number: ");
            int end = scanner.nextInt();

            System.out.println("\nEven numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\n\nOdd numbers between " + start + " and " + end + ":");
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

            scanner.close();
        }
    }

