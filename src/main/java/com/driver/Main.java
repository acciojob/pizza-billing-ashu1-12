package com.driver;

public class Main {

	
	
	public static void main(String args[]) {
		Pizza pizza = new Pizza(true);
		pizza.addExtraToppings();
		pizza.addExtraToppings();
		pizza.addExtraToppings();
		pizza.addExtraToppings();
		pizza.addExtraCheese();
		pizza.addPaperBag();
		String bill = pizza.generateBill();
		System.out.println(bill);
		
		Pizza deluxPizza = new DeluxePizza(false);
		deluxPizza.addExtraToppings();
		bill = deluxPizza.generateBill();
		
		System.out.println(bill);
	}
}