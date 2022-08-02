package test.day12;

import com.day12.Calc;

public class CalcTest {
    public static void main(String[] args) {
        // 今日幸運數字
        // 請輸入您的年齡後由AI幫您算出
        Calc luckyNumber = new Calc() {
            @Override
            public double get(double r) {
                return r * 1234 % 10;
            }
        };
        System.out.println(luckyNumber.get(22.5));
        
        Calc luckyNumber2 = (double r) -> { 
            return r * 1234 % 10; 
        };
        System.out.println(luckyNumber2.get(18.0));
        
        Calc luckyNumber3 = (r) -> r * 1234 % 10;
        System.out.println(luckyNumber3.get(31.0));
        
        // 計算圓面積
        Calc area = (r) -> Math.pow(r, 2) * Math.PI;
        System.out.println(area.get(10));
        
        // 計算球體積
        Calc volume = (r) -> 4/3.0 * Math.pow(r, 3) * Math.PI;
        System.out.println(volume.get(10));
        
    }
}
