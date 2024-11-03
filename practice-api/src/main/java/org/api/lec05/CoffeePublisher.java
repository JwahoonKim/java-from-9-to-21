package org.api.lec05;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.Future;

public class CoffeePublisher implements Publisher<String> {

    @Override
    public void subscribe(Subscriber subscriber) {
        subscriber.onSubscribe(new CoffeeSubscription(subscriber));
    }

    public static class CoffeeSubscription implements Subscription {

        private final Subscriber<? super String> subscriber;
        private Future<?> future;

        public CoffeeSubscription(Subscriber<? super String> subscriber) {
            this.subscriber = subscriber;
        }

        @Override
        public void request(long n) {
            if (n < 0) {
                subscriber.onError(new IllegalArgumentException());
            } else {
                future = CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(1000);
                        subscriber.onNext("아메리카노");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                });
            }
        }

        @Override
        public void cancel() {
            if (future != null) {
                future.cancel(false);
            }
        }
    }
}
