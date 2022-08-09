package test.day19;

import com.day19.Race;

public class RaceDemo {
    public static void main(String[] args) {
        // 任務建立
        Race turtle = new Race();
        Race rabbit = new Race();
        // 將任務注入到執行緒中
        Thread t1 = new Thread(turtle, "烏龜");
        Thread t2 = new Thread(rabbit, "兔子");
        // 調整權限 1~10 (數值越大越優先執行, 預設是5)
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1
        // 執行任務
        t1.start();
        t2.start();
    }
}
