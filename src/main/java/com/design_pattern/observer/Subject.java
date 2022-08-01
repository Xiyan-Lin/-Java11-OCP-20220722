package com.design_pattern.observer;

// 主題
public interface Subject {
    void add(Observer observer); // 訂閱
    void remove(Observer observer); // 取消訂閱
    void notifyObserver(Object data); // 通知訂閱者訊息
}
