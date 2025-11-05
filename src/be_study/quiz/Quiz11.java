package be_study.quiz;

public class Quiz11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 1; i <= 5; i ++) {
		System.out.println(12345);
		}
		
		System.out.println("-----------------------------");
		
		for (int i =1; i <= 5; i++) {
			String sum  = "";
			for (int j = 1; j <= 5; j++) {
				sum += j;
			}
			System.out.println(sum);
		}
		
		System.out.println("----------------------");

		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("%d%d%d%d%d\n",i,i,i,i,i);
		}
		
		System.out.println("-----------------------------");

		for (int i = 1; i <= 5; i++) {
			int good = 0;
			for (int j = 1; j <= 10000; j *= 10) {
				good += i*j ;
			}
			System.out.println(good);
		}
	}

}
