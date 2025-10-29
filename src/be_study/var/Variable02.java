package be_study.var;

public class Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2진수. 8진수, 10진수, 16진수
		
		int num2 = 0b10; //0b가 붙으면 2진수로 읽음
		int num8 = 012; // 숫자 앞에 0이 붙으면 8진수로 인식한다
		int num10 = 10; // 아무것도 없이 바로 숫자가 나오면 10진수로 인식한다
		int num16 = 0x30; // 앞에 0x가 붙으면 16진수로 인식한다

		
		System.out.println(num16);
		
		
		char chr1 = 'A';
		char chr2 = 86;
		char chr3 = 0x23;
		
		char chr4 = 'F';
		char chr5 = '안';		

//		char chr6 = '안녕'; char는 여러 글자를 저장하지 못한다
		
		System.out.println(chr1);
		System.out.println(chr2);
		System.out.println(chr3);
		System.out.println(chr4);
		System.out.println(chr5);
		
		//문자열 타입 " " 큰 따옴표로 감싼 여러문자
		String s1 = "안";
		String s2 = "녕";
		String s3 = "안녕하세요~";
		String s4 = "1234";
		
		System.out.println(s3);
		System.out.println(s4);
		
		int n = 1234; //정수형
		
		System.out.println(n + 10);
		
		System.out.println(s4 + 10);
		
		System.out.println("지금은 " + 16 + "시 입니다");
		System.out.println("지금은 16시 입니다");
		
		String msg = "\"안녕\"하세요"; // 안녕하세요 "안녕"하세요
		System.out.println(msg);
		
		/*\t: 탭만큼 띄움
		 * \n 줄바꿈
		 */
		
		System.out.println("어서\t오세요~ \n반갑습니다.");
		
		double d1 = 12.123;
		double d2 = 500;
		double d3 = 5e2;
		double d4 = 0.0012;
		double d5 = 0.12e-2;
		
		float f1 = 23.45f; //float는 값 뒤에 f를 표기
		
		
		
		System.out.println(d5);
		
		boolean open = true;
		boolean close = false;
		boolean stop = false;
		
		boolean isOpened = true;
		boolean isClosed = false;
		
		boolean hasOption = true;
		
		}

}
