package be_study.inherit.inherit01;

public class Inherit01Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parents p1 = new Parents(5000);
		p1.money = 1000000;
		
		Child c1 = new Child();
		c1.schoolName = "중앙고";
		c1.grade = 3;
		c1.say();
		
		Child c2 = new Child("중앙고", 3, 5000);
		c2.play();
		c2.say();
		System.out.println(c2.grade);
		System.out.println(c2.schoolName);
		System.out.println(c2.money);
		
		System.out.println(c1.money);
		
		c2.printInfo();
	}

}
