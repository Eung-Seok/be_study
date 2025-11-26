package be_study.quiz.quiz26;

public class Triangle {

	//객체
	int base;
	int height;
	
	//생성자(굳이 할 필요 없음)
	Triangle() {}

	
	//메소드
	
	void setSize(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	double getArea() {
		double result = base * height / 2.0;
		return result;
	}
}
