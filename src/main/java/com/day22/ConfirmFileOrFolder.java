package com.day22;

import java.io.File;

public class ConfirmFileOrFolder {
    public static void main(String[] args) {
        // 利用 isFile() or isDirectory() 來判斷是否是檔案或目錄
        File a = new File("src/main/java/com/day22/data/demo.txt");
        File b = new File("src/main/java/com/day22/data");
        System.out.println(a + " 是檔案: " + a.isFile());
        System.out.println(b + " 是檔案: " + b.isFile());
        System.out.println(a + " 是目錄: " + a.isDirectory());
        System.out.println(b + " 是目錄: " + b.isDirectory());
    }
}
