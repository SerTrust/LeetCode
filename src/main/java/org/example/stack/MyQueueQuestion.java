package org.example.stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class MyQueueQuestion {

        public static void main(String[] args) {
                MyQueue obj = new MyQueue();
                obj.push(1);
                obj.push(2);
                System.out.println(obj);
                System.out.println(obj.pop());
                System.out.println(obj.peek());
                System.out.println(obj.empty());
        }
}

class MyQueue {
    Queue<Integer> input;

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {
        input = new ArrayDeque<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        input.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return input.poll();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return input.peek();

    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return input.isEmpty();
    }
}
