package com.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathWithDemo {
    public static void main(String[] args) {
        // 路徑比較
        Path p1 = Paths.get("C:/temp/company/finance/salary.txt");
        Path p2 = Paths.get("C:/temp");
        Path p3 = Paths.get("salary.txt");
        
        System.out.println(p1.startsWith(p2)); // 二路徑起始是否相同
        System.out.println(p1.endsWith(p3)); // 二路徑結尾是否相同
    }
}
