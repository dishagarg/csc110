import java.io.*;

public class Lab8 {
	public static void main(String[] args) throws IOException {
		System.out.println("Test 2D Arrays ...");
		int[][] arr = new int[3][6]; // initialize a new array of (dimension 3 x 6)
		int count = 1;
		// initialize the array with the numbers 1 to 18
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = count++;
			}
		}
		// Alternative initializations
		int[][] barr = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 } };

		// Method call: to take out a double array
		double[][] halfItArr = halfIt(arr);

		// Method call: to print integer array
		printArray(arr);
		System.out.println("**********************************************");
		// Method call: to print double array
		printArray(halfItArr);
		System.out.println("**********************************************");

		// Method call: to take a char array returned by letterMath
		char[][] ohhhNo = letterMath();

		// Method call: to print that char array
		printLetters(ohhhNo);
	}

	// Method to generate a double array
	public static double[][] halfIt(int[][] arr) {
		double[][] temp = new double[3][6];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				temp[i][j] = arr[i][j] * 0.5;
			}
		}
		return temp;
	}

	// Method to print an integer array
	public static void printArray(int[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// Method to print a char array
	public static void printLetters(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// Method to print a double array
	public static void printArray(double[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// Method to generate a jagged char array
	public static char[][] letterMath() {
		char[][] itsJagged = new char[4][];
		char starter = 'a';
		for (int i = 0; i < itsJagged.length; i++) {
			itsJagged[i] = new char[(i + 1) * (i + 1)];
			for (int j = 0; j < itsJagged[i].length; j++) {
				int temp = (int) (starter) + i + j;
				itsJagged[i][j] = (char) temp;
			}
		}
		return itsJagged;
	}

}