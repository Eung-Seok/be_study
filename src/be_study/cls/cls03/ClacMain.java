package be_study.cls.cls03;

public class ClacMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calc c1 = new Calc();
		
		System.out.println(c1.madeByInfo());
		
		c1.powerOn();
		
		int result1 = c1.sum(10,20);
		System.out.println(result1);
		
		System.out.println(c1.sum(30,40));
		
//		int result2 = c1.divide(40,6); <-- divide의 리턴값이 double이기 때문에 오류
		double result2 = c1.divide(40,6);
		System.out.println(result2);
		
		int result3 = (int)c1.divide(40,6);
		System.out.println(result3);
		
		c1.checkBattery();
		
		System.out.println("잔여배터리량 : " + c1.checkBattery());
		
		System.out.println("계산기 제조사 : " + c1.madeByInfo());
		
	}

}
