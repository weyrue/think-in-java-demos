package com.thinkInJava.Chapter19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static com.thinkInJava.Chapter6.Print.print;

public class CachedThreadPool {
    public static void main(String[] args) throws Exception {
//        ExecutorService exec = Executors.newCachedThreadPool();
//        ExecutorService exec = Executors.newFixedThreadPool(3);
        ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
        for (int i = 0; i < 5; i++) {
//            exec.execute(new LiftOff());
            exec.execute(new DaemonFromFactory());
        }
//        exec.shutdown();
        print("All daemons started");
        TimeUnit.MILLISECONDS.sleep(500);
    }
}

class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.MILLISECONDS.sleep(100);
                print(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            print("Interrupted");
        }
    }
}
