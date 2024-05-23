package com.driver;

public class Pizza {
	/*private boolean isVeg;
	private int isCheeseAdded;
	private int isToppingsAdded;
	private int isPaperBagAdded;
	private int totalPrice;

	public Pizza(boolean isVeg) {
		this.isVeg = isVeg;
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
			return 300;
		else
			return 400;
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
	}*/
	 private boolean isVeg;

	    private int totalPrice;

	    private int extraCheesePrice;

	    private int paperBagPrice;

	    private int toppingsPrice;

	    private String bill;

	    Pizza(boolean isVeg){

	        if(isVeg){
	            totalPrice = 300;
	            this.bill = "Base Price of Veg Pizza :"+300 +"\n";
	        }else{
	            totalPrice = 400;
	            this.bill = "Base Price Of Non Veg Pizza : "+400 +"\n";

	        }
	        this.extraCheesePrice = 80;
	        this.paperBagPrice = 20;

	        if(isVeg){
	            this.toppingsPrice = 70;
	        }else{
	            this.toppingsPrice = 120;
	        }

	    }

	    public void addExtraCheese(){
	        totalPrice = totalPrice + extraCheesePrice;

	        this.bill = this.bill + "Extra cheese added :"+extraCheesePrice+"\n";
	    }

	    public void addExtraToppings(){
	        totalPrice = totalPrice + toppingsPrice;
	        this.bill = this.bill + "Extra Toppings added :"+toppingsPrice+"\n";
	    }

	    public void paperBagAdded(){
	        totalPrice = totalPrice + paperBagPrice;
	        this.bill = this.bill + "Paper Bag added :"+paperBagPrice+"\n";
	    }

	    public int getTotalPrice(){
	        return totalPrice;
	    }

	    public String getBill(){
	        this.bill = this.bill + "Total Bill Price is :"+totalPrice+"\n";
	        return bill;
	    }


}
