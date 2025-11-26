package be_study.cls.cls02;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car(); //인스턴트 객체 생서
		Car car2 = new Car(); //생성자 호출(시행)
		
		car1.model = "아반떼";
		System.out.println(car1.model);
		System.out.println(car2.color);
		
		System.out.println(car1.color);
		
		Car car3 = new Car();
		Car car4 = new Car("소나타");
		
		System.out.println(car4.model);
		System.out.println(car4.color);
		
		Car car5 = new Car("그랜저");
		car5.color = "black";
		System.out.println(car5.model);
		System.out.println(car5.color);
		
		Car car6 = new Car("쏘렌토", "black");
		System.out.println(car6.model);
		System.out.println(car6.color);
		System.out.println(car6.price);
	}

}
