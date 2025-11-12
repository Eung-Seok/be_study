package be_study.quiz;
import java.util.Scanner;

public class Matrix_Multiplication_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome! This is matrix calculator. ");
		System.out.println("For calculate n x m and m x l matrix please enter n, m, l");
		System.out.print("n : ");
		int n = scanner.nextInt();
		System.out.print("m : ");
		int m = scanner.nextInt();
		System.out.print("l : ");
		int l = scanner.nextInt();
		
		int[][] matrix1 = new int[n][m];
		int[][] matrix2 = new int[m][l];
		
		System.out.println("Please input first matrix");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.printf("[%d][%d] : ");
			}
		}
	}

}
