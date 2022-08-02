package test.day13;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

/*
@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

@FunctionalInterface
public interface BiPredicate<T, U> {
    boolean test(T t, U u);
}
*/
public class FunctionTest2 {
    public static void main(String[] args) {
        Predicate<Integer> score = (t) -> t >= 60;
        System.out.println(score.test(75));
        System.out.println(score.test(45));
        
        BiPredicate<String, Integer> equals = (s, i) -> Integer.parseInt(s) == i.intValue();
        System.out.println(equals.test("100", 100));
        
        
    }
}
