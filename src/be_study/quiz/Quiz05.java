package be_study.quiz;

import java.util.Scanner;
public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1번
		int num = 10;
		System.out.println(num == 0 ? "0" : (num<0 ? "음수" : "양수"));
		
		Scanner scanner = new Scanner(System.in);
		
		//2번
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int d1 = scanner.nextInt();
		System.out.println("입력한 숫자 = " + d1);
		System.out.print("두번째 숫자를 입력하세요 : ");
		int d2 = scanner.nextInt();
		System.out.printf("입력한 숫자 = %d \n", d2);
		
		System.out.printf("더하기 : %d + %d = %d \n", d1, d2, d1 + d2);
		System.out.printf("빼기 : %d - %d = %d \n", d1, d2, d1 - d2);
		System.out.printf("곱하기 : %d * %d = %d \n", d1, d2, d1 * d2);
		System.out.printf("나누기 : %d / %d = %f \n", d1, d2, 1.0*d1/d2);
		
	}

}
