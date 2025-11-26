package be_study.quiz.quiz26;

public class ExrMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1번
		TV myTv = new TV("LG",2021,43);
		myTv.show();
		
		
		//2번
		//7
		Monitor m1 = new Monitor("삼성",27,150000);
		m1.setColor("검은색");
		Monitor m2 = new Monitor("LG",32,330000);
		
		//8
		m1.setXY(1080, 780);
		m2.setColor("흰색");
		m2.setXY(4096, 2048);
		
		//10
		m1.myInfo();
		m2.myInfo();
		
		//11
		m2.price = m2.priceIncrease(70000);
	
		//12
		m1.myInfo();
		m2.myInfo();
		
		
	}
	
	

}
