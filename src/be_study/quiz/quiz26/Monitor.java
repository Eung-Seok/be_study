package be_study.quiz.quiz26;

//1
public class Monitor {

	//객체
	//2
	String brand;
	int inches;
	int price;
	String color;
	int maxResolutionX;
	int maxResolutionY;
	
	//생성자
	//3
	Monitor(String brand, int inches, int price) {
		this.brand = brand;
		this.inches = inches;
		this.price = price;
	}
	
	
	//메소드
	//4
	void setColor(String color) {
		this.color = color;
	}
	void setXY(int x, int y) {
		this.maxResolutionX = x;
		this.maxResolutionY = y;
	}
	
	//5
	void powerOn() {
		System.out.println("전원이 켜졌습니다.");
	}
	
	//6
	int priceIncrease(int input) {
		int result = price + input;
		return result;
	}
	
	//9
	void myInfo() {
		System.out.printf("%s회사 %d인치 %d원 %s %d * %d해상도의 모니터\n",brand,inches,price,color,maxResolutionX,maxResolutionY);
	}
	
}
