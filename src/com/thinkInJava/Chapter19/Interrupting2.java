package com.thinkInJava.Chapter19;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.thinkInJava.Chapter6.Print.print;

public class Interrupting2 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Blocked2());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Issuing t.interrupt()");
        t.interrupt();
    }
}

class BlockedMutex {
    private Lock lock = new ReentrantLock();

    public BlockedMutex() {
        lock.lock();
    }

    public void f() {
        try {
            lock.lockInterruptibly();
            print("lock acquired in f()");
        } catch (InterruptedException e) {
            print("Interrupted from lock acquisition in f()");
        }
    }
}

class Blocked2 implements Runnable {
    BlockedMutex blocked = new BlockedMutex();

    @Override
    public void run() {
        print("waiting for f() in BlockedMutex");
        blocked.f();
        print("Broken out of blocked call");
    }
}
