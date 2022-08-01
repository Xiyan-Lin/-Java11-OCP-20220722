package com.design_pattern.observer;

import java.util.List;
import java.util.ArrayList;

// 新聞主題
public class NewsSubject implements Subject{
    // 利用 List/ArrayList 動態陣列來存放所有訂閱者
    private List<Observer> observers = new ArrayList<>();
    
    @Override
    public void add(Observer observer) { // 訂閱
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) { // 取消訂閱
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Object data) {
        observers.forEach(observer -> observer.update(data));
    }
    
}
