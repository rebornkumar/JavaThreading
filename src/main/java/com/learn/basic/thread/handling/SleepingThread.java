package com.learn.basic.thread.handling;

public class SleepingThread implements Runnable{
    @Override
    public void run() {
        System.out.println("SleepingThread thread is going to sleep");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException ex) {}
    }
}
