package com.design_pattern.observer;

// 使用者訂閱
public class UserObserver implements Observer {
    private String name; // 姓名
    public UserObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Object data) {
        System.out.printf("%s 收到訊息: %s\n", name, data);
    }
    
}
