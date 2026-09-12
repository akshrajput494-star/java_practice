import java.util.Scanner;

public class MatrixMultiplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Matrix A x Matrix B");
		System.out.print("Enter rows in Matrix A: ");
		int rowsA = scanner.nextInt();

		System.out.print("Enter columns in Matrix A (also rows in Matrix B): ");
		int commonDim = scanner.nextInt();

		System.out.print("Enter columns in Matrix B: ");
		int colsB = scanner.nextInt();

		int[][] matrixA = new int[rowsA][commonDim];
		int[][] matrixB = new int[commonDim][colsB];
		int[][] result = new int[rowsA][colsB];

		System.out.println("\nEnter values for Matrix A:");
		for (int row = 0; row < rowsA; row++) {
			for (int column = 0; column < commonDim; column++) {
				System.out.print("A[" + row + "][" + column + "]: ");
				matrixA[row][column] = scanner.nextInt();
			}
		}

		System.out.println("\nEnter values for Matrix B:");
		for (int row = 0; row < commonDim; row++) {
			for (int column = 0; column < colsB; column++) {
				System.out.print("B[" + row + "][" + column + "]: ");
				matrixB[row][column] = scanner.nextInt();
			}
		}

		for (int row = 0; row < rowsA; row++) {
			for (int column = 0; column < colsB; column++) {
				for (int index = 0; index < commonDim; index++) {
					result[row][column] += matrixA[row][index] * matrixB[index][column];
				}
			}
		}

		System.out.println("\nResult:");
		for (int row = 0; row < rowsA; row++) {
			for (int column = 0; column < colsB; column++) {
				System.out.print(result[row][column] + " ");
			}
			System.out.println();
		}

		scanner.close();
	}
}
