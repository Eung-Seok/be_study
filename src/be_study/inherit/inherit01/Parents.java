package be_study.inherit.inherit01;

public class Parents extends GrandParents {

	
	protected int money;
	
	public Parents(int money) {
		System.out.println("Parents생성자 실행됨");
		this.money = money;
		
	}
	
	public void say() {
		System.out.println("한말씀 드립니다.");
	}
}
