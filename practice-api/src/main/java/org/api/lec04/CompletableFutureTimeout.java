package org.api.lec04;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureTimeout {

    public static void main(String[] args) {
        Runnable sleep = () -> {
            try {
                Thread.sleep(10_000);
                System.out.println("작업 완료");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        System.out.println("---작업 실행---");
        CompletableFuture<Void> future = CompletableFuture.runAsync(sleep)
            .orTimeout(1, TimeUnit.SECONDS);// 타임아웃 기능

        future.join();
    }
}