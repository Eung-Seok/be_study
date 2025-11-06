package be_study.arr;

public class Arr01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score1 = 100;
		int score2 = 50;
		int score3 = 75;
		int score4 = 80;
		int score5 = 40;
		
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.0;
		System.out.println("총점: "+sum+" 평균"+ avg);
		
		
		//정수들~~~
		
		int[] scoreArr = { 100, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40, 50, 75, 80, 40};
		//index              0   1   2   3  4
		sum = 0;
		sum = scoreArr[0] + scoreArr[1]+ scoreArr[2]+scoreArr[3]+scoreArr[4];
		System.out.println(sum);
		
		sum = 0;
		for (int i = 0; i <= 4; i++) {
			sum += scoreArr[i]; 
		}
		System.out.println(sum);
		
		//int[] pointArr; 단순선언..
		int[] pointArr = null; //null값 초기화
		// pointArr = {30, 12,10,5,1}; 이런식으로 초기화를 못함
		
		pointArr = new int[] {30, 12, 10, 5, 1};//이런식으로 해야함
		
		pointArr = new int[5]; //안에 있는 숫자만큼의 공간을 명시
		
		pointArr[0] = 30;
		pointArr[1] = 30;
		pointArr[2] = 30;
		pointArr[3] = 30;
		pointArr[4] = 30;
//		pointArr[5] = 30; //공간의 범위를 벗어나 
		
		//저장하고 싶은 값 : 1 2 3 4 5 
		//배열의 인덱스    : 0 1 2 3 4
		
		for(int i = 0; i < 5; i++) {
			pointArr[i] = i+1;
		}
		
		for (int i = 1; i <= 5 ; i++) {
			pointArr[i-1] = i;
		}
		
		//배열 인덱스 0~
		for (int i = 0; i < 5; i++) {
			System.out.print(pointArr[i] + " ");
		}
		System.out.println();
		System.out.println(pointArr); //배열은 참조이기 때문에 주소를 출력시킨다.
		
		//초기값 확인
		
		int[] intArr = new int[6];
		double[] doubleArr = new double[12];
		String[] stringArr = new String[30];
		boolean[] booleanArr = new boolean[7];
		
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 41/*doubleArr.length*/; i++) {
			System.out.print(doubleArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < stringArr.length; i++) {
			System.out.print(stringArr[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < booleanArr.length; i++) {
			System.out.print(booleanArr[i] + " ");
		}
		System.out.println(scoreArr.length);
		
		String[][][] school = new String[3][10][40]
	}

}
