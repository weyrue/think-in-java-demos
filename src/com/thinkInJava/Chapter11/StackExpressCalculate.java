package com.thinkInJava.Chapter11;

import java.util.LinkedList;

import static com.thinkInJava.Chapter6.Print.print;

public class StackExpressCalculate {
    public static void main(String[] args) {
        executeExpression(new Stack<Character>(), "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s");
    }

    private static void executeExpression(Stack stack, String exp) {
        LinkedList<Character> charExpressionList = new LinkedList<>();
        for (int i = 0; i < exp.length(); i++) {
            charExpressionList.addLast(exp.charAt(i));
        }

        while (!charExpressionList.isEmpty()) {
            char order = charExpressionList.pop();
            if (order == '+') {
                stack.push(charExpressionList.pop());
            } else if (order == '-') {
                stack.pop();
                print("Statck: " + stack.toString());
            } else {
                print("Wrong order expression!");
                break;
            }
        }
    }
}

class Stack<T> {
    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean isEmpty() {
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
