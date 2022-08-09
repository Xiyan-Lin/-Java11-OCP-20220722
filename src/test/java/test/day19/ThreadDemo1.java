package test.day19;

import com.day19.Clean;
import com.day19.Coding;
import com.day19.Sales;

public class ThreadDemo1 {
    public static void main(String[] args) {
        // 單工模式
        Coding coding = new Coding();
        Sales sales = new Sales();
        Clean clean = new Clean();
        coding.job();
        sales.job();
        clean.job();
    }
}
