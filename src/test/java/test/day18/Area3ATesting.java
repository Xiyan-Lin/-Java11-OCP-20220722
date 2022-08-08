package test.day18;

// 進行標準 3A 測試
import com.day18.Area;
import org.junit.Test;
import org.junit.Assert;

public class Area3ATesting {
    @Test
    public void testing() {
        // 1. Arrange 安排測試物件與期望結果
        Area area = new Area();
        int w = 10; // 底 (測試參數)
        int h = 5;  // 高 (測試參數)
        int excepted = 25; // 期望得到的值
        
        // 2. Act 調用目標測試物件方法
        int actual = area.triangle(w, h); // 實際得到的值
        
        // 3. Assert 驗證測試結果
        Assert.assertEquals(actual, excepted); // 實際得到的值 == 期望得到的值 ??
        
    }
}
