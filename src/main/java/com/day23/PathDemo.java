package com.day23;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/com/day23/PathDemo.java");
        //Path path = Paths.get("C:/Users/MB-207/Documents/NetBeansProjects/Java_20220722_OCP_11/src/main/java/com/day23/PathDemo.java");
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0, 2): " + path.subpath(0, 2));
        System.out.println("toUri: " + path.toUri());
        
    }
}
