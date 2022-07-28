package com.day07;

public class SSD extends Hardware {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "SSD{" + "size=" + size + '}';
    }
    
}
