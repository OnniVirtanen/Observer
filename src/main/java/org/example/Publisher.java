package org.example;

import java.util.ArrayList;
import java.util.List;

public class Publisher {

    private long secondHasBeenElapsed;
    private List<Subscriber> subscribers = new ArrayList<>();

    public void notifySubscribers() {
        for (Subscriber s : subscribers) {
            s.update(this.secondHasBeenElapsed);
        }
    }

    public void register(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public long getSecondHasBeenElapsed() {
        return secondHasBeenElapsed;
    }

    public void setSecondHasBeenElapsed(long secondHasBeenElapsed) {
        this.secondHasBeenElapsed = secondHasBeenElapsed;
    }

}
