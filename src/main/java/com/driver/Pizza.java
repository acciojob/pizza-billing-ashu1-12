package com.driver;

public class Pizza {
	private boolean isVeg;
	private int isCheeseAdded;
	private int isToppingsAdded;
	private int isPaperBagAdded;
	private int totalPrice;

	public Pizza(boolean isVeg) {
		this.isVeg = isVeg;
		if(isVeg) {
			isToppingsAdded=70;
		}else {
			isCheeseAdded=80;
		}
		
		isPaperBagAdded=20;
	}

	public void addExtraCheese() {
		this.isCheeseAdded = 80;
	}

	public void addExtraToppings() {
		if (isVeg)
			this.isToppingsAdded = 70;
		else
			this.isToppingsAdded = 120;
	}

	public int addTakeaway() {
		return this.isPaperBagAdded = 20;
	}
	
	public int getPrice() {
		if(isVeg)
			return 300+isToppingsAdded+isPaperBagAdded;
		else
			return 400+isCheeseAdded+isPaperBagAdded;
	}

	public String getBill() {
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
