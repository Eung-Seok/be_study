package be_study.test;

import java.util.Random;
import java.util.Scanner;

public class Level3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] hitterName = {"김구번","김일번","김이번","김삼번","김사번","김오번","김육번","김칠번","김팔번"};
		double[] hitCount = new double[9];
		int outCount = 0;
		int randomNum = 0;
		int insertNum = 0;
		int innings = 1;
		int hitterNum = 1;
		while(innings <= 3) {
			System.out.printf("%d이닝 시작\n",innings);
			outCount = 0;
			while(outCount < 3) {
				if(hitterNum/9 == 0) {
					if(hitterNum%9 == 0) {
						System.out.printf("9번 타자 김구번 타율 0.000\n");
					} else {
						System.out.printf("%d번 타자 %s 타율 0.000\n",hitterNum%9, hitterName[hitterNum%9]);
					}
				} else {
					if(hitterNum%9 == 0) {
						System.out.printf("9번 타자 김구번 타율 %.3f\n",hitCount[hitterNum%9]/(hitterNum/9));
					} else {
						System.out.printf("%d번 타자 %s 타율 %.3f\n",hitterNum%9, hitterName[hitterNum%9],hitCount[hitterNum%9 ]/(hitterNum/9) );
					}
				}
				
				randomNum = random.nextInt(1,11);
				System.out.print("1~10의 숫자를 입력해주세요 : ");
				insertNum = scanner.nextInt();
				System.out.printf("주어진 숫자 : %d\n", randomNum);
				System.out.printf("입력한 숫자 : %d\n", insertNum);
				
				if(randomNum != insertNum) {
					outCount++;
					System.out.printf("%d 아웃\n", outCount);
				} else {
					if(hitterNum%9 == 0)
						hitCount[0]++;
					else
						hitCount[hitterNum%9]++;
				}
				
				hitterNum++;
				System.out.println("------------------------------");
			}
			
			System.out.printf("%d이닝 끝\n",innings);
			System.out.println("------------------------------");
			innings++;
		}
		
		System.out.println("경기종료");
		System.out.println("------------------------------");
	}
}
