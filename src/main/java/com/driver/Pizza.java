package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;


    private final int cheese=80;
    private final int vegTopping=70;
    private final int nonVegTopping=120;
    private final int bag=20;

    private  Boolean isCheese=false;
    private  Boolean isTop=false;
    private  Boolean isBag=false;
    private Boolean isBill=false;

    public Boolean getVeg() {
        return isVeg;
    }

    public int getCheese() {
        return cheese;
    }

    public Boolean getTop() {
        return isTop;
    }

    public int getVegTopping() {
        return vegTopping;
    }

    public int getNonVegTopping() {
        return nonVegTopping;
    }

    public int getBag() {
        return bag;
    }

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price=300;
            this.bill= "Base Price Of The Pizza: 300\n";
        }

        else {
            this.price = 400;
            this.bill= "Base Price Of The Pizza: 400\n";
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
            this.price+=cheese;
            this.bill +="Extra Cheese Added: "+cheese+"\n";
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(isTop)
            return;
        isTop=true;
        if(isVeg) {
            this.price+= vegTopping;
            this.bill+="Extra Toppings Added: "+vegTopping+"\n";
        }
        else {
            this.price += nonVegTopping;
            this.bill+="Extra Toppings Added: "+nonVegTopping+"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isBag)
            return;
        isBag=true;
        this.price+=bag;
        this.bill+="Paperbag Added: "+bag+"\n";
    }

    public String getBill(){
        // your code goes here
        if(isBill)
            return this.bill;
        this.bill+="Total Price:"+this.price+"\n";
        return this.bill;
    }
}
