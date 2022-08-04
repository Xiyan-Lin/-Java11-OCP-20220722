package com.day15;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.stream.IntStream;
public class ListDemo4 {
    public static void main(String[] args) {
        Random random = new Random();
        // List 資料尋訪
        // Iterator, ListIterator, for/each(in), java 8 foreach
        List<Integer> nums = new LinkedList<>();
        // 0~9 取五個隨機數字
        /*
        for(int i=0;i<5;i++) {
            nums.add(random.nextInt(10));
        }
        */
        // range(0, 5) 不包含 5
        // rangeClosed(0, 5) 包含 5
        IntStream.range(0, 5).forEach(i -> nums.add(random.nextInt(10)));
        System.out.println(nums);
        ListIterator<Integer> iter = nums.listIterator();
        // 往下讀取 (next)
        while (iter.hasNext()) {
            int idx = iter.nextIndex();
            Integer value = iter.next();
            System.out.printf("idx: %d value: %d\n", idx, value);
        }
        // 往上讀取 (previous)
        while (iter.hasPrevious()) {
            int idx = iter.previousIndex();
            Integer value = iter.previous();
            System.out.printf("idx: %d value: %d\n", idx, value);
        }
    }
}
