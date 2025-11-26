package be_study.inherit.inherit05.v3;

import java.util.ArrayList;
import java.util.List;

public class VMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DustCleaner dc = new DustCleaner();
		dc.money = 100;
		List<Cleaner> list = new ArrayList<Cleaner>();

		list.add(dc);
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());

		for (Cleaner c : list) {
			c.doClean();

			if (c instanceof DustCleaner) {
				DustCleaner cdd = (DustCleaner) c;
				cdd.arrangeItem();
			}
		}

		DustCleaner dc1 = (DustCleaner) list.get(0);
		System.out.println(dc1.money);

	}

}
