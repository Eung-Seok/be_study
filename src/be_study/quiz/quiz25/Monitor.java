package be_study.quiz.quiz25;

public class Monitor {

	//객체
	int inches;
	String madeCompany;
	String modelName;
	
	//생성자
	Monitor(int inches, String madeCompany, String modelName) {
		this.inches = inches;
		this.madeCompany = madeCompany;
		this.modelName = modelName;
	}
	
	
	//메소드
	void printinfo() {
		System.out.println("제조사:" +inches + " 모델명:" + modelName + " 인치:"+inches+"인치");
	}
	
	
}
