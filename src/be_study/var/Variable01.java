package be_study.var;

public class Variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수 선언
		
		//타입 변수명
		// int 타입 : 정수형 숫자 타입
		
		int abc; //변수 선언
		int def; //정수형 숫자 타입의 변수
		
		int point;
		int score;
		
		score = 90; //score라는 변수에 90이란 값을 저장
		
		
//		int x;
//		int y;
//		int z;
		
		int x, y, z ;
		
		
		
		abc = 1;
	
		//level = 99; 선언하지 않은 변수명 사용 불가능
		int level; 
	
		int math = 99; //선언과 동시에 값을 저장
		
		int time; // 변수 선언
		time = 12; // 12 값 저장
		
		time = 13; // 13 값 저장
		
		int myTime = 10 + 5 - 2; //연산 가능
		
		myTime = time + 5;
		
		myTime = time + 4 + time - 1 + time;
		
//		int value;  //value 변선 선언만
//		int result = value + 5; //초기화되지 않은 수는 연산 불가
		
		int value = 20; //value 변수 선언 + 초기화(값 저장)
		int result = value + 5; //값이 있는 변수는 연산 가능
		
		
		//출력
		System.out.println("문자를 넣으면 출력");
		System.out.println(12345);
		System.out.println(value);
		System.out.println(result);
//		System.out.println(level);
		
		System.out.println(result+50);
		
		int totalScore = score + score + 50;
		System.out.println(totalScore);
		System.out.println(totalScore + 30);
		System.out.println(totalScore);
		
		totalScore = totalScore + 70;
		System.out.println(totalScore);
		
		
		// 변수 위치 바꾸기
		int a = 10;
		int b = 20;
		
		int c = a;
		a =b ;
		b = c;
		
		System.out.println(a);
		System.out.println(b);
		
		// a:10 b:20
		
		// 값 바꾸기
		
		
		
	}

}
