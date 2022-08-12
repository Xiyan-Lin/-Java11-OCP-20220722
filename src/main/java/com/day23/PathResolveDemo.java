package com.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathResolveDemo {
    public static void main(String[] args) {
        // 相對路徑結合
        Path p1 = Paths.get("C:/temp/company/finance/");
        Path p2 = Paths.get("salary.txt");
        p1 = p1.resolve(p2);
        System.out.println(p1); // C:\temp\company\finance\salary.txt
        
        // 絕對路徑結合
        Path p3 = Paths.get("C:/temp/company/finance/");
        Path p4 = Paths.get("/salary.txt"); // <-- 注意: 前方有 /
        p3 = p3.resolve(p4);
        System.out.println(p3); // C:\salary.txt
        
    }
}
