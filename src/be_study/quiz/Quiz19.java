package be_study.quiz;

public class Quiz19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1
		int[][] arr1 = new int[4][4];
		int n1 = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr1[i][j] = n1;
				n1++;
			}
		}
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		//2
		
		int[][] arr2 = new int[4][4];
		int n2 = 1;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr2[j][i] = n2;
				n2++;
			}
		}
		
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		//3
		
		int[][] arr3 = new int[4][4];
		int n3 = 1;
		
		for (int i = 3; i >= 0; i--) {
			for (int j = 3; j >=0 ; j--) {
				arr3[i][j] = n3;
				n3++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		//4
		
		int[][] arr4 = new int[4][4];
		int n4 = 1;
		
		for (int i = 3; i >= 0; i--) {
			for (int j = 3; j >=0 ; j--) {
				arr4[j][i] = n4;
				n4++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------");
		
		
	}

}
