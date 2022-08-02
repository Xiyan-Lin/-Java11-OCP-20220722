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
        ToIntFunction<String> nameLength = n -> n.length();
        double avg2 = Arrays.stream(names)
                            .filter(notNull)
                            .mapToInt(nameLength)
                            .average()
                            .getAsDouble();
        System.out.println(avg2);
        
                
        
    }
}
