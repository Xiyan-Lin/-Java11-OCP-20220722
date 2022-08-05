package com.day17;
import static java.util.stream.Collectors.toMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class CollectDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jo", "Mary", "Helen");
        // 整理出每一個名字的資料長度
        // 例如: {Jo=2, John=4, Helen=5, Mary=4}
        Map<String, Integer> result = names.stream()
                                           .collect(toMap(Function.identity(), String::length));
        System.out.println(result);
        
        Map<String, Integer> result2 = names.stream()
                                           .collect(toMap(name->name , name->name.length()));
        System.out.println(result2);
        
    }
}
