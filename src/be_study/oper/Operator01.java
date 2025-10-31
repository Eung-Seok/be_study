package be_study.oper;

public class Operator01 {

	public static void main(String[] args) {
		
		//산술 연산자 
		
		System.out.println( 1+1 );
		System.out.println( 10-5);
		System.out.println(5*9);
		System.out.println(30/7);
		System.out.println((double)30/7);
		System.out.println(30.0/7);
		System.out.println(9%5);
		System.out.println(28%9);
		
		//부호 연산자 (+, -)
		System.out.println(10);
		System.out.println(+10);
		System.out.println(-10);
		System.out.println(-(-10));
		
		//증감 연산자 (++, --)
		
		System.out.println("===========================================");
		
		int x = 10;
		System.out.println(x);
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		
		System.out.println(1+x);
		System.out.println(x);
		
		int y = 8;
		System.out.println(y--);
		System.out.println(--y);
		System.out.println(y);
		
		int q = 1;
		int w = 3;
		int e = 10 + ++q;
		int r = 3 + w--;
		
		System.out.printf("%d %d %d %d \n", q, w, e, r);
		
		//논리 부정 연산자 (!) true false
		
		boolean isHungry = true;
		System.out.println(isHungry);
		System.out.println(!isHungry);
		System.out.println(true);
		System.out.println(false);
		System.out.println(!true);
		System.out.println(!false);
		
		isHungry = false;
		isHungry = !isHungry;
		
		//문자열 결합 연산자
		System.out.println(133 + 3.345 + "문자");
		
		//비교 연산자
		System.out.println( 1 == 2);
		System.out.println( 1 != 2);
		System.out.println( 3 < 5);
		System.out.println( 10 >= 9);
		System.out.println( 4 > 4);
		System.out.println( 9 <= 1 );
		
		//논리 연산자 AND : &&,&, OR : || | , XOR : ^, NOR : !
		System.out.println(10 < 9 || true );
		System.out.println(10 < 9 ^ true);
		
		//대입 연산자 +=, -=, 
		
		int a = 30;
		a = 50;
		
		a += 30; // a = a + 30
		a -= 10; // a = a - 10
		a *= 3;  // a = a * 3
		a /= 2;  // a = a / 2
		a %= 4;  // a = a % 4
		
		
		//삼항 연산자(조건문) ? :
		int point = 300;
		
		//포인트 200점까지는 사은품 생수, 200점 넘으면 커피 
		
		String reward = (point <= 200) ? "생수" : "커피";
		
		System.out.println(reward);
		
		reward = point > 200 ? "생수" : "커피";
		System.out.println(reward);
		
		//조건식은 여러개를 한 줄로 쓸 수 있음
		
		point = 350;
		
		reward = point <= 200 ? "생수" : (point <= 300 ? "커피" : "맥주");
		System.out.println(reward);
		System.out.println();
		System.out.println();
		
		//양수 음수
		
		int num = 20;
		String sign = num == 0 ? "0" : (num < 0 ? "음수" : "양수");
		
		System.out.println(sign);
		
		
		
		
		
	}

}
