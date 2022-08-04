package com.day14;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo5 {
    public static void main(String[] args) {
        // HashSet vs LinkedHashSet vs TreeSet
        // HashSet 無序的集合(與加入順序不同)
        // LinkedHashSet 有序的集合(與加入順序相同)
        // TreeSet 支援排序的集合(小 -> 大)
        Set set1 = new HashSet();
        set1.add(90);
        set1.add(100);
        set1.add(70);
        System.out.println(set1); // [100, 70, 90] 無序的集合(與加入順序不同)
        
        Set set2 = new LinkedHashSet();
        set2.add(90);
        set2.add(100);
        set2.add(70);
        System.out.println(set2); // [90, 100, 70] 有序的集合(與加入順序相同)
        
        Set set3 = new TreeSet();
        set3.add(90);
        set3.add(100);
        set3.add(70);
        System.out.println(set3); // [70, 90, 100] 支援排序的集合(小 -> 大)
    }
}
