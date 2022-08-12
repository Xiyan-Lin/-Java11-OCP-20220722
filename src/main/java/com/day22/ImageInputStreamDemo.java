package com.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ImageInputStreamDemo {
    // 網路圖片位置: https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/homepage/families-gallery/2022/04_12/family_chooser_tecnica_m.png
    public static void main(String[] args) throws Exception {
        String imageUrl = "https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/homepage/families-gallery/2022/04_12/family_chooser_tecnica_m.png";
        URL url = new URL(imageUrl); // 網路 URL 物件
        try(InputStream is = url.openStream(); // 讀取網路的資料串流
            FileOutputStream fos = new FileOutputStream("src/main/java/com/day22/data/car.png");) {
            
            System.out.println(is.available());
            byte[] buffer = new byte[1];
            while (is.read(buffer) != -1) { // 讀取資料到 buffer 中
                fos.write(buffer); // 將 buffer 中的資料寫入到指定檔案中
            }
            System.out.println("寫檔完畢");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
