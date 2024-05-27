package com.driver;

public class Pizza {
	private boolean isVeg;
	private int isCheeseAdded;
	private int isToppingsAdded;
	private int isPaperBagAdded;
	private int totalPrice;
	private int basePrice;

	public Pizza(boolean isVeg) {
		this.isVeg = isVeg;
		
		if(isVeg) {
			this.basePrice=300;
			totalPrice+=basePrice;
		}
			
		else {
			this.basePrice=400;
			totalPrice+=basePrice;
		}
	}

	public void addExtraCheese() {
		if(isCheeseAdded == 0) {	
			this.isCheeseAdded = 80;
			totalPrice+=isCheeseAdded;
		}
	}

	public void addExtraToppings() {
		if(isToppingsAdded == 0) {
		if (isVeg) {
			this.isToppingsAdded = 70;
			totalPrice+=isToppingsAdded;
		}
		else{
			this.isToppingsAdded = 120;
			totalPrice+=isToppingsAdded;
			}
		}
	}

	public int addTakeaway() {
		if(isPaperBagAdded==0) {
			this.isPaperBagAdded = 20;
			totalPrice+=isPaperBagAdded;
		}
		return isPaperBagAdded;
	}
	
	public int getPrice() {
		
		return totalPrice;
			
	}

	public String getBill() {
		//this.totalPrice = 0;
		StringBuffer bill = new StringBuffer();
		//bill.append("------------------------------\n");
		
		
		bill.append("Base Price Of The Pizza: "+this.basePrice + "\n");
		//this.totalPrice += basePrize;
		
		if (isCheeseAdded != 0) {
			bill.append("Extra Cheese Added: " + isCheeseAdded + "\n");
			//this.totalPrice += isCheeseAdded;
		}
		
		if (isToppingsAdded != 0) {
			bill.append("Extra Toppings Added: " + isToppingsAdded + "\n");
			//this.totalPrice += isToppingsAdded;
		}

		if (isPaperBagAdded != 0) {
			bill.append("Paperbag Added: " + isPaperBagAdded + "\n");
			//this.totalPrice += isPaperBagAdded;
		}
		
		//bill.append("------------------------------\n");
		bill.append("Total Price: " + this.totalPrice + "\n");
		//bill.append("------------------------------\n");
		
//		bill.append("____________________________________________________\n");
//		bill.append(" \n");

		return bill.toString();
	}

}
