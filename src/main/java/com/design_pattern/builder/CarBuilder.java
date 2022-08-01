package com.design_pattern.builder;

public interface CarBuilder {
    CarBuilder setWheel(Integer wheel);
    CarBuilder setDoor(Integer door);
    CarBuilder setCC(Integer cc);
    CarBuilder setColor(String color);
    Car create();
}
