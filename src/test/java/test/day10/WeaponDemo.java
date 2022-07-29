package test.day10;

import com.day10.Airplane;
import com.day10.Car;
import com.day10.Fighter;
import com.day10.Tank;
import com.day10.Truck;
import com.day10.Weapon;
import java.util.stream.Stream;

public class WeaponDemo {
    public static void main(String[] args) {
        Car car1 = new Tank("T72 坦克");
        Car car2 = new Truck("卡車");
        
        Airplane airplane1 = new Fighter("F-18 戰鬥機");
        Airplane airplane2 = new Fighter("勇鷹 教練機");
        Airplane airplane3 = new Fighter("SU-27 戰鬥機");
        
        Weapon weapon1 = new Tank("CM-11 虎式坦克");
        Weapon weapon2 = new Fighter("F-16 戰鬥機");
        
        Car[] cars = {car1, car2};
        Airplane[] airplanes = {airplane1, airplane2, airplane3};
        Weapon[] weapons = {weapon1, weapon2};
        
        Stream.of(cars).forEach(Car::move);
        Stream.of(airplanes).forEach(Airplane::speed);
        Stream.of(weapons).forEach(Weapon::shoot);
        
    }
}
