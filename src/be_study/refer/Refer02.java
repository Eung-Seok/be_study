package be_study.refer;

public class Refer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//enum 열거타입
		
		//선호도 저장
		
		int likePoint = 50;
		String likeLevel = "매우좋음";
		
		String likeLevel2 = "많이좋음";
		
		//위에처럼 이상하게 쓸 수도 있으니 저거의 범위를 한정하고 싶음.
		
		if(likeLevel2.equals(likeLevel)) {
			System.out.println("아주 좋다 긍적적이다.");
		} else {
			System.out.println("잘못입력");
		}
		
		LikeIndex li1 = LikeIndex.VERYGOOD;
		LikeIndex li2 = LikeIndex.NORMAL;
		
		if(li2 == LikeIndex.VERYBAD) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
		Week today = Week.FRI;
		Week w2 = Week.FRI;
		
		if(w2 == today) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		
	}

}
