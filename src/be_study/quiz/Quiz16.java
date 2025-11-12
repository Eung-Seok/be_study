package be_study.quiz;

public class Quiz16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = new int[5][5];
		for(int i = 0; i <5 ; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == j) {
					arr[i][j] = 1;
				} else if(i > j) {
					arr[i][j] = 3;
				} else {
					arr[i][j] = 2;
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
