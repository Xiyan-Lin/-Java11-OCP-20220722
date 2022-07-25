package test.day04;

import com.day04.User;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "John";
        user1.age = 18;
        System.out.printf("user1 name: %s, age: %d\n", user1.name, user1.age);
        
        User user2 = new User();
        user2.name = "Mary";
        user2.age = 19;
        System.out.printf("user2 name: %s, age: %d\n", user2.name, user2.age);
    }
}
