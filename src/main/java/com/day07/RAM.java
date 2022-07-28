package com.day07;

public class RAM extends Hardware {
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM{" + "capacity=" + capacity + '}';
    }
    
    
}
