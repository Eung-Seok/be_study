package be_study.quiz;
import java.util.Scanner;
public class Quiz18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//1
		
		for (int i = 1; i<=5; i++) {
			String str1 = "";
			for (int j =5; j >= i; j--) {
				str1 += "*";
			}
			System.out.println(str1);
		}
		
		System.out.println("=======================================");
		
		//2
		
		for (int i = 1; i <= 4; i++) {
			String str2 = "";
			for(int j = 1; j <= i; j++) {
				str2 += "*";
			}
			System.out.println(str2);
		}
		
		System.out.println("======================================");
		
		//3
		System.out.print("자연수를 입력해주세요 : ");
		int n3 = scanner.nextInt();
		
		for(int i = 1; i <= n3 ; i++) {
			if( n3 % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("======================================");
		
		//4
		System.out.print("자연수를 입력해주세요 : ");
		int n4 = scanner.nextInt();
		
		for(int i = 1; i <= 2*n4 - 1; i++) {
			String str4 = "";
			if (i <= n4) { 
				for(int j = 1; j <= i; j++) {
					str4 += "*";
				}
			} else {
				for (int j = 1; j <= 2*n4 - i; j++) {
					str4 += "*";
				}
			}
			
			System.out.println(str4);
		}
		
		System.out.println("======================================");
		
		//5
		
		int n5 = 0;
		for(int i = 1; i <=10; i++) {
			for(int j = 1; j <= i; j++) {
				n5 += j;
			}
		}
		System.out.println(n5);
		System.out.println("======================================");
		//6
		
		int n6 = 0;
		int integer = 0;
		while (n6 < 100) {
			integer++;
			if(integer%2 == 0) {
				n6 -= integer;
			} else {
				n6 += integer;
			}
		}
		
		System.out.println("총합 : " + n6);
		System.out.println("마지막에 더한 값 : " + integer);
	}

}
