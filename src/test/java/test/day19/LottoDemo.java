package test.day19;

import com.day19.Lotto;
import java.util.concurrent.FutureTask;

public class LottoDemo {
    public static void main(String[] args) throws Exception {
        Lotto lotto = new Lotto(); // Callable 物件 (任務)
        FutureTask<Integer> task = new FutureTask<>(lotto); // 建立一個 task 來包裝任務
        new Thread(task).start(); // 建立一個執行緒取執行 task 中的任務
        System.out.println("執行中....");
        System.out.println("lotto: " + task.get());
    }
}
