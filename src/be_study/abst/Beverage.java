package be_study.abst;


//추상 클래스
public abstract class Beverage {
	
	String name;
	int ml;
	
	public void introduce() {
		System.out.println("저는 음료입니다.");
	}
	
	public abstract void checkSafety();
}
