package be_study.inherit.inherit03;

public class Mike {

	
	String type;
	String model;
	int price;
	
	public void volumeUp() {
		System.out.println("Mike volumUp()");
	}
	
	public void check() {
		//기능체크
		System.out.println("마이크 기능 check");
	}
	
	public final void noMethod() {
		System.out.println("noMethod");
	}
	
	
}
