package be_study.quiz.quiz36;
import java.util.ArrayList;
public class Program {

	ArrayList<Customer> customerList;
	Menu menu;
	ArrayList<Order> orderList;
	ArrayList<Rider> riderList;
	
	public void matchRider(Order order) {
		for(int i = 0; i < riderList.size(); i++) {
			if(riderList.get(i).nowDelivery == false) {
				riderList.get(i).nowDelivery = true;
				riderList.get(i).order = order;
				break;
			}
		}
	}
}
