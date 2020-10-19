package com.learn.basic.create;

public class Demonstration {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("executing thread function");
            }
        });
        thread.start();
        thread.join();
        System.out.println("new thread completed successfully");
        Thread threadExecute  = new Thread(new ExecuteMe());
        threadExecute.start();
        threadExecute.join();
        System.out.println("execute thread completed successfully");
        Thread subThread  = new Thread(new SubThread());
        subThread.start();
        subThread.join();
        System.out.println("subThread thread completed successfully");
    }
}
