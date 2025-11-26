package be_study.quiz.quiz35;

public class GasStove {

	int stoveNum;
	String brand;
	int price;
	int intensityOfFire = 0;
	
	public void turnOnFire() {
		intensityOfFire = 10;
	}
	
	public void turnOffFire() {
		intensityOfFire = 0;
	}
	
	public void setIntensityOfFire(int n) {
		intensityOfFire = n;
	}
	
	
	
}
