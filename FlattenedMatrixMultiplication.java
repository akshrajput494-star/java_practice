import java.util.Scanner;

public class FlattenedMatrixMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter rows in the first matrix: ");
		int rowsFirstMatrix = scanner.nextInt();

		System.out.print("Enter shared dimension: ");
		int sharedDimension = scanner.nextInt();

		System.out.print("Enter columns in the second matrix: ");
		int columnsSecondMatrix = scanner.nextInt();

		int[] firstMatrix = new int[rowsFirstMatrix * sharedDimension];
		int[] secondMatrix = new int[sharedDimension * columnsSecondMatrix];
		int[] result = new int[rowsFirstMatrix * columnsSecondMatrix];

		System.out.println("Enter " + firstMatrix.length + " values for the first matrix:");
		for (int index = 0; index < firstMatrix.length; index++) {
			System.out.print("First matrix value " + (index + 1) + ": ");
			firstMatrix[index] = scanner.nextInt();
		}

		System.out.println("Enter " + secondMatrix.length + " values for the second matrix:");
		for (int index = 0; index < secondMatrix.length; index++) {
			System.out.print("Second matrix value " + (index + 1) + ": ");
			secondMatrix[index] = scanner.nextInt();
		}

		for (int row = 0; row < rowsFirstMatrix; row++) {
			for (int column = 0; column < columnsSecondMatrix; column++) {
				int sum = 0;

				for (int sharedIndex = 0; sharedIndex < sharedDimension; sharedIndex++) {
					int firstMatrixIndex = row * sharedDimension + sharedIndex;
					int secondMatrixIndex = sharedIndex * columnsSecondMatrix + column;
					sum += firstMatrix[firstMatrixIndex] * secondMatrix[secondMatrixIndex];
				}

				int resultIndex = row * columnsSecondMatrix + column;
				result[resultIndex] = sum;
			}
		}

		System.out.println("Result:");
		for (int index = 0; index < result.length; index++) {
			if (index > 0) {
				System.out.print(" ");
			}
			System.out.print(result[index]);
		}
		System.out.println();

		scanner.close();
	}
}
