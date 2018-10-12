package com.thinkInJava.Chapter11;

import java.util.*;

import static com.thinkInJava.Chapter6.Print.print;

public class PriorityQueuDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }


        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        print(priorityQueue);
        for (int i = 0; i < priorityQueue.size(); i++) {
            print(priorityQueue.poll());
        }

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.<Integer>reverseOrder());
        priorityQueue.addAll(ints);
        print(priorityQueue);
    }
}
