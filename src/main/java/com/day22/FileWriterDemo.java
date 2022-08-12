package com.day22;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileWriterDemo {
    public static void main(String[] args) {
        String lotto = getLotto();
        File filePath = new File("src/main/java/com/day22/data/lotto.txt");
        try(FileWriter fw = new FileWriter(filePath)) {
            fw.write(lotto); // 寫入資料
            System.out.println("寫入成功");
        } catch (IOException e) {
            System.out.println("寫入失敗");
            e.printStackTrace();
        }
    }
    
    // 取得3星彩樂透號碼
    private static String getLotto() {
        Random random = new Random();
        int n1 = random.nextInt(10);
        int n2 = random.nextInt(10);
        int n3 = random.nextInt(10);
        return String.format("[%d, %d, %d]", n1, n2, n3);
    }
}
