package be_study.quiz;

import java.util.Scanner;
public class Quiz12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//윤년
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("년도를 입력해주세요.");
		int year = scanner.nextInt();
		if (year%4 == 0) {
			if (year%400 == 0) {
				System.out.println("윤년");
			} else if (year%100 == 0) {
				System.out.println("윤년 아님.");
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("윤년아님");
		}
		
	}

}
