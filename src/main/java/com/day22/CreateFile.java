package com.day22;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    // 希望在 src/main/java/com/day22/data 下建立一個 demo.txt 的檔案
    // 完整路徑: src/main/java/com/day22/data/demo.txt
    public static void main(String[] args) throws IOException {
        File folderPath = new File("src/main/java/com/day22/data");
        File filePath = new File("src/main/java/com/day22/data/demo.txt");
        // 檢查目錄
        if(folderPath.exists()) {
            // 檢查檔案
            if(filePath.exists()) {
                System.out.println(filePath + " 檔案已經存在, 無須建立");
            } else {
                boolean success = filePath.createNewFile(); // 建立檔案
                if(success) {
                    System.out.println(filePath + " 檔案建立成功");
                } else {
                    System.out.println(filePath + " 檔案建立失敗");
                }
            }
        } else {
            System.out.println(folderPath + " 目錄不存在, 無法建立檔案");
        }
    }
}
