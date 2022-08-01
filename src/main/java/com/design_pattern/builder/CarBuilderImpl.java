package com.design_pattern.builder;

public class CarBuilderImpl implements CarBuilder {
    // 預設值
    private Integer wheel = 4;
    private Integer door = 2;
    private Integer cc = 2000;
    private String color = "Block";
    
    @Override
    public CarBuilder setWheel(Integer wheel) {
        this.wheel = wheel;
        return this;
    }

    @Override
    public CarBuilder setDoor(Integer door) {
        this.door = door;
        return this;
    }

    @Override
    public CarBuilder setCC(Integer cc) {
        this.cc = cc;
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public Car create() {
        Car car = new Car(wheel, door, cc, color);
        return car;
    }
    
}
