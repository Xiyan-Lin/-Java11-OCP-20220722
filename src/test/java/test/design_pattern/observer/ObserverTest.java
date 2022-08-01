package test.design_pattern.observer;

import com.design_pattern.observer.NewsSubject;
import com.design_pattern.observer.Observer;
import com.design_pattern.observer.Subject;
import com.design_pattern.observer.UserObserver;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new NewsSubject(); // 新聞主題
        Observer observer1 = new UserObserver("小明"); // 訂閱人
        Observer observer2 = new UserObserver("小華"); // 訂閱人
        Observer observer3 = new UserObserver("小英"); // 訂閱人
        
        // 訂閱
        subject.add(observer1);
        subject.add(observer3);
        
        // 發送
        subject.notifyObserver("今天是本星期上課的第一天 Good Luck~");
        
        // 小華加入訂閱
        subject.add(observer2);
        
        // 發送
        subject.notifyObserver("今天開始學設計模式~");
        
        // 小明, 小華取消訂閱
        subject.remove(observer1);
        subject.remove(observer2);
        
        // 發送
        subject.notifyObserver("中午下課! 吃飯了~");
        
    }
}
