package be_study.var;

import java.util.Scanner;

public class Variable06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		
		int num1  =scanner.nextInt();
		
		int num2 = 10;
		
		//값이 같은가? 비교하는 연산자는 ==
		boolean b1 = (num1 == num2);
		
		System.out.println(b1);
	
		scanner.nextLine();
		
		String str1 = scanner.nextLine();
		String str2 = "햄버거";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2);
		System.out.println( str1.equals(str2));
		
		//문자열(String) 값 비교할 때에는 ==가 아니라 .equals를 쓰자
	}

}
