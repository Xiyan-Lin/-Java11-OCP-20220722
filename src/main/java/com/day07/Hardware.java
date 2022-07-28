package com.day07;

public class Hardware {
    private int price; // 硬體價格

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hardware{" + "price=" + price + '}';
    }
    
}
