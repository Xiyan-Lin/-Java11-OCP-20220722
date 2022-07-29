package test.day08;

import com.day08.Bird;
import com.day08.Ostrich;
import com.day08.Penguin;

public class AnimalTest4 {
    public static void main(String[] args) {
        // 多型間的轉型
        Penguin penguin = new Penguin();
        Bird bird = new Penguin();
        penguin.move();
        bird.move();
        penguin.skill();
        ((Penguin)bird).skill();
        
        // 利用 instanceof 來解決轉型上的風險
        if(bird instanceof Ostrich) { // bird 是否可以轉型 Ostrich ?
            ((Ostrich)bird).action();
        } else {
            System.out.println("bird 不可以轉型 Ostrich");
        }
    }
}
