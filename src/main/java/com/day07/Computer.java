package com.day07;

public class Computer extends Machine { // 繼承 is-a
    // has-a 組合
    private CPU cpu;
    private RAM ram;
    private SSD ssd;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public SSD getSsd() {
        return ssd;
    }

    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }
    
    // 改寫 Object 的 toString() 方法

    @Override
    public String toString() {
        return "Computer{" + "cpu=" + cpu + ", ram=" + ram + ", ssd=" + ssd + '}';
    }
    
    
}
