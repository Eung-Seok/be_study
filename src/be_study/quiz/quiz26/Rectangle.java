package be_study.quiz.quiz26;

public class Rectangle {

	//객체
	int height;
	int width;
	
	//생성자
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//메소드
	
	int getArea() {
		int result = width * height;
		return result;
	}
	
	
}
