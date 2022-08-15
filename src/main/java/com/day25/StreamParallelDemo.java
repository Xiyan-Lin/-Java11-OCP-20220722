package com.day25;

import java.util.Arrays;
import java.util.List;

public class StreamParallelDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3, 1, 4, 1, 5, 9);
        //int sum = nums.stream().mapToInt(n -> n * n).sum(); // 循序計算
        int sum = nums.parallelStream().mapToInt(n -> n * n).sum(); // 平行計算
        System.out.println(sum);
    }
}
