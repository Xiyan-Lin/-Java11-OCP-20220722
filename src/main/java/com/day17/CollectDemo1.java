package com.day17;

// collect() 收集器
import static java.util.stream.Collectors.toSet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CollectDemo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jo", "Mary", "Helen");
        // J 開頭的統一集中到一個集合中
        Set<String> jnames = names.stream()
             .filter(name -> name.charAt(0) == 'J')
             //.forEach(System.out::println);
             .collect(toSet());
        System.out.println(jnames);
    }
}
