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
        // 執行任務
        t1.start();
        t2.start();
    }
}
