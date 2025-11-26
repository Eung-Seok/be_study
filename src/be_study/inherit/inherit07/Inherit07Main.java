package be_study.inherit.inherit07;

public class Inherit07Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver d = new Driver();
		Taxi t = new Taxi();
		Bus b = new Bus();
		
		System.out.println(d.toString());
		
		
		d.driveBus(b);
		d.driveTaxi(t);
		
		Vehicle v1 = new Taxi();
		Vehicle v2 = new Bus();
		Vehicle v3 = new Vehicle();
		
		d.drive(v1);
		d.drive(v2);
		d.drive(v3);
		
		System.out.println("Vehicle 매개변수에 Taxi, Bus 전달가능");
		
		Taxi t1 = new Taxi();
		Bus b1 = new Bus();
		d.drive(t1);
		d.drive(b1);
		
		Taxi t2 = takeTaxi();
		Bus b2 = takeBus();
		
		Vehicle v4 = takeTaxi();
		Vehicle v5=  takeBus();
		
		//Bus b10 = takeBus2();
		
		//Vehicle v = new Bus();
		//Bus b = v   XXX
		Vehicle v12 = takeBus2();
		if(v12 instanceof Bus) {
			Bus b12 = (Bus)v12;
		}
		
	}
	
	public static Taxi takeTaxi() {
		return new Taxi();
	}
	
	public static Bus takeBus() {
		return new Bus();
	}
	
	public static Vehicle takeBus2() {
		return new Bus();
	}
	

}
