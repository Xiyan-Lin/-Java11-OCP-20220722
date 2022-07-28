package test.day06;

import com.day06.Calc;

public class CalcTest {
    public static void main(String[] args) {
        System.out.println(Calc.add(10, 20));
        System.out.println(Calc.add(10, 20, 30));
        int result1 = Calc.add(10, 20);
        int result2 = Calc.add(10, 20, 30);
        System.out.println(result1);
        System.out.println(result2);
        //-----------------------------------------
        int[] nums = {10, 20, 30, 40, 50, 60};
        System.out.println(Calc.add(nums));
        
        
    }
}
