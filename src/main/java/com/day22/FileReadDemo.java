package com.day22;
    
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File filePath = new File("src/main/java/com/day22/data/demo.txt");
        FileReader fr = new FileReader(filePath);
        char[] buffer = new char[1]; // 資料緩衝區
        
        int a = fr.read(buffer);
        System.out.println("a=" + a + " buffer[0]=" + buffer[0]);
        
        int b = fr.read(buffer);
        System.out.println("b=" + b + " buffer[0]=" + buffer[0]);
        
        int c = fr.read(buffer);
        System.out.println("c=" + c + " buffer[0]=" + buffer[0]);
        
        int d = fr.read(buffer);
        System.out.println("d=" + d + " buffer[0]=" + buffer[0]);
        
        fr.close();
    }
}
