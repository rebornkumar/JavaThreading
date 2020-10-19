package com.learn.basic.executor.framework;

public class MyTask implements Runnable{
    @Override
    public void run() {
        System.out.println("MyTask is running now!!!");
    }
}
