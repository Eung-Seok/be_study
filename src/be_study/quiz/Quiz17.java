package be_study.quiz;
import java.util.Scanner;
public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//1
		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				if (2*x + 4*y == 10) {
					System.out.printf("(%d, %d)\n",x,y);
				}
			}
		}
		
		//2
		System.out.print("첫번째 정수를 입력해주세요 : ");
		int n2_1 = scanner.nextInt();
		System.out.print("두번째 정수를 입력해주세요 : ");
		int n2_2 = scanner.nextInt();
		
		if (n2_1 >= n2_2 ) {
			System.out.println(n2_1 - n2_2);
		} else {
			System.out.println(n2_2 - n2_1);
		}
		
		//3
		
		System.out.println("0: 안뒤집어진상태");
		System.out.println("1: 뒤집어진 상태");
		System.out.print("첫번째 윷의 상태를 입력해주세요");
		int n3_1 = scanner.nextInt();
		while(!(n3_1 == 0 || n3_1 == 1)) {
			System.out.println("0과 1중에 하나를 입력하셔야합니다.");
			System.out.print("첫번째 윷의 상태를 입력해주세요");
			n3_1 = scanner.nextInt();
		}
		
		System.out.print("두번째 윷의 상태를 입력해주세요");
		int n3_2 = scanner.nextInt();
		while(!(n3_2 == 0 || n3_2 == 1)) {
			System.out.println("0과 1중에 하나를 입력하셔야합니다.");
			System.out.print("두번째 윷의 상태를 입력해주세요");
			n3_2 = scanner.nextInt();
		}
		
		System.out.print("세번째 윷의 상태를 입력해주세요");
		int n3_3 = scanner.nextInt();
		while(!(n3_3 == 0 || n3_3 == 1)) {
			System.out.println("0과 1중에 하나를 입력하셔야합니다.");
			System.out.print("세번째 윷의 상태를 입력해주세요");
			n3_3 = scanner.nextInt();
		}
		
		System.out.print("네번째 윷의 상태를 입력해주세요");
		int n3_4 = scanner.nextInt();
		while(!(n3_4 == 0 || n3_4 == 1)) {
			System.out.println("0과 1중에 하나를 입력하셔야합니다.");
			System.out.print("네번째 윷의 상태를 입력해주세요");
			n3_4 = scanner.nextInt();
		}
		
		System.out.printf("윷의 상태 : %d %d %d %d\n",n3_1,n3_2,n3_3,n3_4);
		int sum3 = n3_1 + n3_2 + n3_3 + n3_4;
		switch (sum3) {
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		}
		
		//4
		System.out.print("0 이상의 정수를 입력해주세요");
		int n4 = scanner.nextInt();
		while(!(n4 >= 0)) {
			System.out.println("숫자를 잘못입력했습니다.");
			System.out.print("0 이상의 정수를 입력해주세요");
			n4 = scanner.nextInt();
		}
		String str4 = "";
		for (int i = 1; i <= n4; i++) {
			str4 += "*";
		}
		System.out.println(str4);
		
	
		
	}

}
