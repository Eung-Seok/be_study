package be_study.quiz;

import java.util.Scanner;
public class Multiplication_Of_Matirx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix1 = {{4,7,2,},{5,1,9},{3,8,1}};
		int[][] matrix2 = {{7,3,1,},{4,7,9},{6,2,1}};
		
		int[][] matrix3 = new int[3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3 ; j++) {
				for (int k = 0; k <3; k++) {
					matrix3[i][j] += matrix1[i][k]*matrix2[k][j];
				}
			}
		}
		System.out.println("First matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3 ; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Press Enter");
		String blank1 = scanner.nextLine();
		
		System.out.println("Second matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3 ; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Press Enter");
		String blank2 = scanner.nextLine();
		
		System.out.println("Then matrix3 = matrix1 * matrix2 is below");
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <3 ; j++) {
				System.out.print(matrix3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
