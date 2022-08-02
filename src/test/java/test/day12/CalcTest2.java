package test.day12;

import com.day12.Calc;
import java.util.Arrays;

public class CalcTest2 {
    public static void main(String[] args) {
        // 陣列應用
        Calc area   = (r) -> Math.pow(r, 2) * Math.PI; // 計算圓面積公式
        Calc volume = (r) -> 4/3.0 * Math.pow(r, 3) * Math.PI; // 計算球體積公式
        Calc luckyNumber = (r) -> (int)(r * 1234.5678) % 10;
        Calc calc = luckyNumber; // volume, area
        double[] array = {10, 15, 25.5, 30.5}; // 一堆半徑
        // case 1
        for(double r : array) {
            System.out.println(calc.get(r));
        }
        // case 2
        Arrays.stream(array).forEach(r -> System.out.println(calc.get(r)));
        
    }
}
