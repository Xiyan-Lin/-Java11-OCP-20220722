package test.day12;

import com.day12.Dog;

public class DogTest {
    public static void main(String[] args) {
        // 介面不可以直接 new
        // Dog is abstract; cannot be instantiated
        // Dog dog = new Dog();
        
        Dog dog = new Dog() {
            @Override
            public void skill(){
                System.out.println("玩飛盤");
            }
        };
        dog.skill();
        
        
        
    }
}
