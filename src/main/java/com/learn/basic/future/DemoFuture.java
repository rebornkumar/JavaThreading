package com.learn.basic.future;

import java.util.concurrent.*;

public class DemoFuture {
    static ExecutorService executorService = Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("play with future and callable");
        System.out.println("sum : " + findSum(100));
        executorService.shutdown();

    }
    static int findSum(final int n) throws InterruptedException, ExecutionException {
        Callable<Integer>callable = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for(int i = 1;i <= n;i++) {
                    sum += i;
                }
                return sum;
            }
        };
        Future<Integer>future = executorService.submit(callable);
        return future.get();
    }
}
