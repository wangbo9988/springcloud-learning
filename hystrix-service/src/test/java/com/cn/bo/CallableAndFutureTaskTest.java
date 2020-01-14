package com.cn.bo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName CallableAndFutureTaskTest
 * @Description 通过Callable+FutureTask方式获取线程执行结果
 * @Author mr.wang
 * @Date 2020/1/14 10:28 上午
 * @Version v1.0
 */

public class CallableAndFutureTaskTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<Integer> futureTask = new FutureTask<>(() -> {
            System.out.println("子线程正在计算...");
            Thread.sleep(1000);
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        });

        Thread thread = new Thread(futureTask);
        thread.start();

        System.out.println("主线程执行...");
        System.out.println("任务执行结果：" + futureTask.get());
    }

}
