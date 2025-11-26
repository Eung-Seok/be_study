package be_study.test2;

public class RouletteGameMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RouletteGameMachine myRoulette = new RouletteGameMachine("eungseokkim", "Cheonan");
		
		while (myRoulette.isRun) {
			myRoulette.selectMenu();
		}
	}
}