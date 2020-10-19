package com.learn.basic.thread.handling;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        while(true) {
            System.out.println("Say hello over and over again");
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException interruptedException) {
                System.out.println(interruptedException);
            }
        }
    }
}
