package test.day20;

import com.day20.SharedBall;

public class SharedBallDemo {
    public static void main(String[] args) {
        SharedBall sharedBall = new SharedBall();
        for(int i=65;i<=70;i++) {
            Thread t = new Thread(sharedBall, (char)i + "");
            t.start();
        }
        /*
        Thread t1 = new Thread(sharedBall, "T1");
        Thread t2 = new Thread(sharedBall, "T2");
        Thread tt = new Thread(sharedBall, "TT");
        t1.start();
        t2.start();
        tt.start();
        */
    }
}
