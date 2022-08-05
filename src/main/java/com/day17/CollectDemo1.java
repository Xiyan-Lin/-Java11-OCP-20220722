package com.day17;

// collect() 收集器
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class CollectDemo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jo", "Mary", "Helen");
        // J 開頭的統一集中到一個集合中
        Set<String> jnames = names.stream()
             .filter(name -> name.charAt(0) == 'J')
             .peek(System.out::println)
             .collect(toSet());
        System.out.println(jnames);
        
        List<Integer> scores = Arrays.asList(100, 40, 60, 80, 55, 100);
        // 將及格的分數統一集中到一個集合中
        List<Integer> passScores = scores.stream()
              .filter(score -> score >= 60)
              .peek(System.out::println)
              .collect(toList());
        System.out.println(passScores);
    }
}
