package com.day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathReadFileDemo1 {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/day22/data/lotto.txt");
        // 讀取資料: FileReader -> BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
            // lines() 是一個 Stream<String>
            br.lines().forEach(System.out::println);
        } catch (Exception e) {
        }
    }
}
