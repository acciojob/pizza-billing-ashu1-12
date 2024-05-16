package com.driver;

public class Pizza {
	protected boolean isVeg;
	protected int isCheeseAdded;
	protected int isToppingsAdded;
	protected int isPaperBagAdded;
	protected int totalPrice;

	public Pizza(boolean isVeg) {
		this.isVeg = isVeg;
	}

	protected void addExtraCheese() {
		this.isCheeseAdded = 80;
	}

	protected void addExtraToppings() {
		if (isVeg)
			this.isToppingsAdded = 70;
		else
			this.isToppingsAdded = 120;
	}

	protected int addTakeaway() {
		return this.isPaperBagAdded += 20;
	}
	
	protected int getPrice() {
		if(isVeg)
			return 300;
		else
			return 400;
	}

	protected String getBill() {
		this.totalPrice = 0;
		StringBuffer bill = new StringBuffer();
		//bill.append("------------------------------\n");
		
		int basePrize = getPrice();
		bill.append("Base Price Of The Pizza: "+basePrize + "\n");
		this.totalPrice += basePrize;
		
		if (isCheeseAdded != 0) {
			bill.append("Extra Cheese Added: " + isCheeseAdded + "\n");
			this.totalPrice += isCheeseAdded;
		}
		
		if (isToppingsAdded != 0) {
			bill.append("Extra Toppings Added: " + isToppingsAdded + "\n");
			this.totalPrice += isToppingsAdded;
		}

		if (isPaperBagAdded != 0) {
			bill.append("Paperbag Added: " + isPaperBagAdded + "\n");
			this.totalPrice += isPaperBagAdded;
		}
		
		//bill.append("------------------------------\n");
		bill.append("Total Price: " + this.totalPrice + "\n");
		//bill.append("------------------------------\n");
		
//		bill.append("____________________________________________________\n");
//		bill.append(" \n");

		return bill.toString();
	}
}
