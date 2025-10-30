package be_study.var;

public class Variable03 {

	public static void main(String[] args) {

		//타입 변환
		
		//int < double
		
		int i1 = 30;
		int i2 = i1;
		//int i3 = 3.11; 정수형 변수 = 실수형 값을 배정할 수 없다
		
		double d1 = 3.11;
		double d2 = d1;
		
		double d3 = 40; // 40 -> 40.0 int -> double
		double d4 = 40.0;
		System.out.println(d3 );
		
		double d5 = i1; //자동 타입 변환 int -> double
		//          30 -> 30.0
		
		System.out.println(d5);
		
		char c1 = 'A';
		int i3 = c1;
		System.out.println(c1);
		System.out.println(i3);
		
		char c2 = (char) i3;
		System.out.println(c2);
		
		double dd1 = 12.34;
		int ii1 = (int) dd1;
		System.out.println(ii1);
		
		// java정수 -> int
		//java 실수 -> double
		//float f1 = (float)4.45;
		float f1 = 4.45f;
		double dd2 = f1; // float < double 자동 타입 변환
		
		//연산에서 타입변환
		int i10 = 3;
		double d10 = 5;
		
//		double i11 = i10 + d10; // int + double -> double
		//         3  +  5   =  8  ->  8.0
		double d11 = i10 + d10;
		
		int i12 = 10;
		double d12 = 5.5;
		
//		int i13 = i12 + d12; int + double -> double
		//         10 + 5.5 -> 15.5
		
		int i13 = (int) (i12 + d12);
		
		
		double dv1 = 5.5;
		double dv2 = 6.6;
		
		
		int result = (int)(dv1 + dv2);
		System.out.println(result);
		result = (int)dv1 + (int)dv2;
		System.out.println(result);
		
		int x = 1;
		int y = 2;
		double result2 = x/y; // int / int -> int
		//				1/2 -> 0.5 -> 0
		// double result = 0 -> 0.0
		
		result2 = (double)x / y;
		result2 = x/(double)y;
		result2 = (double)x/(double)y;
		
		result2 = 1/2;
		result2 = (double)1/2;
		result2 = 1/2.0;
		
		
		
	}

}
