package test.day04;

import com.day04.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.height = 170.0;
        person1.weight = 65.5;
        //person1.bmi = person1.weight / Math.pow(person1.height/100, 2);
        person1.calcBmi();
        person1.print();
        
        Person person2 = new Person();
        person2.height = 180.0;
        person2.weight = 95.5;
        //person2.bmi = person2.weight / Math.pow(person2.height/100, 2);
        person2.calcBmi();
        person2.print();
        
    }
}
