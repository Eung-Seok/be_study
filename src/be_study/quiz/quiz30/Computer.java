package be_study.quiz.quiz30;

public class Computer {

	public final String[] osType = {"윈도우10", "애플 OS X", "안드로이드"};
	
	String osName;
	int mainMemory;
	
	Computer(int osType, int mainMemory) {
		this.osName = this.osType[osType];
		this.mainMemory = mainMemory;
	}
	
	public void print() {
		System.out.printf("운영체제: %s, 메인메모리: %d\n",osName,mainMemory);
	}
	
}
