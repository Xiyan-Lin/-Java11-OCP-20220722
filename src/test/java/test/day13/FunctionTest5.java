package test.day13;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class FunctionTest5 {
    public static void main(String[] args) {
        String[] names = {"John", "Jo", "Helen", null, "Bob", "Vincent"};
        double avg = Arrays.stream(names)
                            .filter(n -> n != null) // Predicate<String>
                            .mapToInt(n -> n.length())  // ToIntFunction<String>
                            .average()
                            .getAsDouble();
        System.out.println(avg);
        //----------------------------------------------------------------------
        Predicate<String> notNull = n -> n != null;
        ToIntFunction<String> nameLength = String::length; // n -> n.length();
        double avg2 = Arrays.stream(names)
                            //.peek(System.out::println)
                            .filter(notNull)
                            //.peek(System.out::println)
                            .mapToInt(nameLength)
                            .peek(System.out::println) //.peek(x -> System.out.println(x))
                            .average()
                            .getAsDouble();
        System.out.println(avg2);
        
                
        
    }
}
