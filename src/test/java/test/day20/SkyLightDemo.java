package test.day20;

import com.day20.SkyLight;
import java.util.concurrent.CyclicBarrier;

public class SkyLightDemo {
    public static void main(String[] args) {
        Runnable barrierAction = () -> System.out.println("放天燈");
        int count = 4;
        int parties = 4;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(parties, barrierAction);
        for(int i=0;i<count;i++) {
            new SkyLight(cyclicBarrier).start();
        }
    }
}
