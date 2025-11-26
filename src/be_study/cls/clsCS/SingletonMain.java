package be_study.cls.clsCS;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Singleton s1 = new Singleton();
//		Singleton s2 = new Singleton();
//		Singleton s3 = new Singleton();
		
//		Singleton.singleton = null; 기존에 있던 1개만 존재하는 객체를 삭제(파괴)
		
		
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		Singleton.getInstance();
		
		
	}

}
