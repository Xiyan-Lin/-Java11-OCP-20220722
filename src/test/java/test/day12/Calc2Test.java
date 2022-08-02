package test.day12;

import com.day12.Calc2;
import java.util.stream.Stream;

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
        // Java 7 作法
        for(double[] row : array) {
            double h = row[0];
            double w = row[1];
            double bmiValue = w / Math.pow(h/100, 2);
            System.out.println(bmiValue);
        }
        // Java 8 作法
        Stream.of(array)
                .mapToDouble(row -> {
                    double h = row[0];
                    double w = row[1];
                    double bmiValue = w / Math.pow(h/100, 2);
                    return bmiValue;
                })
                .forEach(System.out::println); // (bmiValue) -> System.out.println(bmiValue)
        // 上述寫法簡化
        Stream.of(array)
                .mapToDouble(row -> bmi.get(row[0], row[1]))
                .forEach(System.out::println);
                
        // 2. 求整體平均 bmi
        double bmiAvg = Stream.of(array)
                        .mapToDouble(row -> bmi.get(row[0], row[1]))
                        .average()
                        .getAsDouble();
        System.out.println(bmiAvg);
    }
}
