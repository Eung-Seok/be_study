package be_study.quiz.quiz36;

import java.util.ArrayList;

public class Order {

	int orderNumber;
	Customer customer;
	ArrayList<Pizza> pizzaList;
	int totalPrice = totalPrice();
	
	public int totalPrice() {
		int sum =0;
		for(Pizza p: pizzaList)
			sum += p.price;
		return sum;
	}
}
