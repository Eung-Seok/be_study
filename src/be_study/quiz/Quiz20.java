package be_study.quiz;

import java.util.Scanner;
public class Quiz20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int menu;
		int num;
		String yesno;
		int americano = 0;
		int cafelatte = 0;
		int banillalatte = 0;
		
		System.out.println("========메뉴========");
		System.out.println("1. 아메리카노   3500원");
		System.out.println("2. 카페라떼    4100원");
		System.out.println("3. 바닐라라떼   4300원");
		System.out.println("==================");
		
		while(true) {
			while(true) {
				System.out.print("메뉴 선택 : ");
				menu =  scanner.nextInt();
				if(menu >= 1 && menu <= 3) {
					break;
				} else {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					continue;
				}
			}
			while(true) {
				System.out.print("수량 선택 : ");
				num = scanner.nextInt();
				if (num < 0) {
					System.out.println("잘못 선택하셨습니다. 다시 선택해주세요");
					continue;
				}
				switch(menu) {
				case 1:
					americano += num;
					break;
				case 2:
					cafelatte += num;
					break;
				case 3:
					banillalatte += num;
					break;
				}
				break;
			}
			System.out.printf("아메리카노 %d잔, 카페라떼 %d잔, 바닐라라떼 %d잔\n", americano, cafelatte, banillalatte);
			scanner.nextLine();
			while(true ) {
				System.out.print("추가 주문하시겠습니까?(y/n)");
				yesno = scanner.nextLine();
				if(yesno.equals("y") || yesno.equals("n")) {
					break;
				} else {
					continue;
				}
			}
			
			if (yesno.equals("n")) {
				break;
			} else {
				continue;
			}
		}
		
		System.out.println("====================");
		if (americano != 0) {
			System.out.printf("아메리카노 %d잔 : %d원\n",americano, americano * 3500);
		}
		if (cafelatte != 0) {
			System.out.printf("카페라떼 %d잔 : %d원\n",cafelatte, cafelatte * 4100);
		}
		if (banillalatte != 0) {
			System.out.printf("바닐라라떼 %d잔 : %d원\n",banillalatte, banillalatte * 4300);
		}
		System.out.println("====================");
		System.out.printf("총액 : %d원", americano * 3500+ cafelatte * 4100+banillalatte * 4300);
		
		
	}
}

