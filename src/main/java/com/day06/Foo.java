package com.day06;

public class Foo extends Bar{
    // 透過 @Override 註解可以即時判斷是否覆寫成功
    // 覆寫方法名稱,參數列必須與父類被覆寫的方法名稱,參數列相同
    // 存取權限不可以小於父類被覆寫方法的權限
    // public, protected, 無(default, packaged), private
    // 回傳值必須相同, 或是父類被覆寫方法回傳值的子類
    @Override  
    Son calc(int x, int y) {
        System.out.println(x * y);
        return null;
    }
}
