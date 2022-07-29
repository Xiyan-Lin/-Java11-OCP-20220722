package test.day08;

import com.day08.Bird;
import com.day08.Penguin;

public class AnimalTest5 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Penguin penguin = new Penguin();
        bird.move();
        penguin.move();
        ((Bird)penguin).move();
        
        if(bird instanceof Penguin) {
            ((Penguin)bird).move();
        }
    }
}
