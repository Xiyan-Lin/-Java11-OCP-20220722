package test.day08;

import com.day08.Bird;
import com.day08.Ostrich;
import com.day08.Penguin;

public class AnimalTest2 {
    public static void main(String[] args) {
        // 給我二隻鳥, 並呼叫這二隻鳥的共同方法
        // Case 1:
        Ostrich ostrich = new Ostrich();
        Penguin penguin = new Penguin();
        ostrich.move();
        penguin.move();
        
        // Case 2 (利用多型宣告):
        Bird bird1 = new Ostrich();
        Bird bird2 = new Penguin();
        bird1.move();
        bird2.move();
    }
}
