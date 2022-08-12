package com.day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathReadFileDemo2 {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/day22/data/lotto.txt");
        // 讀取資料: Files.newBufferedReader
        try(BufferedReader br = Files.newBufferedReader(path)){
            br.lines().forEach(System.out::println);
        } catch(Exception e) {
        
        }
        
    }
}
