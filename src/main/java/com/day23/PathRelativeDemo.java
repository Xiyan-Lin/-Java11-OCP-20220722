package com.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathRelativeDemo {
    public static void main(String[] args) {
        // 路徑切換
        Path p1 = Paths.get("home");
        Path p2 = Paths.get("home/sally/bar");
        Path p1_to_p2 = p1.relativize(p2);
        System.out.println("cd " + p1_to_p2); // cd sally\bar
        Path p2_to_p1 = p2.relativize(p1);
        System.out.println("cd " + p2_to_p1); // cd ..\..
    }
}
