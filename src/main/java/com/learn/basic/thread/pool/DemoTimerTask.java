package com.learn.basic.thread.pool;

import java.util.Timer;
import java.util.TimerTask;

public class DemoTimerTask {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        TimerTask badTask = new TimerTask() {
            @Override
            public void run() {
                //run
                boolean flag = true;
                while(flag){
                    try {
                        Thread.sleep(10);
                        System.out.println("bad task completed");
                        flag = false;
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
            }
        };
        TimerTask goodTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task completed!!!!! Enjoy!!!!!");
            }
        };
        timer.schedule(badTask,100);
        timer.schedule(goodTask,5000);
        Thread.sleep(3000);
    }
}
