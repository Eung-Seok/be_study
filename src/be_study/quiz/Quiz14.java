package be_study.quiz;

import java.util.Scanner;
public class Quiz14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		int[] five = new int[5];
		for (int i = 0; i <five.length ; i++) {
			System.out.print("자연수를 입력해주세요 : ");
			five[i] = scanner.nextInt();
			//자연수의 조건을 만족하게 하기위한 조건문
			while(five[i] <= 0) {
				System.out.println("잘못입력했습니다.");
				System.out.print("자연수를 입력해주세요 : ");
				five[i] = scanner.nextInt();
			}
			
		}
		
		System.out.print("몇번째 수인가요? : ");
		int nth = scanner.nextInt();
		//배열의 범위를 넘으면 안되기 때문에 넣은 조건식
		while(!(nth >= 1 && nth <=5) ) {
			System.out.println("1부터 5사이의 수를 입력해주세요.");
			System.out.print("몇번째 수인가요? : ");
			nth = scanner.nextInt();
		}
		
		System.out.println("결과 : "+ five[nth-1]);
		
		System.out.println("---------------------------------");
		
		//첫번째 방식
		int[] five2 = new int[5];
		for (int i = five2.length-1; i >=0 ; i--) {
			System.out.print("자연수를 입력해주세요 : ");
			five2[i] = scanner.nextInt();
			while(five2[i] <= 0) {
				System.out.println("잘못입력했습니다.");
				System.out.print("자연수를 입력해주세요 : ");
				five2[i] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < five2.length; i++) {
			System.out.print(five2[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		//두번째 방식
		int[] five2_2 = new int[5];
		for (int i = 0; i < five2_2.length ; i++) {
			System.out.print("자연수를 입력해주세요 : ");
			five2[i] = scanner.nextInt();
			while(five2[i] <= 0) {
				System.out.println("잘못입력했습니다.");
				System.out.print("자연수를 입력해주세요 : ");
				five2[i] = scanner.nextInt();
			}
		}
		
		for (int i = five2_2.length-1; i >=0; i--) {
			System.out.print(five2[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		int[][] matrix = new int[4][4];
		int n = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = n;
				n++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		scanner.nextDouble();
		scanner.nextLine();
		
		
	}

}
