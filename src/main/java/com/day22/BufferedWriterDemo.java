package com.day22;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String[] rows = {"Java 11 爪哇", "1z0-819 認證考試"};
        
        try(FileWriter fw = new FileWriter("src/main/java/com/day22/data/demo.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);) {
            
            for(String data : rows) {
                bw.write(data);
                bw.newLine();
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
