package com.design_pattern.decorator;

public abstract class Food {
    protected String name;
    protected Integer price;
    
    public abstract String getName();
    public abstract Integer getPrice();
}
