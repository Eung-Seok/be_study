package be_study.inherit.inherit04;

import java.util.ArrayList;

import be_study.inherit.inherit03.BluetoothMike;
import be_study.inherit.inherit03.Mike;
import be_study.inherit.inherit03.WirelessMike;

public class Inherit04Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mike m1 = new Mike();
		
		BluetoothMike bm1 = new BluetoothMike();
		WirelessMike wm1 = new WirelessMike();
		
		m1.volumeUp();
		bm1.volumeUp();
		wm1.volumeUp();
		
		Mike m2 = bm1;
		Mike m3 = wm1;
		
		Mike m4 = new BluetoothMike();
		Mike m5 = new WirelessMike();
		
//		BluetoothMike bm2 = m1; //자식타입 = 무보 객체
//		BluetoothMike bm2 = new WirelessMike(); 안됨
		
		m4.volumeUp();
		m5.volumeUp();
		
		//m1 bm1 wm1
		int[] intArr = {1,2,3,4}; //같은 타입
		Mike[] arr = {m1,bm1,wm1};
		Mike[] arr2 = {new Mike(), new BluetoothMike(), new WirelessMike()};
		Mike[] arr3 = new Mike[3];
		arr3[0] = new Mike();
		arr3[1] = new BluetoothMike();
		arr3[2] = new WirelessMike();
	
		
		//arr[0] = m1
		//arr[1] = bm1
		//arr[2] = wm1
		
		ArrayList<Mike> list = new ArrayList<Mike>();
		list.add(new Mike());
		list.add(new BluetoothMike());
		list.add(new WirelessMike());
		
		for(Mike m : list)
			m.volumeUp();
		
		bm1.volumeUp();
	}

}
