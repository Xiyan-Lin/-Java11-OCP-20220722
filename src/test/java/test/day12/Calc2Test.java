package test.day12;

import com.day12.Calc2;

public class Calc2Test {
    public static void main(String[] args) {
        // 二個成績的平均
        Calc2 score = (chinese, math) -> (chinese + math)/2;
        System.out.println(score.get(100, 90));
        // 計算 bmi
        Calc2 bmi = (h, w) -> w / Math.pow(h/100, 2);
        System.out.println(bmi.get(170, 60));
        
        // 二維陣列
        double[][] array = {
            {170, 60},{180, 90},{160, 50}
        };
        // 1. 計算出每一個人的 bmi
        
        // 2. 求整體平均 bmi
        
    }
}
