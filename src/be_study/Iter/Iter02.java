package be_study.Iter;

public class Iter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 for (초기화 ; 조건 ; 증감) {
		 	실행문
		 }
		 
		 while(조건) {
		 
		 }
		 */
		
		//5번 반복
		
		for (int i= 1 ; i <= 5 ; i++) {
			System.out.println("햄버거");
		}
		
		int i = 10;
		while(i<=5) {
			System.out.println("피자");
			i++;
		}
		
		
		while (true) {
			System.out.println("무한루프"+i);
			
			i++;
			if (i==21)
				break;
		}
		
		
		do {
			System.out.println("일단 한번 실행을 해라 do while");
		} while(i < 10);
		
		System.out.println("--------------------------------------");
		
		for (i = 1; i <= 10; i++) {
			
			if (i == 5) {
				continue;
			}
			System.out.println("i : " + i);
			
			if (i==8) 
				break;
		}
	}

}
