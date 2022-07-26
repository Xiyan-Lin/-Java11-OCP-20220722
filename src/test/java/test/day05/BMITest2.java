package test.day05;

import com.day05.BMI;

public class BMITest2 {
    public static void main(String[] args) {
        // 分析 BMI 資料
        BMI bmi1 = new BMI("John", 170.0, 60.0);
        BMI bmi2 = new BMI("Mary", 160.0, 48.0);
        BMI[] bmis = {bmi1, bmi2, new BMI("Helen", 155.0, 65.0)};
        System.out.printf("bmis length: %d\n", bmis.length);
        // 請印出 bmi 的資料
        for(BMI bmi : bmis) {
            bmi.print();
        }
    }
}
