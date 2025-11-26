package be_study.cls.cls02;

public class Car {
	//자동차 의미하는 설계도(클래스)
	
	//필드  (속성 변수)
	String model; //모델명 기본값 null
	String color; //차랑색상 기본값 null
	int price; // 차 가격 기본값 0
	 
	//생성자  (생성할때 초기화할일 new 클래스명())
	
	//생성자를 만들기 않아도 자동으로 추가되는 기본생성자가 있음
	Car() {
		//기본생성자
		//객체 생성하면서 초기에 해야할 일 (필드의 초기화 (필드변수에 값 세팅)
		
		System.out.println("Car() 기본생성자 호출됨");
		color = "green";
		model = null;
		price = 0;
	}
	
	
	Car(String _model) { //new Car("그랜저")
		System.out.println("Car(String _model) 기본생성자 호출됨");
		model = _model;
		//이 생성자를 통해서 객체가 만들어지는 과정에
		//model 필드변수에 매개변수 _model에 전달된 값을 저장하겠다
	}
	
	//매개변수 2개
	Car(String model, String color) { //new Car("쏘렌토","black")
		System.out.println("Car(String mode, String color) 생성자 호출");
		this.model = model;
		this.color = color;
	}
	
//	Car(String _model, String color) {
//		System.out.println("Car(String mode, String color) 생성자 호출");
//		model = _model;
//		color = _color;
//	}
	//메소드 (기능 동작)
}
