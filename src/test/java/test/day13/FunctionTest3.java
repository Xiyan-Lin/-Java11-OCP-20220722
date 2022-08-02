package test.day13;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/*
@FunctionalInterface
public interface Function<T, R> {
    R apply(T t);
}

@FunctionalInterface
public interface UnaryOperator<T> extends Function<T, T> {
    
}
*/
public class FunctionTest3 {
    public static void main(String[] args) {
        Function<Integer, Double> area = (r) -> r * r * Math.PI;
        System.out.println(area.apply(10));
    }
}
