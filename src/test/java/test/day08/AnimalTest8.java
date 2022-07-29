package test.day08;

import com.day08.Animal;
import com.day08.AnimalUtil;
import com.day08.Tiger;

public class AnimalTest8 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        AnimalUtil.print(tiger);
        Animal animal = AnimalUtil.getAnimal();
        AnimalUtil.print(animal);
    }
}
