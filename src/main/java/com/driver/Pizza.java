package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private  Boolean isCheese=false;
    private  Boolean isTop=false;
    private  Boolean isBag=false;
    private Boolean isBill=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.bill= "Base Price Of The Pizza: 300";
        }

        else {
            this.price = 400;
            this.bill= "Base Price Of The Pizza: 400";
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            this.isCheese=true;
            this.price+=80;
            this.bill +="\nExtra Cheese Added: 80";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isTop)
            return;
        isTop=true;
        if(isVeg) {
            this.price+=70;
            this.bill+="\nExtra Toppings Added: 70";
        }
        else {
            this.price += 120;
            this.bill+="\nExtra Toppings Added: 120";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBag)
            return;
        isBag=true;
        this.price+=20;
        this.bill+="\nPaperbag Added: 20";
    }

    public String getBill(){
        // your code goes here
        if(isBill)
            return this.bill;
        this.bill+="\nTotal Price:"+this.price;
        return this.bill;
    }
}
