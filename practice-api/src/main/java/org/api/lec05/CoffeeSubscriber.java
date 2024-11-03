package org.api.lec05;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class CoffeeSubscriber implements Subscriber {

    private Subscription subscription;
    private int coffeeCount;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(Object item) {
        System.out.println("item = " + item);
        coffeeCount++;
        if (coffeeCount < 2) {
            subscription.request(1);
        }
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("에러 ㅂ라생");
    }

    @Override
    public void onComplete() {
        System.out.println("모든 커피를 마셨습니다.");
        subscription.cancel();
    }
}
