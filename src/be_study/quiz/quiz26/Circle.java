package be_study.quiz.quiz26;

public class Circle {

	
	//객체
	double radius;
	
	//생성자(굳이 할 필요는 없음)
	Circle() { }
	
	//메소드
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getArea() {
		double result = radius * radius * 3.14;
		return result;
	}
}
