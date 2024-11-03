package org.api.lec05;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        CoffeeSubscriber coffeeSubscriber = new CoffeeSubscriber();
        CoffeePublisher coffeePublisher = new CoffeePublisher();

        coffeePublisher.subscribe(coffeeSubscriber);

        Thread.sleep(5_000L);
    }

}
