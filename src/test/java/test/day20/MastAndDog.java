package test.day20;

import com.day20.Cookies;
import com.day20.Dog;
import com.day20.Master;

public class MastAndDog {
    public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Thread master = new Thread(new Master(cookies));
        Thread dog = new Thread(new Dog(cookies));
        master.start();
        dog.start();
    }
}
