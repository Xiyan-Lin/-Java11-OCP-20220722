package com.day17;

import static java.util.stream.Collectors.joining;
import java.util.Arrays;
import java.util.List;

public class CollectDemo3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jo", "Mary", "Helen");
        // joining 連結成一個字串
        // 例如: "JohnJoMaryHelen" 或 "John Jo Mary Helen" 或 "John, Jo, Mary, Helen"
        String result1 = names.stream().collect(joining());
        System.out.println(result1);
        String result2 = names.stream().collect(joining(" "));
        System.out.println(result2);
        String result3 = names.stream().collect(joining(", "));
        System.out.println(result3);
        String result4 = names.stream().collect(joining(", ", "begin-", "-end"));
        System.out.println(result4);
    }
}
