package test.day19;

import com.day19.Clean;
import com.day19.Coding;
import com.day19.Sales;

public class ThreadDemo2 {
    public static void main(String[] args) {
        // 多執行緒模式
        Coding coding = new Coding();
        Sales sales = new Sales();
        Clean clean = new Clean();
        // 調用 start() 才可以進入自動排程執行模式 = 多執行緒模式
        coding.start();
        sales.start();
        clean.start();
    }
}
