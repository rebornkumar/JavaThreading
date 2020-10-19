package com.learn.basic.thread.pool;

import java.util.Timer;
import java.util.TimerTask;

public class DemoTimerTaskException {
    public static void main(String[] args) throws RuntimeException,InterruptedException {
        Timer timer = new Timer();
        TimerTask badTask = new TimerTask() {
            @Override
            public void run() {
                throw new RuntimeException("Something bad happened!!!");
            }
        };
        TimerTask goodTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("good task completed!!!");
            }
        };
        timer.schedule(badTask,10);
        Thread.sleep(100);
        timer.schedule(goodTask,100000);
        System.out.println("main thread reached");
    }
}
