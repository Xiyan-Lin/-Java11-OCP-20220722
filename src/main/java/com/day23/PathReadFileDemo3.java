package com.day23;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathReadFileDemo3 {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("src/main/java/com/day22/data/lotto.txt");
        // 讀取資料: Files.readAllLines() 得到 List 集合
        List<String> list = Files.readAllLines(path);
        //System.out.println(list.get(0));
        //System.out.println(list.get(1));
        list.forEach(System.out::println);
        
    }
}
