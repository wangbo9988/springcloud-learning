package com.cn.bo;

import java.util.concurrent.*;

/**
 * @ClassName ExecutorServiceAndFutureTest
 * @Description 通过FCallable+Future方式获取线程执行结果
 * @Author mr.wang
 * @Date 2020/1/14 10:30 上午
 * @Version v1.0
 */

public class CallableAndFutureTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(() -> {
            System.out.println("子线程正在计算...");
            Thread.sleep(1000);
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        });
        executorService.shutdown();

        System.out.println("主线程执行...");
        System.out.println("任务执行结果：" + result.get());

    }

}
