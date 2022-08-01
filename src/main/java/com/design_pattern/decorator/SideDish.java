package com.design_pattern.decorator;

public class SideDish extends Food {
    protected Food food;
    
    public SideDish(Food food) {
        this.food = food;
    }
    
    @Override
    public String getName() {
        return name + " + " + food.getName();
    }

    @Override
    public Integer getPrice() {
        return price + food.getPrice();
    }
    
}
