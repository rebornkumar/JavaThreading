package com.learn.basic.executor.framework;

public class Demonstration {
    public static void main(String[] args) {
        MyExecutor myExecutor = new MyExecutor();
        Runnable myTask = new MyTask();
        myExecutor.execute(myTask);
    }
}
