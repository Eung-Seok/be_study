package be_study.cls.cls06;

public class LikePointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		System.out.println(n);
		
		n = 20;
		System.out.println(n);
		
		final int i =30;
		System.out.println(i);
//		i = 300; final은 바꿀 수가 없음
		
		LikePoint l1 = new LikePoint();
		System.out.println(l1.veryGood);
//		l1.veryGood = 1; final이라서 수정이 불가능
		System.out.println(LikePoint.veryBad); //장점: 객체생성 없이 호출 가능
												
		LikePoint.veryBad = 0;
		System.out.println(LikePoint.veryBad); //단점: 수정이 됨
		System.out.println(l1.veryBad);
		
		
		//상수형 객체생성 없어도 가능, 수정불가
		System.out.println(LikePoint.VERY_GOOD);
		System.out.println(LikePoint.GOOD);
		System.out.println(LikePoint.NORMAL);
		System.out.println(LikePoint.BAD);
		System.out.println(LikePoint.VERY_BAD);
		
	}

}
