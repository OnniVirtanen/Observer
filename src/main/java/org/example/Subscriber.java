package org.example;

public class Subscriber implements Observer {

    private Long secondHasBeenElapsed;

    @Override
    public void update(Object object) {
        this.secondHasBeenElapsed = (long) object;
    }

    public Long getSecondHasBeenElapsed() {
        return secondHasBeenElapsed;
    }

}
