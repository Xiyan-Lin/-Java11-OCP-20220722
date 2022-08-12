package com.day24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.SimpleDateFormat;
import java.util.stream.Stream;

public class FilesWalkDemo {
    static int count = 0;
    // 深度走訪器
    public static void main(String[] args) throws Exception {
        Stream<Path> paths = Files.walk(Paths.get("src/")); 
        //Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\MB-207\\javacode")); 
        
        paths.filter(path -> path.getFileName().toString().contains(".java"))
             .forEach(path -> {
                //System.out.println((++count) + " : " + path.toAbsolutePath());
                try {
                    FileTime ft = Files.readAttributes(path, BasicFileAttributes.class).creationTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm:ss E");
                    System.out.println((++count) + "\t" + path.getFileName() + "\t" + sdf.format(ft.toMillis()));
                } catch (Exception e) {
                }
             });
    }
}
