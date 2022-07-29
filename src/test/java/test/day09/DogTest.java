package test.day09;

import com.day09.Chihuahua;
import com.day09.Dog;
import com.day09.Shiba;

public class DogTest {
    public static void main(String[] args) {
        Shiba shiba = new Shiba();
        Chihuahua chihuahua = new Chihuahua();
        System.out.println(Shiba.feet);
        System.out.println(chihuahua.feet);
        System.out.println(Dog.feet);
        // Dog.feet = 5; // 介面屬性內容值是不可以修改的
        
        shiba.play();
        chihuahua.play();
        
        shiba.eat();
        chihuahua.eat();
    }
}
