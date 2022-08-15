package com.day25;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.iterate(0, i -> i + 1).limit(10);
        stream.forEach(System.out::println);
                
    }
}
