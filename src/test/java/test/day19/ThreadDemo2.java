package test.day19;

import com.day19.Clean;
import com.day19.Coding;
import com.day19.Music;
import com.day19.Sales;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 多執行緒模式
        Coding coding = new Coding();
        Sales sales = new Sales();
        Clean clean = new Clean();
        Music music = new Music();
        // 設定執行緒名稱
        coding.setName("小明");
        sales.setName("老王");
        clean.setName("張三");
        music.setName("Youtube");
        // 將 music 設定為背景執行緒
        music.setDaemon(true);
        // 調用 start() 才可以進入自動排程執行模式 = 多執行緒模式
        coding.start();
        sales.start();
        clean.start();
        music.start();
    }
}
