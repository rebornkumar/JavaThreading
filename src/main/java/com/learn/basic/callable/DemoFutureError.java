package com.learn.basic.callable;

import java.util.concurrent.*;
import java.util.stream.StreamSupport;

public class DemoFutureError {
    static ExecutorService executorService = Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Playing with future and callable");
        System.out.println("sum : " + findSum(100));
        executorService.shutdown();
    }
    static int findSum(final int n) throws ExecutionException, InterruptedException {
        int rslt = -1;
        Callable<Integer> callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
               throw new RuntimeException("Something gone wrong!!!!!!!!");
            }
        };
        Future<Integer>future = executorService.submit(callable);
        try {
            rslt = future.get();
        }
        catch (ExecutionException executionException) {
            System.out.println("Something went wrong!!!! " + executionException.getCause());
        }
        return rslt;
    }
}
