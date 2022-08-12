package com.day24;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Java11ReadWriteDemo {
    public static void main(String[] args) throws Exception {
        String str = "Hello";
        Path path = Paths.get("src/main/java/com/day24/data.txt");
        //Files.deleteIfExists(path);  // 若檔案存在就刪除
        // 寫入字串
        Files.writeString(path, str, StandardOpenOption.WRITE);
        System.out.println("寫入完畢");
        // 讀取字串
        String data = Files.readString(path);
        System.out.println("讀取字串: " + data);
    }
}
