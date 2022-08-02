package test.day13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

/*
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
*/
public class FunctionTest4 {
    public static void main(String[] args) {
        Supplier<Date> now = () -> new Date();
        System.out.println(now.get());
        // function 混搭
        // 透過 Supplier<Date> 取得日期時間
        // Tue Aug 02 15:09:46 CST 2022 
        // 再透過 Function<Date, String>
        // 得到 "2022-08-02 下午 03:15:55 週二" 字串
        
        Function<Date, String> nowstr = (date) -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E");
            return sdf.format(date);
        };
        System.out.println(nowstr.apply(now.get()));
        
    }
}
