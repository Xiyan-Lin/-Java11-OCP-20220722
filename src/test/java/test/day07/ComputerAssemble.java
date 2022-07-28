package test.day07;

// 組裝電腦

import com.day07.CPU;
import com.day07.SSD;
import com.day07.RAM;

public class ComputerAssemble {
    public static void main(String[] args) {
        // 準備 Hardware 零件
        CPU cpu = new CPU();
        cpu.setSpeed(2.5);  // Ghz
        cpu.setPrice(6000); // cpu 價格
        RAM ram = new RAM();
        ram.setCapacity(32);  // Gb
        ram.setPrice(2800);
        SSD ssd = new SSD();
        ssd.setSize(512); // Gb
        ssd.setPrice(2000);
        
        
    }
}
