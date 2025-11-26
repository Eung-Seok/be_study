package be_study.quiz.quiz35;

public class WasteBasket {

	double capacity;
	String color;
	double filledPercentage = 0;
	boolean isCoverOpen = false; 
	
	
	public void fill(double n) {
		filledPercentage += n/capacity*100;
	}
	
	public void empty() {
		this.filledPercentage = 0;
	}
	
	public void coverOpen(){
		this.isCoverOpen = true;
	}
	
	public void coverClose() {
		this.isCoverOpen = false;
	}
	
	
	
	
}
