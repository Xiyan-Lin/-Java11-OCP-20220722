package com.day22;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("src/main/java/com/day22/data/lotto.txt", Charset.forName("utf-8"));
            BufferedReader br = new BufferedReader(fr);) {
            
            String data = null;
            while ((data = br.readLine()) != null) {                
                System.out.println(data);
            }
            
        } catch (Exception e) {
        }
    }
}
