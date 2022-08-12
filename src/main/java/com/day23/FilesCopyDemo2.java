package com.day23;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FilesCopyDemo2 {
    public static void main(String[] args) throws Exception {
        // 網路圖片位置: https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/homepage/families-gallery/2022/04_12/family_chooser_tecnica_m.png
        String imageUrl = "https://www.lamborghini.com/sites/it-en/files/DAM/lamborghini/facelift_2019/homepage/families-gallery/2022/04_12/family_chooser_tecnica_m.png";
        URL url = new URL(imageUrl);
        
        InputStream source = url.openStream();  // 來源端
        Path dest = Paths.get("src/main/java/com/day23/data/image/car.png");  // 目的端
        
        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
    }
}
