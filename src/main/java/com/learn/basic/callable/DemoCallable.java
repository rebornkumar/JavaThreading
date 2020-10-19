package com.learn.basic.callable;

import java.util.concurrent.Callable;

public class DemoCallable {
    public static void main(String[] args) throws Exception{
        SumTask sumTask = new SumTask(15);
        System.out.println(sumTask.call());
        //using anonymous class
        final int n = 10;
        Callable<Integer> sumTask1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for(int i = 1;i <= n;i++) {
                    sum += i;
                }
                return sum;
            }
        };
        System.out.println(sumTask1.call());
    }
}
