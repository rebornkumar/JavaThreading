package com.learn.basic.thread.handling;

public class Demonstration {
    public static void main(String[] args) throws InterruptedException{
        Thread sleepingThread = new Thread(new SleepingThread());
        sleepingThread.start();
        Thread interruptThread = new Thread(new InterruptThread());
        interruptThread.start();

        System.out.println("Main thread sleeping at " + System.currentTimeMillis() / 1000);
        Thread.sleep(3000);
        interruptThread.interrupt();
        MyRunnable myRunnable = new MyRunnable();
        Thread myThread = new Thread(myRunnable);
        myThread.setDaemon(true);
        myThread.start();
//        myThread.join();
        System.out.println("Main thread exiting.");
        System.out.println("JVM killing daemon threads!!!!!!");
    }
}
