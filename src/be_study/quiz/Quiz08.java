package be_study.quiz;

import java.util.Scanner;
public class Quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("출생년도를 입력하세요 : ");
		int year = scanner.nextInt();
		System.out.print("주민번호 뒷자리 첫번째 숫자를 입력하세요");
		int first = scanner.nextInt();
		
		if (year < 2000 && first == 1) {
			System.out.printf("%d살 남자입니다. \n", 2025-year+1);
		} else if (year < 2000 && first == 2) {
			System.out.printf("%d살 여자입니다. \n", 2025-year+1);
		} else if (year >= 2000 && first == 3) {
			System.out.printf("%d살 남자입니다. \n", 2025-year+1);
		} else if (year >= 2000 && first == 4) {
			System.out.printf("%d살 여자입니다. \n", 2025-year+1);
		} else {
			System.out.println("입력을 잘못했습니다.");
		}
		
		
	}

}
