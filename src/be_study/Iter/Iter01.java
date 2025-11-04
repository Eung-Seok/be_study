package be_study.Iter;

public class Iter01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		System.out.println("배고파");
		System.out.println("배고파");
		System.out.println("배고파");
		System.out.println("배고파");
		System.out.println("배고파");
		
		for (i = 1; i <= 10; i++) {
			System.out.println("즐겁다");
			
		}	
		for (i = 1; i < 3; i++) {
			System.out.println("화요일");
		}
		
		for (i = 35; i < 45; ++i) {
			System.out.println("실행문1");
		}
		
		System.out.println(i);
		
		System.out.println("------------------------------------------------");
		
		for (int j = 1; j < 6 ; j++) {
			System.out.println("다이어트 " +j + "일차" );
		}
		
		System.out.println("-----------------------------------------------");
		
		int sum = 0;
		
		for (int n = 1; n <= 5; n++) {
			sum += n;
		}
		
		System.out.println(sum);
		
		int total = 0;
		
		for (int k = 10; k <= 100 ; k += 10) {
			total += k;
		}
		
		System.out.println(total);

		for (int k = 2; k < 2 ; k = k*2) {}
		
		for (int k = 400; k > 100 ; k = k - 50) {}
		
		for (int k = 100; k >= 90 ; k--) {}
	}

}
