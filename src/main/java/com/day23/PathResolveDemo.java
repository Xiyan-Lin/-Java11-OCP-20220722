package com.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolveDemo {
    public static void main(String[] args) {
        // 路徑結合
        Path p1 = Paths.get("C:/temp/company/finance/");
        Path p2 = Paths.get("salary.txt");
        p1 = p1.resolve(p2);
        System.out.println(p1); // C:\temp\company\finance\salary.txt
    }
}
