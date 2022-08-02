package test.day13;

import java.util.function.Consumer;
import java.util.function.BiConsumer;

/*
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}

@FunctionalInterface
public interface BiConsumer<T, U> {
    void accept(T t, U u);
}
*/
public class FunctionTest1 {
    public static void main(String[] args) {
        Consumer<String> welcome = (t) -> System.out.println("歡迎 " + t);
        welcome.accept("John");
        
        BiConsumer<String, Integer> greet = (name, age) -> System.out.printf("姓名: %s 年齡: %d\n", name, age);
        greet.accept("Mary", 18);
    }
}
