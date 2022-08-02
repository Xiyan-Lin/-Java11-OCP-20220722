package com.day12;

@FunctionalInterface
public interface Calc4<T, R> {
    R get(T t);
}
