package com.day22;
    
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class FileReadDemo2 {
    public static void main(String[] args) {
        File filePath = new File("src/main/java/com/day22/data/demo.txt");
        
        try(FileReader fr = new FileReader(filePath, Charset.forName("utf-8"));) {
            char[] buffer = new char[1]; // 資料緩衝區
            while (fr.read(buffer) != -1) {                
                System.out.print(buffer[0]);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
