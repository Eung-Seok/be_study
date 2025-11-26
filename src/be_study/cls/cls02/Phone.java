package be_study.cls.cls02;

public class Phone {

	//필드
	String model;
	int price;
	int battery;
	
	//생성자
	
	//기본생성자 Phone() {}
	
	Phone(String s1) {
//		this.model = s1;  <- 이건 직접적으로 하는 것
//		price = 0;
//		battery = 2500;
		this(s1, 0, 2500);
	}
	
	//모델명, 가격
	Phone(String model, int price) {
//		this.model = model;
//		this.price = price;
		this(model,price,2500);
	}
	
	//배터리, 모델
	Phone(int battery, String model) {
//		this.battery = battery;
//		this.model = model;
		this(model,0,battery);
	}
	
	//모델, 가격, 베터리
	Phone(String model, int price, int battery) {
		this.model = model;
		this.price = price;
		this.battery = battery;
	}
	
	

	//메소드
}
