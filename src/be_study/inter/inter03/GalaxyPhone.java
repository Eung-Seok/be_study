package be_study.inter.inter03;

public class GalaxyPhone implements Callable, Connectable{

	
	int callStatus; //전화 상태 필드변수
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("GalaxyPhone call()");
//		callStatus = 1;
		callStatus = Callable.CALL_ON;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("GalaxyPhone connect()");
	}

}
