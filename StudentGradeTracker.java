import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        int[] scores = new int[n];

        int totalSum = 0;
        
        int highestScore = Integer.MIN_VALUE; 

        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
            
            totalSum += scores[i];
            
            if (scores[i] > highestScore) {
                highestScore = scores[1];
            }
        }

        System.out.println("--- Score Report ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": " + scores[i]);
        }

        System.out.println("\nTotal Class Score: " + totalSum);
        System.out.println("\nHighest Score: " + highestScore);

        scanner.close();
    }
}