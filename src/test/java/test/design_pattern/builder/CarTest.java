package test.design_pattern.builder;

import com.design_pattern.builder.Car;
import com.design_pattern.builder.CarBuilderImpl;

public class CarTest {
    public static void main(String[] args) {
        Car car = new CarBuilderImpl().create();
        System.out.println(car);
        
        Car car2 = new CarBuilderImpl()
                .setColor("Red")
                .create();
        System.out.println(car2);
        
        Car car3 = new CarBuilderImpl()
                .setColor("Yellow")
                .setDoor(5)
                .setCC(3500)
                .create();
        System.out.println(car3);
    }
}
