package test.day19;

import com.day19.Race;

public class RaceDemo {
    public static void main(String[] args) {
        // 任務建立
        Race turtle = new Race();
        Race rabbit = new Race();
        Race dog = new Race();
        Race cat = new Race();
        // 將任務注入到執行緒中
        Thread t1 = new Thread(turtle, "烏龜");
        Thread t2 = new Thread(rabbit, "兔子");
        // 調整權限 1~10 (數值越大越優先執行, 預設是5)
        t1.setPriority(10); // 10, Thread.MAX_PRIORITY
        t2.setPriority(1); // 1, Thread.MIN_PRIORITY
        // 執行任務
        t1.start();
        t2.start();
    }
}
