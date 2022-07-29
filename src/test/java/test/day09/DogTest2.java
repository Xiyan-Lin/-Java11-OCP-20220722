package test.day09;

import com.day09.ADog;
import com.day09.Chihuahua;
import com.day09.Dog;
import com.day09.EDog;
import com.day09.Shiba;

public class DogTest2 {
    public static void main(String[] args) {
        Dog dog1 = new Shiba();
        Dog dog2 = new Chihuahua();
        Dog dog3 = new EDog();
        
        Dog[] dogs = {dog1, dog2, dog3};
        
        ADog adog1 = new Shiba();
        ADog adog2 = new Chihuahua();
        
        ADog[] adogs = {adog1, adog2};
        
        
        
    }
}
