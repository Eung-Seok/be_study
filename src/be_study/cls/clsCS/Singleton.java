package be_study.cls.clsCS;

public class Singleton {

//	private static Singleton singleton = new Singleton();
	private static Singleton singleton;
	
	
	//외부에서 생성하지 못하도록
	private Singleton() { //외부에서 접근 불가능
		
	}
	
	static Singleton getInstance() {
		if(singleton == null)
			singleton = new Singleton();
		
		return singleton;
	}
	
	
}
