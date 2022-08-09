package test.day19;

import com.day20.SharedBall;

public class SharedBallDemo {
    public static void main(String[] args) {
        SharedBall sharedBall = new SharedBall();
        Thread t1 = new Thread(sharedBall, "T1");
        //Thread t2 = new Thread(sharedBall, "T2");
        t1.start();
        //t2.start();
    }
}
