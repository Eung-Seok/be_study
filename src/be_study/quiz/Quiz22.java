package be_study.quiz;

public class Quiz22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = {88,92,75,63,95,70,85,90,100,67};
		int min = 0;
		int max = 0;
		int sum = 0;
		int overEighty = 0;
		
		for (int i = 0; i < scores.length; i++) {
			if( i == 0 ) {
				min = scores[i];
				max = scores[i];
				sum += scores[i];
				if (scores[i] >= 80)
					overEighty++;
			} else {
				if (scores[i] < min) {
					min = scores[i];
				}
				if (scores[i] > max) {
					max = scores[i];
				}
				if (scores[i] >= 80)
					overEighty++;
				sum += scores[i];
			}	
		}
		
		System.out.printf("최고 점수 : %d\n", max);
		System.out.printf("최저 점수 : %d\n", min);
		System.out.printf("평균 점수 : %.1f\n", 1.0*sum/scores.length);
		System.out.printf("80점 이상 학생 수 : %d명\n", overEighty);
		
		
	}

}
