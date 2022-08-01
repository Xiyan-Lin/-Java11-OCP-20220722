package test.day11;

import com.day11.Ball;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 100);
        Ball b2 = new Ball("Red", 100);
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
