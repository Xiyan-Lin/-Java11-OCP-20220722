package test.day08;

import com.day08.Animal;
import com.day08.Penguin;
import com.day08.Tiger;
import java.lang.reflect.Method;

public class AnimalTest7 {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        System.out.println(animal.getClass().getName());
        System.out.println(animal.getClass().getSimpleName());
        System.out.println(animal.getClass().getTypeName());
        System.out.println(animal.getClass().getPackageName());
        for(Method method : animal.getClass().getMethods()) {
            System.out.println(method.getName());
        }
    }
}
