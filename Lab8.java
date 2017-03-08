import java.io.*;

public class Lab8 {
	public static void main(String[] args) throws IOException {
		System.out.println("Test 2D Arrays ...");
		int[][] arr = new int[3][6]; // replace this
		int count = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = count++;
			}
		}

		int[][] barr = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 } };

		double[][] halfItArr = halfIt(arr);

		printArray(arr);
		System.out.println("**********************************************");
		printArray(halfItArr);
		System.out.println("**********************************************");

		char[][] ohhhNo = letterMath();

		printLetters(ohhhNo);
	}

	public static double[][] halfIt(int[][] arr) {
		double[][] temp = new double[3][6];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				temp[i][j] = arr[i][j] * 0.5;
			}
		}
		return temp;
	}

	public static void printArray(int[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void printLetters(char[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

	public static void printArray(double[][] arr) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

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