package be_study.test;

import java.util.Random;
import java.util.Scanner;

public class Level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int outCount = 0;
		int randomNum = 0;
		int insertNum = 0;
		int innings = 1;
		while(innings <= 3) {
			System.out.printf("%d이닝 시작\n",innings);
			outCount = 0;
			while(outCount < 3) {
				randomNum = random.nextInt(1,11);
				System.out.print("1~10의 숫자를 입력해주세요 : ");
				insertNum = scanner.nextInt();
				System.out.printf("주어진 숫자 : %d\n", randomNum);
				System.out.printf("입력한 숫자 : %d\n", insertNum);
				if(randomNum != insertNum) {
					outCount++;
					System.out.printf("%d 아웃\n", outCount);
				}
			}
			System.out.printf("%d이닝 끝\n",innings);
			System.out.println("------------------------------");
			innings++;
		}
		
	}

}
