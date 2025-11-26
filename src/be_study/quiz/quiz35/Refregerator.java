package be_study.quiz.quiz35;

public class Refregerator {

	String brand;
	double capacity;
	boolean isPowerOn;
	int temperature;
	int doorNum;
	int price;
	boolean isIceTrayIn = true;
	IceTray iceTray;
	
	public void powerOn() {
		this.isPowerOn = true;
		System.out.println("냉장고가 켜졌습니다.");
	}
	
	public void powerOff() {
		this.isPowerOn = false;
		System.out.println("냉장고가 꺼졌습니다.");
	}
	
	public void temperatureUp() {
		this.temperature++;
	}
	
	public void temperatureDown() {
		this.temperature--;
	}
	
}
