package org.api.lec04;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureDelay {

    public static void main(String[] args) {
        Executor executor = CompletableFuture.delayedExecutor(5, TimeUnit.SECONDS);

        Runnable runnable = () -> {
            System.out.println("작업 완료");
        };

        System.out.println("---작업 실행---");
        CompletableFuture<Void> future = CompletableFuture.runAsync(runnable, executor);

        // 5초 후에 시작한다.
        future.join();
    }

}
