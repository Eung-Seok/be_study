package be_study.quiz;

import java.util.Scanner;

import java.util.Random;
public class Quiz21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//1
		
		for(int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if (i + j == 6)
					System.out.printf("주사위1 : %d, 주사위2: %d\n", i, j);
				if(i + j >= 6) {
					break;
				} 
			}
		}
		Random random = new Random();
		System.out.println("---------------------------------------");
		
		//2
		
		int[] lotto = new int[6];
		int lottoNum;
		int arrayNum = 0;
		boolean isInArray;
		
		while(lotto[5] == 0) {
			isInArray = false;
			lottoNum = random.nextInt(1, 46);
			for (int i = 0; i <= arrayNum; i++ ) {
				if (lotto[i] == lottoNum) {
					isInArray = true;
					break;
				}
			}
			
			if (isInArray) {
				continue;
			} else {
				lotto[arrayNum] = lottoNum;
				arrayNum++;
			}
		}
	
		for (int i = 0; i < 6; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println("---------------------------------------");
		
		//3 
		
		int[] class1_Score = new int[5];
		int[] class2_Score = new int[5];
		int[] class3_Score = new int[5];
		int class1_Sum = 0;
		int class2_Sum = 0;
		int class3_Sum = 0;
		
		System.out.println("1반의 성적을 입력해주세요.");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("1반 %d번 성적 : ", i);
			class1_Score[i-1] = scanner.nextInt();
			class1_Sum += class1_Score[i-1];
		}
		System.out.println("2반의 성적을 입력해주세요.");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("2반 %d번 성적 : ", i);
			class2_Score[i-1] = scanner.nextInt();
			class2_Sum += class2_Score[i-1];
		}
		System.out.println("3반의 성적을 입력해주세요.");
		for (int i = 1; i <= 5; i++) {
			System.out.printf("3반 %d번 성적 : ", i);
			class3_Score[i-1] = scanner.nextInt();
			class3_Sum += class3_Score[i-1];
		}
		
		int total_Sum = class1_Sum + class2_Sum + class3_Sum; 
		
		System.out.print("1반 성적 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(class1_Score[i] + " ");
		}
		System.out.println();
		System.out.printf("1반 평균 = %d\n", class1_Sum/5);
		System.out.print("2반 성적 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(class2_Score[i] + " ");
		}
		System.out.println();
		System.out.printf("2반 평균 = %d\n", class2_Sum/5);
		System.out.print("3반 성적 : ");
		for (int i = 0; i < 5; i++) {
			System.out.print(class3_Score[i] + " ");
		}
		System.out.println();
		System.out.printf("3반 평균 = %d\n", class3_Sum/5);
		System.out.printf("전체 평균 = %d\n", total_Sum/15);
		System.out.println();
		System.out.println("---------------------------------------");
		
		
		
		//4
		System.out.print("행의 개수를 입력해주세요 : ");
		int row = scanner.nextInt();
		System.out.println("열의 개수를 입력해주세요 : ");
		int column = scanner.nextInt();
		
		System.out.println("행렬의 값을 입력해주세요 ");
		int[][] arr4_1 = new int[row][column];
		int[][] newArray = new int[row + 1][column + 1];
		int totalSum = 0;
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.printf("%d행 %d열 : ", i, j);
				arr4_1[i][j] = scanner.nextInt();
				newArray[i][j] = arr4_1[i][j];
				totalSum += arr4_1[i][j];
			}
		}
		
		for (int i = 0; i < column; i++) {
			int sum = 0;
			for (int j = 0; j < row; j++) {
				sum += arr4_1[j][i];
			}
			newArray[row][i] = sum;
		}
		
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < column; j++) {
				sum += arr4_1[i][j];
			}
			newArray[i][column] = sum;
		}
		
		newArray[row][column] = totalSum;
		
		System.out.println("입력하신 행렬");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr4_1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("확장된 행렬");
		for (int i = 0; i < row+1; i++) {
			for (int j = 0; j < column+1; j++) {
				System.out.print(newArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
