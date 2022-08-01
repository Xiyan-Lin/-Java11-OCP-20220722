package test.design_pattern.decorator;

import com.design_pattern.decorator.Bread;
import com.design_pattern.decorator.Egg;
import com.design_pattern.decorator.Food;
import com.design_pattern.decorator.Ham;
import com.design_pattern.decorator.Lettuce;
import com.design_pattern.decorator.Olives;
import com.design_pattern.decorator.Onion;
import com.design_pattern.decorator.Tomato;
import com.design_pattern.decorator.Tuna;

public class FoodTest {
    public static void main(String[] args) {
        Food food = new Bread(); // 先點麵包
        food = new Ham(food); // 麵包裡夾火腿
        food = new Lettuce(food); // 麵包有火腿的麵包夾生菜
        food = new Egg(food);
        food = new Egg(food);
        food = new Tomato(food);
        food = new Tuna(food);
        food = new Olives(food);
        food = new Onion(food);
        food = new Onion(food);
        food = new Onion(food);
        
        // 顯示麵包中的所有配料與總價
        System.out.printf("食料: %s\n", food.getName());
        System.out.printf("總價: %,d\n", food.getPrice());
        
    }
}
