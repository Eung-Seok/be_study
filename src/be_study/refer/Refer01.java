package be_study.refer;

import java.util.Scanner;

public class Refer01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;			//값 X 공간만 생긴거임.
		int num = 0;	//값 O

		String s1;		//값 X 참조변수
		String s2 = null; // 참조하는게 없다! ==> null
		
		System.out.println(num);
		System.out.println(s2);
		
		Scanner scanner = new Scanner(System.in);
		
//		String t1 = "사과";
//		String t2 = "사과";
//		String t3 = scanner.nextLine();
//		
//		System.out.println(t1 == t1);
//		System.out.println(t1.equals(t2));
//		
//		System.out.println(t2 == t3);
//		System.out.println(t3.equals(t2));
		
//		String ne = null;
//		System.out.println(ne == null);
//		
//		System.out.println(ne.equals("사과"));
		
		//값 복가
		
		int n1 = 10;
		int n2 = n1; //정수형 변수 안에 들어있는 값(10)을 복사
		System.out.println(n1);
		System.out.println(n2);
		
		String ss1 = "배";
		String ss2 = ss1; // 참조형 변수 안에 들어있는 주소를 복사
		System.out.println(ss1);
		System.out.println(ss2);
		
	}

}
