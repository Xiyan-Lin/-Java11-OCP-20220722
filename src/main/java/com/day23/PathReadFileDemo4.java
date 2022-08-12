package com.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathReadFileDemo4 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/day22/data/lotto.txt");
        // 讀取資料: Files.lines 得到 Stream<String>
        Files.lines(path).forEach(System.out::println);
    }
}
