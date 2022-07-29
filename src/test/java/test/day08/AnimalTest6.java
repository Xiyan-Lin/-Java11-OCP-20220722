package test.day08;

import com.day08.Animal;
import com.day08.Bird;
import com.day08.Fish;
import com.day08.Ostrich;
import com.day08.Penguin;
import com.day08.Tiger;
import java.util.stream.Stream;

public class AnimalTest6 {
    public static void main(String[] args) {
        Animal[] animals = {
            new Tiger(), new Fish(), new Bird(), new Ostrich(), new Penguin(), new Animal("動物")
        };
        // 執行每一種動物的 move()
        for(Animal animal : animals) {
            animal.move();
        }
        System.out.println("----------------------------");
        Stream.of(animals)
              .forEach(Animal::move);
        System.out.println("----------------------------");
    }
}
