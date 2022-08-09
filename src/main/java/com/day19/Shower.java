package com.day19;

class Father extends Thread {
    public void run() {
        System.out.println("爸爸準備洗澡發現沒有瓦斯了");
        System.out.println("爸爸打電話請瓦斯工人送瓦斯");
        
        Worker worker = new Worker(); // 建立瓦斯工人執行緒
        worker.start(); // 瓦斯工人執行送瓦斯任務
        
        try {
            worker.join(); // worker.join(設定最大等待時間(ms));
        } catch (InterruptedException e) {
        }
        
        System.out.println("爸爸開始洗澡");
        System.out.println("爸爸洗完澡了");
    }
}

class Worker extends Thread {
    public void run() {
        System.out.println("瓦斯工人接到送瓦斯任務,開始送瓦斯...");
        for(int i=1;i<=5;i++) { // 模擬送瓦斯的時間
            System.out.printf("%d 秒鐘 ", i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("\n瓦斯工人將瓦斯送到家, 並裝好!");
    }
}

public class Shower {
    public static void main(String[] args) {
        Father father = new Father();
        father.start();
    }
}
