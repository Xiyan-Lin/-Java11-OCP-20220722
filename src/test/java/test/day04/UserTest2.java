package test.day04;

import com.day04.User;

public class UserTest2 {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "John";
        user1.age = 18;
        User user2 = new User();
        user2.name = "Mary";
        user2.age = 19;
        user1.print();
        user2.print();
    }
}
