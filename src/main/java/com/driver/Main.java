package com.driver;

public class Main {
  public static void main(String[] args) {
    Pizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
//    dp.addExtraToppings();
//    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.println(dp.getBill());
    
    Pizza dvp = new DeluxePizza(false);
    System.out.println(dvp.getPrice());
//    dp.addExtraToppings();
//    dp.addExtraCheese();
    dvp.addTakeaway();
    System.out.println(dvp.getBill());

    Pizza p = new Pizza(true);
    p.addExtraToppings();
    p.addExtraCheese();
    p.addExtraToppings();
    System.out.println(p.getBill());
  }
}