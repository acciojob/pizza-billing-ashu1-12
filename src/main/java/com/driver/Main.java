package com.driver;

public class Main {
//  public static void main(String[] args) {
//    Pizza dp = new DeluxePizza(true);
//    System.out.println(dp.getBasePrize());
////    dp.addExtraToppings();
////    dp.addExtraCheese();
//    dp.addTakeaway();
//    System.out.println(dp.getBill());
//    
//    Pizza dvp = new DeluxePizza(false);
//    System.out.println(dvp.getPrice());
////    dp.addExtraToppings();
////    dp.addExtraCheese();
//    dvp.addTakeaway();
//    System.out.println(dvp.getBill());
//
//    Pizza p = new Pizza(true);
//    p.addExtraToppings();
//    p.addExtraCheese();
//    p.addExtraToppings();
//    System.out.println(p.getBill());
//  }
	
	
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