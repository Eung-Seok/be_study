package be_study.quiz;
import java.util.Scanner;
public class Quiz10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요 : ");
		int score1 = scanner.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		int score2 = scanner.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		int score3 = scanner.nextInt();
		int total = score1 + score2 + score3;
		double mean = 1.0*total/3;
		
		System.out.println("국어점수 : " + score1);
		System.out.println("수학점수 : " + score2);
		System.out.println("영어점수 : " + score3);
		if (score1 >= 40 && score2 >= 40 && score3 >= 40 && mean >=60) {
			System.out.println("국어 : " + score1);
			System.out.println("수학 : " + score2);
			System.out.println("영어 : " + score3);
			System.out.println("합계 : " + total);
			System.out.printf("평균 : %.1f", mean );
			System.out.println("축하합니다. 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
	}

}
