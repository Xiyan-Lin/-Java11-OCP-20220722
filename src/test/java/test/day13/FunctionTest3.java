package test.day13;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/*
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    
}

@FunctionalInterface
public interface BiFunction<T, U, R> {
    R apply(T t, U u);
}

@FunctionalInterface
public interface BinaryOperator<T> extends BiFunction<T,T,T> {

}
*/
public class FunctionTest3 {
    public static void main(String[] args) {
        Function<Integer, Double> area = (r) -> r * r * Math.PI;
        System.out.println(area.apply(10));
        
        //Function<Integer, Integer> rect = (x) -> 4 * x;
        UnaryOperator<Integer> rect = (x) -> 4 * x; 
        System.out.println(rect.apply(10));
        
        BiFunction<String, Integer, Boolean> exam = (subject, score) -> score >= 60;
        System.out.println(exam.apply("國文", 85));
        
        //BiFunction<Integer, Integer, Integer> rect2 = (w, h) -> 2 * (w + h);
        BinaryOperator<Integer> rect2 = (w, h) -> 2 * (w + h);
        System.out.println(rect2.apply(10, 5));
    }
}
