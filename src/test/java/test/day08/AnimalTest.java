package test.day08;

import com.day08.Bird;
import com.day08.Fish;
import com.day08.Ostrich;
import com.day08.Penguin;
import com.day08.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        Bird bird = new Bird();
        Ostrich ostrich = new Ostrich();
        Penguin penguin = new Penguin();
        tiger.move();
        fish.move();
        bird.move();
        ostrich.move();
        ostrich.action();
        penguin.move();
        penguin.skill();
        
    }
}
