package test.day08;

import com.day08.Bird;
import com.day08.Ostrich;
import com.day08.Penguin;
import java.util.stream.Stream;

public class AnimalTest3 {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Bird();
        birds[1] = new Ostrich();
        birds[2] = new Penguin();
        
        for (Bird bird : birds) {
            bird.move();
        }
        
        Stream.of(new Bird(), new Ostrich(), new Penguin())
              .forEach(bird -> bird.move());
        
        Stream.of(new Bird(), new Ostrich(), new Penguin())
              .forEach(Bird::move);
    }
}
