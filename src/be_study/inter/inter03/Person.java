package be_study.inter.inter03;

public class Person {

	//난 사람
	
	//휴대폰 하나 가지고 있음
	
//	IPhone iPhone;
//	GalaxyPhone  galaxyPhone;
//	LGPhone lgPhone;
	
	Callable callPhone; //
//	Callable c1 = new IPhone();
//	Callable c2 = new GalaxyPhone();
//	Callable c3 = new LGPhone();
	
	//사람 입장에서 핸드폰으로 전화를 건다
	public void call(String targetPhoneNumber) {
		callPhone.call();
	}
	
	
}
