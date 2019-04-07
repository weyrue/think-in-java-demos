package com.thinkInJava.Chapter19;

import java.util.LinkedList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest implements Runnable {
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("Aborting");
                System.exit(0);
            }
        }, 5000);

        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicIntegerTest ait = new AtomicIntegerTest();
        exec.execute(ait);

        while (true) {
            int val = ait.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }

    private AtomicInteger i = new AtomicInteger(0);
    private ThreadLocal<Integer> value = new ThreadLocal<>(){
        @Override
        protected Integer initialValue() {
            return super.initialValue();
        }
    };

    private List<String> list = new LinkedList<>(){};
    private Integer s ;

    public int getValue() {
        return i.get();
    }

    private void evenIncrement() {
        i.addAndGet(2);
        synchronized(this){

        }
    }

    @Override
    public void run() {
        while (true) {
            evenIncrement();
        }
    }
}
