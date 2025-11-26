package be_study.quiz.quiz35;
import java.util.ArrayList;

public class Kitchen {

	
	KitchenSpace kitchenSpace;
	Refregerator refregerator;
	Sink sink;
	GasStove gasStove;
	ArrayList<Cup> cupList;
	ArrayList<WasteBasket> wasteBaskeList;
	
	public void addCup(Cup cup) {
		cupList.add(cup);
	}
	
	public void addWasteBasket(WasteBasket wasteBasket) {
		this.wasteBaskeList.add(wasteBasket);
	}
	
	public void turnOnGasStove() {
		this.gasStove.intensityOfFire = 10;
	}
	
	public void turnOnRefregerator() {
		this.refregerator.isPowerOn = true;
		System.out.println("냉장고가 켜졌습니다.");
	}
	
	public void turnOffRefregerator() {
		this.refregerator.isPowerOn = false;
		System.out.println("냉장고가 꺼졌습니다.");
	}
	
	public void withdrawIceTrayFromRefregerator() {
		this.refregerator.isIceTrayIn = false;
	}
	
	public void fillIceTrayInRefregerator() {
		this.refregerator.isIceTrayIn = false;
	}
	
	
	
	
}
