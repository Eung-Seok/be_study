package be_study.quiz;

import java.util.Scanner;
public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		// 1번. 삼각형의 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 삼각형의 넓이 = 밑변 * 높이 / 2 ;
		
		System.out.print("밑변의 길이를 입력해주세요 : ");
		int low1 = scanner.nextInt();
		System.out.print("높이의 길이를 입력해주세요 : ");
		int height1 = scanner.nextInt();
		System.out.printf("삼각형의 넓이는 %.1f입니다. \n", 1.0*low1*height1/2);

		// 2번. 사다리꼴의 윗변과 밑변과 높이를 입력받아서 넓이를 출력하세요. (소수점까지 표현)
		// 사다리꼴의 넓이 = (윗변 길이 + 밑변 길이) * 높이 / 2;.
		
		System.out.print("밑변의 길이를 입력해주세요 : ");
		int low2 = scanner.nextInt();
		System.out.print("윗변의 길이를 입력해주세요 : ");
		int top2 = scanner.nextInt();
		System.out.print("높이의 길이를 입력해주세요 : ");
		int height2 = scanner.nextInt();
		System.out.printf("사다리꼴의 넓이는 %.1f입니다. \n", 1.0*(low2+top2)*height2/2);
		
		// 3번. 우리반은 24명입니다. 과자가 100개 있습니다.
		// 모두에게 공정하게 동일한 숫자의 과자를 나누어주면
		// 한 명당 몇 개의 과자를 받게되는지와 나누어주고 나서 몇개의 과자가 남는지 출력하세요.
		
		System.out.printf("한 명당 %d개의 과자를 받고 %d개의 과자가 남았습니다. \n", 100/24, 100%24);
		
		// 4번. 세자리의 정수를 입력 받아서 백의자리, 십의자리, 일의자리를 각각 출력하세요.
		// 158
		// 백의자리 : 1
		// 십의자리 : 5
		// 일의자리 : 8 
		
		System.out.print("세자리의 정수를 입력해주세요 : ");
		int integer4 = scanner.nextInt();
		System.out.printf("백의자리 : %d \n", integer4/100);
		System.out.printf("십의자리 : %d \n", (integer4%100)/10);
		System.out.printf("일의자리 : %d \n", integer4%10);
		
		// 5번 x와 y 변수 안에 들어있는 서로의 값을 바꾸기
		int x = 10;
		int y = 20;
		System.out.println("x="+x+ " y="+y);
		//x와 y를 바꾼 작업
		int z;
		z = x;
		x = y;
		y = z;
		System.out.println("x="+x+ " y="+y);
		
		
		
		
		
		
		
		
		
		
	}

}
