package be_study.random;

import java.util.Random;
public class Random01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//난수(랜덤값) 뽑기 사용
	
		//Math.random() 0 <= 랜덤값 < 1
		
		// (int)(Math.random()*개수(범위)) + 시작숫자
		
		// 1~10까지 중 랜덤
		// (int)(Math.random()*개수(범위)) + 1 
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(Math.random());
//		}
//		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println((int)(Math.random()*10) + 1);
//		}
//		
		
		//random.nextInt(n) 0 <= random < n  
		Random random = new Random();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(random.nextInt(10, 16));
		}
		
		
	}

}
