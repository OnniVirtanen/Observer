package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();

        List<Subscriber> subscribers = List.of(s1, s2, s3);
        Publisher publisher = new Publisher();

        for (Subscriber s : subscribers) {
            publisher.register(s);
            System.out.println(s.getSecondHasBeenElapsed());
        }

        publisher.setSecondHasBeenElapsed(5);
        publisher.notifySubscribers();

        for (Subscriber s : subscribers) {
            System.out.println(s.getSecondHasBeenElapsed());
        }

        publisher.setSecondHasBeenElapsed(10);
        publisher.notifySubscribers();

        for (Subscriber s : subscribers) {
            System.out.println(s.getSecondHasBeenElapsed());
        }
    }

}