package com.example.Alejandro_Mora;

public class Product {
    private String itemName = "Greatest Hits";
    private int itemUnits = 1;
    private int exitentUnits = 1;
    private double price = 9.99;

    // Instace field declarations

    

    public Product() {
    }

    /*
    public Product(String itemName, int itemUnits, int exitentUnits, double price) {
        this.itemName = itemName;
        this.itemUnits = itemUnits;
        this.exitentUnits = exitentUnits;
        this.price = price;
    }
    */

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemUnits() {
        return itemUnits;
    }

    public void setItemUnits(int itemUnits) {
        this.itemUnits = itemUnits;
    }

    public int getExitentUnits() {
        return exitentUnits;
    }

    public void setExitentUnits(int exitentUnits) {
        this.exitentUnits = exitentUnits;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [itemName: " + itemName + ", itemUnits: " + itemUnits + ", exitentUnits: " + exitentUnits
                + ", price: " + price + "]";
    }

}
