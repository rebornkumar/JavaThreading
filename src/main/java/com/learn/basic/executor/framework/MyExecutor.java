package com.learn.basic.executor.framework;

import java.util.concurrent.Executor;

public class MyExecutor implements Executor {
    @Override
    public void execute(Runnable runnable) {
        Thread myTaskThread = new Thread(runnable);
        myTaskThread.start();
    }
}
