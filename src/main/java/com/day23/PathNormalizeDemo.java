package com.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalizeDemo {
    public static void main(String[] args) {
        // 除去冗餘路徑(..)
        Path path = Paths.get("C://aaa/bbb/../ccc/ddd.txt");
        System.out.println(path);
        Path path2 = Paths.get("C://aaa/bbb/../ccc/ddd.txt").normalize();
        System.out.println(path2);
    }
}
