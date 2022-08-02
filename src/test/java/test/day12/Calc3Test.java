package test.day12;

import com.day12.Calc3;

public class Calc3Test {
    public static void main(String[] args) {
        Calc3<Integer> c1 = (r) -> r + r;
        System.out.println(c1.get(10));
        
        Calc3<String> c2 = (r) -> r + r;
        System.out.println(c2.get("10"));
    }
}
