package be_study.abst;

public class AbstractMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Beverage b1 = new Beverage(); 추상클래스라 직접적으로 선언이 불가능함
		
		Hite h1 = new Hite();
		h1.name = "하이트라이트";
		h1.ml = 330;
		h1.alcol = 5.3;
		h1.introduce();
		h1.checkAlcol();
		
		Coke c1 = new Coke();
		c1.name = "제로콜라";
		c1.ml = 500;
		c1.sugar = 0;
		c1.introduce();
		
		
		Beverage b1 = new Coke();
		Beverage b2 = new Hite();
		Beverage[] bArr = {new Coke(), new Hite()};
		
		bArr[0].checkSafety();
		b2.checkSafety();
		
		Hite hh = (Hite)b2;
		hh.checkAlcol();
		
		Coke c2 = new Coke();
		
		String a;
		a = "asfd";
		System.out.println(a);
		
		c2.intval();
		
//		int a = 10;
//		int b = 30;
//		int result = a - b;
//		
		System.out.println(c2.intval());

		
	}

}
