package test.day12;

import com.day12.Calc4;

public class Calc4Test {
    public static void main(String[] args) {
        Calc4<Integer, Boolean> score = (t) -> t >= 60;
        System.out.println(score.get(75));
        System.out.println(score.get(45));
        
        Calc4<Integer, Double> area = (r) -> r * r * Math.PI;
        System.out.println(area.get(10));
    }
}
