package com.day07;

public class Computer extends Machine { // 繼承 is-a
    // has-a 組合
    private CPU cpu;
    private RAM ram;
    private HD hd;

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

    public HD getHd() {
        return hd;
    }

    public void setHd(HD hd) {
        this.hd = hd;
    }
    
}
