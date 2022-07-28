package com.day07;

public class CPU extends Hardware {
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CPU{" + "speed=" + speed + '}';
    }
    
}
