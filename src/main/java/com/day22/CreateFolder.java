package com.day22;

import java.io.File;

public class CreateFolder {
    // 希望在 src/main/java/com/day22 建立一個 data 的目錄
    // 完整路徑: src/main/java/com/day22/data
    public static void main(String[] args) {
        String url = "src/main/java/com/day22/data";
        File folderUrl = new File(url);
        // 檢查 folderUrl 是否存在 ?
        if(folderUrl.exists()) {
            System.out.println(folderUrl + "已存在");
        } else {
            System.out.println(folderUrl + "尚未存在");
        }
    }
}
