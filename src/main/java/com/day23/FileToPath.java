package com.day23;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileToPath {
    public static void main(String[] args) throws Exception {
        // 舊有的 File
        File file = new File("src/main/java/com/day22/data/lotto.txt");
        // 新式的 Path
        Path path = file.toPath();
        Files.readAllLines(path).forEach(System.out::println);
    }
}
