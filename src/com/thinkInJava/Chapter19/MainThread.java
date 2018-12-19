package com.thinkInJava.Chapter19;

public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
//        launch.run();

        Thread t = new Thread(new LiftOff());
        t.setDaemon(true);
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
