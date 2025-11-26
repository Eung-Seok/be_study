package be_study.cls.cls07.pack1;

public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point();
		
		p1.math = 90;
		p1.eng = 60;
//		p1.lang = 50; private 접근제한으로 접근불가
		
		
		p1.method1();
		p1.method2();
//		p1.method3(); private 접근제한으로 접근불가
		
		
		Point p2 = new Point();
		Point p3 = new Point(100,80,70);
		
		p2.math = 100; // 변수에 직접 접근해서 사용
		p2.setMath(100); //setter 메소드를 통해서 값을 저장
		
//		p2.lang = 50; 변수에 직접 접은을 할 수가 없음
		p2.setLang(50); //메소드는 public이라서 간접적으로 변수에 접근할 수 있음
		
		p2.eng = 60;
		p2.eng = -60;
		System.out.println(p2.eng);
		p2.setEng(-60);
		System.out.println(p2.eng);
		
		//값을 가져오는(조회/힉득/읽기) getter 메솓,
		System.out.println(p2.math);
		System.out.println(p2.eng);
//		System.out.println(p2.lang);
		System.out.println(p2.getLang());
		
		
	}

}
