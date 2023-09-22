package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private int cheesePrice;
    private int toppingPrice=0;

    private int totalPrice=0;
    private int paperBagPrice=0;
    private String bill="";


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        ///base price
        if(isVeg){
            price = 300;
            totalPrice+=300;
        }
        else{
            price = 400;
            toppingPrice+=400;
        }

        // your code goes here
    }

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
        if(!isVeg){
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
        this.bill+="Base Price of the Pizza: "+getPrice()+"\n";
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
