package com.design_pattern.observer;

// 訂閱者
public interface Observer {
    // 當有訊息(data)進來時要做的行為
    void update(Object data);
}
