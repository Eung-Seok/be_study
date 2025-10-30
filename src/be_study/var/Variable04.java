package be_study.var;

public class Variable04 {

	public static void main(String[] args) {

		// +연산은 숫자+숫자면 더하기연산이고 숫자+문자면 결합연산이 된다. 그리고 순서는 무조건 앞에서부터
		
		String s1 = "12";
		int n1 = 11;
		int n2 = 22;
		System.out.println(n1 + n2 + s1);
		System.out.println(n1 + s1 + n2);
		
		//11 + 22 + "12" = "3312"
		// 11 + "12" + 22 = 111222
		
		String s2 = "1234";
		int n3 = 16;
		System.out.println(s2+n3);
		System.out.println( Integer.parseInt(s2) + n3);
		
		String s3 = "33.55";
//		int n4 = Integer.parseInt(s3);
		double d4 = Double.parseDouble(s3);
		
		System.out.println(d4 + 12.1);
		
		String s4 = "12a.12b";
//		Double.parseDouble(s4);
		
		boolean b1 = true;
		
		String s5 = "false";
		
		boolean b2 = Boolean.parseBoolean(s5);
		System.out.println(b2);
		
		String s10 = String.valueOf(true);
		String s11 = String.valueOf(123);
		String s12 = String.valueOf(33.598);
		
		String s13 = 123 + "";  // "123"
		//    		 int + String -->> String
	}

}
