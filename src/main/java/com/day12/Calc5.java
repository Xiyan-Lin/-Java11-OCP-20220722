package com.day12;

@FunctionalInterface
public interface Calc5<T1, T2, R> {
    R get(T1 t1, T2 t2);
}
