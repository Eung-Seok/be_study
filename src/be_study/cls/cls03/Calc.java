package be_study.cls.cls03;

public class Calc {
	//메소드 계산기 Calculator
	
	//필드
	
	//생성자
	
	
	//메소드
	
	/*
		리턴타입 메소드명(매개변수) {
			실행문
			return ...
		}
		
			리턴		매개변수
			o		o
			o		x
			x		o
			x		x
	 */
	
	//계산기 전원 켜기 -> 리턴X  매개변수X
	
	void powerOn() {
		System.out.println("power On");
	}
	
	//소유자 이름 등록 -> 리턴X  매개변수O (이름)
	void setOwner(String name) {
		System.out.println(name + "님의 계산기로 등록되었습니다.");
	}
	
	//계산기 계산 수행 -> 리턴O  매개변수O
	
	int sum(int num1,int num2) {
		int result = num1 + num2;
		
		return result;
	}
	
	int sum(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		return result;
	}
	
	double sum(double num1, double num2) {
		double result = num1 + num2;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	//리턴O 매개변수X
	
	//배터리 잔여량 얼마인지 출력
	int checkBattery () {
		return 80;
	}
	
	//제조사 출력
	String madeByInfo() {
		return "카시오";
	}
	
	
}
