package be_study.quiz;

import java.util.Scanner;
public class Quiz13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//1
		System.out.print("정수를 입력해주세요 : ");
		int n1 = scanner.nextInt();
		
		if (n1%2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println("---------------------------------");
		//2
		System.out.print("정수를 입력해주세요 : ");
		int n2 = scanner.nextInt();
		if (n2%7 == 0) {
			System.out.println("7의 배수입니다.");
		} else {
			System.out.println("7의 배수가 아닙니다.");
		}
		System.out.println("---------------------------------");
		//3
		int sum3 = 0;
		for (int i = 1; i <= 1000; i++) {
			if(i % 5 == 0) {
				sum3 += i;
			}
		}
		
		System.out.println(sum3);
		
		System.out.println("---------------------------------");
		//4
		System.out.print("1부터 50까지의 수를 입력해주세요");
		int n4 = scanner.nextInt();
		
		while (!(n4 >= 1 && n4 <= 50)) {
			System.out.println("숫자를 잘못 입력했습니다.");
			System.out.print("1부터 50까지의 수를 입력해주세요 : ");
			n4 = scanner.nextInt();
		}
		String s4 = "";
		for (int i = 1; i <= n4; i++) {
			s4 += "*";
		}
		System.out.println(s4);
		
		System.out.println("---------------------------------");
		//5
		
		int sum5 = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum5 -= i;
			} else {
				sum5 += i;
			}
		}
		System.out.println(sum5);
		
		System.out.println("---------------------------------");
		//6
		int sum6 = 0;
		int i6 = 0;
		while (sum6 < 1000) {
			i6++;
			sum6 += i6;
		}
		System.out.println(i6);
		System.out.println(sum6);
		
		System.out.println("---------------------------------");
		//7
		System.out.print("1부터 9까지의 정수 중 하나 입력해주세요 : ");
		int n7 = scanner.nextInt();

		while (!(n7 >= 1 && n7 <= 9)) {
			System.out.println("숫자를 잘못 입력했습니다.");
			System.out.print("1부터 9까지의 정수 중 하나 입력해주세요 : ");
			n7 = scanner.nextInt();
		}
		for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n",n7, i, n7*i);
		}
		
	}

}
