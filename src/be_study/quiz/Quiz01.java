package be_study.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		// 1번
		int month;
		//2번
		int day = 1;
		//3번
		month = 10;
		day = 30;
		System.out.println("오늘은 " + month + "월 " + day + "일 입니다.");
		//4번
		String name = "김응석";
		System.out.println(name);
		//5번
		//자바는 0이 앞에오면 8진수로 인식하기 때문에 010은 출력 텍스트에 포합시켰습니다
		int second = 1234;
		int third = 5678;
		System.out.println("전화번호는 010-"+second+"-"+third+" 입니다.");
		
		int $MAX_NUM = 12;
		
		System.out.println($MAX_NUM);
		/*6
		 * 정답 : a, d, e
		 * b 불가능 #이 들어감
		 * c 불가능 시작은 문자이거나 $,_이어야함
		 * f 불가능 @이 들어감
		 * g 불가능 예약어는 사용하지 못한다.
		 * 
		 * a, e는 가능하긴 하지만 어지간하면 소문자로 시작하는게 관례상 좋다
		 */
		
		/*7
		 *  c : char는 문자 하나밖에 저장하지 못한다
		 */
		
		/*8
		 *  b. int
		 */
		
	}

}
