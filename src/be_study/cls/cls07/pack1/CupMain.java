package be_study.cls.cls07.pack1;

//import java.util.Scanner; //다른 패키지 경로에 있는 클래스를 사용하기위해 import
import be_study.cls.cls07.pack2.Cup;

public class CupMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cup c1 = new Cup();
		be_study.cls.cls07.pack1.Cup c2 = new be_study.cls.cls07.pack1.Cup();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		Cup c5 = new Cup();
		
		be_study.cls.cls07.pack2.Cup c6 = new be_study.cls.cls07.pack2.Cup();
		//임포트가 우선이고 그다음이 같은 패키지 안에 있는 것
		c5.method();
		c6.method();
		
		c6.type = "플라스틱";
		
	}

}
