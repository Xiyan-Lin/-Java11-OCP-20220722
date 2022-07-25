package test.day04;

import com.day04.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.height = 170.0;
        person1.weight = 65.5;
        person1.bmi = person1.weight / Math.pow(person1.height/100, 2);
        person1.print();
    }
}
