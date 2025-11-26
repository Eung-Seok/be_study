package be_study.inherit.inherit07;

public class Driver {

	Vehicle vehicle;

	public void driveBus(Bus bus) {
		bus.run();
	}

	public void driveTaxi(Taxi taxi) {
		taxi.run();
	}

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

	// 메소드 재정의
	// private String toString() { 
	//이미 object에 toString이 public으로 정의되어있어서 더 좁은 제한자로 재정의할 수 없다
	public String toString() {
		return "이것은 driver입니다";
	}
}
