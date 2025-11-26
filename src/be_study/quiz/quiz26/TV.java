package be_study.quiz.quiz26;

public class TV {

	//객체
	String brand;
	int madeYear;
	int inches;
	
	
	//생성자
	TV(String brand, int madeYear, int inches) {
		this.brand = brand;
		this.madeYear = madeYear;
		this.inches = inches;
	}
	
	//메소드
	void show() {
		System.out.println(brand + "제품 " + madeYear + "년형 " + inches+ "인치 TV");
	}
}
