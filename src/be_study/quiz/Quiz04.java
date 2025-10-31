package be_study.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		
		/*
		 * 1번
		 * x=2 y=3
		 * 5
		 * 5  
		 * x=3 y=4
		 * z에 4+5=9가 초기화됨 x:4 y:5 z:9
		 * x=4 y=5
		 * z가 다음라인에 8이됨. 지금은 9인 상태
		 * x에 x+4가 초기화됨 따라서 x:8 y:4 z:8
		 * x=8 y=4 z=8
		 * x에 10을 초기화함 x:10 y:4 z:8
 		 * z에 10/4를 초기화함 int이기 때문에 2가 초기화됨 그리고 다음줄에 y가 1 늘어남
 		 * x=10 y=5 z=2
 		 * x=20 y=6 z=2
 		 * x=10 y=6 z=2
 		 * 
 		 * =========================================================
 		 * 
 		 * 2번
 		 * 
 		 * 1<2 ->  true  AND 3>=1 -> true --> true
 		 * a ==b -> false OR 1>= 2 false OR 3 > 10 -> false --> false
 		 * 3 == 3 -> true 따라서 !true --> false가 result에 초기화됨
 		 * false 
		 */
		//3번
		
		int menuPrice = 7000; //점심 식사 메뉴 가격
		String result = menuPrice <= 6000 ? "훌륭" : (menuPrice <= 8000 ? "선방" : (menuPrice <= 12000 ? "눈물" : "물로배채우기"));
		System.out.println(result);
		menuPrice = 15000;
		result = result;
		System.out.println(result);

		
	}

}
