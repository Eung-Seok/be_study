package be_study.cond;

public class Cond01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//조건문 if문
		
		// if(조건식) 참 -> 실행
		
		int num = 15;
		
		if ( num > 5  ) {
			System.out.println("num은 5보다 크다");
			System.out.println("if문 안에 실행");
		}

		if ( num < 10) {
			System.out.println("num은 10보다 작다");
		} else 
			System.out.println("num은 10보다 크거나 같다");
		
		boolean bln = ( num != 15 );
		
		if (bln) {
			System.out.println("15랑 다른 수");	
		} else {
			System.out.println("15랑 같은 수");
			int y = 8;
		}
		
		
		
		System.out.println("end");
		
		
		

	}

}
