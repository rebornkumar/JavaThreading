package com.learn.basic.thread.handling;

public class InterruptThread implements Runnable{
    @Override
    public void run() {
        try {
            System.out.println("InterruptThread thread is going to sleep for 1000 sec ,start time : " + System.currentTimeMillis()/1000);
            Thread.sleep(1000*60);
        }
        catch (InterruptedException interruptedException) {
            System.out.println("InterruptThread thread is interrupted at : " + System.currentTimeMillis()/1000);
        }
    }
}
