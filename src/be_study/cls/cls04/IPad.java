package be_study.cls.cls04;

public class IPad {

	String owner;
	
	void showInfo() { //태블릿 Ipad 정보
		
		System.out.println("IPad 정보 출력====");
		System.out.println(owner + "의 아이패드 입니다.");
		System.out.println("배터리 잔여량 : " + batteryNum());
	}
	
	int batteryNum() {
		
		return 80;
	}
	
	void returnCheck() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5)
				return;
//				break;
		}
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
