package be_study.quiz.quiz43;

class Main {
	public static void main(String[] args) {
		FoodTruck ft1 = new FoodTruck();
		FoodTruck ft2 = new FoodTruck();
		ft1.foodTruckNum = 1;
		ft2.foodTruckNum = 2;

		Food[] fArr1 = { new Food("김밥", 4000), new Food("돈까스", 9000), new Food("순두부찌개", 8000), new Food("라면", 5500) };
		Food[] fArr2 = { new Food("싸이버거", 5200), new Food("화이트갈릭버거", 4800), new Food("감자튀김", 2800),
				new Food("인크레더블버거", 7000), new Food("치킨", 16000) };

		ft1.menu.fArr = fArr1;
		ft2.menu.fArr = fArr2;
		for (int i = 1; i <= 4; i++) {
			ft1.addMenuNumber(i, i);
			ft2.addMenuNumber(i, i);
		}

		ft1.showMenu();
		ft2.showMenu();

		System.out.println("장사시작 전에 주문했을 때");
		ft1.order(0, 0);
		System.out.println("-----------------------------");
		// 장사시작
		ft1.shutterUp();
		ft2.shutterUp();
		System.out.println("메뉴넘버가 잘못됐을 때");
		ft1.order(0, 3);
		ft2.order(0, 3);
		System.out.println("-----------------------------");
		System.out.println("주문개수가 재고보다 많을 때");
		ft1.order(1, 4);
		ft2.order(2, 5);
		System.out.println("-----------------------------");
		System.out.println("메뉴를 잘 주문했을 때");
		ft1.order(3, 2);
		ft2.order(4, 2);
		System.out.println("-----------------------------");
		System.out.println("장사 접을 때");
		ft1.shutterDown();
		ft2.shutterDown();
		System.out.println("-----------------------------");
		System.out.println("장사 다시 시작할 때 값들");
		ft1.shutterUp();
		ft2.shutterUp();
		System.out.println("1번 푸드트럭 총 매출: " + ft1.totalsales + ", 오늘 매출: " + ft1.sales);
		System.out.println("2번 푸드트럭 총 매출: " + ft2.totalsales + ", 오늘 매출: " + ft2.sales);
		System.out.println("-----------------------------");
		for (int i = 1; i <= 4; i++) {
			ft1.addMenuNumber(i, i);
			ft2.addMenuNumber(i, i);
		}
		ft1.order(4, 2);
		ft2.order(2, 3);
		System.out.println("-----------------------------");
		System.out.println("2일차 매출");
		ft1.shutterDown();
		ft2.shutterDown();
	}

}

class FoodTruck {
	Menu menu = new Menu();
	int foodTruckNum;
	int sales;
	int totalsales;
	boolean isOpen;

	// 메뉴보기
	public void showMenu() {
		int i = 1;
		System.out.println("-------------------------------------");
		for (Food f : menu.fArr) {
			System.out.println(i + "번 메뉴: " + f.name + " (남은 수량: " + f.number + ")");
			i++;
		}
		System.out.println("-------------------------------------");
	}

	// 주문하기
	public void order(int menuNum, int number) {
		if (isOpen) {
			if (menuNum < 1 || menuNum > menu.fArr.length) {
				System.out.println("1~" + menu.fArr.length + "의 숫자를 입력해주세요");
			} else {
				if (menu.fArr[menuNum - 1].number >= number) {
					sales += menu.fArr[menuNum - 1].price * number;
					menu.fArr[menuNum - 1].number -= number;
					System.out.println(menu.fArr[menuNum - 1].name + " " + number + "개 주문");
				} else {
					System.out.println("주문하신 메뉴의 재고가 부족합니다.");
				}
			}
		} else {
			System.out.println("장사가 시작하지 않았습니다.");
		}
	}

	// 재고 채우기
	public void addMenuNumber(int menuNum, int number) {
		menu.fArr[menuNum - 1].number += number;
	}

	// 문 열기
	public void shutterUp() {
		sales = 0;
		this.isOpen = true;
	}

	// 문 닫기
	public void shutterDown() {
		totalsales += sales;
		System.out.println("오늘의 매출은 " + sales + "원");
		System.out.println("총 매출은 " + totalsales + "원");
		this.isOpen = false;
	}

}

class Menu {
	Food[] fArr;
	int sales;
	int totalsales = 0;
	boolean isOpen;

}

class Food {
	String name;
	int price;
	int number;

	Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
