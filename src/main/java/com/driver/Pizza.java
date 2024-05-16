package com.driver;

public class Pizza {

    protected int price;
    protected boolean isVeg;
    protected int cheesePrice;
    protected int toppingPrice;
    protected int totalPrice;
    protected int paperBagPrice;
    protected String bill="";

    
//    		Veg pizza base price = 300
//    		Non-veg pizza base price = 400
//    		Extra Cheese Price = 80
//    		Extra Toppings For Veg Pizza = 70
//    		Extra Toppings For Non-veg Pizza = 120
//    		Paper bag Price = 20
    
    //constructor for normal pizza 
    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        ///base price
        if(isVeg){
            price = 300;
            totalPrice+=300;
        }
        else{
            price = 400;
            totalPrice+=400;
        }

        // your code goes here
    }
//    
//  //constructor for DeluxePizza
//    public Pizza(boolean isVeg,int extraCheese, int extraToppings) {
//    	if(isVeg){
//            price = 300;
//            totalPrice+=300;
//        }
//        else{
//            price = 400;
//            totalPrice+=400;
//        }
//    	this.cheesePrice+=extraCheese;
//    	this.toppingPrice+=extraToppings;
//    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        cheesePrice+=80;
        totalPrice+=80;
    }

    public void addExtraToppings(){
        if(isVeg){
            toppingPrice+=70;
            totalPrice+=70;
        }
        else{
            toppingPrice+=120;
            totalPrice+=120;
        }

        // your code goes here
    }

    public void addTakeaway(){
        // your code goes here
        paperBagPrice+=20;
        totalPrice+=20;
    }
    public void setBill() {
        this.bill+="Base Price Of The Pizza: "+getPrice()+"\n";
        if(cheesePrice >0)
            this.bill+="Extra Cheese Added: "+cheesePrice+"\n";
        if(toppingPrice >0)
            this.bill+="Extra Toppings Added: "+toppingPrice+"\n";
        if(paperBagPrice >0)
            this.bill+="Paperbag Added: "+paperBagPrice+"\n";
        this.bill+="Total price: "+totalPrice+"\n";


    }

    public String getBill(){
        setBill();
        return this.bill;
    }
}
