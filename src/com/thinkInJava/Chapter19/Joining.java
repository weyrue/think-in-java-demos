package com.thinkInJava.Chapter19;

import static com.thinkInJava.Chapter6.Print.print;

public class Joining {
    public static void main(String[] args) {
        Sleeper sleepy = new Sleeper("Sleepy", 1500),
                grumpy = new Sleeper("Grumpy", 1500);
        Joiner dopey = new Joiner("Dopey", sleepy),
                doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            print(getName() + " was interrupted. " + "isInterrupted(): " + isInterrupted());
            return;
        }
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            print("Interrupted!");
        }
        print(getName() + " join completed");
    }
}